package io.purple.springjpa.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter
@Entity
@Table(
        name = "team"
)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Team extends BaseEntity {

    @Id
    @SequenceGenerator(
            name = "team_seq_generator",
            sequenceName = "team_seq"
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "team_id", nullable = false)
    private Long teamId;
    @Column(name = "team_name", nullable = true, length = 100)
    private String teamName;
    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();
}
