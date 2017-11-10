package studio.river.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import studio.river.common.CommonResult;
import studio.river.common.constant.Constant;
import studio.river.pojo.Category;
import studio.river.pojo.Project;
import studio.river.service.IProjectService;

import java.util.List;

/**
 * Created by Administrator on 2017/10/30.
 */
@Controller
@RequestMapping
public class ProjectController {
    @Autowired
    IProjectService projectService;

    @ResponseBody
    @RequestMapping(value = "/blog/project", method = RequestMethod.GET)
    public CommonResult getProjects(){
        String message = null;
        CommonResult result = null;
        try {
            List<Project> list = projectService.getAllProjects();
            result = new CommonResult(Constant.SUCCESS_CODE, null, list);
        } catch (Exception e) {
            message = "服务器异常，获取文章归档失败";
            result = new CommonResult(Constant.FAILED_CODE, message);
        }
        return result;
    }
}
