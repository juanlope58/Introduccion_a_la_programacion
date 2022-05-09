public class Persona {
    private String nombre;
    private Integer edad;
    private String telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(Integer edad){
        this.edad = edad;
    }
    public Integer getEdad(){
        return this.edad;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
    
}
