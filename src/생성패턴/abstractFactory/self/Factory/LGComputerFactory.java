package 생성패턴.abstractFactory.self.Factory;

import 생성패턴.abstractFactory.self.Product.Keyboard;
import 생성패턴.abstractFactory.self.Product.LGKeyboard;
import 생성패턴.abstractFactory.self.Product.LGMouse;
import 생성패턴.abstractFactory.self.Product.Mouse;

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
