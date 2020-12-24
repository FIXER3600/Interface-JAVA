package exemplodebarradeferramenta;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
public class ExemploDeBarraDeFerramenta extends JFrame {
JToolBar bar;
JButton dir,esq,cent,rec,cop,col;
ImageIcon img[];

public ExemploDeBarraDeFerramenta(){
    super("Exemplo de Barra de Ferramentas");
    Container tela = getContentPane();
    tela.setBackground(Color.YELLOW);
    tela.setLayout(null);
    
    String icones[]={"text_align_right.png","text_align_left.png","centro.gif","recortar.gif","copiar.gif","colar.gif"};
    img = new ImageIcon[6];
    for(int i = 0;i<6;i++){
        img[i] = new ImageIcon(icones[i]);}
    
    dir = new JButton(img[0]);
    esq = new JButton(img[1]);
  cent =  new JButton(img[2]);
   rec = new JButton(img[3]);
   cop = new JButton(img[4]);
col = new JButton(img[5]);

dir.setToolTipText("Direita (Ctrl+d)");
esq.setToolTipText("Esquerda (Ctrl+e)");
cent.setToolTipText("Centralizar (Ctrl+z)");
rec.setToolTipText("Recortar (Ctrl+x)");
cop.setToolTipText("Copiar (Ctrl+c)");
col.setToolTipText("Direita (Ctrl+d)");
bar = new JToolBar("Barra de Ferramentas");
UIManager.put("ToolTip.background",SystemColor.info);
UIManager.put("ToolTip.foreground",SystemColor.blue);
bar.setRollover(true);
bar.add(dir);
bar.add(esq);
bar.add(cent);
bar.addSeparator();
bar.add(rec);
bar.add(cop);
bar.add(col);
bar.setBounds(1,1,260,50);
tela.add(bar);
setSize(320,340);
setLocationRelativeTo(null);
setVisible(true);
}
    public static void main(String[] args) {
   ExemploDeBarraDeFerramenta app = new ExemploDeBarraDeFerramenta();
   app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
}
