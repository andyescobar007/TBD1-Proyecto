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
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public void registrarProveedor(String rs,String dir,String cuid,String tel,String cont,String tipo,int act){
        try {
            PreparedStatement prepareS=conector.prepareStatement("sp_insertarproveedor ?,?,?,?,?,?,?");
            prepareS.setString(1,rs);
            prepareS.setString(2,dir);
            prepareS.setString(3,cuid);
            prepareS.setString(4,tel);
            prepareS.setString(5,cont);
            prepareS.setString(6,tipo);
            prepareS.setInt(7,act);
            
            
            prepareS.executeUpdate();
            System.out.println("USUARIO REGISTRADO");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
    public ResultSet getLogin(String user,String pass) throws SQLException{
        String sql="Select * From Usuarios where username=? and password=?";
        //String sql="exec user_login ?,?";
        PreparedStatement preparedS=conector.prepareStatement(sql);
        preparedS.setString(1, user);
        preparedS.setString(2, pass);
        return preparedS.executeQuery();
   
    }
    
    
    public int getIDProveedor(){
        int cod=0;
        try {
            String sql="exec obtenersecuenciaproveedor;";
            //String sql="exec user_login ?,?";
            PreparedStatement preparedS=conector.prepareStatement(sql);
            resultset=preparedS.executeQuery();
            if(resultset.next()){
                cod = resultset.getInt(1); 
            } 
            if(cod==0){
                sql="exec resetSQ_Proveedor";
                preparedS=conector.prepareStatement(sql);
                preparedS.executeQuery();
            }
        } catch (SQLException ex) {
            //Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cod ;
    }
    
    public ResultSet getProveedores(){
        resultset=null;
        try {
            PreparedStatement preparedS=conector.prepareStatement("SELECT * FROM Proveedor");
            resultset=preparedS.executeQuery();
            return resultset;
        } catch (SQLException ex) {
           //Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultset;
    }
     public ResultSet getProductos_Almacen(){
        resultset=null;
        try {
            PreparedStatement preparedS=conector.prepareStatement("SELECT * FROM Productos_Almacen");
            resultset=preparedS.executeQuery();
            return resultset;
        } catch (SQLException ex) {
           
        }
        return resultset;
    }
    
    public void deleteProveedor(int cod){
        try {
            ps=conector.prepareStatement("exec sp_borrar_proveedores ?");
            ps.setInt(1, cod);
            resultset=ps.executeQuery();
        } catch (SQLException ex) {
            
        }
    }
    
    
    
     public ResultSet getLineaProducto(){
        String sql="Select * From Linea";
        PreparedStatement preparedS=null;
        ResultSet result=null;
        try {
            preparedS=conector.prepareStatement(sql);
            result=preparedS.executeQuery();
        } catch (SQLException ex) {
            
        }
        return result;
   
    }
     
     public ResultSet getTipoProducto(String tipo){
        String sql="exec getTipo ?";
        PreparedStatement preparedS=null;
        ResultSet result=null;
        try {
            preparedS=conector.prepareStatement(sql);
            preparedS.setString(1, tipo);
            result=preparedS.executeQuery();
        } catch (SQLException ex) {
            
        }
        return result;
   
    }
     
     
    public int getIDProductoCompra(){
        ResultSet resultset=null;
        int cont=0;
        try {
            resultset=ejecutar_consulta("Select MAX(codigo_producto) from Producto_compra");
            if(resultset.next()){
                cont=resultset.getInt(1);
            }
           } catch (SQLException ex) {
        }
        return cont+1;
    }
   
    public void registrarProductoCompra(String Lin,String tipo,int act,String des,
            int centroCost,String unidadM,String Destino){

        try {
            ps=conector.prepareStatement("exec sp_insertar_productocompra ?,?,?,?,?,?,?");
            ps.setString(1, Lin);
            ps.setString(2, tipo);
            ps.setInt(3, act);
            ps.setString(4, des);
            ps.setInt(5, centroCost);
            ps.setString(6, unidadM);
            ps.setString(7, Destino);
            ps.executeUpdate();
            System.out.println("producto registrado");
            
        } catch (SQLException ex) {
            //Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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

    public void deleteProductoCompra(int codigo) {
        try {
            ps=conector.prepareStatement("exec sp_borrar_productoscompra ?");
            ps.setInt(1, codigo);
            resultset=ps.executeQuery();
        } catch (SQLException ex) {
            
        }
    }
<<<<<<< HEAD
    
    public ResultSet buscarProveedor(String proveedor){
        String sql="exec sp_buscarProveedor ?";
        PreparedStatement preparedS=null;
        ResultSet result=null;
        try {
            preparedS=conector.prepareStatement(sql);
            preparedS.setString(1, proveedor);
            result=preparedS.executeQuery();
        } catch (SQLException ex) {
            
        }
        return result;
    }
    
    public int getIDOrdenCompra(){
        ResultSet resultset=null;
        int cont=0;
        try {
            resultset=ejecutar_consulta("Select MAX(codigo_producto) from orden_compra");
            if(resultset.next()){
                cont=resultset.getInt(1);
            }
           } catch (SQLException ex) {
        }
        return cont+1;
    }
=======
>>>>>>> master
}
