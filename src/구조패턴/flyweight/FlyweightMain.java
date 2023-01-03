package 구조패턴.flyweight;

/**
 * 플라이웨이트 패턴
 *  - 자주 변하지 않는 속성을 재사용함으로써 객체를 가볍게 만들어서 메모리 사용을 줄이는 패턴(많은 인스턴스 사용을 하게되면 OOM의 위험이 있음)
 *  - 변하지 않는 속성을 Flyweight 객체에 모아두고 client는 해당 속성을 FlyweightFactory를 통해서 받아서 사용
 *  - Flyweight은 공유되는 객체기 때문에 immutable 해야함
 *
 * 장점
 *  - 애플리케이션에서 사용하는 메모리를 줄일 수 있음
 *
 * 단점
 *  - 코드구조가 복잡해짐
 *
 * 사용예시
 *  - Integer.valueOf()
 */
public class FlyweightMain {

    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();

        // fontFactory를 통해서 가져오는 font에 대해서는 캐싱을 통해서 메모리 사용을 덜함(성능개선)
        Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('h', "white", fontFactory.getFont("helvetica:10"));
        Character c3 = new Character('h', "white", fontFactory.getFont("nanum:12"));
    }
}
