package com.gustavoParreiras.messaging_springboot.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name = "order")
@Table(name = "order")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;

    @OneToOne(mappedBy = "oder",cascade = CascadeType.ALL)
    private Item items;

    private Double price;
    private LocalDateTime orderDate;

}
