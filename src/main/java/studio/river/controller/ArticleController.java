package studio.river.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import studio.river.common.CommonResult;
import studio.river.common.PageBean;
import studio.river.common.constant.Constant;
import studio.river.pojo.Article;
import studio.river.service.IArticleService;

import java.util.List;

/**
 * Created by Administrator on 2017-8-27.
 */

@RequestMapping(value = "")
@Controller
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    //获取最近发布的文章
    @ResponseBody
    @RequestMapping(value = "/recent",method = RequestMethod.GET)
    public CommonResult<Article> list(){
        String message  = null;
        CommonResult result = null;
        try{
            List<Article> list = articleService.getRecent();
            result= new CommonResult<>(Constant.SUCCESS_CODE,null,list);
        }catch (Exception e){
            message="服务器异常，获取文章失败";
            result = new CommonResult<>(Constant.FAILED_CODE,message);
        }
        return result;
    }

    /**
     * 获取所有的文章
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/blog",method = RequestMethod.POST)
    public CommonResult<Article> getAll(@RequestParam("pageIndex") int pageIndex,@RequestParam("pageSize") int pageSize){
        String message  = null;
        CommonResult result = null;
        PageBean<Article> pageBean = new PageBean<Article>(pageIndex,pageSize);
        try {

            PageBean<Article> list = articleService.getByAll(pageBean);
            result= new CommonResult<>(Constant.SUCCESS_CODE,null,list);
        }catch (Exception e){
            message="服务器异常，获取文章失败";
            result = new CommonResult<>(Constant.FAILED_CODE,message);
        }
        return result;
    }
    /**
     * 获取文章记录数
     */
}
