package Modelo;

import java.util.Date;

public class modeloOperacion  implements java.io.Serializable {

     public Integer id_operacion;
     public String tipo_op;
     public Date fecha_recibido;
     public String libro_isbn;
     public Integer libro_id_libro;
     public Integer usuarios_id_usuario;

    public modeloOperacion() {
    }

    public modeloOperacion(Integer id_operacion, String tipo_op, Date fecha_recibido, String libro_isbn, Integer libro_id_libro, Integer usuarios_id_usuario) {
        this.id_operacion = id_operacion;
        this.tipo_op = tipo_op;
        this.fecha_recibido = fecha_recibido;
        this.libro_isbn = libro_isbn;
        this.libro_id_libro = libro_id_libro;
        this.usuarios_id_usuario = usuarios_id_usuario;
    }

    public Integer getLibro_id_libro() {
        return libro_id_libro;
    }

    public void setLibro_id_libro(Integer libro_id_libro) {
        this.libro_id_libro = libro_id_libro;
    }


    public Integer getId_operacion() {
        return id_operacion;
    }

    public void setId_operacion(Integer id_operacion) {
        this.id_operacion = id_operacion;
    }

    public String getTipo_op() {
        return tipo_op;
    }

    public void setTipo_op(String tipo_op) {
        this.tipo_op = tipo_op;
    }

    public Date getFecha_recibido() {
        return fecha_recibido;
    }

    public void setFecha_recibido(Date fecha_recibido) {
        this.fecha_recibido = fecha_recibido;
    }

    public String getLibro_isbn() {
        return libro_isbn;
    }

    public void setLibro_isbn(String libro_isbn) {
        this.libro_isbn = libro_isbn;
    }

    public Integer getUsuarios_id_usuario() {
        return usuarios_id_usuario;
    }

    public void setUsuarios_id_usuario(Integer usuarios_id_usuario) {
        this.usuarios_id_usuario = usuarios_id_usuario;
    }

}


