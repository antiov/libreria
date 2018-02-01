package ControladoresBD;

import HibernateUtil.NewHibernateUtil;
import Modelo.modeloUsuario;
import java.math.BigInteger;
import java.sql.Array;
import java.util.List;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DAO_usuario {
        
    public   List<?> VerUsuario(String nom,String pass)
    { String algo = "";
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        List<?> i = null;
        try
       {
        Query querys = sesion.createSQLQuery("select * from usuarios where nombre = '" + nom + "' and contrasena = '" + pass + "';");
        System.out.println("query:\n" + querys + "\n");

        i = querys.list();
        
       }
        catch(Exception ex)
        {
            System.out.println("Error query " + ex.getMessage());
        }
        finally
        {
            sf.close();
        }
        return i;
    }
    
    //prueba
    /*
    public  List<String> zabbixDB()
    { String algo = "";
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
       Query query = sesion.createSQLQuery("SELECT * FROM gente;");
       List<Object []> listDatos = query.list();
        for (Object[] datos : listDatos) 
        {
          System.out.println(datos[0] + "--" + datos[1] );
        }
       // Query queryDB = sesion.createSQLQuery("SELECT * FROM users;");
       Query querys = sesion.createSQLQuery("SELECT dato FROM gente;");
        List<String> i = querys.list();
        return i;
    }
    */
    
    public String loginInicio(String usuario,String pass)
    {
         SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Query query = sesion.createSQLQuery("select dato from prueba1.gente where nombre = '" + usuario + "';");
         String algo = "";
        List<String> i = query.list();
        
        if(i.size() <= 0)
        {
          algo = "vacio";
        }
         else
        {
            algo = "ingresar";
        }
         return algo;
    }
   
     private static SessionFactory factory;
     
   public String insertUser(String nombre ,String cargo,String contrasena,String tipo_usuario)
    {   
        String algo = "";
        factory = new Configuration().configure().buildSessionFactory();
         Session ss = factory.openSession();
         modeloUsuario muser = new modeloUsuario(0,nombre , cargo , contrasena , tipo_usuario);
         
        try
         {
           Transaction tx = ss.beginTransaction();

          ss.save(muser);
         tx.commit();
            
             algo = "Usuario Agregado";
         }
        catch(Exception ex)
        {
            System.out.println("Error query " + ex.getMessage());
            algo = "Error query " + ex.getMessage();
        }
        finally
        {
           
        }
      return algo;
    }
   
   public String updateUser(int id,String nombre ,String cargo,String contrasena,String tipo_usuario)
   {
     String algo = "";  
   String query = ( "UPDATE usuarios SET nombre = '" + nombre + "',cargo = '" + cargo + "', contrasena = '" + contrasena + "', tipo_usuario = '" + tipo_usuario + "' " +
                         "WHERE ( nombre = '' );"); 
        
        factory = new Configuration().configure().buildSessionFactory();
         Session ss = factory.openSession();
         modeloUsuario muser = new modeloUsuario(0,nombre , cargo , contrasena , tipo_usuario);
         
        try
         {
            
           Transaction tx = ss.beginTransaction();
             muser.setId_usuario(id);
          ss.update(muser);
         tx.commit();
            
             algo = "¡Usuario actualizado!";
         }
        catch(Exception ex)
        {
            System.out.println("¡Error!" /*+ ex.getMessage()*/);
            algo = "¡Error!" /*+ ex.getMessage()*/;
        }
        finally
        {
           
        }
        
        return algo;
   }
   
   
       public   List<?> VerTodosUsuarios()
    { String algo = "";
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        List<?> i = null;
        try
       {
        Query querys = sesion.createSQLQuery("select * from usuarios;");
        System.out.println("query:\n" + querys + "\n");

        i = querys.list();
        
       }
        catch(Exception ex)
        {
            System.out.println("Error query " + ex.getMessage());
        }
        finally
        {
            sf.close();
        }
        return i;
    }
       
       
      public List<modeloUsuario> todosUsers(){
     
      List<modeloUsuario> lista  = null;
    String algo = "";

         factory = new Configuration().configure().buildSessionFactory();
         Session ss = factory.openSession();
       Query query = ss.createSQLQuery("SELECT * FROM usuarios;");
        List<Object []> listDatos = query.list();
      
        lista = query.list();
       
        return lista;
    }
}
