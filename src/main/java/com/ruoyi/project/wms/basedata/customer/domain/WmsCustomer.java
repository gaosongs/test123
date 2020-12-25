package com.ruoyi.project.wms.basedata.customer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【客户管理】对象 wms_customer
 * 
 * @author ruoyi
 * @date 2020-12-25
 */
public class WmsCustomer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long cid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ctype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String caddress;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ceo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cphone;

    public void setCid(Long cid) 
    {
        this.cid = cid;
    }

    public Long getCid() 
    {
        return cid;
    }
    public void setCname(String cname) 
    {
        this.cname = cname;
    }

    public String getCname() 
    {
        return cname;
    }
    public void setCtype(String ctype) 
    {
        this.ctype = ctype;
    }

    public String getCtype() 
    {
        return ctype;
    }
    public void setCaddress(String caddress) 
    {
        this.caddress = caddress;
    }

    public String getCaddress() 
    {
        return caddress;
    }
    public void setCeo(String ceo) 
    {
        this.ceo = ceo;
    }

    public String getCeo() 
    {
        return ceo;
    }
    public void setCphone(String cphone) 
    {
        this.cphone = cphone;
    }

    public String getCphone() 
    {
        return cphone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cid", getCid())
            .append("cname", getCname())
            .append("ctype", getCtype())
            .append("caddress", getCaddress())
            .append("ceo", getCeo())
            .append("cphone", getCphone())
            .toString();
    }
}
