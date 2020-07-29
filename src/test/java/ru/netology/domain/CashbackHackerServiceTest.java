package ru.netology.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackerServiceTest {
    public CashbackHackerService service = new CashbackHackerService();

    @Test
    public void shouldCalculateCashbackIfPaymentBoundary() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateCashbackIfPaymentLessThanBoundary() {
        int amount = 700;

        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateCashbackIfPaymentZero() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);

    }


}