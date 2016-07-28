package processor.paydirect.impl;

import data.dto.Payment;

/**
 * Created by Adeola.Ojo on 7/26/2016.
 */
public interface IProcessor {
    void execute(Payment payment) throws Exception;
}
