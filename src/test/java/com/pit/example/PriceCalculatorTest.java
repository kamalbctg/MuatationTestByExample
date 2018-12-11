package com.pit.example;

import org.junit.Assert;
import org.junit.Test;

public class PriceCalculatorTest {

    PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    public void testNormalPricing() {
        Assert.assertEquals(17, priceCalculator.getPrice(1, false));
    }

    @Test
    public void testDiscountedPricing() {
        Assert.assertEquals(1500, priceCalculator.getPrice(100, false));
    }

    @Test
    public void testPricingWithCoupon() {
        Assert.assertEquals(15, priceCalculator.getPrice(1, true));
    }

    @Test
    public void testDiscountedPricingWithCoupon() {
        Assert.assertEquals(300, priceCalculator.getPrice(20, true));   //problem should be false
    }
}