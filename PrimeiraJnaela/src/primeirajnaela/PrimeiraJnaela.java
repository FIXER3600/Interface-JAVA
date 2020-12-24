/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeirajnaela;

import java.awt.Container;
import javax.swing.*;
public class PrimeiraJnaela extends JFrame{
public PrimeiraJnaela(){
super("Exercícios");
JButton rotulo1,rotulo2,rotulo3,rotulo4;
Container tela = getContentPane();
		setLayout(null);
rotulo1 = new JButton ("Exercício 1");
		rotulo2 = new JButton ("Exercício 2");
		rotulo3 = new JButton ("Exercício 3");
		rotulo4 = new JButton ("Exercício 4");
setSize(300, 150);
setVisible(true); }
public static void main(String args[]){
PrimeiraJnaela app = new PrimeiraJnaela();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); } }


