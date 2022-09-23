/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceGrafica.conteudo;
import javax.swing.*;
import javax.swing.event.*;
/**
 *
 * @author mfm65
 */
public class aula17_JRadioButton extends JFrame implements ChangeListener{
    
    private final JLabel labelTitulo;
    private final JRadioButton radio1, radio2, radio3;
    private final ButtonGroup BG;
    
    public aula17_JRadioButton(){
        labelTitulo = new JLabel("Aula 17 -> Radio Buttons");
        labelTitulo.setBounds(300, 10, 600, 100);
        add(labelTitulo);
        
        BG = new ButtonGroup();
        
        radio1 = new JRadioButton("400 x 300");
        radio1.setBounds(10, 100, 100, 30);
        add(radio1);
        BG.add(radio1);
        radio1.addChangeListener(
            new ChangeListener(){
                @Override
                public void stateChanged(ChangeEvent evento){
                    if (radio1.isSelected()){
                        setSize(400, 300);
                    }
                }
            }
        );
        
        radio2 = new JRadioButton("600 x 500");
        radio2.setBounds(10, 150, 100, 30);
        add(radio2);
        BG.add(radio2);
        radio2.addChangeListener(
            new ChangeListener(){
                @Override
                public void stateChanged(ChangeEvent evento){
                    if(radio2.isSelected()){
                        setSize(600, 500);
                    }
                } 
            }
        );
        
        radio3 = new JRadioButton("800 x 700");
        radio3.setBounds(10, 200, 100, 30);
        add(radio3);
        BG.add(radio3);
        radio3.addChangeListener(
            new ChangeListener(){
                @Override
                public void stateChanged(ChangeEvent evento){
                    if(radio3.isSelected()){
                        setSize(800, 700);
                    }
                }
            }
        );
    }
    @Override
    public void stateChanged(ChangeEvent evento){
        if (radio1.isSelected()){
            setSize(400, 300);
        } else if (radio2.isSelected()){
            setSize(600, 500);
        }
    }
    
    public static void main(String[] args) {
        aula17_JRadioButton form = new aula17_JRadioButton();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Aula JRadio Button");
    }
}
