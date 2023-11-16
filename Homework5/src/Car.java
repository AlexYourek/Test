public class Car {
    private String marka;
    private String model;
    private int rocznik;
    private double cena;

    private Car(Builder builder) {
        this.marka = builder.marka;
        this.model = builder.model;
        this.rocznik = builder.rocznik;
        this.cena = builder.cena;
    }

    public String getmarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getrocznik() {
        return rocznik;
    }

    public double getcena() {
        return cena;
    }

    public static class Builder {
        private String marka;
        private String model;
        private int rocznik;
        private double cena;

        public Builder() {}

        public Builder marka(String marka) {
            this.marka = marka;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder rocznik(int rocznik) {
            this.rocznik = rocznik;
            return this;
        }

        public Builder cena(double cena) {
            this.cena = cena;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
