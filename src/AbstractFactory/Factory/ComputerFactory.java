package AbstractFactory.Factory;

import AbstractFactory.Product.Keyboard;
import AbstractFactory.Product.Mouse;

public interface ComputerFactory {
    // 제품군에 대한 생성 인터페이스 메서드
    Keyboard createKeyboard();

    Mouse createMouse();
}
