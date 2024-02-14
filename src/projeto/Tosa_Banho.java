package projeto;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/* @author Marcus */
public class Tosa_Banho extends JPanel 
{
    
    private JLabel lblnum1,lblnum2,lblnum3,lblnum4,lblresult;
    private JTextField txtnum1,txtnum2,txtnum3,txtnum4,txtresult;
    private JButton btncalcular,btnlimpar;
   
    
    public Tosa_Banho()
    {
         setBackground(new Color (238,232,170)) ;
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes()
    {
        setLayout(null);
         lblnum1 = new JLabel("Tosa higienica para quantos cães: ");
         lblnum1.setBounds(80,50,300,20);
         lblnum2 = new JLabel("Tosa na tesoura para quantos cães: ");
         lblnum2.setBounds(80,110,300,20);
         lblnum3 = new JLabel("Tosa na máquina para quantos cães: ");
         lblnum3.setBounds(80,170,300,20);
         lblnum4 = new JLabel("Banho para quantos cães: ");
         lblnum4.setBounds(80,230,300,20);
         lblresult = new JLabel("Valor total para pagar: ");
         lblresult.setBounds(80,290,200,20);
        
         txtnum1 = new JTextField();
         txtnum1.setBounds(360,50,140,30);
         txtnum2 = new JTextField();
         txtnum2.setBounds(360,110,140,30);
         txtnum3 = new JTextField();
         txtnum3.setBounds(360,170,140,30);         
         txtnum4 = new JTextField();
         txtnum4.setBounds(360,230,140,30);
         txtresult = new JTextField();
         txtresult.setBounds(320,290,180,30);
        
           
       
         btncalcular = new JButton("Comprar");  
         btncalcular.setBounds(400,350,100,30); 
         btnlimpar = new JButton("esvaziar compra");      
         btnlimpar.setBounds(100,350,150,30);
         
         
         add(lblnum1);
         add(txtnum1);
         add(lblnum2);
         add(txtnum2);
         add(lblnum3);
         add(txtnum3);         
         add(lblnum4);
         add(txtnum4);
         add(lblresult);
         add(txtresult);
         
         add(btnlimpar); 
         add(btncalcular);
    
    }
    private void definirEventos(){
       btncalcular.addActionListener(new ActionListener()
       {
          public void actionPerformed(ActionEvent e)
          {
              double num1=0, num2=0, num3=0, num4=0, result=0;
    
                try
                {
                    num1 = Double.parseDouble(txtnum1.getText());
                    num2 = Double.parseDouble(txtnum2.getText());
                    num3 = Double.parseDouble(txtnum3.getText());
                    num4 = Double.parseDouble(txtnum4.getText());
                }
                catch(NumberFormatException erro)
                {
                   txtresult.setText("Possível erro, verifique.");
                   return;
                }               
                
                num1 = num1 * 10;
                num2 = num1 + (num2 * 15);
                num3 = num2 + (num3 * 12.50);
                result = num3 + (num4 * 10);
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
                txtresult.setText("");
           }
       });
    }
}