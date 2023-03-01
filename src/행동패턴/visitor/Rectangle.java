package 행동패턴.visitor;

public class Rectangle implements Shape{

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
