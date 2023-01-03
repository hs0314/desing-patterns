package 생성패턴.factoryMethod.self;

public class ConcreteCreator implements Creator {

    @Override
    public Product createProduct(boolean flag) {
        //여기서 필요에 따라서 알맞은 Product 클래스 반환
        if(flag){
            return new ConcreteProduct();
        }else{
            return new ConcreteProduct2();
        }
    }
}
