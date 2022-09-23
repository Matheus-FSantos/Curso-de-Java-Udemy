/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceGrafica.conteudo;
import javax.swing.*; //para importar todas as classes
/**
 *
 * @author mfm65
 * 
 * Aula 01 sobre interfaces graficas
 * 
 */
public class aula01_formulario_janela {
    public static void main(String[] args) {
        JFrame form = new JFrame();
        //form.setBoudns(x, y, largura(width), altura(heigth));
        form.setBounds(100, 200, 600, 400);
        form.setVisible(true);
    }     
}