package studio.river.dao;

import org.springframework.stereotype.Repository;
import studio.river.pojo.Category;

import java.util.List;

/**
 * Created by Administrator on 2017-10-22.
 */
@Repository(value = "iCategoryDao")
public interface ICategoryDao {

    List<Category> getAllCategory();
}
