package 행동패턴.chainOfResponsibility;

public abstract class RequestHandler {
    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request req){
        if(nextHandler != null){
            nextHandler.handle(req);
        }
    }
}
