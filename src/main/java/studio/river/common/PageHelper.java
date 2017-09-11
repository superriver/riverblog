package studio.river.common;

import java.util.List;

/**
 * Created by Administrator on 2017/9/7.
 */
public class PageHelper<T> {
    //每页对应记录数的集合
    private List<T> pageList;
    private PageBean pageBean;
    public PageHelper(){

    }
    public PageHelper(PageBean pageBean,List<T> pageList,int totalCount){
        this.pageBean  = pageBean;
        this.pageList  = pageList;
        pageBean.init(totalCount);
    }
    public List<T> getPageList() {
        return pageList;
    }

    public void setPageList(List<T> pageList) {
        this.pageList = pageList;
    }

    public PageBean getPageBean() {
        return pageBean;
    }

    public void setPageBean(PageBean pageBean) {
        this.pageBean = pageBean;
    }



}
