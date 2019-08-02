package org.librarymanager.domain;

public class Reservation {
    private Long bookCopyId;
    private Long userId;

    public Reservation(Long bookCopyId, Long userId) {
        this.bookCopyId = bookCopyId;
        this.userId = userId;
    }

    public Long getBookCopyId() {
        return bookCopyId;
    }

    public void setBookCopyId(Long bookCopyId) {
        this.bookCopyId = bookCopyId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
