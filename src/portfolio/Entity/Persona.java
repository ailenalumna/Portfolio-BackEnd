package portfolio.Entity;


public class Persona {
    
    
    //alt + insert para abrir el menu y agregar constructor, getters y setters
    private int id;
    private String nombre;
    private String apellido;

//constructor vacio
    public Persona() {
    }
//constructor con parametros
    public Persona(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
