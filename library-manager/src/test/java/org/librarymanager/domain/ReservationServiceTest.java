package org.librarymanager.domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ReservationServiceTest {
    @Mock
    private BookCopyRepository bookCopyRepository;

    @Mock
    private ReservationRepository reservationRepository;

    @Test
    public void reserveSetBookReservedAndCreatesReservation() {
        Long bookCopyId = 1L;
        Long userId = 1L;

        BookCopy copy = new BookCopy();

        Mockito
            .when(bookCopyRepository.findById(bookCopyId))
            .thenReturn(copy);


        ReservationService reservationService = new ReservationService(bookCopyRepository, reservationRepository);
        reservationService.reserveBookCopyForUser(bookCopyId, userId);

        Assert.assertTrue(copy.isReserved());
        ArgumentCaptor<Reservation> reservationCaptor = ArgumentCaptor.forClass(Reservation.class);
        Mockito.verify(reservationRepository).add(reservationCaptor.capture());
        Assert.assertEquals(bookCopyId, reservationCaptor.getValue().getBookCopyId());
        Assert.assertEquals(userId, reservationCaptor.getValue().getUserId());
    }
}
