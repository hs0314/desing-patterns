package abstractFactory.self.Factory;

import abstractFactory.self.Product.Keyboard;
import abstractFactory.self.Product.LGKeyboard;
import abstractFactory.self.Product.LGMouse;
import abstractFactory.self.Product.Mouse;

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
