package 생성패턴.abstractFactory.self;

import 생성패턴.abstractFactory.self.Factory.ComputerFactory;
import 생성패턴.abstractFactory.self.Factory.ComputerFactoryService;

public class AbstractFactoryMain {
    public static void main(String[] args){

        ComputerFactoryService computerFactoryService = new ComputerFactoryService();
        String SAMSUNG = "Samsung";
        String LG = "LG";

        ComputerFactory samsungComputerFactory = computerFactoryService.getComputerFactory(SAMSUNG);
        ComputerFactory lgComputerFactory = computerFactoryService.getComputerFactory(LG);

        //SAMSUNG
        System.out.println(samsungComputerFactory.createMouse().getMouseInfo());
        System.out.println(samsungComputerFactory.createKeyboard().getKeyboardInfo());

        //LG
        System.out.println(lgComputerFactory.createMouse().getMouseInfo());
        System.out.println(lgComputerFactory.createKeyboard().getKeyboardInfo());
    }
}
