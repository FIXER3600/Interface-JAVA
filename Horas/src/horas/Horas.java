package horas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.text.DecimalFormat;

public class Horas extends JFrame{
JLabel rot,rot1;
int hh,mm,ss,h;
Calendar hora;
DecimalFormat form;
public Horas(){
    super("Exemplo de Hora");
    Container tela = getContentPane();
    tela.setLayout(null);
    rot = new JLabel("");
    rot.setBounds(100,60,280,20);
    rot1 = new JLabel("Horas no Formato hhmmss");
    rot1.setBounds(60,05,280,20);
    ActionListener tarefa = (new ActionListener(){
   public void actionPerformed(ActionEvent e){
        HORAS();
}
});
javax.swing.Timer time = new javax.swing.Timer(1000,tarefa);
time.start();
tela.add(rot);
tela.add(rot1);
setSize(300,200);
setVisible(true);
setLocationRelativeTo(null);
}
    public static void main(String[] args) {
     Horas app = new Horas();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void HORAS(){
        hora = Calendar.getInstance();
        hh = hora.get(Calendar.HOUR_OF_DAY);
        mm = hora.get(Calendar.MINUTE);
        ss = hora.get(Calendar.SECOND);
        form = new DecimalFormat("00");
        rot.setText("Hora: "+formatar(hh%12)+":"+formatar(mm)+":"+formatar(ss));
    }
    private String formatar(int num){
        form = new DecimalFormat("00");
        return form.format(num);
    }
}
