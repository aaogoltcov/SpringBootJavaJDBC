package netology.springbootjavajdbc.orders.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import netology.springbootjavajdbc.orders.repository.OrderEntity;
import netology.springbootjavajdbc.orders.repository.OrderRepository;

@RestController
@RequestMapping("/")
public class OrderController {
    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("orders")
    public ResponseEntity<List<OrderEntity>> getAllCustomers() {
        List<OrderEntity> customers = orderRepository.findAll();

        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping("products/fetch-product")
    public ResponseEntity<List<String>> getCustomerProducts(@Valid String name) {
        System.out.println(name);
        List<String> products = orderRepository.findByCustomerName(name).stream().toList();
        System.out.println(products);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}