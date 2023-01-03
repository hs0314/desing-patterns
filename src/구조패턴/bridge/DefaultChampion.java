package 구조패턴.bridge;

public class DefaultChampion implements Champion{
    private Skin skin; //xxx: Champion과 Skin을 분리함으로써 서로 구별된 계층구조를 가지도록 설계
    private String name;

    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void move() {
        System.out.printf("%s %s move.\n", skin.getSkinName(), this.name);
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s skillQ.\n", skin.getSkinName(), this.name);
    }

    @Override
    public void skillW() {
        System.out.printf("%s %s skillW.\n", skin.getSkinName(), this.name);
    }

    @Override
    public void skillE() {
        System.out.printf("%s %s skillE.\n", skin.getSkinName(), this.name);
    }

    @Override
    public void skillR() {
        System.out.printf("%s %s skillR.\n", skin.getSkinName(), this.name);
    }
}
