package com.jmu.bibasedmanage.vo;

import com.github.miemiedev.mybatis.paginator.domain.PageList;

import java.io.Serializable;
import java.util.List;
/**
 * 分页返回类
 * Created by ljc on 2017/12/19.
 */
public class Page<T> implements Serializable{
    private int pageSize=2;
    private List<T> result;
    private int totalCount;
    private int pageNo=0;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    /**
     * 获取全页数
     * @return
     */
    public long getTotalPageCount() {
        return this.totalCount % this.pageSize == 0?this.totalCount / this.pageSize : this.totalCount / this.pageSize + 1;
    }

    /**
     * 根据PageList方法获取总条数
     * @param pageList
     */
    public void setTotalCountByPageList(PageList pageList){
        this.totalCount = pageList.getPaginator().getTotalCount();
    }


}
