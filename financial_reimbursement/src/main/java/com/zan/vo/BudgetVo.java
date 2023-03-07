package com.zan.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BudgetVo {

    private BigDecimal equipmentCost;

    private BigDecimal operationCost;

    private BigDecimal outsourcingCost;

    private BigDecimal indirectCost;

    private BigDecimal travelConferenceInternationalCost;

    private BigDecimal publicationLiteratureInformationIntellectualCost;

    private BigDecimal competitionCost;

    private BigDecimal studentGrants;

    private BigDecimal expertConsultationCost;

    private BigDecimal outsourcingCommissionCost;

    private BigDecimal otherCost;

    private BigDecimal trafficCost;

    private BigDecimal managementCost;

    private BigDecimal officeCost;

    private BigDecimal hotelCost;

}
