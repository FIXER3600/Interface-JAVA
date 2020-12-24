/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipotriangulo;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TipoTriangulo extends JFrame {
JLabel rot1,rot2,rot3,exib,exib2,exib3,exib4;
JTextField tex1,tex2,tex3;
JButton med;
   public TipoTriangulo(){
    super("Tipo de Triângulo");
Container tela = getContentPane();
setLayout(null);
rot1 = new JLabel("Lado 1:");
rot2 = new JLabel("Lado 2:");
rot3 = new JLabel("Lado 3:");
med = new JButton("Tipo desse Triângulo");
tex1 = new JTextField(5);
tex2 = new JTextField(5);
tex3 = new JTextField(5);
exib = new JLabel("");

rot1.setBounds(50,20,150,20);
        rot2.setBounds(50,60,150,20);
        tex1.setBounds(180,20,200,20);
        tex2.setBounds(180,60,200,20);
        tex3.setBounds(180,100,200,20);
        rot3.setBounds(50,100,100,20);
        exib.setBounds(50,200,300,20);
        med.setBounds(50,140,300,20);
        
        med.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double num1,num2,num3;
                num1=0;
                num2=0;
                num3=0;
                num1 = Double.parseDouble(tex1.getText());
                num2 = Double.parseDouble(tex2.getText());
                num3 =  Double.parseDouble(tex3.getText());
           
              if ((num3 < num1+num2) && (num2 < num3+num1) && (num1 < num3+num2)){
         if ((num1 == num2) && (num2 == num3)){
            exib.setText("Triângulo Equilátero");          
         }
         else{
            if ((num1 != num2) && (num2 != num3) && (num3 != num1)){
              exib.setText("Triângulo Escaleno");              
            }
            else{
               exib.setText("Triângulo Isóceles");     
            }
         }
      }
      else{
         exib.setText("NÃO é um triângulo");
      }
        exib.setVisible(true);
            
            }
        
});
       
        
        tela.add(rot1);
        tela.add(rot2);
        tela.add(tex1);
        tela.add(tex2);
        tela.add(rot3);
       tela.add(tex3);
        tela.add(exib);
        tela.add(med);
        setSize(400,300);
        setVisible(true);
   }
    public static void main(String[] args) {
       TipoTriangulo app = new TipoTriangulo();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // TODO code application logic here
    }
    
}
