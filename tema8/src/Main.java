public class Main {

    public static void main(String[] args) {
        Persona persona= new Persona(); 

        // Doy valor a las propiedades de la persona
        persona.setNombre("Juan Carlos Lopera");
        persona.setEdad(29);
        persona.setTelefono("3126574375");

        // Impresion de las propiedades
        System.out.println("El nombre es: "+ persona.getNombre());
        System.out.println("La edad es: "+ persona.getEdad());
        System.out.println("El telefono es: "+ persona.getTelefono());
        
    }

}