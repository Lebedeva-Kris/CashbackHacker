package ru.netology.domain;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackerServiceTest {
    public CashbackHackerService service = new CashbackHackerService();

    @Test
    public void shouldCalculateCashbackIfPaymentBoundary() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldCalculateCashbackIfPaymentMoreThanBoundary() {
        int amount = 3000;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldCalculateCashbackIfPaymentLessThanBoundary() {
        int amount = 700;

        int actual = service.remain(amount);
        int expected = 300;

        Assert.assertEquals(actual, expected);

    }
}
