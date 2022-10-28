package hello.login.domain.login;

import hello.login.domain.member.Member;
import hello.login.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    /**
     * @return null 이면 실패
     */

    public Member login(String loginId, String password){
        // 람다를 사용하지 않고 쓴 것
//        Optional<Member> findMemberOptional = memberRepository.findByLoginId(loginId);
//        // optional 에서 get을 하면 member에 있는 것이 꺼내져 나온다. 없다면 예외가 나온다.
//        Member member = findMemberOptional.get();
//        if (member.getPassword().equals(password)){
//            return member;
//        }else {
//            return null;
//        }

//        Optional<Member> byLoginId = memberRepository.findByLoginId(loginId);
//        byLoginId.filter(member1 -> member.getPassword().equals(password))
//                .orElse(null);
//      32줄과 33줄을 합친 것이 아래 형태
        return memberRepository.findByLoginId(loginId)
                .filter(member -> member.getPassword().equals(password))
                .orElse(null);
    }
}
