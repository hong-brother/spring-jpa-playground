package io.purple.springjpa.repository.value;

import io.purple.springjpa.domain.value.ValueMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValueTypeRepository extends JpaRepository<ValueMember, Long> {

}
