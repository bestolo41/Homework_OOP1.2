public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand == "") {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model == "") {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume= engineVolume;
        }

        if (color == null || color == "") {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        this.color = color;

        if (country == null || country == "") {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }


    @Override

    public String toString() {
        return brand + " " + model + ", " + 2015 + " год выпуска, страна сборки: " + country + ", цвет: " + color + ", объем двигателя — " + engineVolume + " л.";
    }

}
