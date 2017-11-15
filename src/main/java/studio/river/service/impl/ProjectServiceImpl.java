package studio.river.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studio.river.dao.IProjectDao;
import studio.river.pojo.Project;
import studio.river.service.IProjectService;

import java.util.List;

/**
 * Created by Administrator on 2017/11/1.
 */

@Service
public class ProjectServiceImpl implements IProjectService{

    @Autowired
    private IProjectDao iProjectDao;
    @Override
    public List<Project> getAllProjects() {
        return iProjectDao.getAllProjectList();
    }
}
