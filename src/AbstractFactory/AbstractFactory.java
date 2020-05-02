package AbstractFactory;

import AbstractFactory.Factory.ComputerFactory;
import AbstractFactory.Factory.ComputerFactoryService;

public class AbstractFactory {
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
