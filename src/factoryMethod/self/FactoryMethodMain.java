package factoryMethod.self;

public class FactoryMethodMain {

    public static void main(String []args){
        Creator creator = new ConcreteCreator();

        Product p1 = creator.createProduct(true);
        Product p2 = creator.createProduct(false);

        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}
