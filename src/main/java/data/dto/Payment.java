package data.dto;

import org.joda.time.DateTime;

/**
 * Created by Adeola.Ojo on 7/25/2016.
 */
public class Payment {

    public String AdditionalInfo ;

    public boolean AllowLoadCardNotification ;

    public boolean AllowServiceNotification ;

    public boolean AllowThirdPartyDataCapture ;

    public String AlternateCustomerNumberMask ;

    public String AlternateCustomerNumberMaskFormat ;

    public String AlternateCustReference ;

    public long Amount ;

    public boolean AppendReceiptNoToEmailSubject ;

    public String BankCode ;

    public String BankCollectionFeePercent ;

    public String BankName ;

    public String BranchCode ;

    public String BranchName ;

    public String CardPAN ;

    public String ChannelName ;

    public ChequeDetail ChequeDetail ;

    public String CollectionBankFees ;

    public String CollectionsAccount ;

    public Corporate Corporate ;

    public Currency Currency ;

    public String CustomerAddress ;

    public double CustomerBorneFee ;

    public String CustomerName ;

    public String CustomerNumberMask ;

    public String CustomerNumberMaskFormat ;

    public String CustomerPhoneNumber ;

    public String CustReference ;

    public String DepositorName ;

    public String DepositSlipNumber ;

    public int EmailNotificationStatus ;

    public boolean EnforceAlternateCustomerNumberEncryption ;

    public boolean EnforceCustomerNumberEncryption ;

    public String FeeName ;

    public double FinalTotalAmount ;

    public int FtpNotificationStatus ;

    public String FtpPassword ;

    public String FtpUrl ;

    public String FtpUsername ;

    public double InitialTotalAmount ;

    public String InstitutionId ;

    public String InstitutionName ;

    public boolean IsChequePayment ;

    public boolean IsCorporateIntegrationOnPaymentItem ;

    public boolean IsDoublePosting ;

    public String IsoFee ;

    public String IsoFeePercent ;

    public String ISWTrxFee ;

    public String ISWTrxFeePercent ;

    public String ISWTrxFees ;

    public String LeadBankFeePercent ;

    public String LeadBankFees ;

    public int LoadCardNotificationStatus ;

    public String Location ;

    public boolean MaskAlternateCustomerNumberWhenDisplayed ;

    public boolean MaskCustomerNumberWhenDisplayed ;

    public boolean MerchantGenerateOwnPaymentRef ;

    public String MerchantPaymentReference ;

    public long OriginalPaymentId ;

    public String OriginalPaymentReference ;

    public String OtherCustomerInfo ;

    public String PaymentCurrency ;

    public DateTime PaymentDate ;

    public String PaymentLogId ;

    public String PaymentMethod ;

    public int PaymentMethodId ;

    public DateTime PaymentNotificationDate ;

    public DateTime PaymentNotificationResponseDate ;

    public int PaymentNotificationRetries ;

    public int PaymentNotificationStatus ;

    public int PaymentNotificationType ;

    public String PaymentReceiptUrl ;

    public String PaymentReference ;

    public String PaymentStatus ;

    public long ProductId ;

    public String ProductUniqueField ;

    public String ReceiptNo ;

    public String RemitaRetrievalReference ;

    public DateTime RemittanceDate ;

    public int ReversalStatus ;

    public String RouteId ;

    public int ServiceNotificationStatus ;

    public String ServicePassword ;

    public String ServiceUrl ;

    public String ServiceUsername ;

    public DateTime SettlementDate ;

    public int SmsNotificationStatus ;

    public String Status ;

    public String TerminalId ;

    public String ThirdPartyCode ;

    public String ThirdPartyMaskSingular ;

    public String ThirdPartyName ;

    public String TillAccountNumber ;

    public double TotalFee ;

    public Transaction Transaction ;

    public String UniqueItemMask ;

    public boolean UseAlternateIdentity ;

    public String UserLastName ;

    public String getAdditionalInfo() {
        return AdditionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        AdditionalInfo = additionalInfo;
    }

    public boolean isAllowLoadCardNotification() {
        return AllowLoadCardNotification;
    }

    public void setAllowLoadCardNotification(boolean allowLoadCardNotification) {
        AllowLoadCardNotification = allowLoadCardNotification;
    }

    public boolean isAllowServiceNotification() {
        return AllowServiceNotification;
    }

    public void setAllowServiceNotification(boolean allowServiceNotification) {
        AllowServiceNotification = allowServiceNotification;
    }

    public boolean isAllowThirdPartyDataCapture() {
        return AllowThirdPartyDataCapture;
    }

    public void setAllowThirdPartyDataCapture(boolean allowThirdPartyDataCapture) {
        AllowThirdPartyDataCapture = allowThirdPartyDataCapture;
    }

    public String getAlternateCustomerNumberMask() {
        return AlternateCustomerNumberMask;
    }

    public void setAlternateCustomerNumberMask(String alternateCustomerNumberMask) {
        AlternateCustomerNumberMask = alternateCustomerNumberMask;
    }

    public String getAlternateCustomerNumberMaskFormat() {
        return AlternateCustomerNumberMaskFormat;
    }

    public void setAlternateCustomerNumberMaskFormat(String alternateCustomerNumberMaskFormat) {
        AlternateCustomerNumberMaskFormat = alternateCustomerNumberMaskFormat;
    }

    public String getAlternateCustReference() {
        return AlternateCustReference;
    }

    public void setAlternateCustReference(String alternateCustReference) {
        AlternateCustReference = alternateCustReference;
    }

    public long getAmount() {
        return Amount;
    }

    public void setAmount(long amount) {
        Amount = amount;
    }

    public boolean isAppendReceiptNoToEmailSubject() {
        return AppendReceiptNoToEmailSubject;
    }

    public void setAppendReceiptNoToEmailSubject(boolean appendReceiptNoToEmailSubject) {
        AppendReceiptNoToEmailSubject = appendReceiptNoToEmailSubject;
    }

    public String getBankCode() {
        return BankCode;
    }

    public void setBankCode(String bankCode) {
        BankCode = bankCode;
    }

    public String getBankCollectionFeePercent() {
        return BankCollectionFeePercent;
    }

    public void setBankCollectionFeePercent(String bankCollectionFeePercent) {
        BankCollectionFeePercent = bankCollectionFeePercent;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public String getBranchCode() {
        return BranchCode;
    }

    public void setBranchCode(String branchCode) {
        BranchCode = branchCode;
    }

    public String getBranchName() {
        return BranchName;
    }

    public void setBranchName(String branchName) {
        BranchName = branchName;
    }

    public String getCardPAN() {
        return CardPAN;
    }

    public void setCardPAN(String cardPAN) {
        CardPAN = cardPAN;
    }

    public String getChannelName() {
        return ChannelName;
    }

    public void setChannelName(String channelName) {
        ChannelName = channelName;
    }

    public data.dto.ChequeDetail getChequeDetail() {
        return ChequeDetail;
    }

    public void setChequeDetail(data.dto.ChequeDetail chequeDetail) {
        ChequeDetail = chequeDetail;
    }

    public String getCollectionBankFees() {
        return CollectionBankFees;
    }

    public void setCollectionBankFees(String collectionBankFees) {
        CollectionBankFees = collectionBankFees;
    }

    public String getCollectionsAccount() {
        return CollectionsAccount;
    }

    public void setCollectionsAccount(String collectionsAccount) {
        CollectionsAccount = collectionsAccount;
    }

    public data.dto.Corporate getCorporate() {
        return Corporate;
    }

    public void setCorporate(data.dto.Corporate corporate) {
        Corporate = corporate;
    }

    public data.dto.Currency getCurrency() {
        return Currency;
    }

    public void setCurrency(data.dto.Currency currency) {
        Currency = currency;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public double getCustomerBorneFee() {
        return CustomerBorneFee;
    }

    public void setCustomerBorneFee(double customerBorneFee) {
        CustomerBorneFee = customerBorneFee;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerNumberMask() {
        return CustomerNumberMask;
    }

    public void setCustomerNumberMask(String customerNumberMask) {
        CustomerNumberMask = customerNumberMask;
    }

    public String getCustomerNumberMaskFormat() {
        return CustomerNumberMaskFormat;
    }

    public void setCustomerNumberMaskFormat(String customerNumberMaskFormat) {
        CustomerNumberMaskFormat = customerNumberMaskFormat;
    }

    public String getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        CustomerPhoneNumber = customerPhoneNumber;
    }

    public String getCustReference() {
        return CustReference;
    }

    public void setCustReference(String custReference) {
        CustReference = custReference;
    }

    public String getDepositorName() {
        return DepositorName;
    }

    public void setDepositorName(String depositorName) {
        DepositorName = depositorName;
    }

    public String getDepositSlipNumber() {
        return DepositSlipNumber;
    }

    public void setDepositSlipNumber(String depositSlipNumber) {
        DepositSlipNumber = depositSlipNumber;
    }

    public int getEmailNotificationStatus() {
        return EmailNotificationStatus;
    }

    public void setEmailNotificationStatus(int emailNotificationStatus) {
        EmailNotificationStatus = emailNotificationStatus;
    }

    public boolean isEnforceAlternateCustomerNumberEncryption() {
        return EnforceAlternateCustomerNumberEncryption;
    }

    public void setEnforceAlternateCustomerNumberEncryption(boolean enforceAlternateCustomerNumberEncryption) {
        EnforceAlternateCustomerNumberEncryption = enforceAlternateCustomerNumberEncryption;
    }

    public boolean isEnforceCustomerNumberEncryption() {
        return EnforceCustomerNumberEncryption;
    }

    public void setEnforceCustomerNumberEncryption(boolean enforceCustomerNumberEncryption) {
        EnforceCustomerNumberEncryption = enforceCustomerNumberEncryption;
    }

    public String getFeeName() {
        return FeeName;
    }

    public void setFeeName(String feeName) {
        FeeName = feeName;
    }

    public double getFinalTotalAmount() {
        return FinalTotalAmount;
    }

    public void setFinalTotalAmount(double finalTotalAmount) {
        FinalTotalAmount = finalTotalAmount;
    }

    public int getFtpNotificationStatus() {
        return FtpNotificationStatus;
    }

    public void setFtpNotificationStatus(int ftpNotificationStatus) {
        FtpNotificationStatus = ftpNotificationStatus;
    }

    public String getFtpPassword() {
        return FtpPassword;
    }

    public void setFtpPassword(String ftpPassword) {
        FtpPassword = ftpPassword;
    }

    public String getFtpUrl() {
        return FtpUrl;
    }

    public void setFtpUrl(String ftpUrl) {
        FtpUrl = ftpUrl;
    }

    public String getFtpUsername() {
        return FtpUsername;
    }

    public void setFtpUsername(String ftpUsername) {
        FtpUsername = ftpUsername;
    }

    public double getInitialTotalAmount() {
        return InitialTotalAmount;
    }

    public void setInitialTotalAmount(double initialTotalAmount) {
        InitialTotalAmount = initialTotalAmount;
    }

    public String getInstitutionId() {
        return InstitutionId;
    }

    public void setInstitutionId(String institutionId) {
        InstitutionId = institutionId;
    }

    public String getInstitutionName() {
        return InstitutionName;
    }

    public void setInstitutionName(String institutionName) {
        InstitutionName = institutionName;
    }

    public boolean isChequePayment() {
        return IsChequePayment;
    }

    public void setChequePayment(boolean chequePayment) {
        IsChequePayment = chequePayment;
    }

    public boolean isCorporateIntegrationOnPaymentItem() {
        return IsCorporateIntegrationOnPaymentItem;
    }

    public void setCorporateIntegrationOnPaymentItem(boolean corporateIntegrationOnPaymentItem) {
        IsCorporateIntegrationOnPaymentItem = corporateIntegrationOnPaymentItem;
    }

    public boolean isDoublePosting() {
        return IsDoublePosting;
    }

    public void setDoublePosting(boolean doublePosting) {
        IsDoublePosting = doublePosting;
    }

    public String getIsoFee() {
        return IsoFee;
    }

    public void setIsoFee(String isoFee) {
        IsoFee = isoFee;
    }

    public String getIsoFeePercent() {
        return IsoFeePercent;
    }

    public void setIsoFeePercent(String isoFeePercent) {
        IsoFeePercent = isoFeePercent;
    }

    public String getISWTrxFee() {
        return ISWTrxFee;
    }

    public void setISWTrxFee(String ISWTrxFee) {
        this.ISWTrxFee = ISWTrxFee;
    }

    public String getISWTrxFeePercent() {
        return ISWTrxFeePercent;
    }

    public void setISWTrxFeePercent(String ISWTrxFeePercent) {
        this.ISWTrxFeePercent = ISWTrxFeePercent;
    }

    public String getISWTrxFees() {
        return ISWTrxFees;
    }

    public void setISWTrxFees(String ISWTrxFees) {
        this.ISWTrxFees = ISWTrxFees;
    }

    public String getLeadBankFeePercent() {
        return LeadBankFeePercent;
    }

    public void setLeadBankFeePercent(String leadBankFeePercent) {
        LeadBankFeePercent = leadBankFeePercent;
    }

    public String getLeadBankFees() {
        return LeadBankFees;
    }

    public void setLeadBankFees(String leadBankFees) {
        LeadBankFees = leadBankFees;
    }

    public int getLoadCardNotificationStatus() {
        return LoadCardNotificationStatus;
    }

    public void setLoadCardNotificationStatus(int loadCardNotificationStatus) {
        LoadCardNotificationStatus = loadCardNotificationStatus;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public boolean isMaskAlternateCustomerNumberWhenDisplayed() {
        return MaskAlternateCustomerNumberWhenDisplayed;
    }

    public void setMaskAlternateCustomerNumberWhenDisplayed(boolean maskAlternateCustomerNumberWhenDisplayed) {
        MaskAlternateCustomerNumberWhenDisplayed = maskAlternateCustomerNumberWhenDisplayed;
    }

    public boolean isMaskCustomerNumberWhenDisplayed() {
        return MaskCustomerNumberWhenDisplayed;
    }

    public void setMaskCustomerNumberWhenDisplayed(boolean maskCustomerNumberWhenDisplayed) {
        MaskCustomerNumberWhenDisplayed = maskCustomerNumberWhenDisplayed;
    }

    public boolean isMerchantGenerateOwnPaymentRef() {
        return MerchantGenerateOwnPaymentRef;
    }

    public void setMerchantGenerateOwnPaymentRef(boolean merchantGenerateOwnPaymentRef) {
        MerchantGenerateOwnPaymentRef = merchantGenerateOwnPaymentRef;
    }

    public String getMerchantPaymentReference() {
        return MerchantPaymentReference;
    }

    public void setMerchantPaymentReference(String merchantPaymentReference) {
        MerchantPaymentReference = merchantPaymentReference;
    }

    public long getOriginalPaymentId() {
        return OriginalPaymentId;
    }

    public void setOriginalPaymentId(long originalPaymentId) {
        OriginalPaymentId = originalPaymentId;
    }

    public String getOriginalPaymentReference() {
        return OriginalPaymentReference;
    }

    public void setOriginalPaymentReference(String originalPaymentReference) {
        OriginalPaymentReference = originalPaymentReference;
    }

    public String getOtherCustomerInfo() {
        return OtherCustomerInfo;
    }

    public void setOtherCustomerInfo(String otherCustomerInfo) {
        OtherCustomerInfo = otherCustomerInfo;
    }

    public String getPaymentCurrency() {
        return PaymentCurrency;
    }

    public void setPaymentCurrency(String paymentCurrency) {
        PaymentCurrency = paymentCurrency;
    }

    public DateTime getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(DateTime paymentDate) {
        PaymentDate = paymentDate;
    }

    public String getPaymentLogId() {
        return PaymentLogId;
    }

    public void setPaymentLogId(String paymentLogId) {
        PaymentLogId = paymentLogId;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }

    public int getPaymentMethodId() {
        return PaymentMethodId;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        PaymentMethodId = paymentMethodId;
    }

    public DateTime getPaymentNotificationDate() {
        return PaymentNotificationDate;
    }

    public void setPaymentNotificationDate(DateTime paymentNotificationDate) {
        PaymentNotificationDate = paymentNotificationDate;
    }

    public DateTime getPaymentNotificationResponseDate() {
        return PaymentNotificationResponseDate;
    }

    public void setPaymentNotificationResponseDate(DateTime paymentNotificationResponseDate) {
        PaymentNotificationResponseDate = paymentNotificationResponseDate;
    }

    public int getPaymentNotificationRetries() {
        return PaymentNotificationRetries;
    }

    public void setPaymentNotificationRetries(int paymentNotificationRetries) {
        PaymentNotificationRetries = paymentNotificationRetries;
    }

    public int getPaymentNotificationStatus() {
        return PaymentNotificationStatus;
    }

    public void setPaymentNotificationStatus(int paymentNotificationStatus) {
        PaymentNotificationStatus = paymentNotificationStatus;
    }

    public int getPaymentNotificationType() {
        return PaymentNotificationType;
    }

    public void setPaymentNotificationType(int paymentNotificationType) {
        PaymentNotificationType = paymentNotificationType;
    }

    public String getPaymentReceiptUrl() {
        return PaymentReceiptUrl;
    }

    public void setPaymentReceiptUrl(String paymentReceiptUrl) {
        PaymentReceiptUrl = paymentReceiptUrl;
    }

    public String getPaymentReference() {
        return PaymentReference;
    }

    public void setPaymentReference(String paymentReference) {
        PaymentReference = paymentReference;
    }

    public String getPaymentStatus() {
        return PaymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        PaymentStatus = paymentStatus;
    }

    public long getProductId() {
        return ProductId;
    }

    public void setProductId(long productId) {
        ProductId = productId;
    }

    public String getProductUniqueField() {
        return ProductUniqueField;
    }

    public void setProductUniqueField(String productUniqueField) {
        ProductUniqueField = productUniqueField;
    }

    public String getReceiptNo() {
        return ReceiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        ReceiptNo = receiptNo;
    }

    public String getRemitaRetrievalReference() {
        return RemitaRetrievalReference;
    }

    public void setRemitaRetrievalReference(String remitaRetrievalReference) {
        RemitaRetrievalReference = remitaRetrievalReference;
    }

    public DateTime getRemittanceDate() {
        return RemittanceDate;
    }

    public void setRemittanceDate(DateTime remittanceDate) {
        RemittanceDate = remittanceDate;
    }

    public int getReversalStatus() {
        return ReversalStatus;
    }

    public void setReversalStatus(int reversalStatus) {
        ReversalStatus = reversalStatus;
    }

    public String getRouteId() {
        return RouteId;
    }

    public void setRouteId(String routeId) {
        RouteId = routeId;
    }

    public int getServiceNotificationStatus() {
        return ServiceNotificationStatus;
    }

    public void setServiceNotificationStatus(int serviceNotificationStatus) {
        ServiceNotificationStatus = serviceNotificationStatus;
    }

    public String getServicePassword() {
        return ServicePassword;
    }

    public void setServicePassword(String servicePassword) {
        ServicePassword = servicePassword;
    }

    public String getServiceUrl() {
        return ServiceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        ServiceUrl = serviceUrl;
    }

    public String getServiceUsername() {
        return ServiceUsername;
    }

    public void setServiceUsername(String serviceUsername) {
        ServiceUsername = serviceUsername;
    }

    public DateTime getSettlementDate() {
        return SettlementDate;
    }

    public void setSettlementDate(DateTime settlementDate) {
        SettlementDate = settlementDate;
    }

    public int getSmsNotificationStatus() {
        return SmsNotificationStatus;
    }

    public void setSmsNotificationStatus(int smsNotificationStatus) {
        SmsNotificationStatus = smsNotificationStatus;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getTerminalId() {
        return TerminalId;
    }

    public void setTerminalId(String terminalId) {
        TerminalId = terminalId;
    }

    public String getThirdPartyCode() {
        return ThirdPartyCode;
    }

    public void setThirdPartyCode(String thirdPartyCode) {
        ThirdPartyCode = thirdPartyCode;
    }

    public String getThirdPartyMaskSingular() {
        return ThirdPartyMaskSingular;
    }

    public void setThirdPartyMaskSingular(String thirdPartyMaskSingular) {
        ThirdPartyMaskSingular = thirdPartyMaskSingular;
    }

    public String getThirdPartyName() {
        return ThirdPartyName;
    }

    public void setThirdPartyName(String thirdPartyName) {
        ThirdPartyName = thirdPartyName;
    }

    public String getTillAccountNumber() {
        return TillAccountNumber;
    }

    public void setTillAccountNumber(String tillAccountNumber) {
        TillAccountNumber = tillAccountNumber;
    }

    public double getTotalFee() {
        return TotalFee;
    }

    public void setTotalFee(double totalFee) {
        TotalFee = totalFee;
    }

    public data.dto.Transaction getTransaction() {
        return Transaction;
    }

    public void setTransaction(data.dto.Transaction transaction) {
        Transaction = transaction;
    }

    public String getUniqueItemMask() {
        return UniqueItemMask;
    }

    public void setUniqueItemMask(String uniqueItemMask) {
        UniqueItemMask = uniqueItemMask;
    }

    public boolean isUseAlternateIdentity() {
        return UseAlternateIdentity;
    }

    public void setUseAlternateIdentity(boolean useAlternateIdentity) {
        UseAlternateIdentity = useAlternateIdentity;
    }

    public String getUserLastName() {
        return UserLastName;
    }

    public void setUserLastName(String userLastName) {
        UserLastName = userLastName;
    }

    public String getUserOtherName() {
        return UserOtherName;
    }

    public void setUserOtherName(String userOtherName) {
        UserOtherName = userOtherName;
    }

    public boolean isUsesUniqueItem() {
        return UsesUniqueItem;
    }

    public void setUsesUniqueItem(boolean usesUniqueItem) {
        UsesUniqueItem = usesUniqueItem;
    }

    public String UserOtherName ;

    public boolean UsesUniqueItem ;
}
