package studio.river.service;

import studio.river.common.PageBean;
import studio.river.common.PageHelper;
import studio.river.pojo.Article;
import studio.river.vo.ArchiveVo;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017-8-27.
 */
public interface IArticleService {

    /**
     * 获取最近发布的文章
     * @return
     */
    List<Article> getRecent();

    /**
     * 获取所有的文章记录
     * @param pageBean
     * @return
     */
    PageHelper<Article> getByAll(PageBean pageBean);

    /**
     * 通过文章id获取文章
     * @return
     */
    Map<String ,Object> getArticleVoByCode(String code);

    /**
     * 文章归档
     */
    /**
     * 获取最近发布的文章
     * @return
     */
    List<ArchiveVo> getArchiveList();

    List<Article> getArchiveArticles(String name);
}
