package studio.river.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studio.river.common.PageBean;
import studio.river.common.PageHelper;
import studio.river.dao.IArticleDao;
import studio.river.pojo.Article;
import studio.river.service.IArticleService;
import studio.river.vo.ArchiveVo;
import studio.river.vo.ArticleVo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017-8-27.
 */
@Service
public class ArticleServiceImpl implements IArticleService {
    @Autowired
    private IArticleDao iArticleDao;

    @Override
    public List<Article> getRecent() {
        List<Article> articles=null;
        try {
            articles= iArticleDao.selectRecent();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        return articles;
    }

    @Override
    public PageHelper<Article> getByAll(PageBean pageBean) {
        List<Article> list = iArticleDao.selectAll(pageBean);
        int count = iArticleDao.selectCount();
        return new PageHelper<>(pageBean, list, count);
    }

    @Override
    public Map<String, Object> getArticleVoByCode(String code) {
        ArticleVo article = iArticleDao.getByVoCode(code);
        System.out.println("getCategoryName---------" + article.getCategoryName());
        Map<String, Object> map = new HashMap<>();
        Article preArticle = iArticleDao.selectNextOrPreVoBy(article,false);
        Article nextArticle = iArticleDao.selectNextOrPreVoBy(article,true);
        map.put("currentArticle",article);
        map.put("preArticle",preArticle);
        map.put("nextArticle",nextArticle);
        return map;
    }

    @Override
    public List<ArchiveVo> getArchiveList() {
        return iArticleDao.getArchiveList();
    }

    @Override
    public List<Article> getArchiveArticles(String name) {
        return  iArticleDao.selectArchiveArticles(name);
    }

    @Override
    public List<Article> getAllByCategoryCode(String code) {
        return iArticleDao.getCategoryArticles(code);
    }

}
