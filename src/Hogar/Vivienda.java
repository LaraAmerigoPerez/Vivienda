/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author paqui
 */
public class Vivienda {

    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;

    public Vivienda(double precio) {
        this.precio = precio;
    }

    public void actualizarPrecio(double descuento) {
        setPrecio(getPrecio() - getPrecio() * descuento);
    }

    //primero creo los metodos getters and setters de todas las propiedades.
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void imprimirVivienda(Vivienda casa) {
        System.out.println("Precio: " + casa.getPrecio());
        System.out.println("Numero de habitaciones: " + casa.getNumHabitaciones());
        System.out.println("Propietario: " + casa.getPropietario());
        System.out.println("Superficie en m2: " + casa.getSuperficie());
        System.out.println("¿Dispone de parking?: " + casa.isParking());
        System.out.println("Estado: " + casa.getEstado());
    }

    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    

}
