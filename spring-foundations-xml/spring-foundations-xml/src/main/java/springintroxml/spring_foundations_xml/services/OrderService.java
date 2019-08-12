package springintroxml.spring_foundations_xml.services;

import springintroxml.spring_foundations_xml.domain.Customer;
import springintroxml.spring_foundations_xml.domain.Order;

import java.util.Map;

public interface OrderService {
    Order createOrder(Customer customer, Map<String, Long> items);
    Order createOrder(String customerId, Map<String, Long> items);
    Order getOrder(String orderId);
}
