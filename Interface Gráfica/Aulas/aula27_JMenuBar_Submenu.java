/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceGrafica.conteudo;
import javax.swing.*;
/**
 *
 * @author mfm65
 */
public class aula27_JMenuBar_Submenu extends JFrame{
    
    private final JMenuBar barra;
    private final JMenu menuArquivo, menuSalvar;
    private final JMenuItem itemAbrirArquivo, itemSalvar, itemSalvarComo;
    
    public aula27_JMenuBar_Submenu(){
        barra = new JMenuBar();
        setJMenuBar(barra);
        
        menuArquivo = new JMenu("Arquivo");
        barra.add(menuArquivo);
        
        itemAbrirArquivo = new JMenuItem("Abrir arquivo");
        menuArquivo.add(itemAbrirArquivo);
        
        //Criando SubMenu
        menuSalvar = new JMenu("Salvar");
        menuArquivo.add(menuSalvar);
        
        itemSalvar = new JMenuItem("Salvar");
        menuSalvar.add(itemSalvar);
        
        itemSalvarComo = new JMenuItem("Salvar Como");
        menuSalvar.add(itemSalvarComo);
    }
    
    public static void main(String[] args) {
        aula27_JMenuBar_Submenu form = new aula27_JMenuBar_Submenu();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Aula 27 - SubMenus");
    }
}
