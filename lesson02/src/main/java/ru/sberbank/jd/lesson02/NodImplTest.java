package ru.sberbank.jd.lesson02;

import org.junit.Assert;
import org.junit.Test;

public class NodImplTest {
    NodImpl nodImpl = new NodImpl();

    @Test
    public void calculate(){
        Assert.assertEquals("НОД отличается от актуального: " + nodImpl.calculate(80,40), 40, nodImpl.calculate(80,40));
        Assert.assertEquals("НОД отличается от актуального: " + nodImpl.calculate(2345,32), 1, nodImpl.calculate(2345,32));
    }
}
