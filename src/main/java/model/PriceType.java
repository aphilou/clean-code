package model;

import java.math.BigDecimal;

public enum PriceType {

    LOW(50),
    MEDIUM(100),
    HIGH(150);

    private final BigDecimal baseAmount;

    PriceType(int baseAmount) {
        this.baseAmount = BigDecimal.valueOf(baseAmount);
    }

    public BigDecimal getBaseAmount() {
        return baseAmount;
    }
}
