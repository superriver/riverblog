package studio.river.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
        return iArticleDao.selectRecent();
    }

    @Override
    public List<Article> getByAll() {

        return iArticleDao.selectAll();
    }
}
