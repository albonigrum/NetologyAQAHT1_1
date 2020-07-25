package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();


    @Test
    public void shouldTestRemainIfAmount0() {
        assertEquals(cashbackHackService.remain(0), 1000);
    }
    @Test
    public void shouldTestRemainIfAmount400() {
        assertEquals(cashbackHackService.remain(400), 600);
    }
    @Test
    public void shouldTestRemainIfAmount1000() {
        assertEquals(cashbackHackService.remain(1000), 0);
    }
}