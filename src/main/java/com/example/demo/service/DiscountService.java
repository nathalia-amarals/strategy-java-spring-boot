package com.example.demo.service;

import com.example.demo.strategy.DiscountStrategy;
import com.example.demo.strategy.DiscountType;
import jakarta.el.MethodNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DiscountService {

    private final List<DiscountStrategy> strategies;
    public DiscountStrategy getStrategy(DiscountType discountType){
        return strategies.stream().filter(strategy -> strategy.selector(discountType))
                .findFirst()
                .orElseThrow(MethodNotFoundException::new);
    }
}
