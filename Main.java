/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package p61.bridge;


/**
 *
 * @author Mauricio Ortiz
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        bridge();
    }
    
    
    public static void bridge(){
        System.out.println("Bridge");
        var inscripcion1 = new InscripcionGrado(new InscripcionPresencialImpl());
        inscripcion1.setNivelEstudio(NivelEstudio.GRADO);
        if(inscripcion1.controlNivelEstudio()){
            inscripcion1.inscribir();
        }
        else{
            System.out.println("No es posible inscribir al estudiante");
        }

        var inscripcion2 = new InscripcionTecnologia(new InscripcionMovilImpl());
        inscripcion2.setNivelEstudio(NivelEstudio.TECNOLOGIA);
        if(inscripcion2.controlNivelEstudio()){
            inscripcion2.inscribir();
        }
        else{
            System.out.println("No es posible inscribir al estudiante");
        }

        var inscripcion3 = new InscripcionPosgrado(new InscripcionLineaImpl());
        inscripcion3.setNivelEstudio(NivelEstudio.POSGRADO);
        if(inscripcion3.controlNivelEstudio()){
            inscripcion3.inscribir();
        }
        else{
            System.out.println("No es posible inscribir al estudiante");
        }
        
        
    }
    
    
}
