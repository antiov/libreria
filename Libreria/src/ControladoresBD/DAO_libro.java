package ControladoresBD;

//import ClasesModeloNegocio.Libro;
import HibernateUtil.NewHibernateUtil;
import Modelo.modeloLibro;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DAO_libro {

    /*
    public void insertar(Libro l){
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Transaction tx = sesion.beginTransaction();
        sesion.saveOrUpdate(l);
        tx.commit();
        sesion.close();        
    }
    public List<Libro> leer(){
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Query query = sesion.createQuery("from Libro");
        List<Libro> lista = query.list();

        return lista;
    }

    public List<String> obtenerEstado(String ISBN){
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Query query = sesion.createSQLQuery("SELECT estado FROM libro WHERE (estado != 'vendido' OR estado != 'devuelto') AND registro_libro_isbn = '"+ISBN+"';");
        List<String> i = query.list();
        return i;
    }
  
      
    public  List<String> PruebaConxDB()
    { String algo = "";
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
       Query query = sesion.createSQLQuery("SELECT * FROM libro;");
       List<Object []> listDatos = query.list();
     for (Object[] datos : listDatos) {
     System.out.println(datos[0] + "--" + datos[1] );
 }
   // Query query = sesion.createSQLQuery("SELECT * FROM users;");
       Query querys = sesion.createSQLQuery("SELECT titulo FROM libro;");
        List<String> i = querys.list();
        return i;
    }
     */
 /* verifica si el usuario y contraseña existen en la base
     * regresa 1 si existe y 0 si no(datos no correctos)  
     */
    public List<?> VerLibro(String titulo, String pass) {
        String algo = "";
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        List<?> i = null;
        try {
            //Se agrega comentario
            Query querys = sesion.createSQLQuery("select * from libro where titulo like '% %';");
            System.out.println("query:\n" + querys + "\n");

            i = querys.list();

        } catch (Exception ex) {
            System.out.println("Error query " + ex.getMessage());
        } finally {
            sf.close();
        }
        return i;
    }

    public List<?> VerTodosUsuarios() {
        String algo = "";
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        List<?> i = null;
        try {
            Query querys = sesion.createSQLQuery("select * from usuarios;");
            System.out.println("query:\n" + querys + "\n");

            i = querys.list();

        } catch (Exception ex) {
            System.out.println("Error query " + ex.getMessage());
        } finally {
            sf.close();
        }
        return i;
    }

    private static SessionFactory factory;

    public String insertLibro(modeloLibro mLib) {
        String algo = "";
        factory = new Configuration().configure().buildSessionFactory();
        Session ss = factory.openSession();
        try {
            Transaction tx = ss.beginTransaction();

            ss.saveOrUpdate(mLib);
            tx.commit();

            algo = "Libro guardado correctamente.";
        } catch (Exception ex) {
            System.out.println("Error query " + ex.getMessage());
            return null;
        }
        return algo;
    }

    public String borrarLibro(modeloLibro mLib) {
        String algo = "";
        factory = new Configuration().configure().buildSessionFactory();
        Session ss = factory.openSession();
        try {
            Transaction tx = ss.beginTransaction();

            ss.delete(mLib);
            tx.commit();

            algo = "Libro Borrado";
        } catch (Exception ex) {
            System.out.println("Error query " + ex.getMessage());
            algo = "Error query " + ex.getMessage();
        } finally {

        }
        return algo;
    }

    public String updateLibro(modeloLibro mLib) {
        String algo = "";

        factory = new Configuration().configure().buildSessionFactory();
        Session ss = factory.openSession();

        try {
            Transaction tx = ss.beginTransaction();
            ss.update(mLib);
            tx.commit();

            algo = "Libro Actualizado !!! ";
        } catch (Exception ex) {
            System.out.println("Error query " + ex.getMessage());
            algo = "Error query " + ex.getMessage();
        } finally {

        }

        return algo;
    }

    public List<modeloLibro> todosLibros() {
        List<modeloLibro> lista = null;
        String algo = "";

        factory = new Configuration().configure().buildSessionFactory();
        Session ss = factory.openSession();
        Query query = ss.createSQLQuery("SELECT * FROM usuarios;");

        lista = query.list();
        return lista;
    }

    public List<modeloLibro> buscaLibros(String row, String param) {
        List<modeloLibro> listaLibros = new ArrayList<>();
        List lista = null;

        factory = new Configuration().configure().buildSessionFactory();
        Session ss = factory.openSession();
        Query query = ss.createSQLQuery("SELECT * FROM libro where " + row + " = " + param + ";");

        lista = query.list();

        if (!lista.isEmpty()) {
            Iterator iteraC = lista.iterator();
            while (iteraC.hasNext()) {
                Object[] tuple = (Object[]) iteraC.next();
                modeloLibro libro = new modeloLibro();/*
                    Integer.parseInt((String) tuple[0]), (String) tuple[1],
                    (String) tuple[2], (String) tuple[3],
                    (String) tuple[4], Integer.parseInt((String) tuple[5]),
                    (String) tuple[6], (Float) tuple[7],
                    Integer.parseInt((String) tuple[8]));*/
                libro.id_libro = (Integer) tuple[0];
                libro.isbn = (String) tuple[1];
                libro.titulo = (String) tuple[2];
                libro.autores = (String) tuple[3];
                libro.editorial = (String) tuple[4];
                libro.lugar_impresion = (String) tuple[5];
                libro.num_pag = (Integer) tuple[6];
                libro.idioma = (String) tuple[7];
                libro.precio = (Float) tuple[8];
                libro.ejemplares_disponibles = (Integer) tuple[9];
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }

    public List<modeloLibro> buscaLibroslLike(Map<String, String> parametros) {
        List<modeloLibro> listaLibros = new ArrayList<>();
        List lista = null;

        factory = new Configuration().configure().buildSessionFactory();
        Session ss = factory.openSession();

        String queryStr = "SELECT * FROM libro where ";

        for (String key : parametros.keySet()) {
            queryStr += key + " like \"%" + parametros.get(key) + "%\" and ";
        }
        Query query = ss.createSQLQuery(queryStr.substring(0, queryStr.length() - 4));

        lista = query.list();

        if (!lista.isEmpty()) {
            Iterator iteraC = lista.iterator();
            while (iteraC.hasNext()) {
                Object[] tuple = (Object[]) iteraC.next();
                modeloLibro libro = new modeloLibro();/*
                    Integer.parseInt((String) tuple[0]), (String) tuple[1],
                    (String) tuple[2], (String) tuple[3],
                    (String) tuple[4], Integer.parseInt((String) tuple[5]),
                    (String) tuple[6], (Float) tuple[7],
                    Integer.parseInt((String) tuple[8]));*/
                libro.id_libro = (Integer) tuple[0];
                libro.isbn = (String) tuple[1];
                libro.titulo = (String) tuple[2];
                libro.autores = (String) tuple[3];
                libro.editorial = (String) tuple[4];
                libro.lugar_impresion = (String) tuple[5];
                libro.num_pag = (Integer) tuple[6];
                libro.idioma = (String) tuple[7];
                libro.precio = (Float) tuple[8];
                libro.ejemplares_disponibles = (Integer) tuple[9];
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }

    public String loginInicio(String usuario, String pass) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Query query = sesion.createSQLQuery("select dato from prueba1.gente where nombre = '" + usuario + "';");
        String algo = "";
        List<String> i = query.list();

        if (i.size() <= 0) {
            algo = "vacio";
        } else {
            algo = "ingresar";
        }
        return algo;
    }

    public List<String> obtenerISBNLibrosUbicacion(String ubicacion) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Query query = sesion.createSQLQuery("SELECT DISTINCT registro_libro_isbn FROM libro WHERE ubicacion = '" + ubicacion + "' and estado='ACTIVO' ORDER BY registro_libro_isbn ASC;");
        List<String> i = query.list();
        return i;
    }

    public void darBaja(String ISBN, String motivo) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        String query = ("UPDATE libro SET estado = 'baja', motivo_devolucion = '" + motivo + "' WHERE (estado != 'vendido' OR estado != 'devuelto') AND registro_libro_isbn = '" + ISBN + "';");
        try {
            sesion.getTransaction().begin();
            sesion.createSQLQuery(query).executeUpdate();
            sesion.getTransaction().commit();
            sesion.close();
        } catch (HibernateException erro) {
            sesion.getTransaction().rollback();
            sesion.close();
        }
    }

    public void darDescuento(String isbn, Integer descuento, Integer id) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        String query = ("UPDATE libro SET descuento = " + descuento + ", tipo_venta = 'OFERTA' WHERE estado = 'ACTIVO' AND registro_libro_isbn = '" + isbn + "' and metodo_recibido_id_metodo_recibido = " + id + ";");
        try {
            sesion.getTransaction().begin();
            sesion.createSQLQuery(query).executeUpdate();
            sesion.getTransaction().commit();
            sesion.close();
        } catch (HibernateException erro) {
            sesion.getTransaction().rollback();
            sesion.close();
        }
    }

    public Integer cantidadEjemplares(String estado, String ISBN, String ubicacion, String condicion) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Query query = sesion.createSQLQuery("SELECT COUNT(id_libro)\n"
                + "FROM libro, metodo_recibido, registro_libro\n"
                + "WHERE\n"
                + "libro.metodo_recibido_id_metodo_recibido = metodo_recibido.id_metodo_recibido AND\n"
                + "libro.estado = '" + estado + "' AND\n"
                + "registro_libro.isbn = libro.registro_inventario_isbn AND\n"
                + "registro_libro.isbn = '" + ISBN + "' AND\n"
                + "libro.ubicacion = '" + ubicacion + "' AND\n"
                + "metodo_recibido.condicion = '" + condicion + "';");
        List<BigInteger> i = query.list();

        return i.get(0).intValue();
    }

    public Integer encontrarMenor(String ISBN, String ubicacion) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Integer i, j;
        String condicion;
        Query query;
        i = cantidadEjemplares("ACTIVO", ISBN, ubicacion, "CONSIGNACIÓN");
        if (i != 0) {
            condicion = "CONSIGNACIÓN";
        } else {
            condicion = "CONTADO";
        }
        query = sesion.createSQLQuery("SELECT MIN(libro.id_libro) FROM libro, metodo_recibido\n"
                + "WHERE\n"
                + "libro.metodo_recibido_id_metodo_recibido = metodo_recibido.id_metodo_recibido AND\n"
                + "libro.estado = 'ACTIVO' AND\n"
                + "registro_libro_isbn = '" + ISBN + "' AND\n"
                + "libro.ubicacion = '" + ubicacion + "' AND\n"
                + "metodo_recibido.id_metodo_recibido IN(SELECT id_metodo_recibido FROM metodo_recibido WHERE\n"
                + "fecha_recibido = (SELECT MIN(fecha_recibido) FROM metodo_recibido WHERE condicion = '" + condicion + "'));");
        j = (Integer) query.list().get(0);
        return j;
    }

    public Float obtenerDescuento(String isbn, Integer idMetodo) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Query query = sesion.createSQLQuery("SELECT MAX(descuento) FROM libro WHERE metodo_recibido_id_metodo_recibido = '" + idMetodo + "' AND registro_inventario_isbn = '" + isbn + "';");
        return ((Float) query.list().get(0));
    }

    public Integer cantidadEjemplares(String ubicacion) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Query query = sesion.createSQLQuery("SELECT COUNT(DISTINCT(registro_libro_isbn)) FROM libro WHERE ubicacion = '" + ubicacion + "'and estado='ACTIVO';");
        List<BigInteger> i = query.list();
        return i.get(0).intValue();
    }

    public Integer cantidadLocal(String isbn, String ubicacion, Integer id) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Query query = sesion.createSQLQuery("SELECT COUNT(*) FROM libro WHERE ubicacion = '" + ubicacion + "' and estado= 'ACTIVO' and metodo_recibido_id_metodo_recibido = " + id + " AND registro_inventario_isbn = '" + isbn + "';");
        return ((BigInteger) query.list().get(0)).intValue();
    }

    public List<String> obtenerISBNLibrosNoVendidos(String idMetodo) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Query query = sesion.createSQLQuery("SELECT DISTINCT(registro_inventario_isbn) FROM libro WHERE metodo_recibido_id_metodo_recibido = '" + idMetodo + "' AND estado = 'ACTIVO' ORDER BY registro_inventario_isbn ASC;");
        List<String> i = query.list();
        return i;
    }

    public List<String> obtenerISBNLibros(String idMetodo) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Query query = sesion.createSQLQuery("SELECT DISTINCT(registro_inventario_isbn) FROM libro WHERE metodo_recibido_id_metodo_recibido = '" + idMetodo + "' ORDER BY registro_inventario_isbn ASC;");
        List<String> i = query.list();
        return i;
    }

    public Integer calcularCantidadEjemplares(String isbn, Integer idMetodo, String estado) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Query query = sesion.createSQLQuery("SELECT COUNT(*) FROM libro WHERE metodo_recibido_id_metodo_recibido = '" + idMetodo + "' AND registro_inventario_isbn = '" + isbn + "' AND estado = '" + estado + "';");
        return ((BigInteger) query.list().get(0)).intValue();
    }

    public void devolverLibros(String isbn, Integer id) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        String query = ("UPDATE libro SET estado = 'DEVUELTO', motivo_devolucion = 'CONSIGNACIÓN' WHERE estado = 'ACTIVO' AND registro_libro_isbn = '" + isbn + "' and metodo_recibido_id_metodo_recibido = " + id + ";");
        try {
            sesion.getTransaction().begin();
            sesion.createSQLQuery(query).executeUpdate();
            sesion.getTransaction().commit();
            sesion.close();
        } catch (HibernateException erro) {
            sesion.getTransaction().rollback();
            sesion.close();
        }
    }

    public void devolverLibro(String isbn, Integer id) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        String query = ("UPDATE libro SET estado = 'DEVUELTO', motivo_devolucion = 'DEFECTO' WHERE id_libro = (SELECT MIN(id_libro)) AND estado = 'ACTIVO' AND registro_libro_isbn = '" + isbn + "' and metodo_recibido_id_metodo_recibido = " + id + ";");
        try {
            sesion.getTransaction().begin();
            sesion.createSQLQuery(query).executeUpdate();
            sesion.getTransaction().commit();
            sesion.close();
        } catch (HibernateException erro) {
            sesion.getTransaction().rollback();
            sesion.close();
        }
    }

    public List<String> obtenerMotivoISBNLibros(Integer id) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Query query = sesion.createSQLQuery("SELECT motivo_devolucion FROM libro WHERE estado = 'DEVUELTO' AND metodo_recibido_id_metodo_recibido = " + id + ";");
        List<String> i = query.list();
        return i;
    }

    public void distribuir(Integer id, String ubicacion) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        String query = ("UPDATE libro SET ubicacion = '" + ubicacion + "' WHERE id_libro = " + id + ";");
        try {
            sesion.getTransaction().begin();
            sesion.createSQLQuery(query).executeUpdate();
            sesion.getTransaction().commit();
            sesion.close();
        } catch (HibernateException erro) {
            sesion.getTransaction().rollback();
            sesion.close();
        }
    }
}
