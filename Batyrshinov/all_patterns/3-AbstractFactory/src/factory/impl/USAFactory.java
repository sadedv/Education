package factory.impl;

import factory.interfaces.TransportFactory;
import transport.interfaces.Aircraft;
import transport.impl.aircraft.Boeing747;
import transport.interfaces.Car;
import transport.impl.car.Porsche;

// американские транспортные средства
public class USAFactory implements TransportFactory{

    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }

}
