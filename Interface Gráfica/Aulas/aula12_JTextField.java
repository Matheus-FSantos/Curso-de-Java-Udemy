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
public class aula12_JTextField extends JFrame implements ActionListener{
    
    private final JLabel labelTitulo;
    private final JLabel labelImagem;
    private final JLabel labelSubtitulo;
    private final JTextField campoTexto;
    private final JButton botaoConfirmar;
    private final JButton botaoSair;
    
    public aula12_JTextField(){
        Font fonteTitulo = new Font("Verdana", Font.TRUETYPE_FONT, 36);
        Font fonteSubtitulo = new Font("Verdana", Font.BOLD, 10);
        Font fonteBotao = new Font("Verdana", Font.ITALIC, 14);
        
        labelTitulo = new JLabel("JTextField");
        labelTitulo.setFont(fonteTitulo);
        labelTitulo.setBounds(270, 20, 400, 100);
        add(labelTitulo);
        
        Icon imagem = new ImageIcon("/imagensCursoUdemyJava/icone.png");
        labelImagem = new JLabel(imagem);
        labelImagem.setBounds(160, 80, 400, 200);
        add(labelImagem);
        
        labelSubtitulo = new JLabel("Informe o seu Nome abaixo:");
        labelSubtitulo.setFont(fonteSubtitulo);
        labelSubtitulo.setBounds(200, 280, 300, 100);
        add(labelSubtitulo);
        
        campoTexto = new JTextField();
        campoTexto.setFont(fonteBotao);
        campoTexto.setBounds(200, 340, 300, 20);
        add(campoTexto);
        
        botaoConfirmar = new JButton("Confirmar");
        botaoConfirmar.setFont(fonteBotao);
        botaoConfirmar.setBounds(200, 420, 300, 20);
        add(botaoConfirmar);
        botaoConfirmar.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evento){
                    String texto = campoTexto.getText();
                    labelTitulo.setText("Olá " + texto.toUpperCase() + "!");
                    labelTitulo.setBounds(210, 20, 400, 100);
                    campoTexto.setText("");
                }
            }
        );
        
        
        botaoSair = new JButton("Sair");
        botaoSair.setFont(fonteBotao);
        botaoSair.setBounds(200, 440, 300, 20);
        botaoSair.setForeground(Color.black);
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
        
    }
    
    public static void main(String[] args) {
        aula12_JTextField form = new aula12_JTextField();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Aula 12");
    }
}
