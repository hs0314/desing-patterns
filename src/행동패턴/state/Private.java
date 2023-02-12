package 행동패턴.state;

public class Private implements State{

    //xxx: concrete state에서 context를 가지고 있어야함
    private Course course;

    public Private(Course course) {
        this.course = course;
    }

    @Override
    public void addReview(String review, Student student) {
        // 수강생 존재여부 확인
        if(this.course.getStudents().contains(student)){
            this.course.getReviews().add(review);
        }else{
            throw new UnsupportedOperationException("Private상태에서는 등록된 학생만 리뷰를 남길 수 있습니다");
        }
    }

    @Override
    public void addStudent(Student student) {

        if(student.isAvailable(this.course)){
            this.course.getStudents().add(student);
        }else{
            throw new UnsupportedOperationException("코스 수강 불가");
        }
    }
}
