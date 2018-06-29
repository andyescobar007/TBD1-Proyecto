/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Hasbun
 */
public class Database {
    Connection conector;
    Statement statement;
    int resultado=0;
    ResultSet resultset;
    PreparedStatement ps;
    String PATH;
    
    public Database(){
       conector=null;
        try {
            PATH = "jdbc:sqlserver://;database=ProyectoOK;integratedSecurity=true;";
            conector= DriverManager.getConnection(PATH);
            ps=null;
            resultset=null;
            statement=null;
            System.out.println("Conectado");
        } catch (SQLException e) {
            System.out.println("error");
            JOptionPane.showMessageDialog(null,"No se pudo conectar a la base de datos");
        }
       
    }
    
    public int logeo(String usuario, String contraseña){
        try {
            String SQL= "SELECT * FROM Usuarios WHERE username='"+usuario+"' AND password=sha1('"+contraseña+"')";
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ejecutar_consulta(SQL);
            System.out.println("ejecute la consulta");
            
            if(resultset.next()){
                resultado=1;
            }
        } catch (SQLException e) {
        }
        return resultado;
        
    }
    public ResultSet ejecutar_consulta(String sql) throws SQLException{
        Statement st;
        st= conector.createStatement();
        resultset = st.executeQuery(sql);
        return resultset;
    }
    
    public void agregar(String sql) throws SQLException{
        conector.prepareStatement(sql).executeUpdate();
        System.out.println("USUARIO REGISTRADO");
       
    }
    public void agregar2(String user,String pass) throws SQLException{
        PreparedStatement prepareS=conector.prepareStatement("insert into Usuarios(username,password) values (?,?)");
        prepareS.setString(1,user);
        prepareS.setString(2,pass);
        
        prepareS.executeUpdate();
        System.out.println("USUARIO REGISTRADO");
       
    }
    
    
    public ResultSet getLogin(String user,String pass) throws SQLException{
        String sql="Select * From Usuarios where username=? and password=?";
        //String sql="exec user_login ?,?";
        PreparedStatement preparedS=conector.prepareStatement(sql);
        preparedS.setString(1, user);
        preparedS.setString(2, pass);
        return preparedS.executeQuery();
   
    }
   
    
    ///* 
    public static void main(String[] args) throws SQLException { 
     
        
     Database db= new Database();
        System.out.println("base de datos conectada");
     ResultSet rttemp;
     //db.ejecutar_consulta("delete from usuarios where username = andy");
     //db.agregar("insert into Usuarios(username,password) values ('MIGUEL','supersecreto')");
     //db.agregar("delete from usuarios where username = 'andy'");
     //db.agregar2("Dcarlos","secreto");
    rttemp= db.ejecutar_consulta("Select * From Usuarios");
     while(rttemp.next()){
         
         System.out.println("Usuario:" +rttemp.getString(1)+ "\tPassword "+rttemp.getString(2));
     }   
    }
    //*/ 
}
