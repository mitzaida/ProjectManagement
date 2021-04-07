package com.pattern.model;

import lombok.Data;

import java.util.List;

@Data
public class Bill {

    private PaymentType paymentType;
    private List<Item> details;
}
