package projeto;

/* @author ISAT */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;


public class CadastroProduto extends JPanel
{
    
    private JLabel lblnum1,lblnum2,lblnum3;
    private JTextField txtnum1,txtnum2,txtnum3;
    private JButton btnGravar,btnAbrir,btnlimpar;
    private Font fontee = new Font("Ebrima", Font.BOLD, 13);
    public CadastroProduto()
    {
        setBackground(new Color (255,255,128)) ;
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes()
    {
         setLayout(null);
         lblnum1 = new JLabel("Código do serviço: ");
         lblnum1.setBounds(130,80,200,20);
         lblnum2 = new JLabel("Nome do serviço: ");
         lblnum2.setBounds(130,140,200,20);
         lblnum3 = new JLabel("Preço do serviço: ");
         lblnum3.setBounds(130,200,200,20);
       
         txtnum1 = new JTextField();
         txtnum1.setBounds(310,80,140,30);
         txtnum2 = new JTextField();
         txtnum2.setBounds(310,140,140,30);
         txtnum3 = new JTextField();
         txtnum3.setBounds(310,200,140,30);
       
         btnGravar = new JButton("Gravar");  
         btnGravar.setBounds(130,260,100,30);
         btnGravar.setFont(fontee);
         btnAbrir = new JButton("consultar");  
         btnAbrir.setBounds(240,260,100,30);
         btnAbrir.setFont(fontee);
         btnlimpar = new JButton("limpar");      
         btnlimpar.setBounds(350,260,100,30);
         btnlimpar.setFont(fontee);
         
         add(lblnum1);
         add(txtnum1);
         add(lblnum2);
         add(txtnum2);
         add(lblnum3);
         add(txtnum3);
         add(btnAbrir);
         add(btnGravar);
         add(btnlimpar);  
    }
    private void definirEventos()
    {
        btnlimpar.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
                txtnum1.setText("");
                txtnum2.setText("");
                txtnum3.setText("");
           }
       });
        
        btnAbrir.addActionListener(new ActionListener()
       {
          public void actionPerformed(ActionEvent e)
            {
              try
                {
                  
                  String arq = JOptionPane.showInputDialog(null, "Forneça o código a abrir");
                  BufferedReader br = new BufferedReader(new FileReader(arq + "teste1.txt"));
                  txtnum1.setText(br.readLine());
                  txtnum2.setText(br.readLine());
                  txtnum3.setText(br.readLine());
                }
                    catch(IOException erro){
                    JOptionPane.showMessageDialog(null, "erro ao abrir o código");
                }              
            }         
       }); 
        
       btnGravar.addActionListener(new ActionListener()
       {
          public void actionPerformed(ActionEvent e)
          {
            if(txtnum1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "o código não pode ser vazio");
                txtnum1.requestFocus();
            }
            else if(txtnum2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "o nome não pode ser vazio");
                txtnum2.requestFocus();
            }
            else if(txtnum3.getText().equals("")){
                JOptionPane.showMessageDialog(null, "o email não pode ser vazio");
                txtnum3.requestFocus();
            }
                    else{
                    try
                    {
                        PrintWriter out = new PrintWriter(txtnum1.getText() + "teste1.txt");
                        out.println(txtnum1.getText());
                        out.println(txtnum2.getText());
                        out.println(txtnum3.getText());
                        out.close();
                        JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso");
                    }
                    catch(IOException erro)
                        {
                            JOptionPane.showMessageDialog(null, "erro ao gravar o arquivo");
                        }
                }         
          }         
       });   
    }
}
