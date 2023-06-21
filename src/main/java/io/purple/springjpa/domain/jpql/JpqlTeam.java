package io.purple.springjpa.domain.jpql;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity()
@Table(name = "jpql_team")
@Getter
@Setter
public class JpqlTeam {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "team")
    private List<JpqlMember> memberList = new ArrayList<>();

    @Builder
    public JpqlTeam(String name, List<JpqlMember> memberList) {
        this.name = name;
        this.memberList = memberList;
    }
}
