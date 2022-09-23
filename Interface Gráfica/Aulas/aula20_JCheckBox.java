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
public class aula20_JCheckBox extends JFrame{
    
    private final ButtonGroup grupoBotoes;
    private final JRadioButton combo1, combo2;
    private final JLabel labelSubtitulo;
    private final JCheckBox check1, check2, check3;
    private final JLabel resultado;
    
    public aula20_JCheckBox(){
        grupoBotoes = new ButtonGroup();
        
        combo1 = new JRadioButton("600x700");
        combo1.setBounds(10, 10, 300, 30);
        add(combo1);
        grupoBotoes.add(combo1);
        combo1.addChangeListener(
            new ChangeListener(){
                @Override
                public void stateChanged(ChangeEvent evento){
                    if(combo1.isSelected()){
                        setSize(600, 700);
                    }
                }
            }
        );
        
        combo2 = new JRadioButton("900x800");
        combo2.setBounds(10, 40, 300, 30);
        add(combo2);
        grupoBotoes.add(combo2);
        combo2.addChangeListener(
            new ChangeListener(){
                @Override
                public void stateChanged(ChangeEvent evento){
                    if(combo2.isSelected()){
                        setSize(900, 800);
                    }
                }
            }
        );
        
        labelSubtitulo = new JLabel("Informe a materia favorita");
        labelSubtitulo.setBounds(20, 160, 600, 30);
        add(labelSubtitulo);
        
        resultado = new JLabel("");
        resultado.setBounds(20, 300, 400, 30);
        add(resultado);
        
        check1 = new JCheckBox("Matematica");
        check1.setBounds(20, 200, 100, 30);
        add(check1);
        check1.addChangeListener(
            new ChangeListener(){
                @Override
                public void stateChanged(ChangeEvent evento){
                    verificar();
                }
            }
        );
        
        check2 = new JCheckBox("Portugues");
        check2.setBounds(20, 220, 100, 30);
        add(check2);
        check2.addChangeListener(
            new ChangeListener(){
                @Override
                public void stateChanged(ChangeEvent evento){
                    verificar();
                }
            }
        );
        
        check3 = new JCheckBox("Historia");
        check3.setBounds(20, 240, 100, 30);
        add(check3);
        check3.addChangeListener(
            new ChangeListener(){
                @Override
                public void stateChanged(ChangeEvent evento){
                    verificar();
                }
            }
        );
    }
    
    //criando uma funcao para reutilizar o codigo varias vezes
    private void verificar(){
        String cursos = "";
        
        if (check1.isSelected()){
            cursos+="Matematica ";
        }
        if (check2.isSelected()){
            cursos+="Português ";
        }
        if (check3.isSelected()){
            cursos+="Historia ";
        }
        
        resultado.setText(cursos);
    }
    
    public static void main(String[] args) {
        aula20_JCheckBox form = new aula20_JCheckBox();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Aula 20");
    }
}
