package library;

import java.util.Date;

class Reservation {
    private Date reservationStartDate;
    private Date reservationEndDate;

    public Reservation(Date reservationStartDate, Date reservationEndDate) {
        this.reservationStartDate = reservationStartDate;
        this.reservationEndDate = reservationEndDate;
    }

    public Date getReservationStartDate() {
        return reservationStartDate;
    }

    public Date getReservationEndDate() {
        return reservationEndDate;
    }

    public void setReservationStartDate(Date reservationStartDate) {
        this.reservationStartDate = reservationStartDate;
    }

    public void setReservationEndDate(Date reservationEndDate) {
        this.reservationEndDate = reservationEndDate;
    }
}