package io.purple.springjpa.domain.jpql;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity()
@Table(name = "jpql_order")
public class JpqlOrder {
    @Id
    @GeneratedValue
    private Long id;

    private int orderAmount;
    @Embedded
    private JpqlAddress address;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private JpqlProduct product;


}
