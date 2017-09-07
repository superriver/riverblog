package studio.river.common;

import java.util.List;

/**
 * Created by Administrator on 2017/9/4.
 */
public class PageBean<T> {
    private Integer pageIndex = 0;
    //当前页
    private Integer currentPage = 0;

    //每页的记录数
    private Integer pageSize = 10;

    //总记录数
    private Integer totalCount;

    //总页数
    private Integer totalPage;

    //每页对应记录数的集合
    private List<T> pageList;
    public PageBean( List<T> pageList) {
        this.pageList = pageList;
    }
    public PageBean(int currentPage, int pageSize, int totalCount, List<T> pageList) {
        this.pageList = pageList;
        this.totalCount = totalCount;
        totalPage = (totalCount % pageSize == 0) ? totalCount / pageSize : (totalCount / pageSize + 1);
    }

    public PageBean(int currentPage, int pageSize) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        pageIndex = (this.currentPage - 1) * pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getPageList() {
        return pageList;
    }

    public void setPageList(List<T> pageList) {
        this.pageList = pageList;
    }
}
