//import stuff here
import java.util.Scanner; //This imports the console scanner that reads user input
//Your code here
public class Program7
{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        double stanleyNickel = 1/240.0;
        double klevin = 1/20.0;
        double schruteBuck = 1;
        
        
        double amtKlevin = 0;
        double amtBuck = 0;
        double amtNickel = 0;
        
        System.out.println("Enter schrute-bucks: ");
        amtBuck = myScanner.nextDouble();
        
        System.out.println("Enter klevin: ");
        amtKlevin = myScanner.nextDouble();
        
        System.out.println("Enter Nickels: ");
        amtNickel = myScanner.nextDouble();
        
        double finalBuck = (schruteBuck*amtBuck+amtKlevin*klevin+amtNickel*stanleyNickel);// hakuna matata
        double total = (double) Math.round(finalBuck*100)/100;
        System.out.println(total);
        
        
        
    }
}
//Paste console output below:
/*Enter schrute-bucks: 
7
Enter klevin: 
17
Enter Nickels: 
9
7.89
/*
/*


*/
