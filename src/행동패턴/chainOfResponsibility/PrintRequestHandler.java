package 행동패턴.chainOfResponsibility;

public class PrintRequestHandler extends RequestHandler{
    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request req){
        System.out.println(req.getBody());
        super.handle(req);
    }
}
