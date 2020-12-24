package calculadora4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculadora4 extends JFrame{
JLabel rot1,rot2,exib;
JTextField tex1,tex2,res;
 JRadioButton somar,subt,div,multi, rest;
 ButtonGroup grupo;
 JButton Calcular;
public Calculadora4(){
super("Calculadora");
Container tela = getContentPane();
setLayout(null);
rot1 = new JLabel("N1:");
rot2 = new JLabel("N2:");
tex1 = new JTextField(5);
tex2 = new JTextField(5);
res = new JTextField(5);
somar = new JRadioButton("Somar(+)");
        subt = new JRadioButton("Subtrair(-)");
        multi = new JRadioButton("Multiplicação (*)");
        div = new JRadioButton("Divisão (/)");
        rest = new JRadioButton("Resto(%)");
        exib = new JLabel ("Resultado:");
        Calcular = new JButton("Calcular");
        grupo = new ButtonGroup();
        grupo.add(somar);
        grupo.add(subt);
        grupo.add(multi);
        grupo.add(div);
        grupo.add(rest);
        Calcular.setBounds(250,70,100,25);
        rot1.setBounds(10,10,100,20);
        rot2.setBounds(10,40,100,20);
        tex1.setBounds(30,10,200,20);
        tex2.setBounds(30,40,200,20);
        res.setBounds(80,240,200,20);
                somar.setBounds(10,80,100,20);
                subt.setBounds(10,110,100,20);
                div.setBounds(10,140,100,20);
                multi.setBounds(10,170,130,20);
                 rest.setBounds(10,200,100,20);
                 exib.setBounds(10,240,100,20);
                Calcular.addActionListener(
    
                        new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                
              if(subt.isSelected() == true){ 
               int num1,num2,subt;
                subt=0;
                num1 = Integer.parseInt(tex1.getText());
                num2 = Integer.parseInt(tex2.getText());
                subt = num1 - num2;
                exib.setVisible(true);
                res.setText(""+subt);
        }
        if(somar.isSelected() == true){       
       
        
                int num1,num2,soma;
                soma=0;
                num1 = Integer.parseInt(tex1.getText());
                num2 = Integer.parseInt(tex2.getText());
                soma = num1 + num2;
                exib.setVisible(true);
                res.setText(""+soma);
            }  
            
        
        if(multi.isSelected() == true){   
    
        
                int num1,num2,multi;
                multi=0;
                num1 = Integer.parseInt(tex1.getText());
                num2 = Integer.parseInt(tex2.getText());
                multi = num1 * num2;
                exib.setVisible(true);
                res.setText(""+multi);
            }  
            
        
        if(div.isSelected() == true){   
     
     
                int num1,num2,div;
                div=0;
                num1 = Integer.parseInt(tex1.getText());
                num2 = Integer.parseInt(tex2.getText());
                div = num1 / num2;
                exib.setVisible(true);
                res.setText(""+div);
            }
            
        
        if(rest.isSelected() == true){ 
  
          
                int num1,num2,rest;
                rest=0;
                num1 = Integer.parseInt(tex1.getText());
                num2 = Integer.parseInt(tex2.getText());
                rest = num1 % num2;
                exib.setVisible(true);
                res.setText(""+rest);
                
        
        }
            }
        });         
            
        tela.add(rot1);
        tela.add(rot2);
        tela.add(tex1);
        tela.add(tex2);
        tela.add(rest);
         tela.add(res);
        tela.add(exib);
        tela.add(somar);
        tela.add(subt);
        tela.add(div);
        tela.add(multi);
        tela.add(Calcular);
        setSize(400,300);
        setVisible(true);
        setResizable(false);
}
    public static void main(String[] args) {
   Calculadora4 app = new Calculadora4();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
