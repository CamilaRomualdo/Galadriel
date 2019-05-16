/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galadriel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Camil
 */
public class AvatarFemininoBanco {
    Connection conexaoDB;
    String URL_DB = "jdbc:derby://localhost:1527/zoid";
    
    public AvatarFemininoBanco() {
        try {
            conexaoDB = DriverManager.getConnection(URL_DB, "galadriel", "galadriel");
            System.out.println("Conexão concluida com exito!");
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
    }
    public void inserirAvatarFeminino(AvatarFeminino af) {
        try {
            Statement comando = conexaoDB.createStatement();
            String nome = af.getNomeAvatar();
            String sqlInsert = "INSERT INTO AF_FEM_TB (NOME , IDADE , ALTURA , PESO ) " 
                    + "VALUES (\'" + af.getNomeAvatar() + "\', " + af.getIdadeAvatr() 
                    + " , " + af.getAlturaAvatar() + " , " + af.getPesoAvatar() + " )";
            System.out.println(sqlInsert);
            comando.executeUpdate(sqlInsert);
            comando.close();
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
    }
    public void recuperarAvatarFemininos(ArrayList<AvatarFeminino> listaAvatarFemininos) {
        try {
            Statement comando = conexaoDB.createStatement();
            String sqlQuery = "SELECT NOME, IDADE, ALTURA, PESO "
                            + "FROM AF_FEM_TB";
            ResultSet resultado = comando.executeQuery(sqlQuery);
            while(resultado.next()){
                String nomeAvatar = resultado.getString("NOME");
                int idadeAvatar = resultado.getInt("IDADE");
                double alturaAvatar = resultado.getDouble("ALTURA");
                double pesoAvatar = resultado.getDouble("PESO");
                AvatarFeminino af = new AvatarFeminino(nomeAvatar, idadeAvatar, alturaAvatar, pesoAvatar);
                listaAvatarFemininos.add(af);
            }
        } catch (SQLException se) {
            System.out.println(se);
        }
    }
    
    
}

