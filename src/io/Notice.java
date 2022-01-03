/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

/**
 *
 * @author LENOVO
 */
public class Notice {
    String language;

    public Notice(String language) {
        this.language = language;
    }

    public Notice() {
        this.language = "French";
    }

    @Override
    public String toString() {
        return "Notice{" + "language=" + language + '}';
    }
    
    
}
