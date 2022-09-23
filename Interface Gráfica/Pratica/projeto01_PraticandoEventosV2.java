/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.interfaceGrafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author mfm65
 */
public class projeto01_PraticandoEventosV2 extends JFrame implements ActionListener{
    static int soma = 0;
    private final JLabel labelTexto;
    private final JLabel labelBackground;
    private final JLabel labelBackground2;
    private final JButton botaoSair;
    private final JButton botaoSomar;
    
    public projeto01_PraticandoEventosV2(){
        Font fonteLabel = new Font("Verdana", Font.BOLD, 36);
        labelTexto = new JLabel("Praticando eventos");
        labelTexto.setFont(fonteLabel);
        labelTexto.setForeground(Color.white);
        labelTexto.setBounds(155, -10, 500, 100);
        add(labelTexto);
        
        Font fonteBotao = new Font("Verdana", Font.ITALIC, 14);
        botaoSair = new JButton("Clique aqui para sair");
        botaoSair.setBounds(210, 365, 240, 20);
        botaoSair.setFont(fonteBotao);
        botaoSair.setForeground(Color.white);
        botaoSair.setBackground(Color.red);
        botaoSair.setOpaque(true);
        add(botaoSair);
        botaoSair.addActionListener(this);
        
        botaoSomar = new JButton("Clique aqui para somar + 1");
        botaoSomar.setFont(fonteBotao);
        botaoSomar.setBounds(210, 340, 240, 20);
        botaoSomar.setForeground(Color.white);
        botaoSomar.setBackground(Color.black);
        botaoSomar.setOpaque(true);
        add(botaoSomar);
        botaoSomar.addActionListener(this);
        
        Icon java = new ImageIcon("/imagensCursoUdemyJava/dukee.png");
        labelBackground2 = new JLabel(java);
        labelBackground2.setBounds(175, 60, 300, 300);
        add(labelBackground2);
        
        Icon background = new ImageIcon("/imagensCursoUdemyJava/fundo.jpg");
        labelBackground = new JLabel(background);
        labelBackground.setBounds(0, 0, 659, 440);
        add(labelBackground);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource() == botaoSair){
            System.exit(0);
        } else if (evento.getSource() == botaoSomar) {
            soma = soma + 1;
            System.out.println("-> " + soma);
        }
    }
    
    public static void main(String[] args) {
        projeto01_PraticandoEventosV2 form = new projeto01_PraticandoEventosV2();

        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 659, 440);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Praticando eventos na tela");
    }
}
