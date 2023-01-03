package 생성패턴.abstractFactory.self.Factory;

public class ComputerFactoryService {

    //가장 앞단에서 생성하고자 하는 제품군에 대한 분기처리를 하고 알맞은 팩토리 객체를 통해서 제품군을 생성한다.
    public ComputerFactory getComputerFactory(String type){
        if("LG".equals(type)){
            return new LGComputerFactory();
        }else if("Samsung".equals(type)){
            return new SamsungComputerFactory();
        }else{
            return null;
        }
    }
}
