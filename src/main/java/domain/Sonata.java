package domain;

public class Sonata extends Car {
    private int distance;


    public Sonata(int num) {
        this.distance = num;
    }


    @Override
    double getDistancePerLiter() {
        return 10;
    }

    @Override
    String getName() {
        return "Sonata";
    }

    @Override
    double getTripDistance() {
        return distance;
    }

    @Override
    double getChargeQuantity() {
        return super.getChargeQuantity();
    }
}
