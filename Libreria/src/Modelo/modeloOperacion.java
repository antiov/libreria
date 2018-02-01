package Modelo;

import java.util.Date;

public class modeloOperacion  implements java.io.Serializable {

     public Integer id_operacion;
     public String tipo_op;
     public Date fecha_recibido;
     public String libro_isbn;
     public Integer usuarios_id_usuario;

    public modeloOperacion() {
    }

    public Integer getIdOper() {
        return id_operacion;
    }

    public void setIdOper(Integer id_operacion) {
        this.id_operacion = id_operacion;
    }

    public String getTipoOper() {
        return tipo_op;
    }

    public void setTipoOper(String tipo_op) {
        this.tipo_op = tipo_op;
    }

    public Date getFechaRecibido() {
        return fecha_recibido;
    }

    public void setFechaRecibido(Date fecha_recibido) {
        this.fecha_recibido = fecha_recibido;
    }

    public String getLibroISBN() {
        return libro_isbn;
    }

    public void setLibroISBN(String libro_isbn) {
        this.libro_isbn = libro_isbn;
    }

    public Integer getUsuariosID() {
        return usuarios_id_usuario;
    }

    public void setUsuariosID(Integer usuarios_id_usuario) {
        this.usuarios_id_usuario = usuarios_id_usuario;
    }


}


