public class Plano {
    public static void main(String[] args) {
        System.out.println("Plano cartesiano");
        Punto punto1 = new Punto(-1, 0);
        Punto punto2 = new Punto(1, 0);
        System.out.println("Distancia: "+punto1.hallarDistancia(punto2));
    }
}
