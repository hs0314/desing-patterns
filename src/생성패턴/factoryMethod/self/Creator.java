package 생성패턴.factoryMethod.self;

// product factory
public interface Creator {

    //팩토리 메서드
    Product createProduct(boolean flag);

}
