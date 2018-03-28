package pe.bazan.jhosep.com.comidaapp.models;

/**
 * Created by Alumno on 27/03/2018.
 */

public class Comida {

    private Integer id;
    private String name;
    private String categoria;
    private String precio;
    private String tiempo;
    private String imagen;

    public Comida(){
    }

    public Comida(Integer id, String name, String categoria, String precio, String tiempo, String imagen) {
        this.id = id;
        this.name = name;
        this.categoria = categoria;
        this.precio = precio;
        this.tiempo = tiempo;
        this.imagen = imagen;

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPrecio() {
        return precio;
    }

    public String getTiempo() {
        return tiempo;
    }

    public String getImagen() { return imagen; }

    @Override
    public String toString() {
        return "Comida(" +
                "id =" + id +
                ",name =" + name + '\'' +
                ",categoria =" + categoria + '\'' +
                ",precio =" + precio + '\'' +
                ",tiempo =" + tiempo + '\'' +
                ",imagen =" + imagen + '\'' +
                ')';

    }
}
