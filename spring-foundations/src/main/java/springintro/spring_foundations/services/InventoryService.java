package springintro.spring_foundations.services;

import springintro.spring_foundations.domain.Product;

import java.util.Map;

public interface InventoryService {
    Map<Product, Long> getTotalInventoryOnHand();
    long getQuantityOnHand(String itemId);
    void adjustInventory(String itemId, long quantity);
}
