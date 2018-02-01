package Modelo;

public class modeloUsuario  
implements java.io.Serializable {

     public Integer id_usuario;
     public String nombre;
     public String cargo;
     public String contrasena;
     public String tipo_usuario;

    public modeloUsuario() {
    }

    public modeloUsuario(Integer id_usuario, String nombre, String cargo, String contrasena, String tipo_usuario) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.cargo = cargo;
        this.contrasena = contrasena;
        this.tipo_usuario = tipo_usuario;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

      
    }

   
     


