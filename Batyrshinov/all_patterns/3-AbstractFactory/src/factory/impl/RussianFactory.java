package factory.impl;

import factory.interfaces.TransportFactory;
import transport.interfaces.Aircraft;
import transport.interfaces.Car;
import transport.impl.car.Niva;
import transport.impl.aircraft.TU134;

// российские транспортные средства
public class RussianFactory implements TransportFactory{

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }

}
