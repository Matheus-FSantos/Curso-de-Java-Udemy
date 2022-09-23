/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceGrafica.conteudo;
import javax.swing.*;
import java.awt.*; //as fontes fazem parte da classe AWT
/**
 *
 * @author mfm65
 * 
 * Aula 04 sobre Interface grafica com JLABEL sobre fontes
 * 
 */


public class aula04_JLabel extends JFrame{
    
    private JLabel label1;
    
    public aula04_JLabel(){
        
        Font letra = new Font("Verdana", Font.ITALIC, 36);
                
        label1 = new JLabel ("Aula 02 sobre JLabel");
        label1.setBounds(50, 100, 570, 100);
        label1.setFont(letra);
        label1.setForeground(Color.blue);
        label1.setBackground(Color.black);
        label1.setOpaque(true);
        add(label1);
    }
    
    public static void main(String[] args) {
        aula04_JLabel form = new aula04_JLabel();
        form.setLayout(null);
        form.setVisible(true);
        form.setResizable(false);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Aula JLabel 2");
    }
}
