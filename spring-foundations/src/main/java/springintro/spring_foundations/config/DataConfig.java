package springintro.spring_foundations.config;

import springintro.spring_foundations.data.repository.CustomerRepository;
import springintro.spring_foundations.data.repository.InventoryItemRepository;
import springintro.spring_foundations.data.repository.SalesOrderRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfig {

    @Bean
    public InventoryItemRepository inventoryItemRepository(){
        return new InventoryItemRepository();
    }

    @Bean
    public CustomerRepository customerRepository(){
        return new CustomerRepository();
    }

    @Bean
    public SalesOrderRepository salesOrderRepository(){
        return new SalesOrderRepository();
    }
}
