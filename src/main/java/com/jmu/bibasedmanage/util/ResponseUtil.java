package com.jmu.bibasedmanage.util;

import com.jmu.bibasedmanage.vo.JsonResponse;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用返回类工具
 * Created by ljc on 2017/12/18.
 */
public class ResponseUtil {
    public static final String SUCCESS = "SUCCESS";//成功
    public static final String FAIL = "FAIL";//失败
    public static final String ERROR = "ERROR";//错误

    public ResponseUtil() {
    }

    public static JsonResponse success(Object result) {
        JsonResponse response = new JsonResponse();
        response.setStatus(SUCCESS);
        response.setResult(result);
        return response;
    }
    /**
     * 返回SUCCESS的Response，并自动根据key1,value1,key2,value2...的参数结构构造Map的result
     *
     * @param keyValues
     * @return
     */
    public static JsonResponse successMap(Object... keyValues) {
        Map<String, Object> result = new HashMap();
        String key = null;
        for (Object kv : keyValues) {
            if (key == null) {
                Assert.isInstanceOf(String.class, kv, "key值必须是字符串");
                key = kv.toString();
            }
            else {
                result.put(key, kv);
                key = null;
            }
        }
        return success(result);
    }

    public static JsonResponse success() {
        JsonResponse response = new JsonResponse();
        response.setStatus(SUCCESS);
        return response;
    }

    public static JsonResponse fail() {
        JsonResponse response = new JsonResponse();
        response.setStatus(FAIL);
        return response;

    }

    public static JsonResponse error(String msg) {
        JsonResponse response = new JsonResponse();
        response.setStatus(ERROR);
        response.setResult(msg);
        return response;
    }

}
