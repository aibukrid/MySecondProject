package ru.stqa.pft.sandbox;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class RectangleTests {


    @Test
    public void testArea() {
        Rectangle r = new Rectangle(4, 6);
        Assert.assertEquals(r.area(), 24.0);
    }
}