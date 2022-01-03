/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.File;
import java.util.Arrays;
/**
 *
 * @author LENOVO
 */
public class Io {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creation d'objet File
        File f = new File("test.txt");
        System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
        System.out.println("Nom du fichier : " + f.getName());
        System.out.println("Existence de fichier : " + f.exists());
        System.out.println("Type repertoir : " + f.isDirectory());
        System.out.println("Type fichier : " + f.isFile());
        
        
        System.out.println(Arrays.toString(f.listRoots()));
        
        System.out.println("\nAffichage des lecteurs a la racine du PC : ");
        for(File file : File.listRoots()){
            System.out.println(file.getAbsolutePath());
            try{
                int i = 1;
                // Parcours de la liste des fichiers et repertoires
                for(File nom : file.listFiles()){
                    //S'il s'agit d'un dossier, on ajoute un "/"
                    System.out.print("\t\t" + ((nom.isDirectory())? nom.getName() + "/" : nom.getName()));
                    
                    
                    if((i%5) == 0)
                        System.out.println("\n");
                    i++;
                }
            } catch(NullPointerException e){
                
            }
        }
        
    }
    
}
