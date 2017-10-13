package studio.river.vo;

import java.util.List;

/**
 * Created by Administrator on 2017/10/10.
 */
public class ArchiveVo {
    private String name;
    private String count;
    private List<ArchiveVo> childArchive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<ArchiveVo> getChildArchive() {
        return childArchive;
    }

    public void setChildArchive(List<ArchiveVo> childArchive) {
        this.childArchive = childArchive;
    }
}
