/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceGrafica.conteudo;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author mfm65
 */
public class aula26_JMenuBar extends JFrame{
    
    private final JMenuBar barra;
    private final JMenu itemArquivo, itemAjuda;
    private final JMenuItem itemSalvar, itemAbrirArquivo, itemDocumentacao;
    
    public aula26_JMenuBar(){
        barra = new JMenuBar();
        setJMenuBar(barra);
        
        itemArquivo = new JMenu("Arquivo");
        barra.add(itemArquivo);
        
        itemAjuda = new JMenu("Ajuda");
        barra.add(itemAjuda);
        
        itemSalvar = new JMenuItem("Salvar");
        itemArquivo.add(itemSalvar);
        
        itemAbrirArquivo = new JMenuItem("Abrir arquivo");
        itemArquivo.add(itemAbrirArquivo);
        
        itemDocumentacao = new JMenuItem("Documentação do APP");
        itemAjuda.add(itemDocumentacao);
        itemDocumentacao.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evento){
                    JOptionPane.showMessageDialog(null, "Teste de Menu Bar", "Documentacao", JOptionPane.INFORMATION_MESSAGE);
                    setTitle("Clicou em Documentação do APP");
                }
            }
        );
    }
    
    public static void main(String[] args) {
        aula26_JMenuBar form = new aula26_JMenuBar();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Aula 27 - Menu Bar parte 2");
    }
}
