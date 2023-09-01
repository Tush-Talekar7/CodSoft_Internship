import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ATMInterface implements ActionListener
{
  TextField txt_Box=new TextField();
  //TextField da=new TextField();
  TextField txt1=new TextField();
 JButton check_Balance=new JButton("Check Balance");
 JButton withdraw_Amount=new JButton("Withdraw Amount");
 JButton deposite_Amount=new JButton("Deposite Amount");
  Label withdraw_Lable=new Label("Enter Amount ");
  //Label dl=new Label("Enter Deposite Amount ");
  Label title=new Label("WELCOME TO ATM");
 public ATMInterface() 
 {
 	
 JFrame main_Frame=new JFrame("Simple Calculation Demo");
 
 main_Frame.setSize(900,800);
 main_Frame.setLayout(null);
 main_Frame.setVisible(true);

 main_Frame.getContentPane().setBackground(Color.LIGHT_GRAY);

 //create font 
 Font fnt=new Font("Arial",Font.BOLD,20);
 Font fl=new Font("Monospaced",Font.BOLD,30);

 Font ft=new Font("Dialog",Font.BOLD,60);
 //set display possition for controls
title.setFont(ft);
 title.setBounds(460,70,600,60);


 check_Balance.setBounds(650,220,220,37);
 withdraw_Amount.setBounds(450,510,220,37);
 deposite_Amount.setBounds(770,510,220,37);

  withdraw_Lable.setBounds(430,335,250,30);
  //dl.setBounds(290,520,400,30);
  txt_Box.setBounds(710,330,360,40);
 //da.setBounds(710,520,360,40);

 check_Balance.setFont(fnt);
 withdraw_Amount.setFont(fnt);
 deposite_Amount.setFont(fnt);
 withdraw_Lable.setFont(fl);
 //dl.setFont(fl);

txt1.setFont(fnt);


 main_Frame.add(title);
 main_Frame.add(withdraw_Lable);
 //main_Frame.add(dl);
 main_Frame.add(txt_Box);
 //main_Frame.add(da);
 main_Frame.add(txt1);
 main_Frame.add(check_Balance);
 main_Frame.add(withdraw_Amount);
 main_Frame.add(deposite_Amount);

 check_Balance.addActionListener(this);
 withdraw_Amount.addActionListener(this);
 deposite_Amount.addActionListener(this);

 main_Frame.addWindowListener(new WindowAdapter()
 {
 public void windowClosing(WindowEvent e)
 {
 System.exit(1);
 }
 });
 }
 // code to execute after event occure
 double availableBalance=5000;
 public void actionPerformed(ActionEvent e)
 {

 if(e.getSource()==check_Balance)
 {

 	JFrame sub_Frame=new JFrame("Withdraw");
 	sub_Frame.setVisible(true);
 	sub_Frame.setLayout(null);
 	sub_Frame.setSize(500,300);
 	Font fg=new Font("Arial",Font.BOLD,35);

	sub_Frame.getContentPane().setBackground(Color.black);

 	Label wam=new Label("Your Current Balance :- ");
 	Label bal=new Label("Rs."+availableBalance);
 	bal.setFont(fg);

  	  wam.setFont(fg);
  	  wam.setBounds(30,100,430,30);
	  wam.setForeground(Color.white);
	  bal.setForeground(Color.WHITE);
 	  sub_Frame.add(wam);
 	  sub_Frame.add(bal);
 	  bal.setBounds(150,145,200,50);


 }
 else if(e.getSource()==withdraw_Amount)
 {
 	String s1=txt_Box.getText();
 	double amt=Double.parseDouble(s1);
 	JFrame sub_Frame=new JFrame("Withdraw");
 	sub_Frame.setVisible(true);
 	sub_Frame.setLayout(null);
 	sub_Frame.setSize(500,300);
 	Font fg=new Font("Arial",Font.BOLD,35);

 	if(amt>availableBalance)
 	{
		sub_Frame.getContentPane().setBackground(Color.WHITE);


 		Label Withdrawa=new Label("Insufficeient Balance..!");
  	  Withdrawa.setFont(fg);
  	  Withdrawa.setBounds(30,100,430,30);
  	  sub_Frame.add(Withdrawa);
 	}

 	else
 	{
		sub_Frame.getContentPane().setBackground(Color.BLUE);
 		availableBalance-=amt;
 	

 	  Label Widrawamt=new Label("Transcantion Successful..!");
 	  Label curBal=new Label("Current Balance Rs"+availableBalance);
  	  Widrawamt.setFont(fg);
  	  curBal.setFont(fg);
	  curBal.setForeground(Color.white);
	  Widrawamt.setForeground(Color.white);
  	  Widrawamt.setBounds(10,100,460,30);
  	  curBal.setBounds(10,150,470,30);
  	  sub_Frame.add(Widrawamt);
  	  sub_Frame.add(curBal);
 	}

 
 }
 else if(e.getSource()==deposite_Amount)
  {
  	JFrame sub_Frame=new JFrame("Withdraw");
 	sub_Frame.setVisible(true);
 	sub_Frame.setLayout(null);
 	sub_Frame.setSize(500,300);
 	Font fg=new Font("Arial",Font.BOLD,35);

  	String s3= txt_Box.getText();
 	double amt3=Double.parseDouble(s3);
	sub_Frame.getContentPane().setBackground(Color.GREEN);

 	availableBalance+=amt3;

 	Label wam=new Label("Transcantion Successful..!");
 	
  	  wam.setFont(fg);
  	  wam.setBounds(10,100,450,30);
 	  sub_Frame.add(wam);
 	
 	 }

	}
 public static void main(String[] arg)
 {
 ATMInterface m=new ATMInterface();
 }
}
