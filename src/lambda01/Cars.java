package lambda01;

public class Cars {
    private String make;
    private String model;
    private int year;
    private String license;

    public Cars(String make, String model, int year, String license) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.license = license;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getLicense() {
        return license;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", license='" + license + '\'' +
                '}';
    }

}
