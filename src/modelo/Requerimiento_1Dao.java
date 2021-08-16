/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sebas
 */
public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // Su código
        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
        Connection conexion = JDBCUtilities.getConnection();
        String consulta="SELECT p.Constructora , p.Ciudad, p.Banco_Vinculado, p.Porcentaje_Cuota_Inicial , p.Clasificacion,p.Fecha_Inicio FROM Proyecto p where p.Ciudad = 'Pereira';"; 
        try {
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(consulta);

            while(resultado.next()){
                Requerimiento_1 requerimiento_1 = new Requerimiento_1();

                requerimiento_1.setConstructora(resultado.getString("Constructora"));
                
                requerimiento_1.setCiudad(resultado.getString("Ciudad"));

                
                requerimiento_1.setBanco(resultado.getString("Banco_Vinculado"));

                requerimiento_1.setPorcentaje(resultado.getDouble("Porcentaje_Cuota_Inicial"));

                requerimiento_1.setClasificacion(resultado.getString("Clasificacion"));

                requerimiento_1.setFecha(resultado.getString("Fecha_Inicio"));

                respuesta.add(requerimiento_1);
            }

            statement.close();
            resultado.close();
        } catch (SQLException e) {
            System.err.println("error en la primera consilta");
            e.printStackTrace();
        } finally {
            if (conexion != null)
                conexion.close();
        }

        // Retornar la colección de vo's
        return respuesta;

    }
}
