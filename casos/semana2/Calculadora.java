public class Calculadora {

    public int sumar(int a, int b) {
        return Math.addExact(a, b);
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.sumar(2, 3));
    }
}