package springintro.spring_foundations.service;

import springintro.spring_foundations.domain.Customer;
import springintro.spring_foundations.domain.Order;

import java.util.Map;

public interface OrderService {
    Order createOrder(Customer customer, Map<String, Long> items);
    Order createOrder(String customerId, Map<String, Long> items);
    Order getOrder(String orderId);
}
