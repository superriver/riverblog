package studio.river.common;

import java.util.List;

/**
 * Created by Administrator on 2017/9/4.
 */
public class PageBean {


    private Integer pageIndex = 0;
    //当前页
    private Integer pageNumber = 0;

    //每页的记录数
    private Integer pageSize = 3;

    //总记录数
    private Integer totalCount;

    //总页数
    private Integer totalPage;

    public  PageBean(){

    }
    public void init(int totalCount) {
        this.totalCount = totalCount;
        totalPage = (totalCount % pageSize == 0) ? totalCount / pageSize : (totalCount / pageSize + 1);
    }

    public PageBean(int pageNumber, int pageSize) {
        System.out.println("currentPage---"+pageNumber);
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.pageIndex = (this.pageNumber - 1) * this.pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
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
    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }
}
