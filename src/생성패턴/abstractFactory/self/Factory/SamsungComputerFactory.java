package 생성패턴.abstractFactory.self.Factory;

import 생성패턴.abstractFactory.self.Product.Keyboard;
import 생성패턴.abstractFactory.self.Product.Mouse;
import 생성패턴.abstractFactory.self.Product.SamsungKeyboard;
import 생성패턴.abstractFactory.self.Product.SamsungMouse;

public class SamsungComputerFactory implements ComputerFactory {
    @Override
    public Keyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new SamsungMouse();
    }
}
