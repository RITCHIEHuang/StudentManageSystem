package dao;

import bean.StudentLoginBean;
import bean.StudentLoginBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentLoginBeanMapper {
    long countByExample(StudentLoginBeanExample example);

    int deleteByExample(StudentLoginBeanExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(StudentLoginBean record);

    int insertSelective(StudentLoginBean record);

    List<StudentLoginBean> selectByExample(StudentLoginBeanExample example);

    StudentLoginBean selectByPrimaryKey(Integer uId);

    int updateByExampleSelective(@Param("record") StudentLoginBean record, @Param("example") StudentLoginBeanExample example);

    int updateByExample(@Param("record") StudentLoginBean record, @Param("example") StudentLoginBeanExample example);

    int updateByPrimaryKeySelective(StudentLoginBean record);

    int updateByPrimaryKey(StudentLoginBean record);
}