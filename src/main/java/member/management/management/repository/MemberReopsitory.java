package member.management.management.repository;

import member.management.management.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberReopsitory {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();





}
