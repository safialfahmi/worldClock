

/** A class that holds seasons of the year  */

package worldclock;

public class Weather {
   private int city_;    // Number of city
   private int month_;   // Number of month
     public void setCity_(int city) {    // The setCity method Sets the city 
        city_ = city ;
    }
     public int getCity_() {             // The getCityy method return the city
        return city_;
    }
     public void setMonth_(int month) {  // The setMonth method Set the month 
       month_ = month;
    }
     public int getMonth_() {            // The getMonth method return the city
        return month_;
    }
     // This Nyc Methode shows the seasons of year in Nyc
     public void Nyc(){
      switch(month_)
      {
         case 1:
         case 2:
         case 12:
             System.out.println("The current season is winter");
             break;
         case 3:
         case 4:
         case 5:
     System.out.println("The current season is spring");
     break;
         case 6:
         case 7:
         case 8:
             System.out.println("The current season is summer");
             break;
         case 9:
         case 10: 
         case 11:
             System.out.println("The current season is autumn");
             break;
      }
    }
     // This toronto Methode shows the seasons of year in Toronto city
     public void toronto (){
      switch(month_)
      {
         case 1:
         case 2:
             System.out.println("The current season is autumn");
             break;
         case 3:
         case 4:
         case 5:
             System.out.println("The current season is spring ");
             break;
         case 6:
         case 7:
         case 8:
             System.out.println("The current season is summer ");
             break;
         case 9:
         case 10:
         case 11: 
         case 12:
             System.out.println("The current season is winter");
             break;
      }
    } 
     // This london Methode shows the seasons of year in London city
     public void london(){
      switch(month_)
      {
         case 1:
         case 2:
         
             System.out.println("The current season is summer");
             break;
         case 3:
         case 4:
         case 5:
             System.out.println("The current season is spring ");
             break;
         case 6:
         case 7:
         case 8:
             System.out.println("The current season is winter ");
             break;
         case 9:
         case 10:
         case 11: 
         case 12:
             System.out.println("The current season is  autumn");
             break;
      }
    }
      // This tokyo Methode shows the seasons of year in Tokyo city
     public void  tokyo(){
      switch(month_)
      {
         case 1:
         case 2:
         
             System.out.println("The current season is autumn ");
             break;
         case 3:
         case 4:
         case 5:
             System.out.println("The current season is winter ");
             break;
         case 6:
         case 7:
         case 8:
             System.out.println("The current season is spring ");
             break;
         case 9:
         case 10:
         case 11: 
         case 12:
             System.out.println("The current season is summer  ");
             break;
      }  
    } 
      // This sydney Methode shows the seasons of year in Sydney city
     public void  sydney(){
      switch(month_)
      {
         case 1:
         case 2:
         
             System.out.println("The current season is summer ");
             break;
         case 3:
         case 4:
         case 5:
             System.out.println("The current season is spring ");
             break;
         case 6:
         case 7:
         case 8:
             System.out.println("The current season is winter");
             break;
         case 9:
         case 10:
         case 11: 
         case 12:
             System.out.println("The current season is autumn");
             break;
      }   
    }
      // This sydney Methode shows the seasons of year in KualaLumpu city
     public void KualaLumpur(){
      switch(month_)
      {
         case 1:
         case 2:
             System.out.println("The current season is winter ");
             break;
         case 3:
         case 4:
         case 5:
              System.out.println("The current season is spring ");
              break;
         case 6:
         case 7:
         case 8:
             System.out.println("The current season is summer ");
             break;
         case 9:
         case 10:
         case 11: 
         case 12:
             System.out.println("The current season is autumn");
             break; 
      }
    }  
      // This choosecity methode calls other method
      public void choosecity(){
       if(city_==1)
        {Nyc();}
       else if(city_==2)
        {toronto();}
       else if(city_==3)
        {london();}
       else if(city_==4)
        {tokyo();}
       else if(city_==5)
        {sydney();}
       else if(city_==6)
        {KualaLumpur();}
    } }