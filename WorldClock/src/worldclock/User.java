

/** This class shows the cities */

package worldclock;

import java.util.Scanner;

public class User {
   
    int user_country;     // Hold the city number of the user
    double time;          // Hold the time 
    int other_country;    // Number of city
    // Creat a Scanner obigect       
    Scanner keyboard = new Scanner (System.in);
    
     // print_2() has been calling in the main
     // This Method display statements
     public void print_2() throws Exception{
       System.out.println("hello, you are in WorldClock ");
       System.out.println("this program can convert the time between the cities and other Features  ");
       System.out.println("so let's get started!\n ");
       print();
} 
    // print() has been calling by print_2()
    public void print()  {
        
     System.out.println("Please enter the NUMBER  of city you live in  ");
     // attempt enter the number 
     try {
     System.out.println(" 1- Makkah         2- Dubai");
     System.out.print("Your choice is: ");
     user_country = keyboard.nextInt();      // User input the choice
     if (user_country<1||user_country>2){
     throw new Exception ("you  entered a wrong number \n please enter the number of the city 1 or 2   .."); 
    }
     System.out.println("Please enter the current TIME in your city in 24H ");
     System.out.print("Your choise is:  ");
     time = keyboard.nextDouble();             // User input the time
    if (time<0|| time> 24)
    {
    throw new Exception("you enterd a wrong number ..The clock from 0 to 24 please try agian  "); 
    }
     System.out.println("-------- ");
     list();                                   // Call the method
     System.out.println("-------- ");
     System.out.println("Please choise one of these cities and we will tell you the time in it !");
     System.out.print("Your choise is:  ");
     other_country = keyboard.nextInt();      // User input the other_country 
     if(other_country >6 ||other_country<1  )
    {
       throw new Exception("you  entered a wrong number \n please try again and  choice one of the cities below  ..");
    }
    }
    catch(Exception e) {
    System.out.println(e.getMessage()); 
   print();     //calling same method
   }
}

   // This choice1 Method calls other method
    public void choice1(){
    Nyc box1=new Nyc( user_country,time,other_country);                   // Creat a Nyc obigect
    Toronto box2=new Toronto( user_country,time,other_country);           // Creat a Torontor obigect
    London box3 = new London(user_country,time,other_country);            // Creat a London obigect
    Tokyo box4= new Tokyo(user_country,time,other_country);               // Creat a Tokyo obigect
    Sydney box5 = new Sydney(user_country,time,other_country);            // Creat a Sydney obigect 
    KualaLumpur box6 = new KualaLumpur(user_country,time,other_country);  // Creat a KualaLumpur obigect
    if(user_country==1&&other_country==1)
        box1.makkah();                                // Call the method from the class
    else if (user_country==2&&other_country==1)
        box1.dubai();                                 // Call the method from the class
    else if (user_country==1&&other_country==2)
        box2.makkah();                                // Call the method from the class
    else if (user_country==2&&other_country==2)  
        box2.dubai();                                 // Call the method from the class
    else if (user_country==1&&other_country==3) 
        box3.makkah();                                // Call the method from the class
    else if (user_country==2&&other_country==3)  
        box3.dubai();                                 // Call the method from the class
    else if (user_country==1&&other_country==4)
        box4.makkah();                                // Call the method from the class
     else if (user_country==2&&other_country==4)
        box4.dubai();                                 // Call the method from the class
     else if (user_country==1&&other_country==5)
        box5.makkah();                                // Call the method from the class
     else if (user_country==2&&other_country==5)
        box5.dubai();                                 // Call the method from the class
     else if (user_country==1&&other_country==6)
        box6.makkah();                                // Call the method from the class
     else if (user_country==2&&other_country==6)
        box6.dubai();                                 // Call the method from the class
     else 
       System.out.println(" You enterd a wrong number ");
}  
   // This list Method show the cities
    public void list(){
     for (int i=1;i<7;i++)
     {
         if(i==1)
           System.out.print(i+"- New york city         ");  
         else if(i==2)
           System.out.print(i+"- Toronto city\n"); 
         else if(i==3)
           System.out.print(i+"- London city           ");  
         else if(i==4)
           System.out.print(i+"- Tokyo city\n"); 
         else if(i==5)
           System.out.print(i+"- Sydney city           "); 
         else if (i==6)
           System.out.print(i+"- Kuala Lumpur city\n");
     }
}
  /* This print_2 method calling in the main */
   
    // This yourTime Method convert the time
    public void yourTime (double times) {
         if(time<0)
        {
              time*=(-1); 
              time=12-time;
              System.out.println( String.format( "%.2f",time)+"PM"); 
        }
          else if(time>0&&time<12)
        {
            System.out.println( String.format( "%.2f",time)+"AM");
        }
        else if(time==0){
            System.out.println("12 AM");
        }
           else if(time>=12&&time<24)
           {
                 System.out.println( String.format( "%.2f",time)+"PM");
        }
           else {
                 System.out.println("You enterd a wrong time  ");
                
                
       }   
}
     // This print1 Method display massage
    public void print1(){
       System.out.println("Exit the program");
}
}
