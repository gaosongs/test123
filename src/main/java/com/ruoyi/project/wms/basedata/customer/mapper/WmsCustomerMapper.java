package com.ruoyi.project.wms.basedata.customer.mapper;


import com.ruoyi.project.wms.basedata.customer.domain.WmsCustomer;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-25
 */
public interface WmsCustomerMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param cid 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public WmsCustomer selectWmsCustomerById(Long cid);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param wmsCustomer 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<WmsCustomer> selectWmsCustomerList(WmsCustomer wmsCustomer);

    /**
     * 新增【请填写功能名称】
     * 
     * @param wmsCustomer 【请填写功能名称】
     * @return 结果
     */
    public int insertWmsCustomer(WmsCustomer wmsCustomer);

    /**
     * 修改【请填写功能名称】
     * 
     * @param wmsCustomer 【请填写功能名称】
     * @return 结果
     */
    public int updateWmsCustomer(WmsCustomer wmsCustomer);

    /**
     * 删除【请填写功能名称】
     * 
     * @param cid 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteWmsCustomerById(Long cid);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param cids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWmsCustomerByIds(String[] cids);
}
