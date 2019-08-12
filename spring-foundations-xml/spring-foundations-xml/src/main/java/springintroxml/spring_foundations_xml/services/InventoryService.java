package springintroxml.spring_foundations_xml.services;

import springintroxml.spring_foundations_xml.domain.Product;

import java.util.Map;

public interface InventoryService {
    Map<Product, Long> getTotalInventoryOnHand();
    long getQuantityOnHand(String itemId);
    void adjustInventory(String itemId, long quantity);
}
