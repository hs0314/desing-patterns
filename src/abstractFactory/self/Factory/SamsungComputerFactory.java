package abstractFactory.self.Factory;

import abstractFactory.self.Product.Keyboard;
import abstractFactory.self.Product.Mouse;
import abstractFactory.self.Product.SamsungKeyboard;
import abstractFactory.self.Product.SamsungMouse;

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
