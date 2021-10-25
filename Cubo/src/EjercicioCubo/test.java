package EjercicioCubo;

public class Test {
    
    public static void main(String[] args) {
        
        Cubo c1 = new Cubo(3, 2, 6);
        System.out.println(c1);
        
        System.out.println("El volumen del cubo es: " + c1.volumen());
    }
    
}
