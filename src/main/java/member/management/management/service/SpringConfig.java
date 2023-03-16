package member.management.management.service;

import member.management.management.repository.MemberReopsitory;
import member.management.management.repository.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberReopsitory());
    }
    @Bean
    public MemberReopsitory memberReopsitory() {
        return new MemoryMemberRepository();
    }
}
