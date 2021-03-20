package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);                 // 저장소에 회원 저장

    Optional<Member> findById(Long id);         // Optional 통해 NULL 처리

    Optional<Member> findByName(String name);

    List<Member> findAll();                     // 저장된 모든 회원의 리스트 반환
}
