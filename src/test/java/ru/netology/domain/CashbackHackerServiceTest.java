package ru.netology.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackerServiceTest {
    public CashbackHackerService service = new CashbackHackerService();

    @Test
    public void shouldRemainIfPaymentBoundary() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldRemainIfPaymentLessThanBoundary() {
        int amount = 700;

        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldRemainIfPaymentZero() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void shouldRemainIfAmountZeroJupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(1000, service.remain(0));
    }

    @org.junit.jupiter.api.Test
    public void shouldRemainIfAmountLessThanBoundaryJupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(300, service.remain(700));
    }

    @org.junit.jupiter.api.Test
    public void shouldRemainIfAmountBoundaryJupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(0, service.remain(1000));
    }


}