/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import datos.Activity;
import datos.ActivityDate;
import datos.Record;
import datos.User;
import excepciones.ExcepcionApp;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Clase que interactúa con la base de datos
 * @author Artur Viader
 */
public class DAO {
    private Connection connection;
    private static DAO instancia;
    static{
        try {
            instancia = new DAO();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "SQL Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }
    }
    /**
     * En el constructor del singleton se conecta con la bdd
     * @throws SQLException Puede devolver excepción si hay error de conexión
     */
    private DAO() throws SQLException
    {
        conectar();
    }
    
    public static void setInstancia(DAO instancia)
    {
        DAO.instancia = instancia;
    }
    
    /**
     * Get de la instancia singleton
     * @return 
     */
    public static DAO getInstancia()
    {
        return instancia;
    }
     /**
     * Se realiza la conexión con la base de datos.
     * @throws SQLException Puede dar error de conexión
     */
    public void conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/quarantine?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String password = "arturmysql";
        connection = (Connection) DriverManager.getConnection(url, user, password);
    }
    
    /**
     * Comprueba que el nombre de usuario y password son correctos.
     * @param username Nombre de usuario.
     * @param password Password.
     * @return Si es correcto o no.
     * @throws SQLException, ExcepcionApp Puede dar error de conexión o login incorrecto
     */
    public Boolean iniciasesion(String username, String password) throws SQLException, ExcepcionApp {
        Statement st = connection.createStatement();
        //Sentencia para obtener el usuario con dicho username
        String query = "Select * from user where username = '" + username + "'";
        ResultSet rs = st.executeQuery(query);
        boolean encontrado = false;
        if (rs.next()) {
            //Se comprueba si el password es correcto
            if (rs.getString("pass").equals(password)) {
                encontrado = true;
            } else {
                encontrado = false;
            }
        } else {
            encontrado = false;
        }
        rs.close();
        st.close();
        //Si el password no es correcto se genera excepción
        if (!encontrado)
        {
            throw new ExcepcionApp(ExcepcionApp.LOGININCORRECTO);
        }
        return encontrado;  
    }
    
    /**
     * Registrar un usuario
     * @param usuario Usuario a registrar
     * @throws SQLException Puede dar exepción de conexión
     * @throws ExcepcionApp  Si el usuario existía da excepción
     */
    public void registrarUsuario(User usuario) throws SQLException, ExcepcionApp
    {
        Statement st = connection.createStatement();
        //Se comprueba si el usuario existe
        String query = "Select * from user where username = '" + usuario.getUsername() + "'";
        ResultSet rs = st.executeQuery(query);
        if (rs.next()) {
            rs.close();
            st.close();
            throw new ExcepcionApp(ExcepcionApp.USUARIOEXISTE);
        }
        else
        {
            rs.close();
            st.close();
            //Se inserta el nuevo usuario
            PreparedStatement ps = connection.prepareStatement("INSERT INTO user(username,pass) VALUES(?,?);");
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getPassword());

            
            ps.executeUpdate();
            // Cerramos recursos
            ps.close();
        }
    }
    
    /**
     * Dar de alta una actividad
     * @param actividad
     * @throws SQLException Excepción de conexión
     * @throws ExcepcionApp Da excepción si la actividad existía
     */
    public void registrarActividad(Activity actividad) throws SQLException, ExcepcionApp
    {
        Statement st = connection.createStatement();
        //Se comprueba si una actividad con el mismo nombre existía
        String query = "Select * from activity where name = '" + actividad.getName() + "'";
        ResultSet rs = st.executeQuery(query);
        if (rs.next()) {
            rs.close();
            st.close();
            throw new ExcepcionApp(ExcepcionApp.ACTIVIDADEXISTE);
        }
        else
        {
            rs.close();
            st.close();
            //Se inserta la nueva actividad
            PreparedStatement ps = connection.prepareStatement("INSERT INTO activity(name,type,founder) VALUES(?,?,?);");
            ps.setString(1, actividad.getName());
            ps.setString(2, actividad.getType());
            ps.setString(3, actividad.getFounder());

            ps.executeUpdate();
            // Cerramos recursos
            ps.close();
        }
        
    }
    
    /**
     * Devuelve una lista con todas las actividades
     * @return Devuelve la lista
     * @throws SQLException Puede dar excepción de base de datos 
     */
    public ArrayList<Activity> selectAllActividades() throws SQLException
    {
        Statement st = connection.createStatement();
        String query = "Select * from activity";
        ResultSet rs = st.executeQuery(query);
        ArrayList<Activity> resultado = new ArrayList<>();
        //Se añaden los resultados a la lista
        while(rs.next())
        {
            resultado.add(new Activity(rs.getString("name"), rs.getString("type"), rs.getString("founder")));
        }
        rs.close();
        st.close();
        return resultado;
    }
    
    /**
     * Inserta un registro
     * @param registro
     * @throws SQLException Puede dar excepción en la bdd
     */
    public void insertRegistro(Record registro) throws SQLException
    {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO record(user,activity,date,time,comment) VALUES(?,?,?,?,?);");
            ps.setString(1, registro.getUser());
            ps.setString(2, registro.getActivity());
            ps.setString(3, registro.getStringDate());
            ps.setString(4, registro.getStringTime());
            ps.setString(5, registro.getComment());

            ps.executeUpdate();
            // Cerramos recursos
            ps.close();
    }
    
    /**
     * Obtiene los registros de un usuario
     * @param usuario
     * @return Devuelve lista de registros
     * @throws SQLException Puede dar excepción de bdd
     */
    public ArrayList<Record> selectRegistrosUsuario(String usuario) throws SQLException
    {
        Statement st = connection.createStatement();
        String query = "Select * from record where user='" + usuario + "'";
        ResultSet rs = st.executeQuery(query);
        ArrayList<Record> resultado = new ArrayList<>();
        //Se añaden los registros a la lista
        while(rs.next())
        {
            int idrecord = rs.getInt("idrecord");
            String user = rs.getString("user");
            String activity = rs.getString("activity");
            Date date = rs.getDate("date");
            Time time = rs.getTime("time");
            String comment = rs.getString("comment"); 
            LocalDateTime datetime;
            //Se juntan la fecha y la hora en una sola variable
            datetime = LocalDateTime.of(date.toLocalDate(), time.toLocalTime());

            resultado.add(new Record(idrecord,user,activity,datetime,comment)); 
        }
        rs.close();
        st.close();
        return resultado;
    }
    
    /**
     * Borra un registro
     * @param registro Registro a borrar
     * @throws SQLException Puede dar excepción de bdd
     */
    public void deleteRegistro(Record registro) throws SQLException
    {
        PreparedStatement ps = connection.prepareStatement("DELETE FROM record WHERE idrecord=?");
        ps.setInt(1, registro.getIdrecord());
        ps.executeUpdate();
        ps.close();
    }
    
    /**
     * Modifica o actualiza un registro
     * @param registro
     * @throws SQLException Excepción bdd
     */
    public void modificaRegistro(Record registro) throws SQLException
    {
        PreparedStatement ps = connection.prepareStatement("UPDATE record SET activity='" + registro.getActivity() + "', comment='" + registro.getComment() +"' WHERE idrecord=" + registro.getIdrecord());
        ps.executeUpdate();
        ps.close();
    }
    
    /**
     * Obtiene la lista de actividades de un usuario
     * @param usuario
     * @return Lista
     * @throws SQLException Excepción de bdd
     */
    public ArrayList<Activity> getActividadesUsuario(String usuario) throws SQLException
    {
        Statement st = connection.createStatement();
        String query = "Select * from activity where founder='" + usuario + "'";
        ResultSet rs = st.executeQuery(query);
        ArrayList<Activity> resultado = new ArrayList<>();
        while(rs.next())
        {
            resultado.add(new Activity(rs.getString("name"), rs.getString("type"), rs.getString("founder")));
        }
        rs.close();
        st.close();
        return resultado;
    }
    
    /**
     * Se obtiene el número de actividades de un tipo concreto que tiene un usuario
     * @param usuario
     * @param tipo
     * @return Número
     * @throws SQLException 
     */
    public int getActividadesUsuarioTipoCount(String usuario,String tipo) throws SQLException
    {
        Statement st = connection.createStatement();
        String query = "Select count(name) as cuantos from activity where founder='" + usuario + "' AND type='" + tipo +"'";
        ResultSet rs = st.executeQuery(query);   
        rs.next();
        int resultado = rs.getInt("cuantos");
        rs.close();
        st.close();
        return resultado;
    }
    
    /**
     * Se obtiene el número de registros de una actividad que no son de un usuario
     * @param actividad
     * @param usuario
     * @return Número
     * @throws SQLException 
     */
    public int getNumRecordsActivity(Activity actividad, String usuario) throws SQLException
    {
        Statement st = connection.createStatement();
        String query = "Select count(idrecord) as cuenta from record where activity='" + actividad.getName() + "' AND NOT user='" + usuario +"'";
        ResultSet rs = st.executeQuery(query);
        rs.next();
        int cuenta = rs.getInt("cuenta");
        rs.close();
        st.close();
        return cuenta;
    }
    
    /**
     * Se obtienen los registros actividades con su tipo de un usuario para una fecha
     * @param user
     * @param date
     * @return Lista de actividades con su tipo y fecha
     * @throws SQLException 
     */
    public ArrayList<ActivityDate> getActividadesUsuarioFecha(String user, LocalDate date) throws SQLException
    {
        Statement st = connection.createStatement();
        Statement sttwo = connection.createStatement();
        //Se consultan los registros de un usuario para una fecha
        String query = "Select * from record where user='" + user + "' AND date='" + date.toString()+ "'";
        ResultSet rs = st.executeQuery(query);
        ArrayList<ActivityDate> resultado = new ArrayList<>();
        ResultSet rstwo = null;
      
        //Para cada registro se consulta el tipo de actividad
        while(rs.next())
        {  
            String querytwo = "Select type from activity where name='" + rs.getString("activity") + "'";
            Time time = rs.getTime("time");
            String name = rs.getString("activity");
            rstwo = sttwo.executeQuery(querytwo);
            //Se añade a la lista
            if(rstwo.next())
            {
                resultado.add(new ActivityDate(name,rstwo.getString("type"),time.toLocalTime()));
            }  
            rstwo.close();
        } 
        rs.close();
        st.close();
        sttwo.close();
        return resultado;
    }  
}
