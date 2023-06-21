package io.purple.springjpa.repository.collection;

import io.purple.springjpa.domain.Team;
import io.purple.springjpa.domain.jpql.JpqlMember;
import io.purple.springjpa.domain.jpql.JpqlTeam;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CollectionTeamRepositoryTest {
    @Autowired
    private CollectionTeamRepository collectionTeamRepository;

    @Test
    void test() {
        System.out.println("collectionTeamRepository = " + collectionTeamRepository.toString());
        JpqlMember member = JpqlMember.builder()
                .username("hsnam")
                .age(20)
                .build();
        List<JpqlMember> jpqlMemberList = new ArrayList<>();
        jpqlMemberList.add(member);
        System.out.println("member = " + member);
        JpqlTeam team = JpqlTeam.builder()
                .name("test~")
                .memberList(jpqlMemberList)
                .build();
        collectionTeamRepository.save(team);

    }

}