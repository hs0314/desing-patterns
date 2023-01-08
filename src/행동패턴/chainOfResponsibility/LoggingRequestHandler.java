package 행동패턴.chainOfResponsibility;

public class LoggingRequestHandler extends RequestHandler{
    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request req){
        System.out.println("logging");
        super.handle(req);
    }
}
