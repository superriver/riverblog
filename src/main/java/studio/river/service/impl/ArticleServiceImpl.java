package studio.river.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studio.river.common.PageBean;
import studio.river.common.PageHelper;
import studio.river.dao.IArticleDao;
import studio.river.pojo.Article;
import studio.river.service.IArticleService;

import java.util.List;

/**
 * Created by Administrator on 2017-8-27.
 */
@Service
public class ArticleServiceImpl implements IArticleService {
    @Autowired
    private IArticleDao iArticleDao;

    @Override
    public List<Article> getRecent() {
        System.out.println("getRecent---------");
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
}
