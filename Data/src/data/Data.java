package data;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Data extends JFrame{
JLabel rot,rot2;
int ds,dia,mes,ano;
Calendar data;
String diasemana[]={"Domingo","Segunda - Feira","Terça - Feira","Quarta - Feira","Quinta - Feira","Sexta - Feira","Sábado"};
String meses[]={"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
    public Data(){
        super("Exemplo de Data");
        Container tela= getContentPane();
        tela.setLayout(null);
        rot = new JLabel("");
        rot2 = new JLabel("");
        
        rot.setBounds(20,30,280,20);
        rot2.setBounds(20,60,280,20);
        
        data = Calendar.getInstance();
        ds = data.get(Calendar.DAY_OF_WEEK);
        dia = data.get(Calendar.DAY_OF_MONTH);
        mes = data.get(Calendar.MONTH);
        ano = data.get(Calendar.YEAR);
    rot.setText("Data: "+dia+"/"+(mes+1)+"/"+ano);
    rot2.setText("Data: "+diasemana[ds-1]+", "+dia+" de "+meses[mes]+" de "+ano);
    tela.add(rot);
    tela.add(rot2);
    setSize(300,200);
    setVisible(true);
    setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
    Data app = new Data();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// TODO code application logic here
    }
    
}
