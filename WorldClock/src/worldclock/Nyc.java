/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldclock;

/**
 *
 * @author user
 */
public class Nyc extends User{
    

    /**
      The Constructor determines the number of parameters used in the program 
     */
    Nyc( int u, double ti,int ot) {
       user_country  =u;   // Hold the city number of the user
       other_country=ot;   // Hold the time 
       time=ti;            // Number of city
    }
  // This makkah method calculates the time difference
     public void makkah() {
     time=time-7;
     yourTime(time);     
    }
  // This dubai method calculates the time difference
     public void dubai() {
     time=time-8;
     yourTime(time);
    }   
}


