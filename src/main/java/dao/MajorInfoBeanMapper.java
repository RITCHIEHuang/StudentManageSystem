package dao;

import bean.MajorInfoBean;
import bean.MajorInfoBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MajorInfoBeanMapper {
    long countByExample(MajorInfoBeanExample example);

    int deleteByExample(MajorInfoBeanExample example);

    int deleteByPrimaryKey(Integer mId);

    int insert(MajorInfoBean record);

    int insertSelective(MajorInfoBean record);

    List<MajorInfoBean> selectByExample(MajorInfoBeanExample example);

    MajorInfoBean selectByPrimaryKey(Integer mId);

    int updateByExampleSelective(@Param("record") MajorInfoBean record, @Param("example") MajorInfoBeanExample example);

    int updateByExample(@Param("record") MajorInfoBean record, @Param("example") MajorInfoBeanExample example);

    int updateByPrimaryKeySelective(MajorInfoBean record);

    int updateByPrimaryKey(MajorInfoBean record);
}