package util.datatype;

import data.dto.Currency;

import java.util.List;

/**
 * Created by Adeola.Ojo on 7/26/2016.
 */
public class CurrencyUtil {

    public static Currency filterCurrencyByCode(List<Currency> coll, String code){
        for (Currency c: coll){
            if(c.getCurrencyCode().equals(code))
                return c;
        }
        return null;
    }

    public static Currency filterCurrencyByISOCode(List<Currency> coll, String code){
        for (Currency c: coll){
            if(c.getIsoCode().equals(code))
                return c;
        }
        return null;
    }
}
