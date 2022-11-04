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
public class projeto01_PraticandoEventosV1 extends JFrame implements ActionListener{
    
    static int c = 0;
    private final JLabel texto1;
    private final JLabel labelImg;
    private final JButton botaoSair;
    private final JButton botaoPermanecer;
    
    public projeto01_PraticandoEventosV1(){
        Font letra = new Font("Verdana", Font.TRUETYPE_FONT, 36);
        
        texto1 = new JLabel("Pratincando interfaces graficas");
        texto1.setBounds(55, 0, 700, 100);
        texto1.setFont(letra);
        texto1.setForeground(Color.black);
        add(texto1);
        
        Icon imagem = new ImageIcon("/imagensCursoUdemyJava/icone.png");
        labelImg = new JLabel(imagem);
        labelImg.setBounds(0, 0, 400, 200);
        labelImg.setLocation(150, 100);
        add(labelImg);
        
        Font fonteBotao = new Font("Verdana", Font.TRUETYPE_FONT, 14);
        botaoSair = new JButton("Clique aqui para sair do app");
        botaoSair.setFont(fonteBotao);
        botaoSair.setBounds(200, 400, 300, 20);
        botaoSair.setForeground(Color.white);
        botaoSair.setBackground(Color.red);
        botaoSair.setOpaque(true);
        add(botaoSair);
        botaoSair.addActionListener(this);
        
        botaoPermanecer = new JButton("Clique aqui");
        botaoPermanecer.setFont(fonteBotao);
        botaoPermanecer.setBounds(200, 380, 300, 20);
        botaoPermanecer.setForeground(Color.white);
        botaoPermanecer.setBackground(Color.black);
        botaoPermanecer.setOpaque(true);
        add(botaoPermanecer);
        botaoPermanecer.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource() == botaoSair){
            System.exit(0);
        } else if (evento.getSource() == botaoPermanecer){
            c = c + 1;
            System.out.println("Voce clicou no botao permanecer " + c + " vezes");
        }
    }
    
    public static void main(String[] args) {
        projeto01_PraticandoEventosV1 form = new projeto01_PraticandoEventosV1();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Praticando");
    }
}