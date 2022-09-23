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
 * 
 * Aula 08, criando eventos em sua declaração
 * 
 */
public class aula08_JButton extends JFrame{
    
    static int clique = 0;
    private JLabel labelTexto;
    private JLabel labelImagem;
    private JButton botao;
    private JButton botaoSair;
    private JLabel labelTitulo;
    
    public aula08_JButton(){
        Font fonte = new Font("Vernada", Font.TRUETYPE_FONT, 36);
        labelTexto = new JLabel("Aula 08 - JButton");
        labelTexto.setBounds(220, 20, 400, 100);
        labelTexto.setFont(fonte);
        add(labelTexto);
        
        Icon img = new ImageIcon("/imagensCursoUdemyJava/icone.png");
        labelImagem = new JLabel(img);
        labelImagem.setBounds(160, 100, 400, 200);
        add(labelImagem);
        
        Font fonteBotao = new Font("Verdana", Font.ITALIC, 14);
        botao = new JButton("Clique aqui");
        botao.setBounds(200, 400, 300, 20);
        botao.setFont(fonteBotao);
        botao.setForeground(Color.white);
        botao.setBackground(Color.black);
        botao.setOpaque(true);
        add(botao);
        botao.addActionListener(
            new ActionListener (){
                @Override
                public void actionPerformed(ActionEvent evento){
                    labelTexto.setText("Você clicou no botão");
                }
            }
        );
        
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
    
    /*public void actionPerformed(ActionEvent evento){
        if(evento.getSource()==botao){
            System.exit(0);
        }
    }
    */
    
    public static void main(String[] args) {
        aula08_JButton form = new aula08_JButton();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Aula 08");
    }    
}
