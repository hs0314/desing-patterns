package 행동패턴.visitor;

public class Circle implements Shape{

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
