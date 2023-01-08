package 행동패턴.chainOfResponsibility;

public class AuthRequestHandler extends RequestHandler{
    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request req){
        System.out.println("Auth check");
        super.handle(req);
    }
}
