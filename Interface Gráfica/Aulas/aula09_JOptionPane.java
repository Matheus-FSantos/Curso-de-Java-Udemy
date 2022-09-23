/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceGrafica.conteudo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author mfm65
 */
public class aula09_JOptionPane extends JFrame implements ActionListener{
    
    private final JLabel labelTitulo;
    private final JLabel labelImg;
    private final JButton botao;
    private final JButton botaoExecutar;
    private final JButton botaoSair;
    
    public aula09_JOptionPane(){
        Font letra = new Font("Verdana", Font.TRUETYPE_FONT, 36);
        labelTitulo = new JLabel("JOptionPane");
        labelTitulo.setBounds(220, 20, 400, 100);
        labelTitulo.setFont(letra);
        add(labelTitulo);
        
        Icon img = new ImageIcon("/imagensCursoUdemyJava/icone.png");
        labelImg = new JLabel(img);
        labelImg.setBounds(160, 100, 400, 200);
        add(labelImg);
        
        Font fonteBotao = new Font("Verdana", Font.ITALIC, 14);
        botao = new JButton("Clique aqui");
        botao.setBounds(200, 380, 300, 20);
        botao.setFont(fonteBotao);
        botao.setForeground(Color.white);
        botao.setBackground(Color.black);
        botao.setOpaque(true);
        add(botao);
        botao.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evento){
                    labelTitulo.setText("Clicou no botão");
                }
            }
        );
        
        botaoExecutar = new JButton("Executar");
        botaoExecutar.setBounds(200, 400, 300, 20);
        botaoExecutar.setFont(fonteBotao);
        add(botaoExecutar);
        botaoExecutar.addActionListener(this);
        
        botaoSair = new JButton("Sair");
        botaoSair.setBounds(200, 420, 300, 20);
        botaoSair.setFont(fonteBotao);
        botaoSair.setForeground(Color.white);
        botaoSair.setBackground(Color.red);
        botaoSair.setOpaque(true);
        add(botaoSair);
        botaoSair.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evento){
                    System.exit(0);
                }
            }
        );
    }
    
    @Override
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource()==botaoExecutar){
            JOptionPane.showMessageDialog(this, "Você clicou no botão executar", "Botao executar", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        aula09_JOptionPane form = new aula09_JOptionPane();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Aula sobre JOptionPane");
    }
}
