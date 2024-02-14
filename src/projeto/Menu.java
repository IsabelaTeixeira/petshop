package projeto;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;


/* @author ISAT */

public class Menu extends JFrame {
    
    
    private Container container;
    private  JMenuBar jmnubarra;
    private JMenu mnuarquivo, mnuexemplos;
    private JMenuItem mnuisair, mnuiTosaBanho, mnuiCadastro, mnuiCadastroProduto;
    
    private ImageIcon i = new ImageIcon(getClass().getResource("cachorrinho.png"));
    private JLabel label  = new JLabel (i);
    
    
    public Menu() {
       
        getContentPane().setBackground(new Color (255,255,128));
        add(label);
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes(){
        
        add(label);
        setIconImage(new ImageIcon("LogoPata.png").getImage());
        setTitle("Menu");
        setBounds(0,0,600,500);
        container = getContentPane();
        jmnubarra = new JMenuBar();
        mnuarquivo = new JMenu("Arquivos");
        mnuexemplos = new JMenu("Exemplos");
        mnuisair = new JMenuItem("Sair");
                mnuisair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
        mnuiCadastro = new JMenuItem("Área de cadastro de clientes ");
        mnuiCadastroProduto = new JMenuItem("Área de cadastro de serviços");
        mnuiTosaBanho = new JMenuItem(" Área de Compra ");  
        mnuarquivo.add(mnuisair);
        mnuexemplos.add(mnuiCadastro);
        mnuexemplos.add(mnuiCadastroProduto);
        mnuexemplos.add(mnuiTosaBanho);
        jmnubarra.add(mnuarquivo);
        jmnubarra.add(mnuexemplos);
        setJMenuBar(jmnubarra);
    }
    
    private void definirEventos(){
      mnuisair.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              System.exit(0);
           }
      });
      
      mnuiCadastro.addActionListener(new ActionListener (){

        public void actionPerformed(ActionEvent e){
           CadastroCliente cadastro = new CadastroCliente();
           container.removeAll();
           container.add(cadastro);
           container.validate();
           
        }  
      });
      
      mnuiCadastroProduto.addActionListener(new ActionListener (){

        public void actionPerformed(ActionEvent e){
           CadastroProduto cadastroproduto = new CadastroProduto();
           container.removeAll();
           container.add(cadastroproduto);
           container.validate();
           
        }  
      });

       
       mnuiTosaBanho.addActionListener(new ActionListener (){

        public void actionPerformed(ActionEvent e){
           Tosa_Banho TosaBanho = new Tosa_Banho();
           container.removeAll();
           container.add(TosaBanho);
           container.validate();
           
        }  
      });
    }
    
    public static void abrir(){
        Menu principal = new Menu();
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
               principal.setLocation((tela.width - principal.getSize().width)/2,
                       (tela.height - principal.getSize().height) /2);
               principal.setVisible(true);
    }
    
     
}