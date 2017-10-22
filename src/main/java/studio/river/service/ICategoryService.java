package studio.river.service;

import studio.river.pojo.Category;

import java.util.List;

/**
 * Created by Administrator on 2017-10-22.
 */
public interface ICategoryService {
    /**
     * 获取所有文章分类
     * @return
     */
    List<Category> getAllCategory();
}
