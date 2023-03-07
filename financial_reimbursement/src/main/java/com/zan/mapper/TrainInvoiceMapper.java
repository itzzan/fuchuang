package com.zan.mapper;

import com.zan.pojo.TrainInvoice;

public interface TrainInvoiceMapper {
    int deleteByPrimaryKey(Integer invoiceId);

    int insert(TrainInvoice record);

    int insertSelective(TrainInvoice record);

    TrainInvoice selectByPrimaryKey(Integer invoiceId);

    int updateByPrimaryKeySelective(TrainInvoice record);

    int updateByPrimaryKey(TrainInvoice record);
}