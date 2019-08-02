package org.librarymanager.domain;

public class BookCopy {
    private boolean reserved;

    public BookCopy() {
    }

    public void reserve() {
        if (isReserved()) {
            throw new ReservationException("Book copy already reserved.");
        }

        reserved = true;
    }

    public boolean isReserved() {
        return reserved;
    }
}
