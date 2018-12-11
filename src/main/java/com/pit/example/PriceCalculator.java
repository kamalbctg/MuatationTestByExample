package com.pit.example;

public class PriceCalculator {
    public int getPrice(int amount, boolean hasCoupon) {
        if (amount >= 20 || hasCoupon) {
            return amount * 15;
        }
        return amount * 17;
    }
}
