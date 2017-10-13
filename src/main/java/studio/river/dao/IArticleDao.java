package studio.river.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import studio.river.common.PageBean;
import studio.river.pojo.Article;
import studio.river.vo.ArchiveVo;
import studio.river.vo.ArticleVo;

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

    ArticleVo getByVoCode(@Param("code") String code);

    Article selectNextOrPreVoBy(@Param("article") Article article,
                                @Param("nextOrPreVo") Boolean nextOrPreVo);


    List<ArchiveVo> getArchiveList();


    List<Article> selectArchiveArticles(@Param("month_name") String monthName);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
}