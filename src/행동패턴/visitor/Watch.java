package 행동패턴.visitor;

public class Watch implements Device{
    @Override
    public void print(Circle circle) {
        System.out.println("print circle to watch");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print rectangle to watch");
    }
}
