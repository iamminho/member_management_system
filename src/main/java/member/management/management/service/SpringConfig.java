package member.management.management.service;

import member.management.management.repository.JdbcMemberRepository;
import member.management.management.repository.MemberReopsitory;
import member.management.management.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberReopsitory());
    }
    @Bean
    public MemberReopsitory memberReopsitory() {
//        return new MemoryMemberRepository();
        return new JdbcMemberRepository(dataSource);
    }
}
