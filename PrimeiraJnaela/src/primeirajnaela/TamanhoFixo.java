/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeirajnaela;

import javax.swing.*;
public class TamanhoFixo extends JFrame{
    public TamanhoFixo(){
        super("Uma janela não dimensionável");
        setResizable(false);
        setSize(300,150);
        setVisible(true);
    }
public static void main(String args[]){
    TamanhoFixo app = new TamanhoFixo();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
        
}
}

