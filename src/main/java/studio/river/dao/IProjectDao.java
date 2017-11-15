package studio.river.dao;

import org.springframework.stereotype.Repository;
import studio.river.pojo.Project;

import java.util.List;

/**
 * Created by Administrator on 2017/11/1.
 */
@Repository(value = "iProjectDao")
public interface IProjectDao {
    List<Project> getAllProjectList();
}
