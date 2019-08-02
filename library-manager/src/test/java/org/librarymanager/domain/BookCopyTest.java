package org.librarymanager.domain;

import org.junit.Assert;
import org.junit.Test;

public class BookCopyTest {
    @Test
    public void testReserve() {
        BookCopy copy = new BookCopy();
        copy.reserve();
        Assert.assertTrue(copy.isReserved());
    }

    @Test(expected = ReservationException.class)
    public void cannotReserveAlreadyReservedBook() {
        BookCopy copy = new BookCopy();
        copy.reserve();
        copy.reserve();
    }
}
