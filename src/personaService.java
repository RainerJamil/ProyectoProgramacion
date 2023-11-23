import java.util.Scanner;

public class personaService {
    public static void crearPersona(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el Nombre: ");
        String Nombre= sc.nextLine();

        System.out.println("Ingrese el primer Apellido: ");
        String Apellido1= sc.nextLine();

        System.out.println("Ingrese el segundo Apellido: ");
        String Apellido2= sc.nextLine();

        persona person =new persona();
        person.setNombre(Nombre);
        person.setApellido1(Apellido1);
        person.setApellido2(Apellido2);
        personaDAO.crearPersonaDB(person);
    }
    public static void listarPersona(){
        personaDAO.leerPersonaDB();

    }
    public static void borrarPersona(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Indica el ID de la persona a borrar: ");
        int id_persona=sc.nextInt();
        personaDAO.borrarPersona(id_persona);
    }
    public static void editarPersona(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nuevo Nombre: ");
        String Nombre= sc.nextLine();

        System.out.println("Nuevo Apellido Paterno: ");
        String Apellido1= sc.nextLine();

        System.out.println("Nuevo Apellido Materno: ");
        String Apellido2= sc.nextLine();

        System.out.println("ID a editar: ");
        int id_persona = sc.nextInt();

        persona apersona = new persona();
        apersona.setNombre(Nombre);
        apersona.setApellido1(Apellido1);
        apersona.setApellido2(Apellido2);
        apersona.setId(id_persona);

        personaDAO.actualizarPersona(apersona);

    }
}
