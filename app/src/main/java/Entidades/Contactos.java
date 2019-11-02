package Entidades;

public class Contactos {
    private String nombre;
    private String apellido;
    private int telefono1;
    private int telefono2;
    private int Favorito;

    /*public Contactos(){}
    public Contactos(String nombre, String apellido, int telefono1, int telefono2, int favorito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        Favorito = favorito;
    }*/

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono1() {
        return telefono1;
    }

    public int getTelefono2() {
        return telefono2;
    }

    public int getFavorito() {
        return Favorito;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono1(int telefono1) {
        this.telefono1 = telefono1;
    }

    public void setTelefono2(int telefono2) {
        this.telefono2 = telefono2;
    }

    public void setFavorito(int favorito) {
        Favorito = favorito;
    }
}
