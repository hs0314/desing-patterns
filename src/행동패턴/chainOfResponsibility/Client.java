package 행동패턴.chainOfResponsibility;

public class Client {
    RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork(){
        Request req = new Request("new request");
        requestHandler.handle(req);
    }
}
