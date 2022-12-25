package adapter;

import adapter.client.LoginHandler;
import adapter.client.UserDetailsService;

/**
 * 어댑터 패턴
 *  - 기존 코드를 클라이언트가 사용하는 인터페이스의 구현체로 바꿔주는 패턴
 *  - 만약 타겟인터페이스, adaptee를 모두 수정할 수 없는 상황이라면 신규 어댑터 클래스(AccountUserDetails, AccountUserDetailsService)를 통해서 구현
 *  - 만약 타겟인터페이스, adaptee 수정이 가능하다면 사용처에서 타겟인터페이스를 구현하면 됌
 *
 *  장점
 *   - 기존 코드 변경 없이 원하는 인터페이스 구현체를 만들어 재사용 가능 (OCP 원칙에 부합)
 *   - 기존 코드와 타겟인터페이스 구현체로 변환하는 부분을 분리할 수 있음
 *
 *  단점
 *   - 새 클래스가 생겨서 복잡도가 증가할 수 있음. 경우에 따라서 기존 코드에서 타겟인터페이스를 구현하도록 하는것 고려
 *
 *  예시
 *   - Arrays.asList(배열) => 리스트
 *   - Collections.enumeration(리스트) => Enumeration
 *   - 스프링 HandlerAdapter
 */
public class AdapterMain {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("heesu", "heesu");

        System.out.println(login);
    }
}
