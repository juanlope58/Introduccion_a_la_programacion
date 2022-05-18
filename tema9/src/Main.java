public class Main {
    public static void main(String[] args) {
        Cliente cliente1=new Cliente();
        cliente1.setEdad(29);
        cliente1.setNombre("Juan Carlos");
        cliente1.setTelefono("310-432-1921");
        cliente1.setCredito("mil dólares");
        System.out.println("Cliente: "+cliente1.getNombre()+", con "+cliente1.getEdad()+" años, telefono; "+ cliente1.getTelefono()+" y crédito de: "+cliente1.getCredito() );

        Trabajador trabajador1=new Trabajador();
        trabajador1.setEdad(29);
        trabajador1.setNombre("Juan Carlos");
        trabajador1.setTelefono("310-432-1921");
        trabajador1.setSalario(3000);
        System.out.println("trabajador: "+trabajador1.getNombre()+", con "+trabajador1.getEdad()+" años, telefono; "+ trabajador1.getTelefono()+" y con salario de: "+trabajador1.getSalario()+" dólares." );
    }
}
class Persona {
    int edad=0;
    String nombre="";
    String telefono="";

    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
}

final class Cliente extends Persona{
    String credito="";

    public String getCredito(){
        return this.credito;
    }
    public void setCredito(String credito){
        this.credito=credito;
    }
}

final class Trabajador extends Persona{
    double salario=0;

    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
}