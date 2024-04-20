package netology.springbootjavajdbc.orders.repository;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "orders")
@Getter
@Setter
@Entity
public class OrderEntity {
    @Id
    private Long id;
    private Date date;
    private String productName;
    private Integer amount;
    private Long customerId;
}
