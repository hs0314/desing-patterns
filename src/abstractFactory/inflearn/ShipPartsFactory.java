package abstractFactory.inflearn;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
