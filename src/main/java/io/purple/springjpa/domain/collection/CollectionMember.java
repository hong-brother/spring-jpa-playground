package io.purple.springjpa.domain.collection;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class CollectionMember {
    @Id
    @GeneratedValue
    private Long id;

    @ElementCollection
    @CollectionTable(
            name = "FAVORITE_FOOD",
            joinColumns = @JoinColumn(name ="MEMBER_ID")
    )
    @Column(name = "FOOD_NAME")
    private Set<String> foods = new HashSet<>();

//    @ElementCollection
//    @CollectionTable
//    private List<CollectionAddress> addressList = new ArrayList<>();
}
