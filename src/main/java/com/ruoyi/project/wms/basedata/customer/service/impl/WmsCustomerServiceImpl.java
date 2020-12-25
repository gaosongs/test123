package com.ruoyi.project.wms.basedata.customer.service.impl;


import com.ruoyi.common.utils.text.Convert;
import com.ruoyi.project.wms.basedata.customer.domain.WmsCustomer;
import com.ruoyi.project.wms.basedata.customer.mapper.WmsCustomerMapper;
import com.ruoyi.project.wms.basedata.customer.service.IWmsCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-25
 */
@Service
public class WmsCustomerServiceImpl implements IWmsCustomerService
{
    @Autowired
    private WmsCustomerMapper wmsCustomerMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param cid 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public WmsCustomer selectWmsCustomerById(Long cid)
    {
        return wmsCustomerMapper.selectWmsCustomerById(cid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param wmsCustomer 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<WmsCustomer> selectWmsCustomerList(WmsCustomer wmsCustomer)
    {
        return wmsCustomerMapper.selectWmsCustomerList(wmsCustomer);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param wmsCustomer 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertWmsCustomer(WmsCustomer wmsCustomer)
    {
        return wmsCustomerMapper.insertWmsCustomer(wmsCustomer);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param wmsCustomer 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateWmsCustomer(WmsCustomer wmsCustomer)
    {
        return wmsCustomerMapper.updateWmsCustomer(wmsCustomer);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWmsCustomerByIds(String ids)
    {
        return wmsCustomerMapper.deleteWmsCustomerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param cid 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteWmsCustomerById(Long cid)
    {
        return wmsCustomerMapper.deleteWmsCustomerById(cid);
    }
}
