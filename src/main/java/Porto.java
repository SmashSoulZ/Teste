
import java.util.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI Gaming kakaka
 */
public class Porto {
        List<navio> navios;
        
        public Porto(){
        navios = new ArrayList<>();
        
    }
        public void imprimirNavios(){
        for (navio n: navios){
           System.out.println("Navio- "+n.nome);
            System.out.println("neca");
        }
    }
}
