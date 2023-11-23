import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println("-----------------");
            System.out.println("Aplicacion de Finanzas Personales");
            System.out.println("1.- Crear Persona");
            System.out.println("2.- Listar Persona");
            System.out.println("3.- Editar Persona");
            System.out.println("4.- Eliminar Persona");
            System.out.println("5.- Salir");
            System.out.print(">>");
            opcion= sc.nextInt();
            switch (opcion){
                case 1:
                    personaService.crearPersona();
                    break;
                case 2:
                    personaService.listarPersona();
                    break;
                case 3:
                    personaService.editarPersona();
                    break;
                case 4:
                    personaService.borrarPersona();
                    break;
                default:
                    break;
            }
        }while (opcion!=5);
    }
}
