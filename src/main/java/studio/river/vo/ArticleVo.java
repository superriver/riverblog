package studio.river.vo;

import studio.river.pojo.Article;

/**
 * Created by Administrator on 2017/9/29.
 */
public class ArticleVo extends Article{
    private String categoryName;
    private String categoryCode;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }
}
