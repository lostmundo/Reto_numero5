/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.JDBCUtilities;
/**
 *
 * @author sebas
 */
public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // Su código

        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();
        String consulta="SELECT c.Proveedor, p.Constructora , c.Pagado FROM Proyecto p inner join Compra c on (p.ID_Proyecto = c.ID_Proyecto) where c.Proveedor in ('Homecenter', 'JUMBO') and (c.Pagado = 'Si' and p.Constructora like '%S.A.') order by c.Proveedor ;";
        try {

            // Recorrer los registros en los VO específicos

            Statement statement= conexion.createStatement();
            ResultSet resultado = statement.executeQuery(consulta);

            while(resultado.next()){
                Requerimiento_2 requerimiento_2 = new Requerimiento_2();

                requerimiento_2.setProveedor(resultado.getString("Proveedor"));

                requerimiento_2.setConstructora(resultado.getString("Constructora"));

                requerimiento_2.setPagado(resultado.getString("Pagado"));

                respuesta.add(requerimiento_2);
            }

            statement.close();
            resultado.close();
        } catch (SQLException e) {
            System.err.println("error en la segunda consilta");
            e.printStackTrace();

        } finally {
            if (conexion != null)
                conexion.close();
        }

        // Retornar la colección de vo's
        return respuesta;

    }
}
