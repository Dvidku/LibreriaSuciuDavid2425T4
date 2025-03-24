/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LibreriaSuciuDavid2425T4;
/**
 *
 * @author david
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        miLibreriaSuciuDavid2425T4 miLibreriaSuciuDavid2425T4;
        String x;
        int stock;
        int num;
        double dinero;
        double saldoActual;
        double ingreso;
        
        
        miLibreriaSuciuDavid2425T4 = new miLibreriaSuciuDavid2425T4("Don Quijote de la Mancha", 10, 45, 120);

        compraQuijoteSuciuDavid2425T4(miLibreriaSuciuDavid2425T4);
        
        saldoActual = miLibreriaSuciuDavid2425T4.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de "+ saldoActual );        
        x = miLibreriaSuciuDavid2425T4.obtenerNombre();
        stock = miLibreriaSuciuDavid2425T4.obtenerStock();
        System.out.println("El libro "+x+" tiene un stock de "+stock+" unidades");
        
        añadeIngresoSuciuDavid2425T4(miLibreriaSuciuDavid2425T4, "Libro Vendido");
    }

    /**
     * Método para añadir un ingreso al saldo de la librería 
     * @param miLibreriaSuciuDavid2425T4 
     * @param concepto Concepto del ingreso
     */
    private static void añadeIngresoSuciuDavid2425T4(miLibreriaSuciuDavid2425T4 miLibreriaSuciuDavid2425T4, String concepto) {
        double ingreso;
        double saldoActual;
        try
        {
            ingreso = 30.5;
            miLibreriaSuciuDavid2425T4.aumentarSaldo(ingreso);
            saldoActual = miLibreriaSuciuDavid2425T4.obtenerSaldo();
            System.out.println("Tu saldo actual después de ingresar es de "+saldoActual+"€");
        } catch (Exception e)
        {
            System.out.println("Fallo al obtener el saldo al ingresar");
        }
    }
    
    /**
     * Método para comparar un libro y actualizar el saldo y stock
     * @param miLibreriaSuciuDavid2425T4 
     */

    private static void compraQuijoteSuciuDavid2425T4(miLibreriaSuciuDavid2425T4 miLibreriaSuciuDavid2425T4) {
        String x;
        int num;
        double dinero;
        double saldoActual;
        try
        {
            x = "Don Quijote de la Mancha";
            num = 2;    //Número de ejemplares a comprar
            dinero = miLibreriaSuciuDavid2425T4.obtenerPrecio();
            saldoActual = miLibreriaSuciuDavid2425T4.obtenerSaldo();
            System.out.println("El libro "+x+" vale "+dinero+"€");
            System.out.println("Tu saldo actual es de "+saldoActual+"€");
            miLibreriaSuciuDavid2425T4.comprarLibro(num);
        } catch (Exception e)
        {
            System.out.println("Error en la compra del libro");
        }
    }
}
