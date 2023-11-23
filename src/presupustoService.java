import java.util.Scanner;

public class presupustoService {
    public static void crearPresupuesto(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el Mes: ");
        int Mes= sc.nextInt();

        System.out.println("Ingrese el Año: ");
        int Anio= sc.nextInt();

        System.out.println("Ingrese el Limite de Gasto: ");
        Double LimiteGasto= sc.nextDouble();

        presupuesto presupuest =new presupuesto();
        presupuest.setMes(Mes);
        presupuest.setAnio(Anio);
        presupuest.setLimiteGasto(LimiteGasto);
        presupuestoDAO.crearPresupuestoDB(presupuest);
    }
    public static void listarPresupuesto(){
        presupuestoDAO.leerPresupuestoDB();

    }
    public static void borrarPresupuesto(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Indica el ID del presupuesto a borrar: ");
        int id_presupuesto=sc.nextInt();
        presupuestoDAO.borrarPresupuesto(id_presupuesto);
    }
    public static void editarPresupuesto(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nuevo Mes: ");
        int Mes= sc.nextInt();

        System.out.println("Nuevo Año: ");
        int Anio= sc.nextInt();

        System.out.println("Nuevo Limite Gasto: ");
        double LimiteGasto= sc.nextDouble();

        System.out.println("ID a editar: ");
        int id_presupuesto = sc.nextInt();

        presupuesto apresupuesto = new presupuesto();
        apresupuesto.setMes(Mes);
        apresupuesto.setAnio(Anio);
        apresupuesto.setLimiteGasto(LimiteGasto);
        apresupuesto.setId(id_presupuesto);

        presupuestoDAO.actualizarPresupuesto(apresupuesto);


    }
}
