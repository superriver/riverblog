package studio.river.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studio.river.dao.ICategoryDao;
import studio.river.pojo.Category;
import studio.river.service.ICategoryService;

import java.util.List;

/**
 * Created by Administrator on 2017-10-22.
 */
@Service
public class CategoryServiceImpl implements ICategoryService{
    @Autowired
    ICategoryDao iCategoryDao;
    @Override
    public List<Category> getAllCategory() {
        return null;
    }
}
