package 행동패턴.state;

/**
 * 상태 패턴
 *  - 상태에 따라서 행동이 달라지는 객체에 대한 처리
 *  - 상태에 특화된 행동을 분리함으로써, 새로운 행동을 추가하더라도 다른 상태에 영향을 주지 않음
 *  - state 인터페이스, 구체 state 클래스, 상태를 변경하는 context로 구성
 *
 *  장점
 *   - 상태에 따른 동작을 개별 클래스로 관리 할 수 있음
 *   - context클래스의 코드 복잡도를 줄일 수 있음
 *   - 상태 추가, 특정 상태 변경이 타 상태에 영향을 주지 않음 (의존 타입이 인터페이스이기 때문)
 *
 */
public class StateMain {
    public static void main(String[] args) {
        Course course = new Course();
        Student student1 = new Student("heesu");
        Student student2 = new Student("student2");
        student2.addPrivate(course);

        course.addStudent(student1);

        course.changeState(new Private(course));

        course.addReview("hello", student1);

        course.addStudent(student2);

        System.out.println(course.getReviews());
        System.out.println(course.getStudents());
        System.out.println(course.getState());
    }
}
