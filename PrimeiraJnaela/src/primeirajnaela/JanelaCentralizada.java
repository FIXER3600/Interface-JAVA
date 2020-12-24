/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeirajnaela;
import javax.swing.*;
public class JanelaCentralizada extends JFrame{
    public JanelaCentralizada(){
        super("Janela Centralizada");
        setSize(300,150);
        setVisible(true);
        setLocationRelativeTo(null);
    }
public static void main(String args[]){
    JanelaCentralizada app = new JanelaCentralizada();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
