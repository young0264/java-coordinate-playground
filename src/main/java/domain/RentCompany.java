package domain;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");

    private List<Car> company;
    StringBuilder report = new StringBuilder();

    public RentCompany() {
        company = new ArrayList<>();
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        company.add(car);
    }

    public String generateReport() {
        for (Car car : company) {

            String result = String.format("%s : %s리터", car.getName(), (int)car.getChargeQuantity()) + NEWLINE;
            System.out.println(result);
            report.append(result);
        }
        return report.toString();
    }
}
