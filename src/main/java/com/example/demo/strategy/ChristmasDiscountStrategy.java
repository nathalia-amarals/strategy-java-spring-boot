package com.example.demo.strategy;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ChristmasDiscountStrategy implements DiscountStrategy{
    @Override
    public BigDecimal applyDiscount(BigDecimal price) {
        return price.multiply(BigDecimal.valueOf(0.90)); // 10% de desconto
    }

    @Override
    public boolean selector(DiscountType discountType) {
        return DiscountType.CHRISTMAS.equals(discountType);
    }
}
