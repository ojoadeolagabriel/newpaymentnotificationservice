package data.dto;

import org.joda.time.DateTime;

/**
 * Created by Adeola.Ojo on 7/25/2016.
 */
public class Transaction {

    public String Amount ;

    public String ApprovedAmount ;

    public String CardExpiryDay ;

    public String CardExpiryMonth ;

    public String CardExpiryYear ;

    public int CardId ;

    public String CardPAN ;

    public String CardSequenceNumber ;

    public String CurrencyCode ;

    public String FinalApprovedAmount ;

    public DateTime FinalDateTime ;

    public String FinalResponseCode ;

    public String FinalRetrievalReferenceNumber ;

    public String FromAccount ;

    public String FromAccountType ;

    public String ResponseCode ;

    public String Retries ;

    public String RetrievalReferenceNumber ;

    public String Surcharge ;

    public String SurchargeCurrency ;

    public String TerminalId ;

    public DateTime Time ;

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getApprovedAmount() {
        return ApprovedAmount;
    }

    public void setApprovedAmount(String approvedAmount) {
        ApprovedAmount = approvedAmount;
    }

    public String getCardExpiryDay() {
        return CardExpiryDay;
    }

    public void setCardExpiryDay(String cardExpiryDay) {
        CardExpiryDay = cardExpiryDay;
    }

    public String getCardExpiryMonth() {
        return CardExpiryMonth;
    }

    public void setCardExpiryMonth(String cardExpiryMonth) {
        CardExpiryMonth = cardExpiryMonth;
    }

    public String getCardExpiryYear() {
        return CardExpiryYear;
    }

    public void setCardExpiryYear(String cardExpiryYear) {
        CardExpiryYear = cardExpiryYear;
    }

    public int getCardId() {
        return CardId;
    }

    public void setCardId(int cardId) {
        CardId = cardId;
    }

    public String getCardPAN() {
        return CardPAN;
    }

    public void setCardPAN(String cardPAN) {
        CardPAN = cardPAN;
    }

    public String getCardSequenceNumber() {
        return CardSequenceNumber;
    }

    public void setCardSequenceNumber(String cardSequenceNumber) {
        CardSequenceNumber = cardSequenceNumber;
    }

    public String getCurrencyCode() {
        return CurrencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        CurrencyCode = currencyCode;
    }

    public String getFinalApprovedAmount() {
        return FinalApprovedAmount;
    }

    public void setFinalApprovedAmount(String finalApprovedAmount) {
        FinalApprovedAmount = finalApprovedAmount;
    }

    public DateTime getFinalDateTime() {
        return FinalDateTime;
    }

    public void setFinalDateTime(DateTime finalDateTime) {
        FinalDateTime = finalDateTime;
    }

    public String getFinalResponseCode() {
        return FinalResponseCode;
    }

    public void setFinalResponseCode(String finalResponseCode) {
        FinalResponseCode = finalResponseCode;
    }

    public String getFinalRetrievalReferenceNumber() {
        return FinalRetrievalReferenceNumber;
    }

    public void setFinalRetrievalReferenceNumber(String finalRetrievalReferenceNumber) {
        FinalRetrievalReferenceNumber = finalRetrievalReferenceNumber;
    }

    public String getFromAccount() {
        return FromAccount;
    }

    public void setFromAccount(String fromAccount) {
        FromAccount = fromAccount;
    }

    public String getFromAccountType() {
        return FromAccountType;
    }

    public void setFromAccountType(String fromAccountType) {
        FromAccountType = fromAccountType;
    }

    public String getResponseCode() {
        return ResponseCode;
    }

    public void setResponseCode(String responseCode) {
        ResponseCode = responseCode;
    }

    public String getRetries() {
        return Retries;
    }

    public void setRetries(String retries) {
        Retries = retries;
    }

    public String getRetrievalReferenceNumber() {
        return RetrievalReferenceNumber;
    }

    public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
        RetrievalReferenceNumber = retrievalReferenceNumber;
    }

    public String getSurcharge() {
        return Surcharge;
    }

    public void setSurcharge(String surcharge) {
        Surcharge = surcharge;
    }

    public String getSurchargeCurrency() {
        return SurchargeCurrency;
    }

    public void setSurchargeCurrency(String surchargeCurrency) {
        SurchargeCurrency = surchargeCurrency;
    }

    public String getTerminalId() {
        return TerminalId;
    }

    public void setTerminalId(String terminalId) {
        TerminalId = terminalId;
    }

    public DateTime getTime() {
        return Time;
    }

    public void setTime(DateTime time) {
        Time = time;
    }

    public String getToAccount() {
        return ToAccount;
    }

    public void setToAccount(String toAccount) {
        ToAccount = toAccount;
    }

    public String getToAccountType() {
        return ToAccountType;
    }

    public void setToAccountType(String toAccountType) {
        ToAccountType = toAccountType;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String ToAccount ;

    public String ToAccountType ;

    public String Type ;
}
