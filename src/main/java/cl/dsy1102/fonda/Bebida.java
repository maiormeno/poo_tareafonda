package cl.dsy1102.fonda;

public abstract class Bebida {
    private String nombre;
    private int volumenML;
    private int stock;
    private boolean activo;


    public Bebida(String nombre, int volumenML, int stock, boolean activo) {
        this.nombre = nombre;
        this.volumenML = volumenML;
        this.stock = stock;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVolumenML() {
        return volumenML;
    }

    public void setVolumenML(int volumenML) {
        this.volumenML = volumenML;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
