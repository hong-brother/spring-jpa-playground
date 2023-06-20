package io.purple.springjpa.domain.value;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class ValueMember {
    @Id
    @GeneratedValue
    private Long id;
    @Embedded
    private ValuePeriod period;

    @Builder
    public ValueMember(Long id, ValuePeriod period) {
        this.id = id;
        this.period = period;
    }
}
