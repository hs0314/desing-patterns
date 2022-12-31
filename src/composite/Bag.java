package composite;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component{

    private List<Component> components = new ArrayList<>();

    public void add(Component component){
        components.add(component);
    }

    public List<Component> getComponents(){
        return this.components;
    }

    @Override
    public int getPrice() { // xxx: 이렇게 함으로써 sum()에 대한 연산처리를 Bag객체가 하게됌
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
