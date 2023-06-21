package io.purple.springjpa.domain.jpql;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity()
@Table(name = "jpql_member")
public class JpqlMember {

    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private int age;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private JpqlTeam team;

    @Builder
    public JpqlMember(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
