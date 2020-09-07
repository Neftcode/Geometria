public class Circulo {
    double radio;
    Punto centro;

    public Circulo(double radio, Punto centro) {
        this.radio = radio;
        this.centro = centro;
    }

    public double hallarArea() {
        return Math.pow(Math.PI*this.radio, 2);
    }

    public double hallarPerimetro() {
        return 0;
    }

}
