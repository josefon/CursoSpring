package es.josefon.vetclub1;
// Generated 17-ene-2017 0:46:30 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Actores generated by hbm2java
 */
public class Actores  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String apellidos;
     private Date fechaNacimiento;

    public Actores() {
    }

    public Actores(String nombre, String apellidos, Date fechaNacimiento) {
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.fechaNacimiento = fechaNacimiento;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }




}


