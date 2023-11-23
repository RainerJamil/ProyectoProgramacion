public class categoria {
    int id;
    String Nombre;

    public categoria(){

    }
    public categoria(int id, String nombre) {
        this.id = id;
        Nombre = nombre;
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
}

