package model;

import java.math.BigDecimal;

public enum Discount {

    CUSTOMER(0.8),
    PATNER(0.7);

    private BigDecimal rate;

    Discount(double rate) {
        this.rate = BigDecimal.valueOf(rate);
    }

    public BigDecimal getRate() {
        return rate;
    }
}
