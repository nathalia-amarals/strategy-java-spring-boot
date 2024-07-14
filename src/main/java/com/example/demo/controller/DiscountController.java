package com.example.demo.controller;

import com.example.demo.service.DiscountService;
import com.example.demo.strategy.DiscountType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("discount")
@RequiredArgsConstructor
public class DiscountController {

    private final DiscountService discountService;

    @GetMapping("/christmas")
    public ResponseEntity getChristimasDiscount(@RequestParam("value")BigDecimal value){
        var result = discountService.getStrategy(DiscountType.CHRISTMAS).applyDiscount(value);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/new-year")
    public ResponseEntity getNewYearDiscount(@RequestParam("value")BigDecimal value){
        var result = discountService.getStrategy(DiscountType.NEW_YEAR).applyDiscount(value);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/easter")
    public ResponseEntity getEasterDiscount(@RequestParam("value")BigDecimal value){
        var result = discountService.getStrategy(DiscountType.EASTER).applyDiscount(value);
        return ResponseEntity.ok(result);
    }
}
