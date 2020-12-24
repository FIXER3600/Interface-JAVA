/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplotable;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class ExemploTable extends JFrame {
    
    private JTable table;
    private final String colunas[]={"Nome:","Idade:","Sexo:"};
    private final String dados[][]={
        {"Charles","19","Masculino"},
        {"Galileu","454","Masculino"},
        {"Hawking","76","Masculino"},
        {"Newton","375","Masculino"},
        {"Kepler","447","Masculino"},
        {"Einstein","139","Masculino"},
        {"Copernicus","545","Masculino"}};
     public ExemploTable() {
         setLayout(new FlowLayout());
         setSize(new Dimension(600,200));
         setLocationRelativeTo(null);
         setTitle("Exemplo JTable");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         table=new JTable(dados,colunas);
         table.setPreferredScrollableViewportSize(new Dimension(500,100));
         table.setFillsViewportHeight(true);
         
         JScrollPane scrollPane=new JScrollPane(table);
         
         add(scrollPane);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new ExemploTable().setVisible(true);
    }
    
}
