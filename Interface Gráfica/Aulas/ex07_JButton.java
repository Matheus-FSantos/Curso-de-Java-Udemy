/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceGrafica.conteudo;
import javax.swing.*;
import java.awt.*;
//import para poder adicionar um evento na interface grafica
import java.awt.event.*;
/**
 *
 * @author mfm65
 */
public class ex07_JButton extends JFrame implements ActionListener{
    
    private JLabel labelTexto;
    private JLabel labelImg;
    private JButton labelBotao;
    
    public ex07_JButton(){
        Font fonte = new Font("Verdana", Font.TRUETYPE_FONT, 36);
        
        labelTexto = new JLabel("Aula 07");
        labelTexto.setFont(fonte);
        labelTexto.setBounds(300, 20, 500, 100);
        add(labelTexto);
        
        Icon imagem = new ImageIcon("/imagensCursoUdemyJava/icone.png");
        labelImg = new JLabel(imagem);
        labelImg.setBounds(160, 100, 400, 200);
        add(labelImg);
        
        Font fonteBotao = new Font("Verdana", Font.TRUETYPE_FONT, 14);
        labelBotao = new JButton("Clique aqui para fechar o APP");
        labelBotao.setBounds(200, 400, 300, 20);
        labelBotao.setFont(fonteBotao);
        labelBotao.setForeground(Color.white);
        labelBotao.setBackground(Color.black);
        labelBotao.setOpaque(true);
        add(labelBotao);
        labelBotao.addActionListener(this); //adicionando um evento
    }
    
    public void actionPerformed(ActionEvent evento){ //funcao padrao
        if(evento.getSource() == labelBotao){
            System.exit(0); //Serve para fechar a aplicacao
        }
    }
    
    public static void main(String[] args) {
        ex07_JButton form = new ex07_JButton();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setResizable(false);
        form.setTitle("Aula 07 - Botões");
    }
}
