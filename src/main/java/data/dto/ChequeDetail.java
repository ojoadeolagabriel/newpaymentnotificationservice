package data.dto;

/**
 * Created by Adeola.Ojo on 7/25/2016.
 */
public class ChequeDetail {

    public String BankName ;

    public int ChequeBankId ;

    public String ChequeDateReturned ;

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public int getChequeBankId() {
        return ChequeBankId;
    }

    public void setChequeBankId(int chequeBankId) {
        ChequeBankId = chequeBankId;
    }

    public String getChequeDateReturned() {
        return ChequeDateReturned;
    }

    public void setChequeDateReturned(String chequeDateReturned) {
        ChequeDateReturned = chequeDateReturned;
    }

    public String getChequeNumber() {
        return ChequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        ChequeNumber = chequeNumber;
    }

    public String getChequeValueDate() {
        return ChequeValueDate;
    }

    public void setChequeValueDate(String chequeValueDate) {
        ChequeValueDate = chequeValueDate;
    }

    public boolean isOwnBankCheque() {
        return IsOwnBankCheque;
    }

    public void setOwnBankCheque(boolean ownBankCheque) {
        IsOwnBankCheque = ownBankCheque;
    }

    public int getPaymentId() {
        return PaymentId;
    }

    public void setPaymentId(int paymentId) {
        PaymentId = paymentId;
    }

    public String ChequeNumber ;

    public String ChequeValueDate ;

    public boolean IsOwnBankCheque ;

    public int PaymentId ;
}
