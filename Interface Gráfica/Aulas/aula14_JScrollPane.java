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
public class aula14_JScrollPane extends JFrame{
    
    private final JTextArea areaTexto;
    private final JScrollPane barras;
    
    public aula14_JScrollPane(){
        Font fonteTexto = new Font("Verdana", Font.ITALIC, 14);
        areaTexto = new JTextArea();
        areaTexto.setFont(fonteTexto);
        barras = new JScrollPane(areaTexto);
        barras.setBounds(0, 0, 687, 465);
        add(barras);
    }
    
    public static void main(String[] args) {
        aula14_JScrollPane form = new aula14_JScrollPane();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Aula 14");
    }
}
