package ru.netology.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackerServiceTest {
    public CashbackHackerService service = new CashbackHackerService();

    @org.junit.jupiter.api.Test
    public void shouldRemainIfAmountZero() {
        org.junit.jupiter.api.Assertions.assertEquals(1000, service.remain(0));
    }

    @org.junit.jupiter.api.Test
    public void shouldRemainIfAmountLessThanBoundary() {
        org.junit.jupiter.api.Assertions.assertEquals(300, service.remain(700));
    }

    @org.junit.jupiter.api.Test
    public void shouldRemainIfAmountBoundary() {
        org.junit.jupiter.api.Assertions.assertEquals(0, service.remain(1000));
    }


}