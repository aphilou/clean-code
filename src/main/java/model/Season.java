package model;

import java.math.BigDecimal;

public enum Season {
    PEAK(1.5),
    OFF(0.8);

    private BigDecimal rate;

    Season(double rate) {
        this.rate = BigDecimal.valueOf(rate);
    }

    public BigDecimal getRate() {
        return rate;
    }
}
