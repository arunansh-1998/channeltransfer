package com.comviva.vms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ChannelTransferVO {

    private String transferId;

    private String status;

    private String transferDate;

    private String referenceNo;

    private String extTxnNo;

    private String extTxnDate;

    private String initiatedBy;

    private String msisdn;

    private String distributionType;

    private String amount;

    private String transferValue;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTransferValue() {
        return transferValue;
    }

    public void setTransferValue(String transferValue) {
        this.transferValue = transferValue;
    }

    public String getDistributionType() {
        return distributionType;
    }

    public void setDistributionType(String distributionType) {
        this.distributionType = distributionType;
    }

    public String getInitiatedBy() {
        return initiatedBy;
    }

    public void setInitiatedBy(String initiatedBy) {
        this.initiatedBy = initiatedBy;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    //    private String commissionProfileSetId;
//
//    private String commissionProfileVersion;
//
//    private String requestedQuantity;
//
//    private String channelUserRemarks;
//
//    private String firstApproverRemarks;
//
//    private String secondApproverRemarks;
//
//    private String thirdApproverRemarks;
//
//    private String firstApprovedBy;
//
//    private String firstApprovedOn;
//
//    private String secondApprovedBy;
//
//    private String secondApprovedOn;
//
//    private String thirdApprovedBy;
//
//    private String thirdApprovedOn;
//
//    private String cancelledBy;
//
//    private String cancelledOn;
//
//    private String createdOn;
//
//    private String createdBy;
//
//    private String modifiedBy;
//
//    private String modifiedOn;
//
//    private String status;
//
//    private String type;
//
//    private String transferInitiatedBy;
//
//    private String transferMrp;
//
//    private String firstApproverLimit;
//
//    private String secondApproverLimit;
//
//    private String payableAmount;
//
//    private String netPayableAmount;
//
//    private String pmtInstType;
//
//    private String pmtInstNo;
//
//    private String pmtInstDate;
//
//    private String pmtInstAmount;
//
//    private String senderTxnProfile;
//
//    private String receiverTxnProfile;
//
//    private String totalTax1;
//
//    private String totalTax2;
//
//    private String totalTax3;
//
//    private String source;
//
//    private String receiverCategoryCode;
//
//    private String requestGatewayCode;
//
//    private String requestGatewayType;
//
//    private String pmtInstSource;
//
//    private String productType;
//
//    private String transferCategory;
//
//    private String transferType;
//
//    private String transferSubType;
//
//    private String closeDate;
//
//    private String batchNo;
//
//    private String batchDate;
//
//    private String controlTransfer;
//
//    private String msisdn;
//
//    private String toMsisdn;
//
//    private String toDomainCode;
//
//    private String toGrphDomainCode;
//
//    private String smsDefaultLang;
//
//    private String smsSecondLang;
//
//    private String focBonusBatchDate;
//
//    private String focBonusBatchNo;
//
//    private String firstLevelApprovedQuantity;
//
//    private String secondLevelApprovedQuantity;
//
//    private String thirdLevelApprovedQuantity;
//
//    private String txnWallet;
//
//    private String ownerTransferMrp;
//
//    private String ownerDebitMrp;
//
//    private String bonusType;
//
//    private String activeUserId;
//
//    private String transactionMode;
//
//    private String refTransferid;
//
//    private String cellId;
//
//    private String switchId;
//
//    private String lmsPointAdjustValue;
//
//    private String stockUpdated;
//
//    private String sosStatus;
//
//    private String sosSettlementDate;
//
//    private String info1;
//
//    private String info2;
//
//    private String dualCommType;
//
//    private String othCommPrfSetId;
//
//    private String info3;
//
//    private String info4;
//
//    private String info5;
//
//    private String pmtInstStatus;
//
//    private String oldMsisdn;
//
//    private String oldToMsisdn;
//
//    private String msisdnModified;
//
//    private String reconcilationBy;
//
//    private String reconcilationDate;
//
//    private String reconcilationFlag;
//
//    private String reconcilationRemark;
//
//    private String info6;
//
//    private String info7;
//
//    private String info8;
//
//    private String info9;
//
//    private String info10;
//
//    private String approvalDoc;
//
//    private String approvalDocType;
//
//    private String approvalDocFilePath;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public String getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getExtTxnNo() {
        return extTxnNo;
    }

    public void setExtTxnNo(String extTxnNo) {
        this.extTxnNo = extTxnNo;
    }

    public String getExtTxnDate() {
        return extTxnDate;
    }

    public void setExtTxnDate(String extTxnDate) {
        this.extTxnDate = extTxnDate;
    }

//    public String getCommissionProfileSetId() {
//        return commissionProfileSetId;
//    }
//
//    public void setCommissionProfileSetId(String commissionProfileSetId) {
//        this.commissionProfileSetId = commissionProfileSetId;
//    }
//
//    public String getCommissionProfileVersion() {
//        return commissionProfileVersion;
//    }
//
//    public void setCommissionProfileVersion(String commissionProfileVersion) {
//        this.commissionProfileVersion = commissionProfileVersion;
//    }
//
//    public String getRequestedQuantity() {
//        return requestedQuantity;
//    }
//
//    public void setRequestedQuantity(String requestedQuantity) {
//        this.requestedQuantity = requestedQuantity;
//    }
//
//    public String getChannelUserRemarks() {
//        return channelUserRemarks;
//    }
//
//    public void setChannelUserRemarks(String channelUserRemarks) {
//        this.channelUserRemarks = channelUserRemarks;
//    }
//
//    public String getFirstApproverRemarks() {
//        return firstApproverRemarks;
//    }
//
//    public void setFirstApproverRemarks(String firstApproverRemarks) {
//        this.firstApproverRemarks = firstApproverRemarks;
//    }
//
//    public String getSecondApproverRemarks() {
//        return secondApproverRemarks;
//    }
//
//    public void setSecondApproverRemarks(String secondApproverRemarks) {
//        this.secondApproverRemarks = secondApproverRemarks;
//    }
//
//    public String getThirdApproverRemarks() {
//        return thirdApproverRemarks;
//    }
//
//    public void setThirdApproverRemarks(String thirdApproverRemarks) {
//        this.thirdApproverRemarks = thirdApproverRemarks;
//    }
//
//    public String getFirstApprovedBy() {
//        return firstApprovedBy;
//    }
//
//    public void setFirstApprovedBy(String firstApprovedBy) {
//        this.firstApprovedBy = firstApprovedBy;
//    }
//
//    public String getFirstApprovedOn() {
//        return firstApprovedOn;
//    }
//
//    public void setFirstApprovedOn(String firstApprovedOn) {
//        this.firstApprovedOn = firstApprovedOn;
//    }
//
//    public String getSecondApprovedBy() {
//        return secondApprovedBy;
//    }
//
//    public void setSecondApprovedBy(String secondApprovedBy) {
//        this.secondApprovedBy = secondApprovedBy;
//    }
//
//    public String getSecondApprovedOn() {
//        return secondApprovedOn;
//    }
//
//    public void setSecondApprovedOn(String secondApprovedOn) {
//        this.secondApprovedOn = secondApprovedOn;
//    }
//
//    public String getThirdApprovedBy() {
//        return thirdApprovedBy;
//    }
//
//    public void setThirdApprovedBy(String thirdApprovedBy) {
//        this.thirdApprovedBy = thirdApprovedBy;
//    }
//
//    public String getThirdApprovedOn() {
//        return thirdApprovedOn;
//    }
//
//    public void setThirdApprovedOn(String thirdApprovedOn) {
//        this.thirdApprovedOn = thirdApprovedOn;
//    }
//
//    public String getCancelledBy() {
//        return cancelledBy;
//    }
//
//    public void setCancelledBy(String cancelledBy) {
//        this.cancelledBy = cancelledBy;
//    }
//
//    public String getCancelledOn() {
//        return cancelledOn;
//    }
//
//    public void setCancelledOn(String cancelledOn) {
//        this.cancelledOn = cancelledOn;
//    }
//
//    public String getCreatedOn() {
//        return createdOn;
//    }
//
//    public void setCreatedOn(String createdOn) {
//        this.createdOn = createdOn;
//    }
//
//    public String getCreatedBy() {
//        return createdBy;
//    }
//
//    public void setCreatedBy(String createdBy) {
//        this.createdBy = createdBy;
//    }
//
//    public String getModifiedBy() {
//        return modifiedBy;
//    }
//
//    public void setModifiedBy(String modifiedBy) {
//        this.modifiedBy = modifiedBy;
//    }
//
//    public String getModifiedOn() {
//        return modifiedOn;
//    }
//
//    public void setModifiedOn(String modifiedOn) {
//        this.modifiedOn = modifiedOn;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getTransferInitiatedBy() {
//        return transferInitiatedBy;
//    }
//
//    public void setTransferInitiatedBy(String transferInitiatedBy) {
//        this.transferInitiatedBy = transferInitiatedBy;
//    }
//
//    public String getTransferMrp() {
//        return transferMrp;
//    }
//
//    public void setTransferMrp(String transferMrp) {
//        this.transferMrp = transferMrp;
//    }
//
//    public String getFirstApproverLimit() {
//        return firstApproverLimit;
//    }
//
//    public void setFirstApproverLimit(String firstApproverLimit) {
//        this.firstApproverLimit = firstApproverLimit;
//    }
//
//    public String getSecondApproverLimit() {
//        return secondApproverLimit;
//    }
//
//    public void setSecondApproverLimit(String secondApproverLimit) {
//        this.secondApproverLimit = secondApproverLimit;
//    }
//
//    public String getPayableAmount() {
//        return payableAmount;
//    }
//
//    public void setPayableAmount(String payableAmount) {
//        this.payableAmount = payableAmount;
//    }
//
//    public String getNetPayableAmount() {
//        return netPayableAmount;
//    }
//
//    public void setNetPayableAmount(String netPayableAmount) {
//        this.netPayableAmount = netPayableAmount;
//    }
//
//    public String getPmtInstType() {
//        return pmtInstType;
//    }
//
//    public void setPmtInstType(String pmtInstType) {
//        this.pmtInstType = pmtInstType;
//    }
//
//    public String getPmtInstNo() {
//        return pmtInstNo;
//    }
//
//    public void setPmtInstNo(String pmtInstNo) {
//        this.pmtInstNo = pmtInstNo;
//    }
//
//    public String getPmtInstDate() {
//        return pmtInstDate;
//    }
//
//    public void setPmtInstDate(String pmtInstDate) {
//        this.pmtInstDate = pmtInstDate;
//    }
//
//    public String getPmtInstAmount() {
//        return pmtInstAmount;
//    }
//
//    public void setPmtInstAmount(String pmtInstAmount) {
//        this.pmtInstAmount = pmtInstAmount;
//    }
//
//    public String getSenderTxnProfile() {
//        return senderTxnProfile;
//    }
//
//    public void setSenderTxnProfile(String senderTxnProfile) {
//        this.senderTxnProfile = senderTxnProfile;
//    }
//
//    public String getReceiverTxnProfile() {
//        return receiverTxnProfile;
//    }
//
//    public void setReceiverTxnProfile(String receiverTxnProfile) {
//        this.receiverTxnProfile = receiverTxnProfile;
//    }
//
//    public String getTotalTax1() {
//        return totalTax1;
//    }
//
//    public void setTotalTax1(String totalTax1) {
//        this.totalTax1 = totalTax1;
//    }
//
//    public String getTotalTax2() {
//        return totalTax2;
//    }
//
//    public void setTotalTax2(String totalTax2) {
//        this.totalTax2 = totalTax2;
//    }
//
//    public String getTotalTax3() {
//        return totalTax3;
//    }
//
//    public void setTotalTax3(String totalTax3) {
//        this.totalTax3 = totalTax3;
//    }
//
//    public String getSource() {
//        return source;
//    }
//
//    public void setSource(String source) {
//        this.source = source;
//    }
//
//    public String getReceiverCategoryCode() {
//        return receiverCategoryCode;
//    }
//
//    public void setReceiverCategoryCode(String receiverCategoryCode) {
//        this.receiverCategoryCode = receiverCategoryCode;
//    }
//
//    public String getRequestGatewayCode() {
//        return requestGatewayCode;
//    }
//
//    public void setRequestGatewayCode(String requestGatewayCode) {
//        this.requestGatewayCode = requestGatewayCode;
//    }
//
//    public String getRequestGatewayType() {
//        return requestGatewayType;
//    }
//
//    public void setRequestGatewayType(String requestGatewayType) {
//        this.requestGatewayType = requestGatewayType;
//    }
//
//    public String getPmtInstSource() {
//        return pmtInstSource;
//    }
//
//    public void setPmtInstSource(String pmtInstSource) {
//        this.pmtInstSource = pmtInstSource;
//    }
//
//    public String getProductType() {
//        return productType;
//    }
//
//    public void setProductType(String productType) {
//        this.productType = productType;
//    }
//
//    public String getTransferCategory() {
//        return transferCategory;
//    }
//
//    public void setTransferCategory(String transferCategory) {
//        this.transferCategory = transferCategory;
//    }
//
//    public String getTransferType() {
//        return transferType;
//    }
//
//    public void setTransferType(String transferType) {
//        this.transferType = transferType;
//    }
//
//    public String getTransferSubType() {
//        return transferSubType;
//    }
//
//    public void setTransferSubType(String transferSubType) {
//        this.transferSubType = transferSubType;
//    }
//
//    public String getCloseDate() {
//        return closeDate;
//    }
//
//    public void setCloseDate(String closeDate) {
//        this.closeDate = closeDate;
//    }
//
//    public String getBatchNo() {
//        return batchNo;
//    }
//
//    public void setBatchNo(String batchNo) {
//        this.batchNo = batchNo;
//    }
//
//    public String getBatchDate() {
//        return batchDate;
//    }
//
//    public void setBatchDate(String batchDate) {
//        this.batchDate = batchDate;
//    }
//
//    public String getControlTransfer() {
//        return controlTransfer;
//    }
//
//    public void setControlTransfer(String controlTransfer) {
//        this.controlTransfer = controlTransfer;
//    }
//
//    public String getMsisdn() {
//        return msisdn;
//    }
//
//    public void setMsisdn(String msisdn) {
//        this.msisdn = msisdn;
//    }
//
//    public String getToMsisdn() {
//        return toMsisdn;
//    }
//
//    public void setToMsisdn(String toMsisdn) {
//        this.toMsisdn = toMsisdn;
//    }
//
//    public String getToDomainCode() {
//        return toDomainCode;
//    }
//
//    public void setToDomainCode(String toDomainCode) {
//        this.toDomainCode = toDomainCode;
//    }
//
//    public String getToGrphDomainCode() {
//        return toGrphDomainCode;
//    }
//
//    public void setToGrphDomainCode(String toGrphDomainCode) {
//        this.toGrphDomainCode = toGrphDomainCode;
//    }
//
//    public String getSmsDefaultLang() {
//        return smsDefaultLang;
//    }
//
//    public void setSmsDefaultLang(String smsDefaultLang) {
//        this.smsDefaultLang = smsDefaultLang;
//    }
//
//    public String getSmsSecondLang() {
//        return smsSecondLang;
//    }
//
//    public void setSmsSecondLang(String smsSecondLang) {
//        this.smsSecondLang = smsSecondLang;
//    }
//
//    public String getFocBonusBatchDate() {
//        return focBonusBatchDate;
//    }
//
//    public void setFocBonusBatchDate(String focBonusBatchDate) {
//        this.focBonusBatchDate = focBonusBatchDate;
//    }
//
//    public String getFocBonusBatchNo() {
//        return focBonusBatchNo;
//    }
//
//    public void setFocBonusBatchNo(String focBonusBatchNo) {
//        this.focBonusBatchNo = focBonusBatchNo;
//    }
//
//    public String getFirstLevelApprovedQuantity() {
//        return firstLevelApprovedQuantity;
//    }
//
//    public void setFirstLevelApprovedQuantity(String firstLevelApprovedQuantity) {
//        this.firstLevelApprovedQuantity = firstLevelApprovedQuantity;
//    }
//
//    public String getSecondLevelApprovedQuantity() {
//        return secondLevelApprovedQuantity;
//    }
//
//    public void setSecondLevelApprovedQuantity(String secondLevelApprovedQuantity) {
//        this.secondLevelApprovedQuantity = secondLevelApprovedQuantity;
//    }
//
//    public String getThirdLevelApprovedQuantity() {
//        return thirdLevelApprovedQuantity;
//    }
//
//    public void setThirdLevelApprovedQuantity(String thirdLevelApprovedQuantity) {
//        this.thirdLevelApprovedQuantity = thirdLevelApprovedQuantity;
//    }
//
//    public String getTxnWallet() {
//        return txnWallet;
//    }
//
//    public void setTxnWallet(String txnWallet) {
//        this.txnWallet = txnWallet;
//    }
//
//    public String getOwnerTransferMrp() {
//        return ownerTransferMrp;
//    }
//
//    public void setOwnerTransferMrp(String ownerTransferMrp) {
//        this.ownerTransferMrp = ownerTransferMrp;
//    }
//
//    public String getOwnerDebitMrp() {
//        return ownerDebitMrp;
//    }
//
//    public void setOwnerDebitMrp(String ownerDebitMrp) {
//        this.ownerDebitMrp = ownerDebitMrp;
//    }
//
//    public String getBonusType() {
//        return bonusType;
//    }
//
//    public void setBonusType(String bonusType) {
//        this.bonusType = bonusType;
//    }
//
//    public String getActiveUserId() {
//        return activeUserId;
//    }
//
//    public void setActiveUserId(String activeUserId) {
//        this.activeUserId = activeUserId;
//    }
//
//    public String getTransactionMode() {
//        return transactionMode;
//    }
//
//    public void setTransactionMode(String transactionMode) {
//        this.transactionMode = transactionMode;
//    }
//
//    public String getRefTransferid() {
//        return refTransferid;
//    }
//
//    public void setRefTransferid(String refTransferid) {
//        this.refTransferid = refTransferid;
//    }
//
//    public String getCellId() {
//        return cellId;
//    }
//
//    public void setCellId(String cellId) {
//        this.cellId = cellId;
//    }
//
//    public String getSwitchId() {
//        return switchId;
//    }
//
//    public void setSwitchId(String switchId) {
//        this.switchId = switchId;
//    }
//
//    public String getLmsPointAdjustValue() {
//        return lmsPointAdjustValue;
//    }
//
//    public void setLmsPointAdjustValue(String lmsPointAdjustValue) {
//        this.lmsPointAdjustValue = lmsPointAdjustValue;
//    }
//
//    public String getStockUpdated() {
//        return stockUpdated;
//    }
//
//    public void setStockUpdated(String stockUpdated) {
//        this.stockUpdated = stockUpdated;
//    }
//
//    public String getSosStatus() {
//        return sosStatus;
//    }
//
//    public void setSosStatus(String sosStatus) {
//        this.sosStatus = sosStatus;
//    }
//
//    public String getSosSettlementDate() {
//        return sosSettlementDate;
//    }
//
//    public void setSosSettlementDate(String sosSettlementDate) {
//        this.sosSettlementDate = sosSettlementDate;
//    }
//
//    public String getInfo1() {
//        return info1;
//    }
//
//    public void setInfo1(String info1) {
//        this.info1 = info1;
//    }
//
//    public String getInfo2() {
//        return info2;
//    }
//
//    public void setInfo2(String info2) {
//        this.info2 = info2;
//    }
//
//    public String getDualCommType() {
//        return dualCommType;
//    }
//
//    public void setDualCommType(String dualCommType) {
//        this.dualCommType = dualCommType;
//    }
//
//    public String getOthCommPrfSetId() {
//        return othCommPrfSetId;
//    }
//
//    public void setOthCommPrfSetId(String othCommPrfSetId) {
//        this.othCommPrfSetId = othCommPrfSetId;
//    }
//
//    public String getInfo3() {
//        return info3;
//    }
//
//    public void setInfo3(String info3) {
//        this.info3 = info3;
//    }
//
//    public String getInfo4() {
//        return info4;
//    }
//
//    public void setInfo4(String info4) {
//        this.info4 = info4;
//    }
//
//    public String getInfo5() {
//        return info5;
//    }
//
//    public void setInfo5(String info5) {
//        this.info5 = info5;
//    }
//
//    public String getPmtInstStatus() {
//        return pmtInstStatus;
//    }
//
//    public void setPmtInstStatus(String pmtInstStatus) {
//        this.pmtInstStatus = pmtInstStatus;
//    }
//
//    public String getOldMsisdn() {
//        return oldMsisdn;
//    }
//
//    public void setOldMsisdn(String oldMsisdn) {
//        this.oldMsisdn = oldMsisdn;
//    }
//
//    public String getOldToMsisdn() {
//        return oldToMsisdn;
//    }
//
//    public void setOldToMsisdn(String oldToMsisdn) {
//        this.oldToMsisdn = oldToMsisdn;
//    }
//
//    public String getMsisdnModified() {
//        return msisdnModified;
//    }
//
//    public void setMsisdnModified(String msisdnModified) {
//        this.msisdnModified = msisdnModified;
//    }
//
//    public String getReconcilationBy() {
//        return reconcilationBy;
//    }
//
//    public void setReconcilationBy(String reconcilationBy) {
//        this.reconcilationBy = reconcilationBy;
//    }
//
//    public String getReconcilationDate() {
//        return reconcilationDate;
//    }
//
//    public void setReconcilationDate(String reconcilationDate) {
//        this.reconcilationDate = reconcilationDate;
//    }
//
//    public String getReconcilationFlag() {
//        return reconcilationFlag;
//    }
//
//    public void setReconcilationFlag(String reconcilationFlag) {
//        this.reconcilationFlag = reconcilationFlag;
//    }
//
//    public String getReconcilationRemark() {
//        return reconcilationRemark;
//    }
//
//    public void setReconcilationRemark(String reconcilationRemark) {
//        this.reconcilationRemark = reconcilationRemark;
//    }
//
//    public String getInfo6() {
//        return info6;
//    }
//
//    public void setInfo6(String info6) {
//        this.info6 = info6;
//    }
//
//    public String getInfo7() {
//        return info7;
//    }
//
//    public void setInfo7(String info7) {
//        this.info7 = info7;
//    }
//
//    public String getInfo8() {
//        return info8;
//    }
//
//    public void setInfo8(String info8) {
//        this.info8 = info8;
//    }
//
//    public String getInfo9() {
//        return info9;
//    }
//
//    public void setInfo9(String info9) {
//        this.info9 = info9;
//    }
//
//    public String getInfo10() {
//        return info10;
//    }
//
//    public void setInfo10(String info10) {
//        this.info10 = info10;
//    }
//
//    public String getApprovalDoc() {
//        return approvalDoc;
//    }
//
//    public void setApprovalDoc(String approvalDoc) {
//        this.approvalDoc = approvalDoc;
//    }
//
//    public String getApprovalDocType() {
//        return approvalDocType;
//    }
//
//    public void setApprovalDocType(String approvalDocType) {
//        this.approvalDocType = approvalDocType;
//    }
//
//    public String getApprovalDocFilePath() {
//        return approvalDocFilePath;
//    }
//
//    public void setApprovalDocFilePath(String approvalDocFilePath) {
//        this.approvalDocFilePath = approvalDocFilePath;
//    }
}
