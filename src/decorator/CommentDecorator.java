package decorator;

public class CommentDecorator implements CommentService {

    // xxx: decorator를 가지고 있고 이를 통해 런타임시에 지정된 concreteDecorator의 addComment() 메서드를 호출 할 수 있게 된다
    CommentService commentService;

    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}
