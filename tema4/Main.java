package ejercicio2;

public class Main {
    public static void main(String[] args) {
        int numeroIf = -30;

        if(numeroIf != 0){
            if(numeroIf<0){
                System.out.println("El número es negativo");
            }else{
                System.out.println("El número es positivo");
            }
        }else{
            System.out.println("El número es cero");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
            
        }

        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile<3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);            
        }

        String estacion = "verano";
        switch (estacion) {
            case "verano":
                System.out.println("Estamos en verano");                
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;        
            default:
                System.out.println("No es una estación");
                break;
        }

    }
    
}
