package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.MonthDay;

public class Price {

    final static MonthDay OFF_SEASON_START = MonthDay.of(9, 20);
    final static MonthDay OFF_SEASON_END = MonthDay.of(4, 20);

    private PriceType type;
    private Season season;

    Price(PriceType type, LocalDate day) {
        this.type = type;
        int year = day.getYear();
        if (OFF_SEASON_START.isBefore(OFF_SEASON_END)) {
            if (day.isAfter(OFF_SEASON_START.atYear(year))
                    && day.isBefore(OFF_SEASON_END.atYear(year))) {
                this.season = Season.OFF;
            } else {
                this.season = Season.PEAK;
            }
        } else {
            if (day.isBefore(OFF_SEASON_START.atYear(year))
                    && day.isAfter(OFF_SEASON_END.atYear(year))) {
                this.season = Season.PEAK;
            } else {
                this.season = Season.OFF;
            }
        }
    }


    public BigDecimal getNormalCost() {
        return type.getBaseAmount().multiply(season.getRate());
    }

    public BigDecimal applyDiscount(Discount type) {
        return getNormalCost().multiply(type.getRate());
    }
}
