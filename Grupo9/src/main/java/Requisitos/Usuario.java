/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Requisitos;

/*Administrador -> Ingresar usuario y contraseña 
  Administrador -> Ingresar datos personales de los empleados
  Administrador -> Archivar datos de los equipos
  Asministrador -> Mostrar en pantalla todos los equipos que participan.
I Usuarios -> Indicar los datos de todos los participantes*/
public class Usuario {
    //
    private String usuario;
    private String contraseña;
    private String Nombre;
    private String Apellido;
    private String Cedula;
    private String correo;
    private String Direccion;
    

    public Usuario(){
    }
    public Usuario(String usuario) {
        this.usuario = usuario;
    }
    

    public Usuario(String usuario, String contraseña, String Nombre, String Apellido, String Cedula, String correo, String Direccion) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.correo = correo;
        this.Direccion = Direccion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
 
    
}
