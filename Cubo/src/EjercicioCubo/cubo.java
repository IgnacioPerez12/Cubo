package EjercicioCubo;

public class Cubo {
    
    int ancho, alto, profundo;

    //CONTRUCTOR VACIO
    public Cubo() {
    
    }
    
    //CONSTRUCTOR CON TODO

    public Cubo(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    //METODO VOLUMEN
    public int volumen(){
        return ancho * alto * profundo;
    } 

    //ToString
    @Override
    public String toString() {
        return "cubo{" + "ancho = " + ancho + ", alto = " + alto + ", profundo = " + profundo + '}';
    }
 
    
}
