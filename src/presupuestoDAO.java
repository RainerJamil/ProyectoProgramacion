import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class presupuestoDAO {
    public static void crearPresupuestoDB(presupuesto presupuest){
        Conexion db_connect=new Conexion();
        try(Connection conexion=db_connect.get_conConnection()){
            PreparedStatement ps =null;
            try{
                String query = "INSERT INTO `finanzaspersonales`.`presupuesto` (`Mes`,`Anio`,`LimiteGasto`) VALUES (?,?,?)";
                ps=conexion.prepareStatement(query);
                ps.setInt(1,presupuest.getMes());
                ps.setInt(2,presupuest.getAnio());
                ps.setDouble(3,presupuest.getLimiteGasto());
                ps.executeUpdate();
            }catch (SQLException ex){
                System.out.println(ex);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void leerPresupuestoDB(){
        Conexion db_conexion= new Conexion();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try(Connection conexion =db_conexion.get_conConnection()) {
            String query = "SELECT * FROM presupuesto";
            ps =conexion.prepareStatement(query);
            rs =ps.executeQuery();

            while (rs.next()){
                System.out.println("id: "+rs.getInt("id"));
                System.out.println("Mes: "+rs.getInt("Mes"));
                System.out.println("Año: "+rs.getInt("Anio"));
                System.out.println("Limite Gasto: "+rs.getDouble("LimiteGasto"));
                System.out.println(" ");
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }
    public static void borrarPresupuesto(int id){
        Conexion db_connect=new Conexion();
        try(Connection conexion=db_connect.get_conConnection()){
            PreparedStatement ps=null;
            try {
                String query ="DELETE FROM `finanzaspersonales`.`presupuesto` WHERE  `id`=?";
                ps=conexion.prepareStatement(query);
                ps.setInt(1,id);
                ps.executeUpdate();
                System.out.println("Presupuesto ha sido eliminado");
            }catch (SQLException e){
                System.out.println(e);
                System.out.println("Presupuesto no se pudo borrar");
            }

        }catch (SQLException e){
            System.out.println(e);
        }


    }
    public static void actualizarPresupuesto(presupuesto presupuest){
        Conexion db_connect=new Conexion();
        try(Connection conexion=db_connect.get_conConnection()){
            PreparedStatement ps;
            try {
                String query = "UPDATE `finanzaspersonales`.`presupuesto` SET `Mes`=?, `Anio`=?, `LimiteGasto`=? WHERE  `id`=?";
                ps=conexion.prepareStatement(query);
                ps.setInt(1,presupuest.getMes());
                ps.setInt(2,presupuest.getAnio());
                ps.setDouble(3,presupuest.getLimiteGasto());
                ps.setInt(4,presupuest.getId());
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
