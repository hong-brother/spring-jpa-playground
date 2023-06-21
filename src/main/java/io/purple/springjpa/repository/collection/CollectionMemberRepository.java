package io.purple.springjpa.repository.collection;

import io.purple.springjpa.domain.collection.CollectionMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionMemberRepository extends JpaRepository<CollectionMember, Long> {

}
