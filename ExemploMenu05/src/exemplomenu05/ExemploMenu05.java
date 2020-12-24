package exemplomenu05;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class ExemploMenu05 extends JFrame{ 
    JMenuBar barra; 
    JMenu opcoes,fonte,cor,estilo,tamanho; 
    JMenuItem limpar,sair,azul,verde,vermelho,amarelo,preto; 
    JCheckBoxMenuItem nomeE[]; 
    ButtonGroup grupoT,grupoE; 
    JRadioButtonMenuItem tamanhoF[]; 
    String tam[] = {"12","14","16","18"}; 
    String est[] = {"Normal", "Negrito", "Italica", "Negrito e Itálico"}; 
    JTextArea texto; 
    JPanel painel; 
    JScrollPane rolagem; 
    int estilofonte, tamfonte; 
    public ExemploMenu05(){ 
        super("Exemplo de Menus executando ações");
        Container tela = getContentPane(); 
        tela.setLayout(null); 
        estilofonte=Font. PLAIN; 
        tamfonte=12; barra = new JMenuBar(); 
        setJMenuBar(barra); 
        opcoes = new JMenu("Opcoes"); 
        barra.add(opcoes); 
        limpar = new JMenuItem("Limpar"); 
        fonte = new JMenu("Fonte"); 
        cor = new JMenu("Cor"); 
        azul = new JMenuItem("Azul"); 
        verde = new JMenuItem("Verde"); 
        vermelho = new JMenuItem("Vermelho"); 
        amarelo = new JMenuItem("Amarelo"); 
        preto = new JMenuItem("Preto"); 
        TratadorE tratestilo = new TratadorE(); 
        estilo = new JMenu("Estilo"); 
        grupoE = new ButtonGroup(); 
        nomeE = new JCheckBoxMenuItem[4]; 
for(int i = 0; i < 4; i++){ 
    nomeE[i] = new JCheckBoxMenuItem(est[i]);
    estilo.add(nomeE[i]);
            grupoE.add(nomeE[i]);
            nomeE[i].addItemListener(tratestilo);//adiciona o item listado na palavra

estilo.add(nomeE[i]); 
grupoE.add(nomeE[i]); 
nomeE[i].addItemListener(tratestilo); 
}    
TratadorT trattamanho = new TratadorT(); 
tamanho = new JMenu("Tamanho"); 
grupoT = new ButtonGroup(); 
tamanhoF = new JRadioButtonMenuItem[4]; 

for(int i = 0; i < 4; i++){ 
    tamanhoF[i] = new JRadioButtonMenuItem(tam[i]);
            tamanho.add(tamanhoF[i]);
            grupoT.add(tamanhoF[i]);
            tamanhoF[i].addItemListener(trattamanho);
        }

        sair = new JMenuItem("Sair");

        //utilizado adicionar atalho, asiim quando sao apertadas as respectivas teclas sua ação é iniciada
        opcoes.setMnemonic(KeyEvent.VK_O);// a tecla o opções
        limpar.setMnemonic(KeyEvent.VK_L);//tecla l chama limpar
        fonte.setMnemonic(KeyEvent.VK_F);//tecla f chama fonte
        sair.setMnemonic(KeyEvent.VK_S);//a tecla s chama sair
        cor.setMnemonic(KeyEvent.VK_C);//a tecla c chama cor
        estilo.setMnemonic(KeyEvent.VK_E);//a tecla e chama estilo
        tamanho.setMnemonic(KeyEvent.VK_T);// a tecla t chama tamanho
        
        //adicionando os campos na aba opcoes
        opcoes.add(limpar);
        opcoes.add(fonte);
        opcoes.addSeparator();
        opcoes.add(sair);
        
        //adicionando as cores na aba cor
        cor.add(azul);
        cor.add(verde);
        cor.add(vermelho);
        cor.add(amarelo);
        cor.add(preto);
        
        //adicionando as opcoes de escolha na aba fonte
        fonte.add(cor);
        fonte.add(estilo);
        fonte.add(tamanho);
        
        //instanciando o JTextArea e o JScroolPane adicionando as barras de rolagem vertical e horizontal, colocando tudo na tela e posicionando as mesmas
        texto = new JTextArea(10,20);//dimensiona o JTextArea
        rolagem = new JScrollPane(texto);//intancia o JScrooPane
        rolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);//seta a scrollbar verticar
        rolagem.setHorizontalScrollBarPolicy((JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS));//set a scrool bar horizontal
        painel = new JPanel();//instancia o JPanel
        painel.add(rolagem);//adiciona rolagem no painel
        painel.setBounds(30,30,250,250);//dimensiona o painel
        tela.add(painel);//adicion o painel na tela

        //da acão a opção limpar quando a pessoa clica ela pega o que esta escruito no JTextArea e apaga
        limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("");//substituira o que esta escrito por "", ou seja, nada,assim apagando e que estava escrito
                texto.requestFocus();//da foco ao que esta escrito
            }
        });
        
        //azul, verde, vermelho, amarelo e preto são funcoes dadas quando vc clica na opçao cor e escolhe uma.Ele troca a cor do texto pela cor selecionada
        azul.addActionListener(new ActionListener() {//da açao ao botão
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setForeground(Color.BLUE);//troca a cor do que estiver escrito para a cor azul
                repaint();//  se usa o método repaint em Java quando quer que a tela atualize o mais rápido possível
            }
        });
        verde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setForeground(Color.green);//troca a cor do que estiver escrito para a cor verde
                repaint();//se usa o método repaint em Java quando quer que a tela atualize o mais rápido possível
            }
        });
        vermelho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setForeground(Color.red);//troca a cor do que estiver escrito para a cor vermelho
                repaint();//se usa o método repaint em Java quando quer que a tela atualize o mais rápido possível
            }
        });
        amarelo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setForeground(Color.yellow);//troca a cor do que estiver escrito para a cor amarelo
                repaint();//  se usa o método repaint em Java quando quer que a tela atualize o mais rápido possível 
            }
        });
        preto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setForeground(Color.black);//troca a cor do que estiver escrito para a cor preto
                repaint();//  se usa o método repaint em Java quando quer que a tela atualize o mais rápido possível
            }
        });
        
        //Ao clicar na opcao sair ele executa essa ação que é exibir um JOpitionPane perguntando se realmente é desejo sair e quando clica em sim o prgrama fecha 
        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resposta;
                resposta=JOptionPane.showConfirmDialog(null,"Deseja realmente sair?",
                        "Mensagem do Programa",JOptionPane.YES_NO_OPTION);//apresenta um JOpition Pane perguntando se é desejado mesmo sair
                if (resposta==JOptionPane.YES_OPTION)//se a opção selecionada for sim ele executa System.exit(0) e fecha o prgrama
                    System.exit(0);//fecha a tela da interface
            }
        });

        setSize(500,300);//dimenciona a tela
        setLocationRelativeTo(null);//posiciona ea no meio da tela
        setVisible(true);//diz que ela é visivel
    }
    public static void main(String args[]) {
        ExemploMenu05 app = new ExemploMenu05();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class TratadorE implements ItemListener{
        public void itemStateChanged(ItemEvent e) {
            if(nomeE[0].isSelected())
                estilofonte=Font.PLAIN;//opcao padrão no tamanho da letra so seve pra voltar para a fonte original
            if(nomeE[1].isSelected())
                estilofonte=Font.BOLD;//se a opcao 1 for selecionada a fonte muda pra bold
            if(nomeE[2].isSelected())
                estilofonte=Font.ITALIC;//se a opcao 2 for selecionada a fonte muda pra italic
            if(nomeE[3].isSelected())
                estilofonte=Font.BOLD+Font.ITALIC;//se a opcao 3 for selecionada a fonte muda pra bold e italic
            texto.setFont(new Font("",estilofonte,tamfonte));
            repaint();// se usa o método repaint em Java quando quer que a tela atualize o mais rápido possível
        }
    }

    public class TratadorT implements ItemListener{
        public void itemStateChanged(ItemEvent e) {
            if(tamanhoF[0].isSelected())//opcao padrão no tamanho da letra so seve pra voltar ao tamanho original
                tamfonte=12;
            if(tamanhoF[1].isSelected())//se a opcao 1 for selecionada o tamanho muda pra 14 
                tamfonte=14;
            if(tamanhoF[2].isSelected())//se a opcao 2 for selecionada o tamanho muda pra 16
                tamfonte=16;
            if(tamanhoF[3].isSelected())//se a opcao 3 for selecionada o tamanho muda pra 18
                tamfonte=18;
            texto.setFont(new Font("",estilofonte,tamfonte));
            repaint();//  se usa o método repaint em Java quando quer que a tela atualize o mais rápido possível
        }
    }
}
