package io.purple.springjpa.domain.collection;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "collection_member")
@Getter
@NoArgsConstructor
public class CollectionMember {
    @Id
    @GeneratedValue
    private Long id;

    @ElementCollection
    @CollectionTable(
            name = "FAVORITE_FOOD",
            joinColumns = @JoinColumn(name ="MEMBER_ID")
    )
    @Column(name = "tags")
    private Set<String> tags = new HashSet<>();

    @ElementCollection
    @CollectionTable(
            name = "address",
            joinColumns = @JoinColumn(name = "id", referencedColumnName = "id")
    )
    private List<CollectionAddress> addressList = new ArrayList<>();

    public void setAddressList(CollectionAddress addressList) {
        this.addressList.add(addressList);
    }

    @Builder
    public CollectionMember(Long id) {
        this.id = id;
    }
}
