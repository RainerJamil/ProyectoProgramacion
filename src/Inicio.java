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
            System.out.println("1.- Persona");
            System.out.println("2.- Presupuesto");
            System.out.println("3.- Categoria");
            System.out.println("4.- Salir");
            System.out.print(">>");
            opcion= sc.nextInt();
            switch (opcion){
                case 1:
                    Scanner case1=new Scanner(System.in);
                    int opcion1=0;
                    do{
                        System.out.println("-----------------");
                        System.out.println("Aplicacion de Finanzas Personales");
                        System.out.println("1.- Crear Persona");
                        System.out.println("2.- Listar Persona");
                        System.out.println("3.- Editar Persona");
                        System.out.println("4.- Eliminar Persona");
                        System.out.println("5.- Salir");
                        System.out.print(">>");
                        opcion1= sc.nextInt();
                        switch (opcion1){
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
                    }while (opcion1!=5);
                    break;
                case 2:
                    Scanner case2 =new Scanner(System.in);
                    int opcion2=0;
                    do{
                        System.out.println("-----------------");
                        System.out.println("Aplicacion de Finanzas Personales");
                        System.out.println("1.- Crear Presupuesto");
                        System.out.println("2.- Listar Presupuesto");
                        System.out.println("3.- Editar Presupuesto");
                        System.out.println("4.- Eliminar Presupuesto");
                        System.out.println("5.- Salir");
                        System.out.print(">>");
                        opcion2= sc.nextInt();
                        switch (opcion2){
                            case 1:
                                presupustoService.crearPresupuesto();
                                break;
                            case 2:
                                presupustoService.listarPresupuesto();
                                break;
                            case 3:
                                presupustoService.editarPresupuesto();
                                break;
                            case 4:
                                presupustoService.borrarPresupuesto();
                                break;
                            default:
                                break;
                        }
                    }while (opcion2!=5);
                    break;
                case 3://flash puta jajajajaja
                    Scanner case3 =new Scanner(System.in);
                    int opcion3=0;
                    do{
                        System.out.println("-----------------");
                        System.out.println("Aplicacion de Finanzas Personales");
                        System.out.println("1.- Crear Categoria");
                        System.out.println("2.- Listar Categoria");
                        System.out.println("3.- Editar Categoria");
                        System.out.println("4.- Eliminar Categoria");
                        System.out.println("5.- Salir");
                        System.out.print(">>");
                        opcion3= sc.nextInt();
                        switch (opcion3){
                            case 1:
                                categoriaService.crearCategoria();
                                break;
                            case 2:
                                categoriaService.listarCategria();
                                break;
                            case 3:
                                categoriaService.editarPresupuesto();
                                break;
                            case 4:
                                categoriaService.borrarCategoria();
                                break;
                            default:
                                break;
                        }
                    }while (opcion3!=5);
            }
        }while (opcion!=4);
    }
}

