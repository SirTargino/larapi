package com.laratelie.larapi.repositories;

import com.laratelie.larapi.models.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<CustomerOrder, UUID> {
    @Query("SELECT e FROM CustomerOrder e WHERE e.client = :client")
    CustomerOrder findByClient(@Param("client") String client);

}
