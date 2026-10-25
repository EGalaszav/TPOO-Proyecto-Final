public class Saludo {

    public String saludar(String nombre) {
        return "Hola, " + nombre;
    }

    public static void main(String[] args) {
        Saludo s = new Saludo();
        System.out.println(s.saludar("TPOO"));
    }
}
