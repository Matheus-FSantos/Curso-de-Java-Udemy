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
 * 
 * Aula 05 do curso Java iniciante ao intermediario
 * Criação de JFrames com imagens
 * 
 */
public class aula05_JLabel extends JFrame {
    
    private final JLabel label;
    private final JLabel labelImg;
    
    public aula05_JLabel(){
        Font fonte = new Font("Verdade", Font.TRUETYPE_FONT, 36);
        
        label = new JLabel("Teste Icone Java");
        label.setBounds(0, 20, 500, 100);
        label.setFont(fonte);
        label.setForeground(Color.black);
        label.setLocation(230, 20);
        label.setOpaque(true);
        add(label);
        
        
        Icon imagem = new ImageIcon("/imagensCursoUdemyJava/icone.png"); //Objeto por conter a imagem
        labelImg = new JLabel(imagem);
        labelImg.setBounds(20, 150, 400, 200);
        labelImg.setLocation(150, 100);//Usado para setar uma localizacao a imagem
        add(labelImg);
    }
    
    
    public static void main(String[] args) {
        aula05_JLabel form = new aula05_JLabel();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setResizable(false);
        form.setTitle("Aula 05");
    }     
}