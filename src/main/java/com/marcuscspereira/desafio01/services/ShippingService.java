package com.marcuscspereira.desafio01.services;

import org.springframework.stereotype.Service;

import com.marcuscspereira.desafio01.entities.Order;

@Service
public class ShippingService {
  
  public double shipment(Order order) {
    final double ORDER_BASIC_VALUE = order.getBasic();
    if (ORDER_BASIC_VALUE > 0 && ORDER_BASIC_VALUE < 100) {
      return 20.00;
    } else if (ORDER_BASIC_VALUE >= 100 && ORDER_BASIC_VALUE < 200) {
      return 12.00;
    } else {
      return 0.00;
    }
  }
}
