package devices;
    public class Wash {

        // pola klasy Myjnia
        private String nazwa;
        private String adres;

        public void Myjnia(String nazwa, String adres) {
            this.nazwa = nazwa;
            this.adres = adres;
        }

        public void Car() {

        }

        public void umyjSamochod(Car car) {
            System.out.println("Trwa mycie samochodu " + car.getMake() + " " + car.getModel());
        }
    }
