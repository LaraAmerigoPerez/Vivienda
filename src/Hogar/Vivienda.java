/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author Lara Amerigo Perez
 */

/**
 * Clase Vivienda que contiene las propiedades y metodos de una vivienda
 * 
 */
public class Vivienda {
/**
 * variables de la clase vivienda
 */
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;

    /**
     * Metodo constructor de tipo double 
     *
     * @param precio de la vivienda
     */
    public Vivienda(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo para actualizar el precio de la vivienda
     *
     * @param descuento
     */
    public void actualizarPrecio(double descuento) {
        setPrecio(getPrecio() - getPrecio() * descuento);
    }

    /**
     * Metodo Getter para el precio de la vivienda
     *
     * @return
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Metodo Setter para cambiar la superficie
     * @param superficie 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Metodo Getter para el numero de habitaciones de la vivienda
     *
     * @return
     */

    public int getNumHabitaciones() {
        return numHabitaciones;
    }
        /**
     * Metodo Setter para el numero de habitaciones
     * @param superficie 
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    /**
     * Metodo Getter para la superficie de la vivienda
     *
     * @return
     */

    public double getSuperficie() {
        return superficie;
    }
    /**
     * Metodo Setter para cambiar la superficie
     * @param superficie 
     */

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    /**
     * Metodo Getter para el parking de la vivienda
     *
     * @return 
     */

    public boolean getParking() {
        return parking;
    }
    /**
     * Metodo Setter para el parking
     * @param parking 
     */

    public void setParking(boolean parking) {
        this.parking = parking;
    }
    /**
     * Metodo Getter para el Estado de la vivienda
     *
     * @return 
     */

    public String getEstado() {
        return estado;
    }
    /**
     * Metodo Setter para cambiar el estado
     * @param estado 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * Metodo Getter para el precio de la vivienda
     *
     * @return
     */
    public String getPropietario() {
        return propietario;
    }
    
    /**
     * Metodo Setter para cambiar el propietario
     * @param propietario 
     */

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     * Metodo imprimirVivienda() para imprimir por pantalla los valores de la casa
     *
     * @param casa
     */
    public void imprimirVivienda(Vivienda casa) {
        System.out.println("Precio: " + casa.getPrecio());
        System.out.println("Numero de habitaciones: " + casa.getNumHabitaciones());
        System.out.println("Propietario: " + casa.getPropietario());
        System.out.println("Superficie en m2: " + casa.getSuperficie());
        System.out.println("¿Dispone de parking?: " + casa.getParking());
        System.out.println("Estado: " + casa.getEstado());
    }

    /**
     * Metodo constructor que contiene como parametros todas las propiedades de la clase Vivienda
     *
     * @param precio
     * @param numHabitaciones
     * @param superficie
     * @param parking
     * @param estado
     * @param propietario
     */
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }

}
