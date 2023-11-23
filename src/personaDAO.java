import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class personaDAO {
    public static void crearPersonaDB(persona person){
        Conexion db_connect=new Conexion();
        try(Connection conexion=db_connect.get_conConnection()){
            PreparedStatement ps =null;
            try{
                String query = "INSERT INTO `finanzaspersonales`.`persona` (`Nombre`,`Apellido1`,`Apellido2`) VALUES (?,?,?)";
                ps=conexion.prepareStatement(query);
                ps.setString(1,person.getNombre());
                ps.setString(2,person.getApellido1());
                ps.setString(3,person.getApellido2());
                ps.executeUpdate();
            }catch (SQLException ex){
                System.out.println(ex);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void leerPersonaDB(){

    }
    public static void borrarPersona(int id){

    }
    public static void actualizarPersona(persona person){

    }
}
