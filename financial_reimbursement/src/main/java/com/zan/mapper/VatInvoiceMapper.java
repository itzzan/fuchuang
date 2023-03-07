package com.zan.mapper;

import com.zan.pojo.VatInvoice;

public interface VatInvoiceMapper {
    int deleteByPrimaryKey(Integer invoiceId);

    int insert(VatInvoice record);

    int insertSelective(VatInvoice record);

    VatInvoice selectByPrimaryKey(Integer invoiceId);

    int updateByPrimaryKeySelective(VatInvoice record);

    int updateByPrimaryKey(VatInvoice record);
}