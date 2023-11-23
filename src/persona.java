public class persona {
    int id;
    String Nombre;
    String Apellido1;
    String Apellido2;

    public persona(){

    }
    public persona(int id, String nombre, String apellido1, String apellido2) {
        this.id = id;
        Nombre = nombre;
        Apellido1 = apellido1;
        Apellido2 = apellido2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String apellido1) {
        Apellido1 = apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String apellido2) {
        Apellido2 = apellido2;
    }
}
