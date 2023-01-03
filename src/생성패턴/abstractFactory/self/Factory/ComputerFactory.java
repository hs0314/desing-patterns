package 생성패턴.abstractFactory.self.Factory;

import 생성패턴.abstractFactory.self.Product.Keyboard;
import 생성패턴.abstractFactory.self.Product.Mouse;

public interface ComputerFactory {
    // 제품군에 대한 생성 인터페이스 메서드
    Keyboard createKeyboard();

    Mouse createMouse();
}
