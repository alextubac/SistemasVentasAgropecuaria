
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int p;   
    //OPERACIONES CRUD
    
    public List listar(){
        String sql = "select * from producto";
        List<Producto>lista=new ArrayList<>();
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Producto prd=new Producto();
                prd.setId(rs.getInt(1));
                prd.setNom(rs.getString(2));
                prd.setPre(rs.getString(3));
                prd.setStock(rs.getInt(4));
                prd.setEstado(rs.getString(5));
                lista.add(prd);
            }
        }catch (Exception e){
        }
            return lista;
        }        
    public int agregar (Producto prd){
        String sql = "insert into producto(Nombres, Precio, Stock, Estado)values(?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, prd.getNom());
            ps.setString(2, prd.getPre());
            ps.setInt(3, prd.getStock());
            ps.setString(4, prd.getEstado());
            ps.executeUpdate();
        }catch (Exception e){           
        }
        return p;
    }
    public  Producto listarId(int id){
        Producto prd=new Producto();
        String sql="select * from producto where IdProducto="+id;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                prd.setNom(rs.getString(2));
                prd.setPre(rs.getString(3));
                prd.setStock(rs.getInt(4));
                prd.setEstado(rs.getString(5));
            }
        }catch (Exception e){
            
        }
        return prd;
    }
    public int actualizar(Producto prd){
          String sql = "update producto set Nombres=?, Precio=?, Stock=?, Estado=? where IdProducto=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, prd.getNom());
            ps.setString(2, prd.getPre());
            ps.setInt(3, prd.getStock());
            ps.setString(4, prd.getEstado());
            ps.setInt(5, prd.getId());
            ps.executeUpdate();
        }catch (Exception e) {           
        }
        return p;    
    }
    public void delete(int id){
        String sql="delete from producto where IdProducto="+id;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch (Exception e){
            
        }
    }
}
