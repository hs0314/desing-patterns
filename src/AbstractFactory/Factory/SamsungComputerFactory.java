package AbstractFactory.Factory;

import AbstractFactory.Product.Keyboard;
import AbstractFactory.Product.Mouse;
import AbstractFactory.Product.SamsungKeyboard;
import AbstractFactory.Product.SamsungMouse;

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
