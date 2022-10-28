package hello.login.domain.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data   // @Data는 가장 기본적인, getter setter 메소드를 선언해줌.
public class Member {

    private Long id;

    @NotEmpty
    private String loginId; // 로그인 id

    @NotEmpty
    private String name;    // 사용자 이름

    @NotEmpty
    private String password;

}
