/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando
 */
public class Libro {
    String isbn;
    String nombre;
    String autor;
    String editorial;
    int paginas;
    int año;
    
    Connection cnn ; 
    Statement state;
    ResultSet res;
    
    public Libro(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca?zeroDateTimeBehavior=convertToNull", "root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Libro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Libro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean agregar(){
        try {
            String query = "insert into libro values('"+isbn+"','"+nombre+"','"+autor+"','"+editorial+"',"+paginas+","+año+")";
            int saber = 0;
            state = cnn.createStatement();
            saber = state.executeUpdate(query);
            if(saber == 1){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(Libro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean eliminar(){
        try {
            String query ="delete from libro where isbn = '"+isbn+"'";
            int borr = 0;
            state = cnn.createStatement();
            borr = state.executeUpdate(query);
            if(borr == 1 ){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Libro.class.getName()).log(Level.SEVERE, null, ex);
        }return false;
    }
    
    public boolean modificar(){
        try {
            String query = "update libro set nombre = '"+nombre+"', autor = '"+autor+"', editorial ='"+editorial+"', cant_pag = "+paginas+", año = "+año+" where isbn = '"+isbn+"' ";
            int mod = 0;
            state = cnn.createStatement();
            mod =     state.executeUpdate(query);
            if (mod == 1){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(Libro.class.getName()).log(Level.SEVERE, null, ex);
        }return false;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
}
