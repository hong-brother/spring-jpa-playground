package io.purple.springjpa.repository.value;

import io.purple.springjpa.domain.value.ValueMember;
import io.purple.springjpa.domain.value.ValuePeriod;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
class ValueTypeRepositoryTest {

    @Autowired
    private ValueTypeRepository ValueTypeRepository;
    @Test
    @DisplayName("TEST embedded type")
    void embeddedTest() {
        ValuePeriod valuePeriod = ValuePeriod.builder()
                .endDate(LocalDateTime.now())
                .startDate(LocalDateTime.now())
                .build();
        ValueMember member = ValueMember.builder()
                .id(1L)
                .period(valuePeriod)
                .build();

        ValueTypeRepository.save(member);


        Optional<ValueMember> findValue = ValueTypeRepository.findById(member.getId());
        assertEquals(findValue.get().getId(), member.getId());
    }
}