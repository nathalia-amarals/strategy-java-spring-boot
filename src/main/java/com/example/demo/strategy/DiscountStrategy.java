package com.example.demo.strategy;

import java.math.BigDecimal;

public interface DiscountStrategy {

    BigDecimal applyDiscount(BigDecimal price);

    boolean selector(DiscountType discountType);
}
