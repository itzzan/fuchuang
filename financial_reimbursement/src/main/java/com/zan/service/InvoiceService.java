package com.zan.service;

import com.zan.vo.InvoiceAllVo;
import com.zan.vo.ResponseVo;

public interface InvoiceService {

    //扫描添加发票
    void addInvoice();

    //票据详情
    ResponseVo<InvoiceAllVo> invoiceDetail();

    //票据记录
    void invoiceList();

    //删除票据
    void deleteInvoice();
}
