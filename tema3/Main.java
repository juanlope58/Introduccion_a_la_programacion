package ejercicio1;

public class Main {

    public static void main(String[] args) {
        suma(1,5,23);
        
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.numPuertas);
    }
    
    public static void suma(int a, int b, int c) {
        System.out.println(a+b+c);
        return;        
    }
}
