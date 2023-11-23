public class presupuesto {
    int id;
    int Mes;
    int Anio;
    double LimiteGasto;
    public presupuesto(){

    }

    public presupuesto(int id, int mes, int anio, double limiteGasto) {
        this.id = id;
        Mes = mes;
        Anio = anio;
        LimiteGasto = limiteGasto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMes() {
        return Mes;
    }

    public void setMes(int mes) {
        Mes = mes;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int anio) {
        Anio = anio;
    }

    public double getLimiteGasto() {
        return LimiteGasto;
    }

    public void setLimiteGasto(double limiteGasto) {
        LimiteGasto = limiteGasto;
    }
}
