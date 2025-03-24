/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibreriaSuciuDavid2425T4;
/**
 *
 * @author david
 */
public class miLibreriaSuciuDavid2425T4 {
    private String nom;
    private int cantidad;
    private double precio;
    private double saldo;
    //Constructor sin argumentos
    public miLibreriaSuciuDavid2425T4(){}
    //constructor con parámetros para inicializar todas las propiedades de la clase
    public miLibreriaSuciuDavid2425T4(String nom, int cantidad, double precio, double saldo){
        this.nom = nom;                 //Nombre del libro
        this.cantidad = cantidad;       //Cantidad de ejemplares que hay en stock
        this.precio = precio;           //Precio unitario del libro
        this.saldo = saldo;             //Saldo en la cuenta de la librería
    }
    //Método que devuelve el nombre del libro
    public String obtenerNombre(){
        return getNom();
    }
    //Método que devuelve el precio del libro
    public double obtenerPrecio(){
        return getPrecio();
    }
    //Método que devuelve la cantidad de libros de ese ejemplar que quedan para vender
    public int obtenerStock(){
        return getCantidad();
    }
    //Método para obtener el saldo en la cuenta
    public double obtenerSaldo(){
        return getSaldo();
    }
    //Método para aumentar el saldo
    public void aumentarSaldo(double saldomas) throws Exception{
        if (saldomas<0)
            throw new Exception("No se puede sacar dinero de la cuenta de la librería");
        setSaldo(getSaldo() + saldomas);
    }
    //Método para comprar un ejemplar de un libro, actualiza el stock y el saldo
    public void comprarLibro(int canti) throws Exception{
        if (canti <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa de libros");
        setCantidad(getCantidad() - canti);
        if (getSaldo() <= getPrecio())
            throw new Exception ("No hay suficiente saldo para comprar");
        setSaldo(getSaldo() - getPrecio());
    }

    
    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
