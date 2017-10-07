package studio.river.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import studio.river.common.CommonResult;
import studio.river.common.PageBean;
import studio.river.common.PageHelper;
import studio.river.common.constant.Constant;
import studio.river.pojo.Article;
import studio.river.service.IArticleService;

import java.util.List;
import java.util.Map;

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
            System.out.println("1---------");
            List<Article> list = articleService.getRecent();
            System.out.println("---------"+list.size());
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
    public CommonResult<Article> getAll(PageBean pageBean){
        String message  = null;
        CommonResult result = null;
        try {
            System.out.println("pageBean---------"+pageBean.getPageIndex());
            PageHelper<Article> list = articleService.getByAll(pageBean);
            System.out.println("PageHelper---------"+list.getPageList().size());

            result= new CommonResult<>(Constant.SUCCESS_CODE,null,list);
        }catch (Exception e){
            System.out.println("----"+e.getMessage());
            message="服务器异常，获取文章失败";
            result = new CommonResult<>(Constant.FAILED_CODE,message);
        }
        return result;
    }
    /**
     * 获取文章记录数
     */
    @ResponseBody
    @RequestMapping(value = "/blog/article/{code}",method = RequestMethod.GET)
    public CommonResult getArticleByCode(@PathVariable("code") String articleCode){
       Map<String,Object> map= articleService.getArticleVoByCode(articleCode);
        String msg = null;
        CommonResult commonResult=null;
        System.out.println("getArticleByCode---------"+map.size());
        if(map==null){
            msg="抱歉，你要查看的文章不存在！";
            commonResult = new CommonResult(Constant.FAILED_CODE,msg);
        }else{
            commonResult =  new CommonResult(Constant.SUCCESS_CODE,msg,map);
        }
       return commonResult;
    }
}
