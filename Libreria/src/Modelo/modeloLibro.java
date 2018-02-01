package Modelo;

public class modeloLibro  implements java.io.Serializable {

     public String isbn;
     public String titulo;
     public String autores;
     public String editorial;
     public String lugar_impresion;
     public Integer num_pag;
     public String idioma;
     public Integer precio;
     public Integer ejemplares_disponibles;

    public modeloLibro() {
    }

    public modeloLibro(String isbn, String titulo, String autores, String editorial, String lugar_impresion, Integer num_pag, String idioma, Integer precio, Integer ejemplares_disponibles) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        this.lugar_impresion = lugar_impresion;
        this.num_pag = num_pag;
        this.idioma = idioma;
        this.precio = precio;
        this.ejemplares_disponibles = ejemplares_disponibles;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getLugar_impresion() {
        return lugar_impresion;
    }

    public void setLugar_impresion(String lugar_impresion) {
        this.lugar_impresion = lugar_impresion;
    }

    public Integer getNum_pag() {
        return num_pag;
    }

    public void setNum_pag(Integer num_pag) {
        this.num_pag = num_pag;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getEjemplares_disponibles() {
        return ejemplares_disponibles;
    }

    public void setEjemplares_disponibles(Integer ejemplares_disponibles) {
        this.ejemplares_disponibles = ejemplares_disponibles;
    }

   

}


