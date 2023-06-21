package io.purple.springjpa.domain.jpql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name = "jpql_product")
public class JpqlProduct {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int stockAmount;
}
