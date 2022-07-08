/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registro;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author SUPERTRONICA
 */
public class Administrador {
    private static Administrador administrador = new Administrador();
    private static Atributos atributos = new Atributos();
    private static Scanner teclado = new Scanner(System.in);
    private static String cadena = new String("");
    //
    public void iniciarSecion(){
        String auxiliar="";
        auxiliar=teclado.nextLine();
        try{
            System.out.println("Usuario: ");
            atributos.setUsuario(teclado.nextLine());
            System.out.println("Contraseña: ");
            atributos.setContraseña(teclado.nextLine());
            
    }catch(Exception io){
            System.err.println("Error Revisar;"+io.getMessage());
            throw io;
        
    }
    
  }
    public void crearCuenta(String email){
        String auxiliar = "";
        auxiliar =teclado.nextLine();
        try{
            System.out.println("Nombre: ");
            atributos.setNombre(teclado.nextLine());
            System.out.println("Apellido: ");
           // Pattern pattern = Pattern.compile();
            //Matcher mather = pattern.macher(email);
           
            atributos.setApellido(teclado.nextLine());
            System.out.println("Correo electronico: ");
            atributos.setCorreoElectronico(teclado.nextLine());
            System.out.println("Contraseña Nueva: ");
            atributos.setContraseñaNueva(teclado.nextLine());
            System.out.println("Fecha de Nacimiento: ");
            atributos.setFechaNacimiento(teclado.nextLine());
            System.out.println("Sexo: ");
            atributos.setSexo(teclado.nextLine());
          
        }catch(Exception io){
            System.out.println("Error revisar"+ io.getMessage());
            throw io;
        }
        }
    //return mather.find();
        public boolean ValidarEmail(String email) {
        // Patron para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }
    public static void main(String[] args){
        String enviarDatos= new String("");
        int opciones=0;
        while(opciones!=4){
            System.out.println("1.- Iniciar sesion");
            System.out.println("2.-Crear cuenta");
            System.out.println("3.-Validar email");
            System.out.println("4.- Salir");
            opciones=teclado.nextInt();
            
        switch(opciones){
                
            case 1-> administrador.iniciarSecion();
            case 2-> administrador.crearCuenta(teclado.nextLine());
            case 3-> {
                    System.out.println("Validar email");
                    administrador.ValidarEmail(" ");
        if(administrador.ValidarEmail("aprendiendoscrum@2019gmail.com")){
            JOptionPane.showMessageDialog(null, "correcto");
            
        }else{
            JOptionPane.showMessageDialog(null, "Incorrecto");
         }
        }
       }
     }
    }
        
  }
    
    
