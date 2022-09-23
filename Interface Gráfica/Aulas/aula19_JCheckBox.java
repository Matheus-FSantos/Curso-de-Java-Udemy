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
public class aula19_JCheckBox extends JFrame{

    private final ButtonGroup grupoBotao;
    private final JRadioButton botao1, botao2, botao3;
    private final JCheckBox check1, check2, check3;
    private final JLabel labelSubtitulo;
    
    public aula19_JCheckBox(){
        
        grupoBotao = new ButtonGroup();
        
        botao1 = new JRadioButton("400 x 300");
        botao1.setBounds(20, 20, 100, 30);
        add(botao1);
        grupoBotao.add(botao1);
        botao1.addChangeListener(
            new ChangeListener(){
                @Override
                public void stateChanged(ChangeEvent evento){
                    if(botao1.isSelected()){
                        setSize(400, 300);
                    }
                }
            }
        );
        
        botao2 = new JRadioButton("600 x 500");
        botao2.setBounds(20, 70, 100, 30);
        add(botao2);
        grupoBotao.add(botao2);
        botao2.addChangeListener(
            new ChangeListener(){
                @Override
                public void stateChanged(ChangeEvent evento){
                    if(botao2.isSelected()){
                        setSize(600, 500);
                    }
                }
            }
        );
        
        botao3 = new JRadioButton("800 x 700");
        botao3.setBounds(20, 120, 100, 30);
        add(botao3);
        grupoBotao.add(botao3);
        botao3.addChangeListener(
            new ChangeListener(){
                @Override
                public void stateChanged(ChangeEvent evento){
                    if(botao3.isSelected()){
                        setSize(800, 700);
                    }
                }
            }
        );
        
        labelSubtitulo = new JLabel("Informe suas Aulas favoritas:");
        labelSubtitulo.setBounds(20, 160, 600, 30);
        add(labelSubtitulo);
        
        check1 = new JCheckBox("Matematica");
        check1.setBounds(20, 200, 100, 30);
        add(check1);
        
        check2 = new JCheckBox("Português");
        check2.setBounds(20, 230, 100, 30);
        add(check2);
        
        check3 = new JCheckBox("História");
        check3.setBounds(20, 260, 100, 30);
        add(check3);
    }
    
    public static void main(String[] args) {
        aula19_JCheckBox form = new aula19_JCheckBox();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Aula 19");
    }
}
