package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldTestRemainIfAmount0() {
        assertEquals(1000, cashbackHackService.remain(0));
    }
    @Test
    public void shouldTestRemainIfAmount400() {
        assertEquals(600, cashbackHackService.remain(400));
    }
    @Test
    public void shouldTestRemainIfAmount1000() {
        assertEquals(0, cashbackHackService.remain(1000));
    }
}