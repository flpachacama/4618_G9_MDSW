/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Requisitos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*Administrador -> Ingresar usuario y contraseña 
  Administrador -> Ingresar datos personales de los empleados
  Administrador -> Archivar datos de los equipos
  Asministrador -> Mostrar en pantalla todos los equipos que participan.
I Usuarios -> Indicar los datos de todos los participantes*/
public class Administrador {
    private static Administrador admin=new Administrador();
    private  static Usuario usuario=new Usuario();
    private static  Scanner teclado=new Scanner(System.in);
    private static String cadena=new String("");

    public Administrador() {
    }

    public void grabarArchivo(String dato){
        
        try{//excepcion tipo chequet = obligatoria(arnes)
            FileWriter fw=new FileWriter("usuario.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
                bw.write(dato + "\t\n");
        }catch(IOException e){
            //throw e;

       }
        
    }
       public void ingresarDatos(){
        String auxiliar="";
        auxiliar= teclado.nextLine();
        try{//excepcion tipó uncheket = no obligatoria
            
            System.out.println("Usuario: ");
            usuario.setUsuario(teclado.nextLine());
            System.out.println("Contraseña: ");
            usuario.setContraseña(teclado.nextLine()); 
            System.out.println("Nombre: ");
            usuario.setNombre(teclado.nextLine());
            System.out.println("Apellido: ");
            usuario.setApellido(teclado.nextLine());
            System.out.println("Cedula: ");
            usuario.setCedula(teclado.nextLine());
            System.out.println("Correo: ");
            usuario.setCorreo(teclado.nextLine());
            System.out.println("Direccion: ");
            usuario.setDireccion(teclado.nextLine());
        }catch(Exception io){
            System.out.println("ERROR REVISAR: " + io.getMessage());
            throw io;
        }
        auxiliar= teclado.nextLine();
        System.out.println("Datos ingresados: "+usuario.getUsuario()+usuario.getContraseña()+usuario.getNombre()+usuario.getApellido()+usuario.getCedula()+usuario.getCorreo()+usuario.getDireccion());
    } 
       public void leerArchivo(){
        try{
            File archivo=new File("usuarios.txt");
            FileReader fr=new FileReader(archivo);
            BufferedReader br=new BufferedReader(fr);
            String registro;
            //registro=juguetes.getCodJuguete()+"\t"+juguetes.getNombreJuguete()+"\n";
            registro=usuario.getUsuario()+"\t"+usuario.getContraseña()+"\t"+usuario.getNombre()+"\t"+usuario.getApellido()+"\t"+usuario.getCedula()+"\t"+usuario.getCorreo()+"\t"+usuario.getDireccion()+"\n";
            while((registro=br.readLine()) != null){
                System.out.println(registro);
            }
        }catch(IOException io){
            System.out.println("Error:"+io.getMessage());
                    
        }
    } 
    
     public static void main(String[] args){
        String enviarDatos= new String(""); 
        int opciones=0;
        while(opciones!=7){
            //juguetes.getCodJuguete()+juguetes.getNombreJuguete();
            System.out.println("1.-Ingresar Datos");
            System.out.println("2.-Leer Archivo");
            System.out.println("3.-Grabar Archivo");
            System.out.println("7.- SALIR");
            
            opciones=teclado.nextInt();
            
            switch(opciones){
                case 1 -> admin.ingresarDatos();
                case 2 -> admin.leerArchivo();
                case 3 -> {
                    System.out.println("guarda");
                    cadena=usuario.getUsuario()+"\t"+usuario.getContraseña()+"\t"+usuario.getNombre()+"\t"+usuario.getApellido()+"\t"+usuario.getCedula()+"\t"+usuario.getCorreo()+"\t"+usuario.getDireccion()+"\n";
                    System.out.println("cadena:"+cadena);
                    admin.grabarArchivo(cadena);
                }
            }
        }
    }
    
}
