package studio.river.service;

import studio.river.common.PageBean;
import studio.river.common.PageHelper;
import studio.river.pojo.Article;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017-8-27.
 */
public interface IArticleService {

    List<Article> getRecent();
    PageHelper<Article> getByAll(PageBean pageBean);

    Map<String,Object> getByVoCode(String code);
}
