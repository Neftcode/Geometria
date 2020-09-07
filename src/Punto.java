//

public class Punto {
    double x;
    double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double hallarDistancia(Punto punto) {
        return Math.sqrt(Math.pow(this.x-punto.x, 2) + Math.pow(this.y-punto.y, 2));
    }


}
