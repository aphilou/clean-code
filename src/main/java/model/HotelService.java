package model;

import java.math.BigDecimal;

public class HotelService {

    private BigDecimal amount;
    private String name;

    public HotelService(BigDecimal amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
