package netology.springbootjavajdbc.orders.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer>, JpaSpecificationExecutor<OrderEntity> {

    @Query("""
            select o.productName
            from CustomerEntity c
            left join OrderEntity o on o.customerId = c.id
            where c.name = :name
            """)
    Collection<String> findByCustomerName(String name);
}
