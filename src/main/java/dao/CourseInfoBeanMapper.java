package dao;

import bean.CourseInfoBean;
import bean.CourseInfoBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseInfoBeanMapper {
    long countByExample(CourseInfoBeanExample example);

    int deleteByExample(CourseInfoBeanExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(CourseInfoBean record);

    int insertSelective(CourseInfoBean record);

    List<CourseInfoBean> selectByExample(CourseInfoBeanExample example);

    CourseInfoBean selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") CourseInfoBean record, @Param("example") CourseInfoBeanExample example);

    int updateByExample(@Param("record") CourseInfoBean record, @Param("example") CourseInfoBeanExample example);

    int updateByPrimaryKeySelective(CourseInfoBean record);

    int updateByPrimaryKey(CourseInfoBean record);
}