import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class categoriaDAO {
    public static void crearCategoriaDB(categoria cat){
        Conexion db_connect=new Conexion();
        try(Connection conexion=db_connect.get_conConnection()){
            PreparedStatement ps =null;
            try{
                String query = "INSERT INTO `finanzaspersonales`.`presupuesto` (`Nombre`) VALUES (?)";
                ps=conexion.prepareStatement(query);
                ps.setString(1,cat.getNombre());
                ps.executeUpdate();
            }catch (SQLException ex){
                System.out.println(ex);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void leerCategoriaDB(){
        Conexion db_conexion= new Conexion();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try(Connection conexion =db_conexion.get_conConnection()) {
            String query = "SELECT * FROM categoria";
            ps =conexion.prepareStatement(query);
            rs =ps.executeQuery();

            while (rs.next()){
                System.out.println("id: "+rs.getInt("id"));
                System.out.println("Nombre: "+rs.getString("Nombre"));
                System.out.println(" ");
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }
    public static void borrarCategoria(int id){
        Conexion db_connect=new Conexion();
        try(Connection conexion=db_connect.get_conConnection()){
            PreparedStatement ps=null;
            try {
                String query ="DELETE FROM `finanzaspersonales`.`categoria` WHERE  `id`=?";
                ps=conexion.prepareStatement(query);
                ps.setInt(1,id);
                ps.executeUpdate();
                System.out.println("Categoria ha sido eliminado");
            }catch (SQLException e){
                System.out.println(e);
                System.out.println("Categoria no se pudo borrar");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void actualizarCateria(categoria cat){
        Conexion db_connect=new Conexion();
        try(Connection conexion=db_connect.get_conConnection()){
            PreparedStatement ps;
            try {
                String query = "UPDATE `finanzaspersonales`.`categoria` SET `Nombre`=? WHERE  `id`=?";
                ps=conexion.prepareStatement(query);
                ps.setString(1,cat.getNombre());
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
