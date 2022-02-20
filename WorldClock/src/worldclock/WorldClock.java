
/** This program calculates the time difference and shows the seasons of the year as the user choose8 */

package worldclock;

import java.util.Scanner;

public class WorldClock {

public static void main(String[] args) throws Exception {
       // Leop displays the program from the first
     // Creat a User obigect 
    User box=new User();
    box.print_2();        // Call the method from the class
    box.choice1();        // Call the method from the class
    weather1();
    }
    // This weather1 Method show the weather
    public static void weather1(){
         int city ;   // Number of city
         int month;   // Number of month
           Scanner keyboard = new Scanner (System.in);
    System.out.println("Do you want to know the weather today (Y/N):");  // The user's Y or N decision
    char choice = keyboard .nextLine().charAt(0);  // User input the choice
    if(choice == 'Y' ||  choice == 'y'){
    System.out.println("-------- ");
    User box=new User();
    box.list();                      // Call the method from the class
    System.out.println("-------- ");
    System.out.println("Please choose one of these cities and we'll tell you the season Annual in it");
    System.out.print("Your choise is:  ");
    city = keyboard.nextInt();      // User input the city 
    System.out.println("-------- ");
    ChooseMonth();                  // Call the method
    System.out.println("-------- ");
    System.out.print("Please enter the current month\n");
    System.out.print("Your choise is:  ");
    month = keyboard.nextInt();     // User input the month
   // Creat a Weather obigect 
    Weather box2=new Weather();  
    box2.setCity_(city);         // Set the city 
    box2.getCity_();             // Display the 
    box2.setMonth_(month);       // Set the Month
    box2.getMonth_();            // Display the Month
    box2.choosecity();           // Call the method from the class     
    // Creat  overriding  
    // Polymorphism.
    User box1 = new Overriding();
    System.out.println("-------- ");
    box1.print1();               // Call the method from the class
    }
    else{
      System.out.println("Thank you\n you had successfully exit from the program  "); 
    }
    }
    // This ChooseMonth Method show the Months
    public static void ChooseMonth(){
     for (int i=1;i<=12;i++)
     {
         if(i==1)
           System.out.print(i+"- January         ");
         else if(i==2)
           System.out.print(i+"- February\n");  
         else if(i==3)
           System.out.print(i+"- March           "); 
         else if(i==4)
           System.out.print(i+"- April\n"); 
         else if(i==5)
           System.out.print(i+"- May             "); 
         else if (i==6)
           System.out.print(i+"- June\n");
         else if (i==7)
           System.out.print(i+"- July            ");
         else if (i==8)
           System.out.print(i+"- August\n");
         else if (i==9)
           System.out.print(i+"- September       ");
         else if (i==10)
           System.out.print(i+"- October\n");
         else if (i==11)
           System.out.print(i+"- November       ");
         else if (i==12)
           System.out.print(i+"- December\n");
     }
  }  
} 
