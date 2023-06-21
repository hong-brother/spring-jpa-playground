package io.purple.springjpa.domain.collection;

import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public class CollectionAddress {
    private String zipCode;
    private String address1;
    private String address2;

    @Builder
    public CollectionAddress(String zipCode, String address1, String address2) {
        this.zipCode = zipCode;
        this.address1 = address1;
        this.address2 = address2;
    }
}
