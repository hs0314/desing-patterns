package 행동패턴.state;

public class Draft implements State{

    //xxx: concrete state에서 context를 가지고 있어야함
    private Course course;

    public Draft(Course course) {
        this.course = course;
    }

    @Override
    public void addReview(String review, Student student) {
        throw new UnsupportedOperationException("Draft상태에서는 리뷰를 남길 수 없습니다");
    }

    @Override
    public void addStudent(Student student) {
        this.course.getStudents().add(student); // Cousere와 순환참조가 나지 않도록 getter를 통해서 들고온 list에 add
        if(course.getStudents().size() > 1){
            // xxx: 요건: draft상태에서 학생 수가 2명 이상되면 Private 상태로 변경
            this.course.changeState(new Private(this.course));
        }
    }
}