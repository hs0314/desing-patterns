package factoryMethod.inflearn;

public class FactoryMethodMain {
    public static void main(String[] args) {

        WhiteShipFactory whiteShipFactory = new WhiteShipFactory();
        BlackShipFactory blackShipFactory = new BlackShipFactory();

        Ship whiteShip = whiteShipFactory.orderShip("white ship", "1@1.1");
        Ship blackShip = blackShipFactory.orderShip("black ship", "1@1.1");


        FactoryMethodMain main = new FactoryMethodMain();
        main.print(new WhiteShipFactory(), "testWhiteShip", "2@2.2");
    }

    // 위와 같은 방식으로 개선이 되어도 결국 처리시에 어떠한 factory를 받아와서 처리할지는 알고 있어야함
    // 생성 로직을 인터페이스로 공통화 해버릴 수 있음 (일종의 DI) -> 클라이언트 코드 변경 최소화
    private void print(ShipFactory factory, String name, String email){
        System.out.println(factory.orderShip(name, email));
    }
}
