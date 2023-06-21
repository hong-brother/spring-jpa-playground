package io.purple.springjpa.repository.collection;

import io.purple.springjpa.domain.jpql.JpqlTeam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionTeamRepository extends JpaRepository<JpqlTeam, Long> {

}
