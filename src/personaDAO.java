import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        Conexion db_conexion= new Conexion();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try(Connection conexion =db_conexion.get_conConnection()) {
            String query = "SELECT * FROM persona";
            ps =conexion.prepareStatement(query);
            rs =ps.executeQuery();

            while (rs.next()){
                System.out.println("id: "+rs.getInt("id"));
                System.out.println("Nombre: "+rs.getString("Nombre"));
                System.out.println("Apellido Paterno: "+rs.getString("Apellido1"));
                System.out.println("Apellido Materno: "+rs.getString("Apellido2"));
                System.out.println(" ");
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }
    public static void borrarPersona(int id){
        Conexion db_connect=new Conexion();
        try(Connection conexion=db_connect.get_conConnection()){
            PreparedStatement ps=null;
            try {
                String query ="DELETE FROM `finanzaspersonales`.`persona` WHERE  `id`=?";
                ps=conexion.prepareStatement(query);
                ps.setInt(1,id);
                ps.executeUpdate();
                System.out.println("Persona ha sido eliminado");
            }catch (SQLException e){
                System.out.println(e);
                System.out.println("Persona no se pudo borrar");
            }

        }catch (SQLException e){
            System.out.println(e);
        }


    }
    public static void actualizarPersona(persona person){
        Conexion db_connect=new Conexion();
        try(Connection conexion=db_connect.get_conConnection()){
            PreparedStatement ps;
            try {
                String query = "UPDATE `finanzaspersonales`.`persona` SET `Nombre`=?, `Apellido1`=?, `Apellido2`=? WHERE  `id`=?";
                ps=conexion.prepareStatement(query);
                ps.setString(1,person.getNombre());
                ps.setString(2,person.getApellido1());
                ps.setString(3,person.getApellido2());
                ps.setInt(4,person.getId());
                ps.executeUpdate();
                System.out.println("Se actualizo correctamente");

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }
}
