package com.ruoyi.project.wms.basedata.customer.service;


import com.ruoyi.project.wms.basedata.customer.domain.WmsCustomer;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-12-25
 */
public interface IWmsCustomerService 
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
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWmsCustomerByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param cid 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteWmsCustomerById(Long cid);
}
