package springintro.spring_foundations.services.impl;

import springintro.spring_foundations.data.repository.CustomerRepository;
import springintro.spring_foundations.data.repository.SalesOrderRepository;
import springintro.spring_foundations.domain.Customer;
import springintro.spring_foundations.domain.Order;
import springintro.spring_foundations.services.InventoryService;
import springintro.spring_foundations.services.OrderService;

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
