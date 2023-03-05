package domain;

public class Avante extends Car {
    private int distance;


    public Avante(int num) {
        this.distance = num;
    }


    @Override
    double getDistancePerLiter() {
        return 15;
    }

    @Override
    String getName() {
        return "Avante";
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
