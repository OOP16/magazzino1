package View;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Model.LoginModel;


public class LoginView extends JFrame implements ActionListener{
   private JTextField txtUsername;
   private JPasswordField txtPassword;
   private JButton btnLogin;
   private LoginModel model;
   private JFrame frame;
  
   public LoginView(){
       super("Login MVC");
       frame = new JFrame();
       frame.setBounds(100, 100, 450, 300);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       txtUsername = new JTextField(15);
       txtPassword = new JPasswordField(15);
       txtPassword.setEchoChar('*');
       btnLogin = new JButton("Login");
      
       JPanel content = new JPanel();
       content.setLayout(new FlowLayout());
       content.add(new JLabel("Username:"));
       content.add(txtUsername);
       content.add(new JLabel("Password:"));
       content.add(txtPassword);
       content.add(btnLogin);
       
       btnLogin.addActionListener(this);
      
       this.setContentPane(content);
       this.pack();
      
       this.addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent e){
               System.exit(0);
           }
       });
   }

   public void actionPerformed(ActionEvent e) {
   }
  
   public LoginModel getUser(){
       model = new LoginModel(txtUsername.getText(), txtPassword.getText());
       return model;       
   }
  
   public void showMessage(String msg){
       JOptionPane.showMessageDialog(this, msg);
   }
  
   public void addLoginListener(ActionListener log) {
         btnLogin.addActionListener(log);
       }


	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
		
		
		
	}

	


