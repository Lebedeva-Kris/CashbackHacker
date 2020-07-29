package ru.netology.domain;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackerServiceTest {
    public CashbackHackerService service = new CashbackHackerService();

    @Test
    public void shouldRemainIfPaymentBoundary() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldRemainIfPaymentLessThanBoundary() {
        int amount = 700;

        int actual = service.remain(amount);
        int expected = 300;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldRemainIfPaymentZero() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);

    }


}
