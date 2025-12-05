package com.example.customerorder.repository;

import com.example.customerorder.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByCustomerId(Long customerId);

    // TODO: Add a JPQL query to find orders with a totalAmount greater than a specified minimum amount
    // The method signature should be: List<Order> findOrdersByTotalAmountGreaterThan(double minAmount);
    // Use the @Query annotation to define the JPQL query.
    
    @Query("from Order o where o.totalAmount>:minAmount")
    List<Order> findOrdersByTotalAmountGreaterThan(@Param("minAmount") double minAmount);

}
