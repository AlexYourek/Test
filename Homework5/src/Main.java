public class Main {
    public static void main(String[] args) {
        Car car1 = new Car.Builder()
                .marka("Toyota")
                .model("Corolla")
                .rocznik(2010)
                .cena(40000.0)
                .build();

        Car car2 = new Car.Builder()
                .marka("Peugeot")
                .model("308")
                .rocznik(2022)
                .cena(20000.0)
                .build();

        System.out.println("Car 1: " + car1.getmarka() + " " + car1.getModel() + " " + car1.getrocznik() + " " + car1.getcena());
        System.out.println("Car 2: " + car2.getmarka() + " " + car2.getModel() + " " + car2.getrocznik() + " " + car2.getcena());
    }
}
