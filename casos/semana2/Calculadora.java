public class Calculadora {

    public int sumar(int a, int b) {
        return (a + b) * 2;
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.sumar(2, 3));
    }
}
