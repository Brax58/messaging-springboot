package com.gustavoParreiras.messaging_springboot.repository;

import com.gustavoParreiras.messaging_springboot.domain.Order;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, String> {

    @NonNull
    Optional<Order> findById(@NonNull String id);
}
