package org.librarymanager.domain;

public class ReservationService {
    private BookCopyRepository bookCopyRepository;
    private ReservationRepository reservationRepository;

    public ReservationService(BookCopyRepository bookCopyRepository, ReservationRepository reservationRepository) {
        this.bookCopyRepository = bookCopyRepository;
        this.reservationRepository = reservationRepository;
    }

    public void reserveBookCopyForUser(Long bookCopyId, Long userId) {
        BookCopy bookCopy = bookCopyRepository.findById(bookCopyId);
        bookCopy.reserve();
        Reservation reservation = new Reservation(bookCopyId, userId);
        reservationRepository.add(reservation);
    }
}
