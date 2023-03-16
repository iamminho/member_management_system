package member.management.management.service;

import member.management.management.repository.MemberReopsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private final MemberReopsitory memberReopsitory;

    @Autowired
    public MemberService(MemberReopsitory memberReopsitory) {
        this.memberReopsitory = memberReopsitory;
    }
}
