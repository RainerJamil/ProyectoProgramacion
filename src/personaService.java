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
    public static void listarPerson(){

    }
    public static void borrarPersona(){

    }
    public static void editarPersona(){

    }
}
