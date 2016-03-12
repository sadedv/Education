package patternsdemo.factorymethod;

// фабрика по созданию автомобилей
public class CarSelector {
    
    // фабричный метод, который создает нужный автомобиль
    public Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Geep();
                break;
            case GAZON:
                car = new NewGeep();
                break;
        }

        return car;
    }
}
