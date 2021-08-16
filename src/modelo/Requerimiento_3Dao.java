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
public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        // Su código
        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        Connection conexion = JDBCUtilities.getConnection();
        String consulta="SELECT Cargo, MAX(Salario) from Lider l group by l.Cargo having MAX(l.Salario)>700000;";
        try {
            // Recorrer los registros en los VO específicos
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(consulta);

            while(resultado.next()){
                Requerimiento_3 requerimiento_3 = new Requerimiento_3();

                requerimiento_3.setCargo(resultado.getString("Cargo"));

                requerimiento_3.setMaxSalario(resultado.getInt("MAX(Salario)"));

                respuesta.add(requerimiento_3);
            }
        } catch (SQLException e) {
            System.err.println("error en la segunda consilta");
            e.printStackTrace();
        } finally {
            if (conexion != null){
                conexion.close();
            }
        }

        // Retornar la colección de vo's
        return respuesta;

    }
}
