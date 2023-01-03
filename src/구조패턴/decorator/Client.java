package 구조패턴.decorator;

public class Client {
    private CommentService commentService;

    public Client(CommentService commentService){
        this.commentService = commentService;
    }

    public void writeComment(String comment){
        commentService.addComment(comment);
    }
}
