package studio.river.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import studio.river.common.CommonResult;
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

    @ResponseBody
    @RequestMapping(value = "/recent",method = RequestMethod.GET)
    public CommonResult<Article> list(){
        System.out.println("1----->");
        List<Article> list = articleService.getByAll();
        System.out.println("2----->"+list.size());
        return new CommonResult<Article>(Constant.SUCCESS_CODE,null,list);
    }

}
