package com.example.demo.strategy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class NewYearDiscountStrategy implements DiscountStrategy{
    @Override
    public BigDecimal applyDiscount(BigDecimal price) {
        return price.multiply(BigDecimal.valueOf(0.85)); // 15% de desconto
    }

    @Override
    public boolean selector(DiscountType discountType) {
        return DiscountType.NEW_YEAR.equals(discountType);
    }
}
