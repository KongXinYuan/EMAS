package com.evmtv.epg.mapper;

import com.evmtv.epg.entity.BranchIdAndSourceId;
import com.evmtv.epg.entity.TContractAdvResource;
import com.evmtv.epg.entity.TContractAdvResourceExample;
import com.evmtv.epg.response.ResourceContractAdvResponse;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TContractAdvResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_contract_adv_resource
     *
     * @mbggenerated Sun Sep 15 20:56:22 CST 2013
     */
    int countByExample(TContractAdvResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_contract_adv_resource
     *
     * @mbggenerated Sun Sep 15 20:56:22 CST 2013
     */
    int deleteByExample(TContractAdvResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_contract_adv_resource
     *
     * @mbggenerated Sun Sep 15 20:56:22 CST 2013
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_contract_adv_resource
     *
     * @mbggenerated Sun Sep 15 20:56:22 CST 2013
     */
    int insert(TContractAdvResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_contract_adv_resource
     *
     * @mbggenerated Sun Sep 15 20:56:22 CST 2013
     */
    int insertSelective(TContractAdvResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_contract_adv_resource
     *
     * @mbggenerated Sun Sep 15 20:56:22 CST 2013
     */
    List<TContractAdvResource> selectByExample(TContractAdvResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_contract_adv_resource
     *
     * @mbggenerated Sun Sep 15 20:56:22 CST 2013
     */
    TContractAdvResource selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_contract_adv_resource
     *
     * @mbggenerated Sun Sep 15 20:56:22 CST 2013
     */
    int updateByExampleSelective(@Param("record") TContractAdvResource record, @Param("example") TContractAdvResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_contract_adv_resource
     *
     * @mbggenerated Sun Sep 15 20:56:22 CST 2013
     */
    int updateByExample(@Param("record") TContractAdvResource record, @Param("example") TContractAdvResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_contract_adv_resource
     *
     * @mbggenerated Sun Sep 15 20:56:22 CST 2013
     */
    int updateByPrimaryKeySelective(TContractAdvResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_contract_adv_resource
     *
     * @mbggenerated Sun Sep 15 20:56:22 CST 2013
     */
    int updateByPrimaryKey(TContractAdvResource record);
    /**
     * 广告位资源
     * @param record
     * @return
     */
    List<ResourceContractAdvResponse> selectResourceByRcaresponse(@Param("record") ResourceContractAdvResponse record);
    /**
     * 广告位资源
     * @param response
     * @return
     */
	int countResourceByRcaresponse(@Param("record") ResourceContractAdvResponse record);
	/**
	 * 广告播出时间验证
	 * @return
	 */
	List<BranchIdAndSourceId> startDateVerifySource();
}