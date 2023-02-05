package 행동패턴.memento;

/**
 * 메멘토 패턴
 *  - 객체 내부의 상태를 외부에 저장해놓고 이를 복원할 때 사용 (객체 내부의 상태를 외부에 공개하지는 않음)
 *    ex) 텍스트 에디터 설정
 *  - CareTaker(상태를 저장하는 외부객체), Originator(상태를 실제로 사용하는 객체), Memento(상태를 추상화한 객체)
 *  - CareTaker가 Originator의 내부상태를 Memento타입으로 저장하고 있는 구조
 *
 * 사용 예시
 *  - 자바 Serializable을 통한 직렬화/역직렬화
 */
public class MementoMain {

    // 여기서는 client를 careTaker라고 가정하고 구현
    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        GameSave save = game.save(); // memento객체 생성 (snapshot)

        // 상태가 클라이언트에서 변경되었어도 memento객체를 restore해서 가져올 수 있음
        game.setBlueTeamScore(12);
        game.setRedTeamScore(22);
        game.restore(save);

        System.out.println(game.getBlueTeamScore());
        System.out.println(game.getRedTeamScore());


    }
}
