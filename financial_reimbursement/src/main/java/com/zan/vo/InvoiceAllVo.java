package com.zan.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 票据详情Vo[所有票据类型]
 */
public class InvoiceAllVo {

    private Integer invoiceId;

    private String invoiceName;

    private String invoiceCode;

    private BigDecimal invoicePrice;

    private Date invoiceDate;

    private String vatInvoicePayerName;

    private String varInvoiceGoodsList;

    private String vatInvoiceRatePayerId;

    private String vatInvoiceSellerName;

    private String vatInvoiceSellerBankAccount;

    private String passengerName;

    private String passengerId;

    private Date departureDate;

    private String departureStation;

    private String arrivalStation;

    private String ticketType;

    private Integer authenticity;

    private Integer existInvoiceSeal;

    private Integer existStample;

    private String invoiceNumber;

    //以下为其他信息
    private String vatInvoiceHaoma;

    private String vatInvoiceCorrectCode;

    private String vatInvoiceSellerId;

    private String vatInvoiceZhuanYongFlag;

    private String trainNumber;

    private String seatNumber;

    private String wagonNumber;

    private String mileage;

    private BigDecimal civilAviationFund;

    private BigDecimal fuelSurcharge;

    private BigDecimal premium;

    private String groups;

    private String remarks;

    private Date createTime;
}
