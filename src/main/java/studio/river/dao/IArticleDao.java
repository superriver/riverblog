package studio.river.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import studio.river.common.PageBean;
import studio.river.pojo.Article;

import java.util.List;

@Repository(value = "iArticleDao")
public interface IArticleDao {

    /**
     *
     * select title from article where order by datatime limit 5
     * @param id
     * @return
     */

    List<Article> selectRecent();

    List<Article> selectAll(@Param("pageBean") PageBean pageBean);

    int selectCount();

    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
}