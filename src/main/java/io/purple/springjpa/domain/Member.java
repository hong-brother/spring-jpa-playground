package io.purple.springjpa.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(
        name = "member"
)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity {
    @Id
    @SequenceGenerator(
            name = "member_seq_generator",
            sequenceName = "member_seq"
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "member_id", nullable = false)
    private Long memberId;
    @Column(name = "etc", nullable = true, length = 1000)
    private String etc;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
}
