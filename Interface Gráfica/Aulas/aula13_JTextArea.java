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
public class aula13_JTextArea extends JFrame{
    
    private final JTextArea areaTexto;
    private final JScrollPane barras;
    
    public aula13_JTextArea(){
        Font fonteArea = new Font("Verdana", Font.ITALIC, 15);
        areaTexto = new JTextArea();
        areaTexto.setFont(fonteArea);
        
        barras = new JScrollPane(areaTexto);
        barras.setBounds(0, 0, 687, 465);
        add(barras);
    }
    
    public static void main(String[] args) {
        aula13_JTextArea form = new aula13_JTextArea();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setResizable(false);
        form.setTitle("Aula 13");
    }
}
