import java.util.*;

class NumberGame
{
public static void main(String args[])
{
System.out.println("Welcome to Guess NumberGame ");
System.out.println("You will be asked to guess a Number to win the game ");
System.out.println("You have maximum 10 attempt limit");
Scanner sc=new Scanner(System.in);

Random random_Number=new Random();
int k=random_Number.nextInt(100);
int counter=0;


for(int i=1;i<=10;i++)
{
 System.out.println("Enter The random_Number: ");
 

 int input_Number=sc.nextInt();
 
 if(input_Number==k)
 {
  System.out.println("OOhhOO!,Your number is correct you win the game in "+i+"th attempt");
  counter=1;
  break;
 }
 else if (input_Number<k)
 {
  System.out.println("your guess number is Smaller");
 }
 else
 {
  System.out.println("your guess number is Greater");
 }
 
 }
 if(counter!=1)
 {
  System.out.println("Sorry ! you loss the game");
 }
}
}
