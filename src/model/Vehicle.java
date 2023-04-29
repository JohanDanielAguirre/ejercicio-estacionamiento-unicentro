package model;

public class Vehicle {
    private String placa;
    private String cedula;
    public Vehicle(String placa, String cedula) {
        this.placa = placa;
        this.cedula = cedula;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
