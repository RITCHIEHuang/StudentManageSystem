package dao;

import bean.StudentInfoBean;
import bean.StudentInfoBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentInfoBeanMapper {
    long countByExample(StudentInfoBeanExample example);

    int deleteByExample(StudentInfoBeanExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(StudentInfoBean record);

    int insertSelective(StudentInfoBean record);

    List<StudentInfoBean> selectByExample(StudentInfoBeanExample example);

    StudentInfoBean selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") StudentInfoBean record, @Param("example") StudentInfoBeanExample example);

    int updateByExample(@Param("record") StudentInfoBean record, @Param("example") StudentInfoBeanExample example);

    int updateByPrimaryKeySelective(StudentInfoBean record);

    int updateByPrimaryKey(StudentInfoBean record);
}