package composite;

/**
 *  컴포짓 패턴
 *   - client가 부분/전체를 동일한 컴포넌트로 인식하고 처리할 수 있게 하는 패턴(트리구조가 선행되어야함)
 *
 *  장점
 *   - 클라이언트에서는 추상 Component를 보고 있으므로 클라이언트 코드 변경 없이 새로운 element type추가 가능 (OCP)
 *   - 복잡한 트리 구조를 편하게 사용할 수 있음 (다형성, 재귀 활용 가능)
 *
 *  단점
 *   - 공통된 인터페이스를 정의해야하기 때문에 지나치게 일반화를 해야하는 경우 발생 (이런 경우 특정 디자인 패턴 의존적인 구조를 가져가고 있지 않은지 체크 필요)
 */
public class CompositeMain {

    public static void main(String[] args) {
        Item blade = new Item("item1", 450);
        Item potion = new Item("potion1", 50);

        Bag bag = new Bag();
        bag.add(blade);
        bag.add(potion);

        CompositeMain client = new CompositeMain();
        client.printPrice(blade);
        client.printPrice(bag);

    }

    private void printPrice(Component component){ // xxx: client에서는 공통 컴포넌트 객체로만 보면 됌
        System.out.println(component.getPrice());
    }
}
