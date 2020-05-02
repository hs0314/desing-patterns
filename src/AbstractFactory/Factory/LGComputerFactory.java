package AbstractFactory.Factory;

import AbstractFactory.Product.Keyboard;
import AbstractFactory.Product.LGKeyboard;
import AbstractFactory.Product.LGMouse;
import AbstractFactory.Product.Mouse;

public class LGComputerFactory implements ComputerFactory {
    @Override
    public Keyboard createKeyboard() {
        return new LGKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new LGMouse();
    }
}
