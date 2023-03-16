package member.management.management.service;

import member.management.management.domain.Member;
import member.management.management.repository.MemberReopsitory;

import java.util.List;
import java.util.Optional;

public class MemberService {
    private final MemberReopsitory memberReopsitory;

    public MemberService(MemberReopsitory memberReopsitory) {
        this.memberReopsitory = memberReopsitory;
    }

//    회원가입
    public Long join(Member member) {
        validateDuplicateMember(member);
        memberReopsitory.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberReopsitory.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

//    전체 회원 조회
    public List<Member> findMembers() {
        return memberReopsitory.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberReopsitory.findById(memberId);
    }
}
