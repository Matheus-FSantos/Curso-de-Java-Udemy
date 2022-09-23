/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceGrafica.conteudo;
import javax.swing.*;
/**
 *
 * @author mfm65
 * 
 * Aula 03, criacao de JLabel
 */
public class aula03_JLabel extends JFrame {
    
    private JLabel label1;
    
    public aula03_JLabel(){
        label1  = new JLabel("Olá mundo");
        label1.setBounds(100, 100, 100, 100);
        add(label1);
    }
    
    public static void main(String[] args) {
        //CONFIGS PADROES
        aula03_JLabel janela = new aula03_JLabel();
        janela.setLayout(null);
        janela.setVisible(true);
        janela.setBounds(0, 0, 700, 500);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("Aula JLabel");
        
    }
}
