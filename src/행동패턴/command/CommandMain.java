package 행동패턴.command;


/**
 * 커맨드 패턴
 *  - 요청을 캡슐화해서 호출하는 쪽(invoker), 처리하는 쪽(receiver)을 분리 시키는 패턴
 *  - command 인터페이스를 두고 있기 때문에 요청처리 방법(concreteCommand)이 변경되어도 호출자의 코드가 변경되지 않음
 *
 * 장점
 *  - 기존 코드 변경없이 새로운 command 생성 가능 (OCP)
 *  - invoker의 코드가 변경되지 않아도 됌
 *  - 각 command 구현객체가 하나의 책임을 가지고 있도록 할 수 있음 (SRP)
 *
 * 단점
 *  - 관리해야하는 command 객체 늘어남
 *
 * 사용 예시
 *  - 자바 ExecutorService.submit(runnable(command) 전달)
 *  - 스프링 SimpleJdbcInsert -> insert쿼리를 실행하기 위한 정보를 가지고 있는 command 오브젝트
 */
public class CommandMain {

    // Command의 구현 클래스의 코드는 변경되어도 invoker(호출하는쪽)의 코드 변경은 없음
    // Command를 재사용할 수 있음
    public static void main(String[] args) {
        Button lightButton = new Button(new LightOnCommand(new Light()));
        lightButton.press();

        Button gameButton = new Button(new GameStartCommand(new Game()));
        gameButton.press();
        gameButton = new Button(new GameEndCommand(new Game()));
        gameButton.press();
    }
}
