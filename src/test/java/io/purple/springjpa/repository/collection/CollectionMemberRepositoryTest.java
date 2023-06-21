package io.purple.springjpa.repository.collection;

import io.purple.springjpa.domain.collection.CollectionAddress;
import io.purple.springjpa.domain.collection.CollectionMember;
import jakarta.annotation.security.RunAs;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;
import static org.junit.jupiter.api.Assertions.assertAll;

@ExtendWith(SpringExtension.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
class CollectionMemberRepositoryTest {
    @Autowired
    private CollectionMemberRepository collectionMemberRepository;

    @Test
    @DisplayName("Test Collection")
    void collectionTest() {
        CollectionAddress collectionAddress = CollectionAddress.builder()
                .address1("seoul")
                .address2("gu")
                .zipCode("1234")
                .build();
        CollectionMember cm = CollectionMember.builder()
                .id(1L)
                .build();
        cm.setAddressList(collectionAddress);

        collectionMemberRepository.save(cm);
        System.out.println("----------------------------------------");
        collectionMemberRepository.flush();
        System.out.println("----------------------------------------");
        collectionMemberRepository.findById(cm.getId());

        assertThat("").is(null);


    }

}