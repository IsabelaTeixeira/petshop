package projeto;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* @author ISAT */
public class Login extends JFrame {
    
     private JTextField txtlogin;
    private JPasswordField senha;
    private JLabel lbllogin,lblsenha,lblloginn;
    private JButton btnentrar;
    private JButton btncancelar;
    private static Login janela;
    
    private Font fonte = new Font("Ebrima", Font.BOLD, 15);
    private Font fontee = new Font("Ebrima", Font.BOLD, 13);
    
    public Login()
    {   
        getContentPane().setBackground(new Color (255,255,128));
        inicializarComponentes();
        definirEventos();
    }       
    
    private void inicializarComponentes(){
        
        UIManager.put("Label.font", fonte);
        setIconImage(new ImageIcon("LogoPata.png").getImage());
        setTitle("AnimalCity");
        setBounds(0,0,300,250);
        setLayout(null);
        txtlogin = new JTextField(10);
        senha = new JPasswordField(8);
        lblloginn = new JLabel ("Login:");
        lbllogin = new JLabel("Usuário ");
        lblsenha = new JLabel("Senha ");
        btnentrar = new JButton("Logar");
        btncancelar = new JButton("Cancelar");
        
        //posições e tamanhos dos componentes.
        lblloginn.setBounds (119,10,80,25);
        txtlogin.setBounds(150,50,80,25);
        lbllogin.setBounds(50,50,80,25);
        senha.setBounds(150,95,80,25);
        lblsenha.setBounds(50,95,80,25);
        btnentrar.setBounds(40,140,100,25);
        btnentrar.setFont(fontee);
        btncancelar.setBounds(150,140,100,25);
        btncancelar.setFont(fontee);
        
        add(lblloginn);        
        add(lbllogin);
        add(txtlogin);
        add(lblsenha);
        add(senha);
        add(btnentrar);
        add(btncancelar);
    }
    
private void definirEventos(){
    
    btnentrar.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent e){
            String senhal = String.valueOf(senha.getPassword());
            if(txtlogin.getText().equals("1") && senhal.equals("1"))
            {
                    janela.setVisible(false);
                    Menu.abrir();
            }
            else {
                    JOptionPane.showMessageDialog(null, "Login e senha inválidos");
                 }
        }
    });
  

    btncancelar.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    });
}
        
    public static void main (String[] args)
    {
        SwingUtilities.invokeLater(new Runnable(){
           public void run(){
             janela = new Login();
             janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
             janela.setLocation((tela.width - janela.getSize().width)/2 ,
                     (tela.height - janela.getSize().height) / 2);
             janela.setVisible(true);
           }
        });
    }
}

