package com.pattern.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Item {
    private String code;
    private String name;
    private BigDecimal price;
}
