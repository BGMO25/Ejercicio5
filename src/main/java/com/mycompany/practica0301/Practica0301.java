/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica0301;

/**
 *
 * @author SAIDA
 */
public class Practica0301 {

     public static void main(String[] args) {
        
        
        
        var ventanaBorderLayout = new Panel1("BorderLayout", 400, 120, 0, 0);
        ventanaBorderLayout.setVisible(true);
        
        var ventanaGridLayout = new Panel2("GridLayout", 220, 150, 450, 0);
        ventanaGridLayout.setVisible(true);
        
        var ventanaFlowLayout = new Panel3("FlowLayout", 400, 100, 700, 0);
        ventanaFlowLayout.setVisible(true);
        
        var ventananoruega = new Panel4("BorderLayout", 500, 220, 500,200 );
        ventananoruega.setVisible(true);
    }
}