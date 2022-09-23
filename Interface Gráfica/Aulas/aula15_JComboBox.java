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
public class aula15_JComboBox extends JFrame implements ActionListener{
    
    private final JLabel labelTexto;
    private final JLabel labelImagem;
    private final JComboBox combo;
    private final JButton botao1;
    
    public aula15_JComboBox(){
        Font fonteTexto = new Font("Verdana", Font.TRUETYPE_FONT, 36);
        Font fonteBotao = new Font("Verdana", Font.ITALIC, 14);
        labelTexto = new JLabel("JComboBox");
        labelTexto.setFont(fonteTexto);
        labelTexto.setBounds(270, 20, 400, 100);
        add(labelTexto);
        
        Icon imagem = new ImageIcon("/imagensCursoUdemyJava/icone.png");
        labelImagem = new JLabel(imagem);
        labelImagem.setBounds(160, 80, 400, 200);
        add(labelImagem);
        
        combo = new JComboBox();
        combo.setFont(fonteBotao);
        combo.setBounds(200, 340, 300, 20);
        add(combo);
        combo.addItem("Selecione");
        combo.addItem("Vermelho");
        combo.addItem("Amarelo");
        combo.addItem("Azul");
        combo.addItem("Verde");
        
        
        botao1 = new JButton("Clique Aqui");
        botao1.setFont(fonteBotao);
        botao1.setBounds(200, 360, 300, 20);
        add(botao1);
        botao1.addActionListener(
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
        aula15_JComboBox form = new aula15_JComboBox();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Aula 15");
    }
}
