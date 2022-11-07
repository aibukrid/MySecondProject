package ru.stqa.pft.sandbox;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TreeTests {
    @Test
    public void testArea() {
        Tree t = new Tree(18, 100, 20, 60);
        Assert.assertEquals(t.height(), 6.0);
    }
}