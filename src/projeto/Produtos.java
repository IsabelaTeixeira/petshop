package projeto;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/* @author ISAT */
public class Produtos extends JPanel 
{
    
    private JLabel lblnum1,lblnum2,lblnum3,lblnum4,lblnum5,lblresult;
    private JTextField txtnum1,txtnum2,txtnum3,txtnum4,txtnum5,txtresult;
    private JButton btncalcular,btnlimpar;
    
    public Produtos()
    {
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes()
    {
        setLayout(null);
         lblnum1 = new JLabel("Digite a quantida de coleiras:");
         lblnum1.setBounds(10,30,200,20);
         lblnum2 = new JLabel("Digite a quantidade de ração");
         lblnum2.setBounds(10,60,200,20);
         lblnum3 = new JLabel("Digite a quantida de brinquedos:");
         lblnum3.setBounds(10,90,200,20);
         lblnum4 = new JLabel("Digite a quantidade de caminhas:");
         lblnum4.setBounds(10,120,200,20);
         lblnum5 = new JLabel("Digite a quantida de acessórios:");
         lblnum5.setBounds(10,150,200,20);
         lblresult = new JLabel("Valor total da compra: ");
         lblresult.setBounds(10,180,200,20);
       
         txtnum1 = new JTextField();
         txtnum1.setBounds(210,30,140,20);
         txtnum2 = new JTextField();
         txtnum2.setBounds(210,60,140,20);
         txtnum3 = new JTextField();
         txtnum3.setBounds(210,90,140,20);
         txtnum4 = new JTextField();
         txtnum4.setBounds(210,120,140,20);
         txtnum5 = new JTextField();
         txtnum5.setBounds(210,150,140,20);
         txtresult = new JTextField();
         txtresult.setBounds(150,180,200,20);
       
         btncalcular = new JButton("Comprar");  
         btncalcular.setBounds(10,220,140,38); 
         btnlimpar = new JButton("esvaziar compra");      
         btnlimpar.setBounds(210,220,140,38);
         add(lblnum1);
         add(txtnum1);
         add(lblnum2);
         add(txtnum2);
         add(lblnum3);
         add(txtnum3);
         add(lblnum4);
         add(txtnum4);
         add(lblnum5);
         add(txtnum5);
         add(lblresult);
         add(txtresult);
         add(btncalcular);
         add(btnlimpar);  
    }
    private void definirEventos(){
       btncalcular.addActionListener(new ActionListener()
       {
          public void actionPerformed(ActionEvent e)
          {
              double num1=0, num2=0, num3=0, num4=0, num5=0, result=0;
    
                try
                {
                    num1 = Double.parseDouble(txtnum1.getText());
                    num2 = Double.parseDouble(txtnum2.getText());
                    num3 = Double.parseDouble(txtnum3.getText());
                    num4 = Double.parseDouble(txtnum4.getText());
                    num5 = Double.parseDouble(txtnum5.getText());
                }
                catch(NumberFormatException erro)
                {
                   txtresult.setText("Possível erro, verifique.");
                   return;
                }               
                
                num1 = num1 * 2.50;
                num2 = num1 + (num2 * 5);
                num3 = num2 + (num3 * 3.50);
                num4 = num3 + (num4 * 5);
                result = num4 + (num5 * 4.75);
                txtresult.setText("" + result); 
          }         
       });
       btnlimpar.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
                txtnum1.setText("");
                txtnum2.setText("");
                txtnum3.setText("");
                txtnum4.setText("");
                txtnum5.setText("");
                txtresult.setText("");
           }
       });
    }
}
   
    




