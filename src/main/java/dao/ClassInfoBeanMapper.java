package dao;

import bean.ClassInfoBean;
import bean.ClassInfoBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassInfoBeanMapper {
    long countByExample(ClassInfoBeanExample example);

    int deleteByExample(ClassInfoBeanExample example);

    int deleteByPrimaryKey(Integer classId);

    int insert(ClassInfoBean record);

    int insertSelective(ClassInfoBean record);

    List<ClassInfoBean> selectByExample(ClassInfoBeanExample example);

    ClassInfoBean selectByPrimaryKey(Integer classId);

    int updateByExampleSelective(@Param("record") ClassInfoBean record, @Param("example") ClassInfoBeanExample example);

    int updateByExample(@Param("record") ClassInfoBean record, @Param("example") ClassInfoBeanExample example);

    int updateByPrimaryKeySelective(ClassInfoBean record);

    int updateByPrimaryKey(ClassInfoBean record);
}