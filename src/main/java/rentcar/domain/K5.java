package rentcar.domain;

public class K5 extends Car {
    private int distance;


    public K5(int num) {
        this.distance = num;
    }


    @Override
    double getDistancePerLiter() {
        return 13;
    }

    @Override
    String getName() {
        return "K5";
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
