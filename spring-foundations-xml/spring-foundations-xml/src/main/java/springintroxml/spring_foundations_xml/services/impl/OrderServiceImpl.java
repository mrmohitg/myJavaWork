package springintroxml.spring_foundations_xml.services.impl;

import springintroxml.spring_foundations_xml.data.repository.CustomerRepository;
import springintroxml.spring_foundations_xml.data.repository.SalesOrderRepository;
import springintroxml.spring_foundations_xml.domain.Customer;
import springintroxml.spring_foundations_xml.domain.Order;
import springintroxml.spring_foundations_xml.services.InventoryService;
import springintroxml.spring_foundations_xml.services.OrderService;

import java.util.Map;

public class OrderServiceImpl implements OrderService {
    private final InventoryService inventoryService;
    private final CustomerRepository customerRepository;
    private final SalesOrderRepository salesOrderRepository;

    public OrderServiceImpl(InventoryService inventoryService, CustomerRepository customerRepository, SalesOrderRepository salesOrderRepository) {
        this.inventoryService = inventoryService;
        this.customerRepository = customerRepository;
        this.salesOrderRepository = salesOrderRepository;
    }

    public Order createOrder(Customer customer, Map<String, Long> items) {
        return null;
    }

    public Order createOrder(String customerId, Map<String, Long> items) {
        return null;
    }

    public Order getOrder(String orderId) {
        return null;
    }
}
