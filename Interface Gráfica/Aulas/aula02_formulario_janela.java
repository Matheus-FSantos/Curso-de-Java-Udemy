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
 * Aula 02 sobre interfaces Graficas
 * 
 */
public class aula02_formulario_janela extends JFrame{
    public static void main(String[] args) {
        
        aula02_formulario_janela form = new aula02_formulario_janela();
        form.setLayout(null);
        form.setBounds(0, 0, 600, 400);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setResizable(false);
        form.setLocationRelativeTo(null);
        form.setTitle("Minha primeira aplicação gráfica");
    }
}   