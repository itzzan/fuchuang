package com.zan.mapper;

import com.zan.pojo.TaxiInvoice;

public interface TaxiInvoiceMapper {
    int deleteByPrimaryKey(Integer invoiceId);

    int insert(TaxiInvoice record);

    int insertSelective(TaxiInvoice record);

    TaxiInvoice selectByPrimaryKey(Integer invoiceId);

    int updateByPrimaryKeySelective(TaxiInvoice record);

    int updateByPrimaryKey(TaxiInvoice record);
}