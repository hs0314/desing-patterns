package 행동패턴.state;

public class Published implements State{

    //xxx: concrete state에서 context를 가지고 있어야함
    private Course course;

    public Published(Course course) {
        this.course = course;
    }

    @Override
    public void addReview(String review, Student student) {
        this.course.getReviews().add(review);
    }

    @Override
    public void addStudent(Student student) {
        this.course.getStudents().add(student);
    }
}
