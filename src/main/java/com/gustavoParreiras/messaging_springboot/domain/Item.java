package com.gustavoParreiras.messaging_springboot.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "item")
@Table(name = "item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;
    private String name;
    private int amount;

    @ManyToOne
    @JoinColumn(name = "oder_id")
    private Order order;
}
