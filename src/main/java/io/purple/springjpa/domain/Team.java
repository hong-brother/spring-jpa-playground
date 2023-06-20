package io.purple.springjpa.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
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
    @GeneratedValue
    @Column(name = "team_id", nullable = false)
    private Long teamId;
    @Column(name = "team_name", nullable = true, length = 100)
    private String teamName;

    @Builder
    public Team(String teamName) {
        this.teamName = teamName;
        this.createDtm = LocalDateTime.now();
        this.updateDtm = LocalDateTime.now();
    }
}
