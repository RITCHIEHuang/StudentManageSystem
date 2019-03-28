package dao;

import bean.DepartmentInfoBean;
import bean.DepartmentInfoBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentInfoBeanMapper {
    long countByExample(DepartmentInfoBeanExample example);

    int deleteByExample(DepartmentInfoBeanExample example);

    int deleteByPrimaryKey(Integer dId);

    int insert(DepartmentInfoBean record);

    int insertSelective(DepartmentInfoBean record);

    List<DepartmentInfoBean> selectByExample(DepartmentInfoBeanExample example);

    DepartmentInfoBean selectByPrimaryKey(Integer dId);

    int updateByExampleSelective(@Param("record") DepartmentInfoBean record, @Param("example") DepartmentInfoBeanExample example);

    int updateByExample(@Param("record") DepartmentInfoBean record, @Param("example") DepartmentInfoBeanExample example);

    int updateByPrimaryKeySelective(DepartmentInfoBean record);

    int updateByPrimaryKey(DepartmentInfoBean record);
}