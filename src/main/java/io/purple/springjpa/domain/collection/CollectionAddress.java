package io.purple.springjpa.domain.collection;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class CollectionAddress {
    @Id
    private Long id;
    private String zipCode;
    private String address1;
    private String address2;

}
