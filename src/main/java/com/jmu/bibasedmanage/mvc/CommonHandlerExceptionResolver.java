package com.jmu.bibasedmanage.mvc;

import com.jmu.bibasedmanage.exception.BusinessException;
import com.jmu.bibasedmanage.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 系统统一异常处理，对于ajax请求自动转成json格式数据，并保持与JsonResponse数据结构一致
 * 
 * @author 刘俊杰
 * 
 */
public class CommonHandlerExceptionResolver extends SimpleMappingExceptionResolver {

	public final static int RESPONSE_TYPE_JSON = 0;
	public final static int RESPONSE_TYPE_HTML = 1;

	public final static String AJAX_HEADER = "X-Requested-With";

	public final static String AJAX_HEADER_VALUE = "XMLHttpRequest";

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                              Exception ex) {
		//TODO 待改进
		logException(ex, request);

		int responseType = resovleResponseType(request, ex);
		switch (responseType) {
		case RESPONSE_TYPE_JSON:
			// 返回json格式的错误信息，保持与JsonResponse数据格式一致
			ModelAndView jsonView = new ModelAndView(new MappingJacksonJsonView());
			jsonView.addObject("status", ResponseUtil.ERROR);
			String errmsg = ex.getMessage();
			String prefix = "com.jmu.bibasedmanage.exception.BusinessException:";
			if (ex instanceof RuntimeException && errmsg != null && errmsg.startsWith(prefix)) {
				int end = errmsg.indexOf("\n", prefix.length());
				if (end > 0) {
					errmsg = errmsg.substring("com.jmu.bibasedmanage.exception.BusinessException:".length(),
							errmsg.indexOf("\n"));
					if (log.isDebugEnabled())
						log.debug("抓取异常信息：" + errmsg);
				}
			}
			jsonView.addObject("result", errmsg);
			response.setStatus(200);
			return jsonView;
		default:
			return super.doResolveException(request, response, handler, ex);
		}
	}

	protected int resovleResponseType(HttpServletRequest request, Exception ex) {
		String accept = request.getHeader("Accept");
		if (accept == null)
			accept = "";
		if (AJAX_HEADER_VALUE.equalsIgnoreCase(request.getHeader(AJAX_HEADER))
				|| accept.toLowerCase().contains("application/json") || accept.toLowerCase().contains("text/json")) {
			return RESPONSE_TYPE_JSON;
		} else {
			return RESPONSE_TYPE_HTML;
		}
	}

	@Override
	protected void logException(Exception ex, HttpServletRequest request) {
		if (ex instanceof BusinessException) {
			log.info(ex.getMessage());
		} else {
			log.error("", ex);
		}
	}

}
