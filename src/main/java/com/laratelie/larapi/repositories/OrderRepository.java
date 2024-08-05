package com.laratelie.larapi.repositories;

import com.laratelie.larapi.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
    @Query("SELECT e FROM Order e WHERE e.client = :client")
    Order findByClient(@Param("client") String client);

    boolean existsByClient(String client);
}
