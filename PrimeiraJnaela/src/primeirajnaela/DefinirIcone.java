/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeirajnaela;

import javax.swing.*;
public class DefinirIcone extends JFrame {
    public DefinirIcone(){
        super("Como definir o ícone para a janela");
        ImageIcon icone = new ImageIcon("src/primeirajnaela/th.jpg");
        setIconImage(icone.getImage());
        setSize(300,150);
        setVisible(true);
    }
public static void main(String args[]){
    DefinirIcone app = new DefinirIcone();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
