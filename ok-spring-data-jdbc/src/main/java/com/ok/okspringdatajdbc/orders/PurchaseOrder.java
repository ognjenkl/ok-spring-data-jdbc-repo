package com.ok.okspringdatajdbc.orders;

import org.springframework.data.annotation.Id;

public class PurchaseOrder {

    @Id
    Long id;
    String shippingAddress;
}
