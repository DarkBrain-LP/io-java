/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;
import java.io.Serializable;
import java.io.File;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class Game implements Serializable{
    private String gamaeName, gameStyle;
    private int productionYear;
    private transient Notice notice;

    public Game(String gamaeName, String gameStyle, int productionYear) {
        this.gamaeName = gamaeName;
        this.gameStyle = gameStyle;
        this.productionYear = productionYear;
        this.notice = new Notice("English");
    }

    @Override
    public String toString() {
        return "Game{" + "gamaeName=" + gamaeName + ", gameStyle=" + gameStyle + ", productionYear=" + productionYear + ", notice=" + notice + '}';
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
       ObjectInputStream ois;
       ObjectOutputStream oos;
       
       try{
           oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("game"))));
           oos.writeObject(new Game("Fifa20", "FootBall", 2020));
           oos.writeObject(new Game("Fifa19", "FootBall", 2019));
           oos.writeObject(new Game("Fifa18", "FootBall", 2018));
           oos.close();
           
           ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("game"))));
           
           try{
               System.out.println(((Game)ois.readObject()).toString());
               System.out.println(((Game)ois.readObject()).toString());
               System.out.println(((Game)ois.readObject()).toString());
               System.out.println(((Game)ois.readObject()).toString());
           } catch(IOException e){
               System.out.println("There are not others games : ");
               e.printStackTrace();
           }
        
       } catch(IOException e){
           e.printStackTrace();
       }
       
        
    }
    
}
