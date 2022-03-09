package abstractFactory.inflearn;

import factoryMethod.inflearn.WhiteShipFactory;

public class WhiteshipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory){
        this.shipPartsFactory = shipPartsFactory;
    }

    //
    public Ship createShip(){
        Ship ship = new Ship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
