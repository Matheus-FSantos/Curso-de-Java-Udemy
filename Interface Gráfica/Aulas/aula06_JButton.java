/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceGrafica.conteudo;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author mfm65
 */
public class aula06_JButton extends JFrame {
    
    private JLabel labelTexto;
    private JLabel labelImg;
    private JButton labelBotao;
    
    public aula06_JButton(){
        Font fonte = new Font("Verdana", Font.TRUETYPE_FONT, 36);
        
        labelTexto = new JLabel("Aula 06");
        labelTexto.setFont(fonte);
        labelTexto.setBounds(300, 20, 500, 100);
        add(labelTexto);
        
        Icon imagem = new ImageIcon("/imagensCursoUdemyJava/icone.png");
        labelImg = new JLabel(imagem);
        labelImg.setBounds(160, 100, 400, 200);
        add(labelImg);
        
        Font fonteBotao = new Font("Verdana", Font.TRUETYPE_FONT, 14);
        labelBotao = new JButton("Clique aqui");
        labelBotao.setBounds(280, 400, 160, 20);
        labelBotao.setFont(fonteBotao);
        labelBotao.setForeground(Color.white);
        labelBotao.setBackground(Color.black);
        labelBotao.setOpaque(true);
        add(labelBotao);
    
    }
    
    public static void main(String[] args) {
        aula06_JButton form = new aula06_JButton();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setResizable(false);
        form.setTitle("Aula 06 - Botões");
    }
}
