package netology.springbootjavajdbc.customers.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "customers")
@Getter
@Setter
@Entity
public class CustomerEntity {
    @Id
    private Long id;
    private String name;
    private String surname;
    private Integer age;
    private String phoneNumber;
}
