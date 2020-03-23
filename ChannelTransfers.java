package com.comviva.vms.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name="CHANNEL_TRANSFERS")
public class ChannelTransfers implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "TRANSFER_ID")
    private String transferId;

    @Column(name = "NETWORK_CODE")
    private String networkCode;

    @Column(name = "NETWORK_CODE_FOR")
    private String networkCodeFor;

    @Column(name = "GRPH_DOMAIN_CODE")
    private String grphDomainCode;

    @Column(name = "DOMAIN_CODE")
    private String domainCode;

    @Column(name = "SENDER_CATEGORY_CODE")
    private String senderCategoryCode;

    @Column(name = "SENDER_GRADE_CODE")
    private String senderGradeCode;

    @Column(name = "RECEIVER_GRADE_CODE")
    private String receiverGradeCode;

    @Column(name = "FROM_USER_ID")
    private String fromUserId;

    @Column(name = "TO_USER_ID")
    private String toUserId;

    @Column(name = "TRANSFER_DATE")
    private String transferDate;

    @Column(name = "REFERENCE_NO")
    private String referenceNo;

    @Column(name = "EXT_TXN_NO")
    private String extTxnNo;

    @Column(name = "EXT_TXN_DATE")
    private String extTxnDate;

    @Column(name = "COMMISSION_PROFILE_SET_ID")
    private String commissionProfileSetId;

    @Column(name = "COMMISSION_PROFILE_VER")
    private String commissionProfileVersion;

    @Column(name = "REQUESTED_QUANTITY")
    private String requestedQuantity;

    @Column(name = "CHANNEL_USER_REMARKS")
    private String channelUserRemarks;

    @Column(name = "FIRST_APPROVER_REMARKS")
    private String firstApproverRemarks;

    @Column(name = "SECOND_APPROVER_REMARKS")
    private String secondApproverRemarks;

    @Column(name = "THIRD_APPROVER_REMARKS")
    private String thirdApproverRemarks;

    @Column(name = "FIRST_APPROVED_BY")
    private String firstApprovedBy;

    @Column(name = "FIRST_APPROVED_ON")
    private String firstApprovedOn;

    @Column(name = "SECOND_APPROVED_BY")
    private String secondApprovedBy;

    @Column(name = "SECOND_APPROVED_ON")
    private String secondApprovedOn;

    @Column(name = "THIRD_APPROVED_BY")
    private String thirdApprovedBy;

    @Column(name = "THIRD_APPROVED_ON")
    private String thirdApprovedOn;

    @Column(name = "CANCELLED_BY")
    private String cancelledBy;

    @Column(name = "CANCELLED_ON")
    private String cancelledOn;

    @Column(name = "CREATED_ON")
    private String createdOn;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    @Column(name = "MODIFIED_ON")
    private String modifiedOn;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "TRANSFER_INITIATED_BY")
    private String transferInitiatedBy;

    @Column(name = "TRANSFER_MRP")
    private String transferMrp;

    @Column(name = "FIRST_APPROVER_LIMIT")
    private String firstApproverLimit;

    @Column(name = "SECOND_APPROVER_LIMIT")
    private String secondApproverLimit;

    @Column(name = "PAYABLE_AMOUNT")
    private String payableAmount;

    @Column(name = "NET_PAYABLE_AMOUNT")
    private String netPayableAmount;

    @Column(name = "PMT_INST_TYPE")
    private String pmtInstType;

    @Column(name = "PMT_INST_NO")
    private String pmtInstNo;

    @Column(name = "PMT_INST_DATE")
    private String pmtInstDate;

    @Column(name = "PMT_INST_AMOUNT")
    private String pmtInstAmount;

    @Column(name = "SENDER_TXN_PROFILE")
    private String senderTxnProfile;

    @Column(name = "RECEIVER_TXN_PROFILE")
    private String receiverTxnProfile;

    @Column(name = "TOTAL_TAX1")
    private String totalTax1;

    @Column(name = "TOTAL_TAX2")
    private String totalTax2;

    @Column(name = "TOTAL_TAX3")
    private String totalTax3;

    @Column(name = "SOURCE")
    private String source;

    @Column(name = "RECEIVER_CATEGORY_CODE")
    private String receiverCategoryCode;

    @Column(name = "REQUEST_GATEWAY_CODE")
    private String requestGatewayCode;

    @Column(name = "REQUEST_GATEWAY_TYPE")
    private String requestGatewayType;

    @Column(name = "PMT_INST_SOURCE")
    private String pmtInstSource;

    @Column(name = "PRODUCT_TYPE")
    private String productType;

    @Column(name = "TRANSFER_CATEGORY")
    private String transferCategory;

    @Column(name = "TRANSFER_TYPE")
    private String transferType;

    @Column(name = "TRANSFER_SUB_TYPE")
    private String transferSubType;

    @Column(name = "CLOSE_DATE")
    private String closeDate;

    @Column(name = "BATCH_NO")
    private String batchNo;

    @Column(name = "BATCH_DATE")
    private String batchDate;

    @Column(name = "CONTROL_TRANSFER")
    private String controlTransfer;

    @Column(name = "MSISDN")
    private String msisdn;

    @Column(name = "TO_MSISDN")
    private String toMsisdn;

    @Column(name = "TO_DOMAIN_CODE")
    private String toDomainCode;

    @Column(name = "TO_GRPH_DOMAIN_CODE")
    private String toGrphDomainCode;

    @Column(name = "SMS_DEFAULT_LANG")
    private String smsDefaultLang;

    @Column(name = "SMS_SECOND_LANG")
    private String smsSecondLang;

    @Column(name = "FOC_BONUS_BATCH_DATE")
    private String focBonusBatchDate;

    @Column(name = "FOC_BONUS_BATCH_NO")
    private String focBonusBatchNo;

    @Column(name = "FIRST_LEVEL_APPROVED_QUANTITY")
    private String firstLevelApprovedQuantity;

    @Column(name = "SECOND_LEVEL_APPROVED_QUANTITY")
    private String secondLevelApprovedQuantity;

    @Column(name = "THIRD_LEVEL_APPROVED_QUANTITY")
    private String thirdLevelApprovedQuantity;

    @Column(name = "TXN_WALLET")
    private String txnWallet;

    @Column(name = "OWNER_TRANSFER_MRP")
    private String ownerTransferMrp;

    @Column(name = "OWNER_DEBIT_MRP")
    private String ownerDebitMrp;

    @Column(name = "BONUS_TYPE")
    private String bonusType;

    @Column(name = "ACTIVE_USER_ID")
    private String activeUserId;

    @Column(name = "TRANSACTION_MODE")
    private String transactionMode;

    @Column(name = "REF_TRANSFER_ID")
    private String refTransferid;

    @Column(name = "CELL_ID")
    private String cellId;

    @Column(name = "SWITCH_ID")
    private String switchId;

    @Column(name = "LMS_POINT_ADJUST_VALUE")
    private String lmsPointAdjustValue;

    @Column(name = "STOCK_UPDATED")
    private String stockUpdated;

    @Column(name = "SOS_STATUS")
    private String sosStatus;

    @Column(name = "SOS_SETTLEMENT_DATE")
    private String sosSettlementDate;

    @Column(name = "INFO1")
    private String info1;

    @Column(name = "INFO2")
    private String info2;

    @Column(name = "DUAL_COMM_TYPE")
    private String dualCommType;

    @Column(name = "OTH_COMM_PRF_SET_ID")
    private String othCommPrfSetId;

    @Column(name = "INFO3")
    private String info3;

    @Column(name = "INFO4")
    private String info4;

    @Column(name = "INFO5")
    private String info5;

    @Column(name = "PMT_INST_STATUS")
    private String pmtInstStatus;

    @Column(name = "OLD_MSISDN")
    private String oldMsisdn;

    @Column(name = "OLD_TO_MSISDN")
    private String oldToMsisdn;

    @Column(name = "MSISDN_MODIFIED")
    private String msisdnModified;

    @Column(name = "RECONCILIATION_BY")
    private String reconcilationBy;

    @Column(name = "RECONCILIATION_DATE")
    private String reconcilationDate;

    @Column(name = "RECONCILIATION_FLAG")
    private String reconcilationFlag;

    @Column(name = "RECONCILIATION_REMARK")
    private String reconcilationRemark;

    @Column(name = "INFO6")
    private String info6;

    @Column(name = "INFO7")
    private String info7;

    @Column(name = "INFO8")
    private String info8;

    @Column(name = "INFO9")
    private String info9;

    @Column(name = "INFO10")
    private String info10;

    @Column(name = "APPROVAL_DOC")
    private String approvalDoc;

    @Column(name = "APPROVAL_DOC_TYPE")
    private String approvalDocType;

    @Column(name = "APPROVAL_DOC_FILE_PATH")
    private String approvalDocFilePath;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public String getNetworkCode() {
        return networkCode;
    }

    public void setNetworkCode(String networkCode) {
        this.networkCode = networkCode;
    }

    public String getNetworkCodeFor() {
        return networkCodeFor;
    }

    public void setNetworkCodeFor(String networkCodeFor) {
        this.networkCodeFor = networkCodeFor;
    }

    public String getGrphDomainCode() {
        return grphDomainCode;
    }

    public void setGrphDomainCode(String grphDomainCode) {
        this.grphDomainCode = grphDomainCode;
    }

    public String getDomainCode() {
        return domainCode;
    }

    public void setDomainCode(String domainCode) {
        this.domainCode = domainCode;
    }

    public String getSenderCategoryCode() {
        return senderCategoryCode;
    }

    public void setSenderCategoryCode(String senderCategoryCode) {
        this.senderCategoryCode = senderCategoryCode;
    }

    public String getSenderGradeCode() {
        return senderGradeCode;
    }

    public void setSenderGradeCode(String senderGradeCode) {
        this.senderGradeCode = senderGradeCode;
    }

    public String getReceiverGradeCode() {
        return receiverGradeCode;
    }

    public void setReceiverGradeCode(String receiverGradeCode) {
        this.receiverGradeCode = receiverGradeCode;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getToUserId() {
        return toUserId;
    }

    public void setToUserId(String toUserId) {
        this.toUserId = toUserId;
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

    public String getCommissionProfileSetId() {
        return commissionProfileSetId;
    }

    public void setCommissionProfileSetId(String commissionProfileSetId) {
        this.commissionProfileSetId = commissionProfileSetId;
    }

    public String getCommissionProfileVersion() {
        return commissionProfileVersion;
    }

    public void setCommissionProfileVersion(String commissionProfileVersion) {
        this.commissionProfileVersion = commissionProfileVersion;
    }

    public String getRequestedQuantity() {
        return requestedQuantity;
    }

    public void setRequestedQuantity(String requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public String getChannelUserRemarks() {
        return channelUserRemarks;
    }

    public void setChannelUserRemarks(String channelUserRemarks) {
        this.channelUserRemarks = channelUserRemarks;
    }

    public String getFirstApproverRemarks() {
        return firstApproverRemarks;
    }

    public void setFirstApproverRemarks(String firstApproverRemarks) {
        this.firstApproverRemarks = firstApproverRemarks;
    }

    public String getSecondApproverRemarks() {
        return secondApproverRemarks;
    }

    public void setSecondApproverRemarks(String secondApproverRemarks) {
        this.secondApproverRemarks = secondApproverRemarks;
    }

    public String getThirdApproverRemarks() {
        return thirdApproverRemarks;
    }

    public void setThirdApproverRemarks(String thirdApproverRemarks) {
        this.thirdApproverRemarks = thirdApproverRemarks;
    }

    public String getFirstApprovedBy() {
        return firstApprovedBy;
    }

    public void setFirstApprovedBy(String firstApprovedBy) {
        this.firstApprovedBy = firstApprovedBy;
    }

    public String getFirstApprovedOn() {
        return firstApprovedOn;
    }

    public void setFirstApprovedOn(String firstApprovedOn) {
        this.firstApprovedOn = firstApprovedOn;
    }

    public String getSecondApprovedBy() {
        return secondApprovedBy;
    }

    public void setSecondApprovedBy(String secondApprovedBy) {
        this.secondApprovedBy = secondApprovedBy;
    }

    public String getSecondApprovedOn() {
        return secondApprovedOn;
    }

    public void setSecondApprovedOn(String secondApprovedOn) {
        this.secondApprovedOn = secondApprovedOn;
    }

    public String getThirdApprovedBy() {
        return thirdApprovedBy;
    }

    public void setThirdApprovedBy(String thirdApprovedBy) {
        this.thirdApprovedBy = thirdApprovedBy;
    }

    public String getThirdApprovedOn() {
        return thirdApprovedOn;
    }

    public void setThirdApprovedOn(String thirdApprovedOn) {
        this.thirdApprovedOn = thirdApprovedOn;
    }

    public String getCancelledBy() {
        return cancelledBy;
    }

    public void setCancelledBy(String cancelledBy) {
        this.cancelledBy = cancelledBy;
    }

    public String getCancelledOn() {
        return cancelledOn;
    }

    public void setCancelledOn(String cancelledOn) {
        this.cancelledOn = cancelledOn;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransferInitiatedBy() {
        return transferInitiatedBy;
    }

    public void setTransferInitiatedBy(String transferInitiatedBy) {
        this.transferInitiatedBy = transferInitiatedBy;
    }

    public String getTransferMrp() {
        return transferMrp;
    }

    public void setTransferMrp(String transferMrp) {
        this.transferMrp = transferMrp;
    }

    public String getFirstApproverLimit() {
        return firstApproverLimit;
    }

    public void setFirstApproverLimit(String firstApproverLimit) {
        this.firstApproverLimit = firstApproverLimit;
    }

    public String getSecondApproverLimit() {
        return secondApproverLimit;
    }

    public void setSecondApproverLimit(String secondApproverLimit) {
        this.secondApproverLimit = secondApproverLimit;
    }

    public String getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(String payableAmount) {
        this.payableAmount = payableAmount;
    }

    public String getNetPayableAmount() {
        return netPayableAmount;
    }

    public void setNetPayableAmount(String netPayableAmount) {
        this.netPayableAmount = netPayableAmount;
    }

    public String getPmtInstType() {
        return pmtInstType;
    }

    public void setPmtInstType(String pmtInstType) {
        this.pmtInstType = pmtInstType;
    }

    public String getPmtInstNo() {
        return pmtInstNo;
    }

    public void setPmtInstNo(String pmtInstNo) {
        this.pmtInstNo = pmtInstNo;
    }

    public String getPmtInstDate() {
        return pmtInstDate;
    }

    public void setPmtInstDate(String pmtInstDate) {
        this.pmtInstDate = pmtInstDate;
    }

    public String getPmtInstAmount() {
        return pmtInstAmount;
    }

    public void setPmtInstAmount(String pmtInstAmount) {
        this.pmtInstAmount = pmtInstAmount;
    }

    public String getSenderTxnProfile() {
        return senderTxnProfile;
    }

    public void setSenderTxnProfile(String senderTxnProfile) {
        this.senderTxnProfile = senderTxnProfile;
    }

    public String getReceiverTxnProfile() {
        return receiverTxnProfile;
    }

    public void setReceiverTxnProfile(String receiverTxnProfile) {
        this.receiverTxnProfile = receiverTxnProfile;
    }

    public String getTotalTax1() {
        return totalTax1;
    }

    public void setTotalTax1(String totalTax1) {
        this.totalTax1 = totalTax1;
    }

    public String getTotalTax2() {
        return totalTax2;
    }

    public void setTotalTax2(String totalTax2) {
        this.totalTax2 = totalTax2;
    }

    public String getTotalTax3() {
        return totalTax3;
    }

    public void setTotalTax3(String totalTax3) {
        this.totalTax3 = totalTax3;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getReceiverCategoryCode() {
        return receiverCategoryCode;
    }

    public void setReceiverCategoryCode(String receiverCategoryCode) {
        this.receiverCategoryCode = receiverCategoryCode;
    }

    public String getRequestGatewayCode() {
        return requestGatewayCode;
    }

    public void setRequestGatewayCode(String requestGatewayCode) {
        this.requestGatewayCode = requestGatewayCode;
    }

    public String getRequestGatewayType() {
        return requestGatewayType;
    }

    public void setRequestGatewayType(String requestGatewayType) {
        this.requestGatewayType = requestGatewayType;
    }

    public String getPmtInstSource() {
        return pmtInstSource;
    }

    public void setPmtInstSource(String pmtInstSource) {
        this.pmtInstSource = pmtInstSource;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTransferCategory() {
        return transferCategory;
    }

    public void setTransferCategory(String transferCategory) {
        this.transferCategory = transferCategory;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public String getTransferSubType() {
        return transferSubType;
    }

    public void setTransferSubType(String transferSubType) {
        this.transferSubType = transferSubType;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getBatchDate() {
        return batchDate;
    }

    public void setBatchDate(String batchDate) {
        this.batchDate = batchDate;
    }

    public String getControlTransfer() {
        return controlTransfer;
    }

    public void setControlTransfer(String controlTransfer) {
        this.controlTransfer = controlTransfer;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getToMsisdn() {
        return toMsisdn;
    }

    public void setToMsisdn(String toMsisdn) {
        this.toMsisdn = toMsisdn;
    }

    public String getToDomainCode() {
        return toDomainCode;
    }

    public void setToDomainCode(String toDomainCode) {
        this.toDomainCode = toDomainCode;
    }

    public String getToGrphDomainCode() {
        return toGrphDomainCode;
    }

    public void setToGrphDomainCode(String toGrphDomainCode) {
        this.toGrphDomainCode = toGrphDomainCode;
    }

    public String getSmsDefaultLang() {
        return smsDefaultLang;
    }

    public void setSmsDefaultLang(String smsDefaultLang) {
        this.smsDefaultLang = smsDefaultLang;
    }

    public String getSmsSecondLang() {
        return smsSecondLang;
    }

    public void setSmsSecondLang(String smsSecondLang) {
        this.smsSecondLang = smsSecondLang;
    }

    public String getFocBonusBatchDate() {
        return focBonusBatchDate;
    }

    public void setFocBonusBatchDate(String focBonusBatchDate) {
        this.focBonusBatchDate = focBonusBatchDate;
    }

    public String getFocBonusBatchNo() {
        return focBonusBatchNo;
    }

    public void setFocBonusBatchNo(String focBonusBatchNo) {
        this.focBonusBatchNo = focBonusBatchNo;
    }

    public String getFirstLevelApprovedQuantity() {
        return firstLevelApprovedQuantity;
    }

    public void setFirstLevelApprovedQuantity(String firstLevelApprovedQuantity) {
        this.firstLevelApprovedQuantity = firstLevelApprovedQuantity;
    }

    public String getSecondLevelApprovedQuantity() {
        return secondLevelApprovedQuantity;
    }

    public void setSecondLevelApprovedQuantity(String secondLevelApprovedQuantity) {
        this.secondLevelApprovedQuantity = secondLevelApprovedQuantity;
    }

    public String getThirdLevelApprovedQuantity() {
        return thirdLevelApprovedQuantity;
    }

    public void setThirdLevelApprovedQuantity(String thirdLevelApprovedQuantity) {
        this.thirdLevelApprovedQuantity = thirdLevelApprovedQuantity;
    }

    public String getTxnWallet() {
        return txnWallet;
    }

    public void setTxnWallet(String txnWallet) {
        this.txnWallet = txnWallet;
    }

    public String getOwnerTransferMrp() {
        return ownerTransferMrp;
    }

    public void setOwnerTransferMrp(String ownerTransferMrp) {
        this.ownerTransferMrp = ownerTransferMrp;
    }

    public String getOwnerDebitMrp() {
        return ownerDebitMrp;
    }

    public void setOwnerDebitMrp(String ownerDebitMrp) {
        this.ownerDebitMrp = ownerDebitMrp;
    }

    public String getBonusType() {
        return bonusType;
    }

    public void setBonusType(String bonusType) {
        this.bonusType = bonusType;
    }

    public String getActiveUserId() {
        return activeUserId;
    }

    public void setActiveUserId(String activeUserId) {
        this.activeUserId = activeUserId;
    }

    public String getTransactionMode() {
        return transactionMode;
    }

    public void setTransactionMode(String transactionMode) {
        this.transactionMode = transactionMode;
    }

    public String getRefTransferid() {
        return refTransferid;
    }

    public void setRefTransferid(String refTransferid) {
        this.refTransferid = refTransferid;
    }

    public String getCellId() {
        return cellId;
    }

    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    public String getSwitchId() {
        return switchId;
    }

    public void setSwitchId(String switchId) {
        this.switchId = switchId;
    }

    public String getLmsPointAdjustValue() {
        return lmsPointAdjustValue;
    }

    public void setLmsPointAdjustValue(String lmsPointAdjustValue) {
        this.lmsPointAdjustValue = lmsPointAdjustValue;
    }

    public String getStockUpdated() {
        return stockUpdated;
    }

    public void setStockUpdated(String stockUpdated) {
        this.stockUpdated = stockUpdated;
    }

    public String getSosStatus() {
        return sosStatus;
    }

    public void setSosStatus(String sosStatus) {
        this.sosStatus = sosStatus;
    }

    public String getSosSettlementDate() {
        return sosSettlementDate;
    }

    public void setSosSettlementDate(String sosSettlementDate) {
        this.sosSettlementDate = sosSettlementDate;
    }

    public String getInfo1() {
        return info1;
    }

    public void setInfo1(String info1) {
        this.info1 = info1;
    }

    public String getInfo2() {
        return info2;
    }

    public void setInfo2(String info2) {
        this.info2 = info2;
    }

    public String getDualCommType() {
        return dualCommType;
    }

    public void setDualCommType(String dualCommType) {
        this.dualCommType = dualCommType;
    }

    public String getOthCommPrfSetId() {
        return othCommPrfSetId;
    }

    public void setOthCommPrfSetId(String othCommPrfSetId) {
        this.othCommPrfSetId = othCommPrfSetId;
    }

    public String getInfo3() {
        return info3;
    }

    public void setInfo3(String info3) {
        this.info3 = info3;
    }

    public String getInfo4() {
        return info4;
    }

    public void setInfo4(String info4) {
        this.info4 = info4;
    }

    public String getInfo5() {
        return info5;
    }

    public void setInfo5(String info5) {
        this.info5 = info5;
    }

    public String getPmtInstStatus() {
        return pmtInstStatus;
    }

    public void setPmtInstStatus(String pmtInstStatus) {
        this.pmtInstStatus = pmtInstStatus;
    }

    public String getOldMsisdn() {
        return oldMsisdn;
    }

    public void setOldMsisdn(String oldMsisdn) {
        this.oldMsisdn = oldMsisdn;
    }

    public String getOldToMsisdn() {
        return oldToMsisdn;
    }

    public void setOldToMsisdn(String oldToMsisdn) {
        this.oldToMsisdn = oldToMsisdn;
    }

    public String getMsisdnModified() {
        return msisdnModified;
    }

    public void setMsisdnModified(String msisdnModified) {
        this.msisdnModified = msisdnModified;
    }

    public String getReconcilationBy() {
        return reconcilationBy;
    }

    public void setReconcilationBy(String reconcilationBy) {
        this.reconcilationBy = reconcilationBy;
    }

    public String getReconcilationDate() {
        return reconcilationDate;
    }

    public void setReconcilationDate(String reconcilationDate) {
        this.reconcilationDate = reconcilationDate;
    }

    public String getReconcilationFlag() {
        return reconcilationFlag;
    }

    public void setReconcilationFlag(String reconcilationFlag) {
        this.reconcilationFlag = reconcilationFlag;
    }

    public String getReconcilationRemark() {
        return reconcilationRemark;
    }

    public void setReconcilationRemark(String reconcilationRemark) {
        this.reconcilationRemark = reconcilationRemark;
    }

    public String getInfo6() {
        return info6;
    }

    public void setInfo6(String info6) {
        this.info6 = info6;
    }

    public String getInfo7() {
        return info7;
    }

    public void setInfo7(String info7) {
        this.info7 = info7;
    }

    public String getInfo8() {
        return info8;
    }

    public void setInfo8(String info8) {
        this.info8 = info8;
    }

    public String getInfo9() {
        return info9;
    }

    public void setInfo9(String info9) {
        this.info9 = info9;
    }

    public String getInfo10() {
        return info10;
    }

    public void setInfo10(String info10) {
        this.info10 = info10;
    }

    public String getApprovalDoc() {
        return approvalDoc;
    }

    public void setApprovalDoc(String approvalDoc) {
        this.approvalDoc = approvalDoc;
    }

    public String getApprovalDocType() {
        return approvalDocType;
    }

    public void setApprovalDocType(String approvalDocType) {
        this.approvalDocType = approvalDocType;
    }

    public String getApprovalDocFilePath() {
        return approvalDocFilePath;
    }

    public void setApprovalDocFilePath(String approvalDocFilePath) {
        this.approvalDocFilePath = approvalDocFilePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChannelTransfers that = (ChannelTransfers) o;
        return transferId.equals(that.transferId) &&
                networkCode.equals(that.networkCode) &&
                networkCodeFor.equals(that.networkCodeFor) &&
                grphDomainCode.equals(that.grphDomainCode) &&
                domainCode.equals(that.domainCode) &&
                senderCategoryCode.equals(that.senderCategoryCode) &&
                senderGradeCode.equals(that.senderGradeCode) &&
                receiverGradeCode.equals(that.receiverGradeCode) &&
                fromUserId.equals(that.fromUserId) &&
                toUserId.equals(that.toUserId) &&
                transferDate.equals(that.transferDate) &&
                referenceNo.equals(that.referenceNo) &&
                extTxnNo.equals(that.extTxnNo) &&
                extTxnDate.equals(that.extTxnDate) &&
                commissionProfileSetId.equals(that.commissionProfileSetId) &&
                commissionProfileVersion.equals(that.commissionProfileVersion) &&
                requestedQuantity.equals(that.requestedQuantity) &&
                channelUserRemarks.equals(that.channelUserRemarks) &&
                firstApproverRemarks.equals(that.firstApproverRemarks) &&
                secondApproverRemarks.equals(that.secondApproverRemarks) &&
                thirdApproverRemarks.equals(that.thirdApproverRemarks) &&
                firstApprovedBy.equals(that.firstApprovedBy) &&
                firstApprovedOn.equals(that.firstApprovedOn) &&
                secondApprovedBy.equals(that.secondApprovedBy) &&
                secondApprovedOn.equals(that.secondApprovedOn) &&
                thirdApprovedBy.equals(that.thirdApprovedBy) &&
                thirdApprovedOn.equals(that.thirdApprovedOn) &&
                cancelledBy.equals(that.cancelledBy) &&
                cancelledOn.equals(that.cancelledOn) &&
                createdOn.equals(that.createdOn) &&
                createdBy.equals(that.createdBy) &&
                modifiedBy.equals(that.modifiedBy) &&
                modifiedOn.equals(that.modifiedOn) &&
                status.equals(that.status) &&
                type.equals(that.type) &&
                transferInitiatedBy.equals(that.transferInitiatedBy) &&
                transferMrp.equals(that.transferMrp) &&
                firstApproverLimit.equals(that.firstApproverLimit) &&
                secondApproverLimit.equals(that.secondApproverLimit) &&
                payableAmount.equals(that.payableAmount) &&
                netPayableAmount.equals(that.netPayableAmount) &&
                pmtInstType.equals(that.pmtInstType) &&
                pmtInstNo.equals(that.pmtInstNo) &&
                pmtInstDate.equals(that.pmtInstDate) &&
                pmtInstAmount.equals(that.pmtInstAmount) &&
                senderTxnProfile.equals(that.senderTxnProfile) &&
                receiverTxnProfile.equals(that.receiverTxnProfile) &&
                totalTax1.equals(that.totalTax1) &&
                totalTax2.equals(that.totalTax2) &&
                totalTax3.equals(that.totalTax3) &&
                source.equals(that.source) &&
                receiverCategoryCode.equals(that.receiverCategoryCode) &&
                requestGatewayCode.equals(that.requestGatewayCode) &&
                requestGatewayType.equals(that.requestGatewayType) &&
                pmtInstSource.equals(that.pmtInstSource) &&
                productType.equals(that.productType) &&
                transferCategory.equals(that.transferCategory) &&
                transferType.equals(that.transferType) &&
                transferSubType.equals(that.transferSubType) &&
                closeDate.equals(that.closeDate) &&
                batchNo.equals(that.batchNo) &&
                batchDate.equals(that.batchDate) &&
                controlTransfer.equals(that.controlTransfer) &&
                msisdn.equals(that.msisdn) &&
                toMsisdn.equals(that.toMsisdn) &&
                toDomainCode.equals(that.toDomainCode) &&
                toGrphDomainCode.equals(that.toGrphDomainCode) &&
                smsDefaultLang.equals(that.smsDefaultLang) &&
                smsSecondLang.equals(that.smsSecondLang) &&
                focBonusBatchDate.equals(that.focBonusBatchDate) &&
                focBonusBatchNo.equals(that.focBonusBatchNo) &&
                firstLevelApprovedQuantity.equals(that.firstLevelApprovedQuantity) &&
                secondLevelApprovedQuantity.equals(that.secondLevelApprovedQuantity) &&
                thirdLevelApprovedQuantity.equals(that.thirdLevelApprovedQuantity) &&
                txnWallet.equals(that.txnWallet) &&
                ownerTransferMrp.equals(that.ownerTransferMrp) &&
                ownerDebitMrp.equals(that.ownerDebitMrp) &&
                bonusType.equals(that.bonusType) &&
                activeUserId.equals(that.activeUserId) &&
                transactionMode.equals(that.transactionMode) &&
                refTransferid.equals(that.refTransferid) &&
                cellId.equals(that.cellId) &&
                switchId.equals(that.switchId) &&
                lmsPointAdjustValue.equals(that.lmsPointAdjustValue) &&
                stockUpdated.equals(that.stockUpdated) &&
                sosStatus.equals(that.sosStatus) &&
                sosSettlementDate.equals(that.sosSettlementDate) &&
                info1.equals(that.info1) &&
                info2.equals(that.info2) &&
                dualCommType.equals(that.dualCommType) &&
                othCommPrfSetId.equals(that.othCommPrfSetId) &&
                info3.equals(that.info3) &&
                info4.equals(that.info4) &&
                info5.equals(that.info5) &&
                pmtInstStatus.equals(that.pmtInstStatus) &&
                oldMsisdn.equals(that.oldMsisdn) &&
                oldToMsisdn.equals(that.oldToMsisdn) &&
                msisdnModified.equals(that.msisdnModified) &&
                reconcilationBy.equals(that.reconcilationBy) &&
                reconcilationDate.equals(that.reconcilationDate) &&
                reconcilationFlag.equals(that.reconcilationFlag) &&
                reconcilationRemark.equals(that.reconcilationRemark) &&
                info6.equals(that.info6) &&
                info7.equals(that.info7) &&
                info8.equals(that.info8) &&
                info9.equals(that.info9) &&
                info10.equals(that.info10) &&
                approvalDoc.equals(that.approvalDoc) &&
                approvalDocType.equals(that.approvalDocType) &&
                approvalDocFilePath.equals(that.approvalDocFilePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transferId, networkCode, networkCodeFor, grphDomainCode, domainCode, senderCategoryCode, senderGradeCode, receiverGradeCode, fromUserId, toUserId, transferDate, referenceNo, extTxnNo, extTxnDate, commissionProfileSetId, commissionProfileVersion, requestedQuantity, channelUserRemarks, firstApproverRemarks, secondApproverRemarks, thirdApproverRemarks, firstApprovedBy, firstApprovedOn, secondApprovedBy, secondApprovedOn, thirdApprovedBy, thirdApprovedOn, cancelledBy, cancelledOn, createdOn, createdBy, modifiedBy, modifiedOn, status, type, transferInitiatedBy, transferMrp, firstApproverLimit, secondApproverLimit, payableAmount, netPayableAmount, pmtInstType, pmtInstNo, pmtInstDate, pmtInstAmount, senderTxnProfile, receiverTxnProfile, totalTax1, totalTax2, totalTax3, source, receiverCategoryCode, requestGatewayCode, requestGatewayType, pmtInstSource, productType, transferCategory, transferType, transferSubType, closeDate, batchNo, batchDate, controlTransfer, msisdn, toMsisdn, toDomainCode, toGrphDomainCode, smsDefaultLang, smsSecondLang, focBonusBatchDate, focBonusBatchNo, firstLevelApprovedQuantity, secondLevelApprovedQuantity, thirdLevelApprovedQuantity, txnWallet, ownerTransferMrp, ownerDebitMrp, bonusType, activeUserId, transactionMode, refTransferid, cellId, switchId, lmsPointAdjustValue, stockUpdated, sosStatus, sosSettlementDate, info1, info2, dualCommType, othCommPrfSetId, info3, info4, info5, pmtInstStatus, oldMsisdn, oldToMsisdn, msisdnModified, reconcilationBy, reconcilationDate, reconcilationFlag, reconcilationRemark, info6, info7, info8, info9, info10, approvalDoc, approvalDocType, approvalDocFilePath);
    }
}
