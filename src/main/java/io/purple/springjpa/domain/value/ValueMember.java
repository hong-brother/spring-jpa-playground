package io.purple.springjpa.domain.value;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity()
@Table(name = "value_member")
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
