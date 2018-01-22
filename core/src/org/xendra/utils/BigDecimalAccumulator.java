package org.xendra.utils;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigDecimal;

import org.drools.runtime.rule.TypedAccumulateFunction;

/**
 * This is a 'sum' accumulator for a collection of {@link BigDecimal}.
 * Out-of-the-box Drools has sum accumulators which are able to add up
 * BigDecimals, but do so by converting them to doubles. So the number you get
 * out at the end is not good if your application is doing anything
 * financial.
 * 
 * To use this, create a package builder configuration file:
 * <pre>
 *   META-INF/drools.packagebuilder.conf
 * </pre>
 * Put the following in it:
 * <pre>
 *   drools.accumulate.function.sumbd = uk.co.scattercode.drools.accumulators.BigDecimalAccumulator
 * </pre>
 * And you can now do things like:
 * <pre>
 *   accumulate( 
 *       CurrencyExposure( currency in ("GBP", "EUR", "NOK"), 
 *           $exp : exposure
 *       ),
 *       $sumGbpEurNok : sumbd( $exp )
 *   )
 * </pre>
 * 
 * @author Stephen Masters
 */
public class BigDecimalAccumulator implements TypedAccumulateFunction {

    /**
     * Session-specific data required by the accumulator is stored in a
     * {@link BigDecimalSum} context, which is instantiated by this
     * method.
     */
    @Override
    public Serializable createContext() {
        return new BigDecimalSum();
    }

    /**
     * Initializes the accumulator with an empty list of {@link BigDecimal}.
     */
    @Override
    public void init(Serializable context) throws Exception {
        BigDecimalSum accumulator = (BigDecimalSum) context;
        accumulator.init();
    }

    /**
     * Adds the value to the accumulator sum.
     */
    @Override
    public void accumulate(Serializable context, Object value) {
        BigDecimalSum accumulator = (BigDecimalSum) context;
        accumulator.add((BigDecimal) value);
    }

    /**
     * Subtracts the value from the accumulator sum.
     */
    @Override
    public void reverse(Serializable context, Object value) throws Exception {
        BigDecimalSum accumulator = (BigDecimalSum) context;
        accumulator.subtract((BigDecimal) value);
    }

    /**
     * Yes, this accumulator does implement the reverse method..
     */
    @Override
    public boolean supportsReverse() {
        return true;
    }

    /**
     * Returns the current 'sum' held in the accumulator.
     */
    @Override
    public Object getResult(Serializable context) throws Exception {
        BigDecimalSum accumulator = (BigDecimalSum) context;
        return accumulator.sum;
    }

    /**
     * Returns the class of the object returned by getResult.
     */
    @Override
    public Class<BigDecimal> getResultType() {
        return BigDecimal.class;
    }

    /**
     * Required to support {@link Externalizable} interface so that data can be
     * shared across sessions. However, we don't need to do that, so this method
     * is empty.
     */
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    }

    /**
     * Required to support {@link Externalizable} interface so that data can be
     * shared across sessions. However, we don't need to do that, so this method
     * is empty.
     */
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
    }

    /**
     * Session-specific data required by the accumulator is stored in a
     * an instance of this class.
     */
    private static class BigDecimalSum implements Serializable {
        /** Generated serialVersionUID */
        private static final long serialVersionUID = -3852330030144129793L;
        BigDecimal sum = BigDecimal.ZERO;
        void init() {
            this.sum = BigDecimal.ZERO;
        }
        void add(BigDecimal augend) {
            this.sum = sum.add(augend);
        }
        void subtract(BigDecimal subtrahend) {
            this.sum = sum.subtract(subtrahend);
        }
    }

}