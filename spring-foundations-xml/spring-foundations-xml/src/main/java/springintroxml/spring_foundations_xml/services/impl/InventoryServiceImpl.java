package springintroxml.spring_foundations_xml.services.impl;

import springintroxml.spring_foundations_xml.data.repository.InventoryItemRepository;
import springintroxml.spring_foundations_xml.domain.Product;
import springintroxml.spring_foundations_xml.services.InventoryService;

import java.util.Map;

public class InventoryServiceImpl implements InventoryService {
    private final InventoryItemRepository inventoryItemRepository;

    public InventoryServiceImpl(InventoryItemRepository inventoryItemRepository){
        this.inventoryItemRepository = inventoryItemRepository;
    }

    public Map<Product, Long> getTotalInventoryOnHand() {
        return null;
    }

    public long getQuantityOnHand(String itemId) {
        return 0;
    }

    public void adjustInventory(String itemId, long quantity) {

    }
}
