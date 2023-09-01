
import javax.swing.*;
//import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
public class wordcount implements ActionListener{ 
 		JLabel heading=new JLabel(" Word Counter ");
		JLabel heading1=new JLabel(" Welcome To Word Counter ...!!");
 		JTextField input=new JTextField();
 		JButton submit=new JButton("COUNT");
 		Font font=(new Font("Monospaced",Font.BOLD,30));
		Font font1=(new Font("Serif Bold",Font.BOLD,60));
		Font font3=(new Font("Dialog",Font.BOLD,30));
 		JLabel  result=new JLabel(" ");	
 	
 	wordcount()
 	{
 	    JFrame main_Frame=new JFrame();
 		main_Frame.setLayout(null);
 		main_Frame.setSize(1000,1000);
 		main_Frame.setVisible(true);

 		
 		
 		main_Frame.getContentPane().setBackground(Color.GRAY);
 		heading.setFont(font1);
 		heading.setBounds(610,150,700,100);
 		heading.setForeground(Color.BLACK);

		heading1.setFont(font3);
 		heading1.setBounds(610,50,700,60);
 		heading1.setForeground(Color.YELLOW);

 		input.setBounds(310,300,1100,50);
 		input.setFont(font);
 		main_Frame.add(heading);
		main_Frame.add(heading1);
 		main_Frame.add(input);
 		
 		submit.setBounds(605,500,370,60);
		submit.setBackground(Color.ORANGE);
		
		submit.setFont(font3);
		main_Frame.add(submit);
		submit.addActionListener(this);
		
		result.setBounds(680,600,1000,70);
		result.setForeground(Color.blue);
		result.setFont(font3);
		main_Frame.add(result);
 		
 		
 		main_Frame.setDefaultCloseOperation(main_Frame.EXIT_ON_CLOSE);	
 	}
 	public  void actionPerformed(ActionEvent e)
 	{
 		String str=input.getText();
	  	// String str4=str.replace("[\n]+", " ");
	  	// System.out.println (str4);
	   	String str3= str.replaceAll("( )+", " ");
	  	//System.out.println (str3);
  		String str1=str3.trim();
  		//	System.out.println (str1);
  		int cnt=0;
  		for(int i=0;i<str1.length();i++)
  		{
  			char ch=str1.charAt(i);
  			if(ch==' ')
  			{
  				cnt++;
  			}
  			else if(ch==','||ch=='.'||ch=='?')
  			{
  				continue;
  			}
  		}
  		String dd=String.valueOf(cnt+1);
  		result.setText("Total Words are: "+dd);
 	}	
    public static void main (String[] args) {
 		wordcount t=new wordcount();	
    }
}