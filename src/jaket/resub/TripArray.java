/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaket.resub;

import java.util.ArrayList;

/**
 *
 * @author Jake
 */
public class TripArray {
    private ArrayList<String> trips = new ArrayList<String>();
    
    public void addTrip(String tripName){
        trips.add(tripName);
    }
    
    public ArrayList<String> getTrip(){
        return trips;
    }

}
