package dao;

import bean.AdminLoginBean;
import bean.AdminLoginBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminLoginBeanMapper {
    long countByExample(AdminLoginBeanExample example);

    int deleteByExample(AdminLoginBeanExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(AdminLoginBean record);

    int insertSelective(AdminLoginBean record);

    List<AdminLoginBean> selectByExample(AdminLoginBeanExample example);

    AdminLoginBean selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") AdminLoginBean record, @Param("example") AdminLoginBeanExample example);

    int updateByExample(@Param("record") AdminLoginBean record, @Param("example") AdminLoginBeanExample example);

    int updateByPrimaryKeySelective(AdminLoginBean record);

    int updateByPrimaryKey(AdminLoginBean record);
}