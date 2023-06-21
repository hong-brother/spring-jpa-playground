package io.purple.springjpa.domain.jpql;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class JpqlAddress {
    private String city;
    private String street;
    private String zipCode;
}
