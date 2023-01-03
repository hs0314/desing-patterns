package 생성패턴.factoryMethod.inflearn;

/*
참고**
private 메서드(9이상), default 메서드(8이상) 등은 자바 버전에 따라서 사용여부가 다르다

-> 필요에 따라서 concrete객체와 팩토리 사이에 추상클래스를 둘 수도 있음
 */
public interface ShipFactory {

    default Ship orderShip(String name, String email){
        validate(name, email);
        prepareFor(name);

        Ship ship = createShip();

        sendEmailTo(email, ship);

        return ship;
    }

    Ship createShip();

    private void validate(String name, String email){
        if (name== null || name.isBlank()){
            throw new IllegalArgumentException("name null");
        }

        if (email== null || email.isBlank()){
            throw new IllegalArgumentException("email null");
        }
    }

    private void prepareFor(String name){
        System.out.println(name + " preparing...");
    }

    private void sendEmailTo(String email, Ship ship){
        System.out.println(ship.getName() + " Done...");
    }
}
