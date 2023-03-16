package member.management.management.service;

import member.management.management.repository.MemberReopsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class MemberService {
    private final MemberReopsitory memberReopsitory;

    public MemberService(MemberReopsitory memberReopsitory) {
        this.memberReopsitory = memberReopsitory;
    }
} 
