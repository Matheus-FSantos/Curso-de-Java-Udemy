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
public class aula16_JComboBox extends JFrame{
    
    private final JLabel labelTexto;
    private final JComboBox comboBox;
    private final JButton botao1;
    
    public aula16_JComboBox(){
        Font fonteTexto = new Font("Verdana", Font.TRUETYPE_FONT, 34);
        Font fontePadrao = new Font("Verdana", Font.ITALIC, 14);
        labelTexto = new JLabel("Aula sobre JComboBox");
        labelTexto.setFont(fonteTexto);
        labelTexto.setBounds(150, 10, 600, 50);
        add(labelTexto);
        
        comboBox = new JComboBox();
        comboBox.setFont(fontePadrao);
        comboBox.setBounds(200, 100, 300, 30);
        add(comboBox);
        comboBox.addItem("Selecione...");
        comboBox.addItem("Vermelho");
        comboBox.addItem("Verde");
        comboBox.addItem("Amarelo");
        comboBox.addItem("Azul");
        comboBox.addItemListener(
            new ItemListener(){
                @Override
                public void itemStateChanged(ItemEvent evento){
                    //converte o objeto para String
                    String texto = comboBox.getSelectedItem().toString();
                    if (!texto.equals("Selecione...")){
                        setTitle(texto);
                    }
                }
            }
        );
        
        
        botao1 = new JButton("Sair");
        botao1.setFont(fontePadrao);
        botao1.setBounds(300, 400, 150, 30);
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
    
    public static void main(String[] args) {
        aula16_JComboBox form = new aula16_JComboBox();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Aula 16");
    }    
}
