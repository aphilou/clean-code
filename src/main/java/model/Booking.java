package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {

    private LocalDate startDate;
    private LocalDate endDate;
    private int guestNumber;
    private List<HotelService> extras;

    public Booking(LocalDate startDate, LocalDate endDate, int guestNb) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.guestNumber = guestNb;
        this.extras = new ArrayList<>();
    }

    public LocalDate getStartDate() {

        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void addExtra(HotelService extra) {
        extras.add(extra);
    }

    public BigDecimal getExtraCost() {
        BigDecimal total = BigDecimal.ZERO;
        for (HotelService extra :
             extras) {
            total = total.add(extra.getAmount());
        }
        return total;
    }
}
