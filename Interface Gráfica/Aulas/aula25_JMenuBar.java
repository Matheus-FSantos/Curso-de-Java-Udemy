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
public class aula25_JMenuBar extends JFrame{
    
    //Criando a barra de menu e os campos de menu
    private final JMenuBar barra;
    private final JMenu menuArquivo, menuEditar;
    
    //Criando os itens do menu
    private final  JMenuItem item1, item2, item3, item4;
    
    public aula25_JMenuBar(){
        barra = new JMenuBar();
        setJMenuBar(barra); //fala que é a barra da aplicacao
        
        //Mriação dos menus
        menuArquivo = new JMenu("Arquivo");
        barra.add(menuArquivo);
        
        menuEditar = new JMenu("Editar");
        barra.add(menuEditar);
        
        //Itens principais dos menus
        item1 = new JMenuItem("Salvar");
        menuArquivo.add(item1);
        
        item2 = new JMenuItem("Sair");
        menuArquivo.add(item2);
        
        item3 = new JMenuItem("Exportar");
        menuEditar.add(item3);
        
        item4 = new JMenuItem("Importar");
        menuEditar.add(item4);
        
    }
    
    public static void main(String[] args) {
        aula25_JMenuBar form = new aula25_JMenuBar();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Aula 25 - Menu Bar");
    }
}
