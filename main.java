/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package p61;

import p61.adapter.Adapter;
import p61.bridge.InscripcionGrado;
import p61.bridge.InscripcionPresencialImpl;
import p61.bridge.NivelEstudio;
import p61.composite.Circulo;
import p61.composite.Dibujo;
import p61.composite.Linea;
import p61.decorator.NotificacionConEmail;
import p61.decorator.NotificacionDecorator;
import p61.decorator.NotificacionHTML;
import p61.facade.PersonaFacade;
import p61.facade.TipoPersona;

/**
 *
 * @author Mauricio Ortiz
 */
public class PdsUnidad02Ooms {

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
        
        
    }
    
    
}
