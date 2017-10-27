package studio.river.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import studio.river.common.CommonResult;
import studio.river.common.constant.Constant;
import studio.river.pojo.Article;
import studio.river.pojo.Category;
import studio.river.service.IArticleService;
import studio.river.service.ICategoryService;
import studio.river.service.impl.CategoryServiceImpl;
import studio.river.vo.ArchiveVo;

import java.util.List;

/**
 * Created by Administrator on 2017-10-22.
 */

@RequestMapping(value = "")
@Controller
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private IArticleService articleService;
    @ResponseBody
    @RequestMapping(value = "/blog/category",method = RequestMethod.GET)
    public CommonResult getAllCategory(){
        String message = null;
        CommonResult result = null;
        try {
            List<Category> list = categoryService.getAllCategory();
            System.out.println("list->"+list.size());
            result = new CommonResult(Constant.SUCCESS_CODE, null, list);
        } catch (Exception e) {
            message = "服务器异常，获取文章归档失败";
            result = new CommonResult(Constant.FAILED_CODE, message);
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/blog/category/{code}",method = RequestMethod.GET)
    public CommonResult getCategoryList(@PathVariable("code") String code){
        String message = null;
        CommonResult result = null;
        try {
            System.out.println("id---"+code);
            List<Article> list = articleService.getAllByCategoryCode(code);
            result = new CommonResult(Constant.SUCCESS_CODE, null, list);
        } catch (Exception e) {
            message = "服务器异常，获取文章归档失败";
            result = new CommonResult(Constant.FAILED_CODE, message);
        }
        return result;

    }
}
