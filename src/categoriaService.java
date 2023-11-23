import java.util.Scanner;

public class categoriaService {
    public static void crearCategoria(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el Nombre: ");
        String Nombre= sc.nextLine();

        categoria cat =new categoria();
        cat.setNombre(Nombre);
        categoriaDAO.crearCategoriaDB(cat);
    }
    public static void listarCategria(){
        categoriaDAO.leerCategoriaDB();
    }
    public static void borrarCategoria(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Indica el ID de la categoria a borrar: ");
        int id_cat=sc.nextInt();
        categoriaDAO.borrarCategoria(id_cat);
    }
    public static void editarPresupuesto(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nuevo Nombre: ");
        String Nombre= sc.nextLine();

        System.out.println("ID a editar: ");
        int id_cat = sc.nextInt();

        categoria acat = new categoria();
        acat.setNombre(Nombre);
        acat.setId(id_cat);

        categoriaDAO.actualizarCateria(acat);
    }
}
