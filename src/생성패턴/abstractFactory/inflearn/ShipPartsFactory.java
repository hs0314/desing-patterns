package 생성패턴.abstractFactory.inflearn;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
