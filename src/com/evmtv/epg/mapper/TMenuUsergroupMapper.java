package com.evmtv.epg.mapper;

import com.evmtv.epg.entity.TMenuUsergroup;
import com.evmtv.epg.entity.TMenuUsergroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMenuUsergroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_usergroup
     *
     * @mbggenerated Mon Jul 01 16:35:57 CST 2013
     */
    int countByExample(TMenuUsergroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_usergroup
     *
     * @mbggenerated Mon Jul 01 16:35:57 CST 2013
     */
    int deleteByExample(TMenuUsergroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_usergroup
     *
     * @mbggenerated Mon Jul 01 16:35:57 CST 2013
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_usergroup
     *
     * @mbggenerated Mon Jul 01 16:35:57 CST 2013
     */
    int insert(TMenuUsergroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_usergroup
     *
     * @mbggenerated Mon Jul 01 16:35:57 CST 2013
     */
    int insertSelective(TMenuUsergroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_usergroup
     *
     * @mbggenerated Mon Jul 01 16:35:57 CST 2013
     */
    List<TMenuUsergroup> selectByExample(TMenuUsergroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_usergroup
     *
     * @mbggenerated Mon Jul 01 16:35:57 CST 2013
     */
    TMenuUsergroup selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_usergroup
     *
     * @mbggenerated Mon Jul 01 16:35:57 CST 2013
     */
    int updateByExampleSelective(@Param("record") TMenuUsergroup record, @Param("example") TMenuUsergroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_usergroup
     *
     * @mbggenerated Mon Jul 01 16:35:57 CST 2013
     */
    int updateByExample(@Param("record") TMenuUsergroup record, @Param("example") TMenuUsergroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_usergroup
     *
     * @mbggenerated Mon Jul 01 16:35:57 CST 2013
     */
    int updateByPrimaryKeySelective(TMenuUsergroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_usergroup
     *
     * @mbggenerated Mon Jul 01 16:35:57 CST 2013
     */
    int updateByPrimaryKey(TMenuUsergroup record);
}