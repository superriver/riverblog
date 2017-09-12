package studio.river.common;

import java.util.List;

/**
 * Created by Administrator on 2017/9/4.
 */
public class PageBean {


    private Integer pageIndex = 0;
    //当前页
    private Integer pageNumber = 1;

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
    /**
     * 唯一公有构造器
     *
     * @param pageNumber 当前页码:默认值为1
     * @param pageSize   每页显示记录数:默认值为10
     */
    public PageBean(int pageNumber, int pageSize) {
        System.out.println("currentPage---"+pageNumber);
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.pageIndex = (this.pageNumber - 1) * this.pageSize;
    }


    public Integer getPageIndex() {
        return (this.pageNumber - 1) * this.pageSize;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
}
