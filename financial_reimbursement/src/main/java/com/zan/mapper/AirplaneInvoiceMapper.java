package com.zan.mapper;

import com.zan.pojo.AirplaneInvoice;

public interface AirplaneInvoiceMapper {
    int deleteByPrimaryKey(Integer invoiceId);

    int insert(AirplaneInvoice record);

    int insertSelective(AirplaneInvoice record);

    AirplaneInvoice selectByPrimaryKey(Integer invoiceId);

    int updateByPrimaryKeySelective(AirplaneInvoice record);

    int updateByPrimaryKey(AirplaneInvoice record);
}