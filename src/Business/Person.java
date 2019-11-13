/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Kenneth
 */
public class Person {

    public Person(int typeUser, String nombre, String cedula, String apellido, String SegundoApellido, String nacimiento) {
        this.typeUser = typeUser;
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
        this.SegundoApellido = SegundoApellido;
        this.nacimiento = nacimiento;
    }

    public int getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(int typeUser) {
        this.typeUser = typeUser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String SegundoApellido) {
        this.SegundoApellido = SegundoApellido;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
    private int typeUser;
    private String nombre;
    private String cedula;
    private String apellido;
    private String SegundoApellido;
    private String nacimiento;
}