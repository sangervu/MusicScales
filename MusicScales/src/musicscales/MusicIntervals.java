package musicscales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class MusicIntervals {
    
    public static LinkedHashSet<String> hashList;
    public String[] myIntervals = new String[54612];
    public String[] myIntervalsCleaned = new String[54612];
    
    static int counter = -1;


    public void setInterval(String intervallit) {
        
        counter = counter + 1;
        this.myIntervals[counter] = intervallit;
    }
    
     public String[] getInterval() {

        return myIntervals;
    }
     
     
     public void myTrueScales() {
         
      MusicScales scales = new MusicScales();

        int laskuri = -1;

        //puhdistetun taulukon koko, jossa kaikki ovat potentiaalisia skaaloja
        //tarkistetaan kaikki potentiuaaliset skaalat
        for (int n = 0; n < 54612; n++) {

            String scale = scales.getScales(myIntervals[n]);

            if (scale != null) {
                laskuri = laskuri + 1;
                myIntervalsCleaned[laskuri] = myIntervals[n];
            }
        }
        myIntervalsCleaned = Arrays.copyOf(myIntervalsCleaned, laskuri + 1);
        this.myIntervalsCleaned = myIntervalsCleaned;
    }    
    public void cleanInterval() {
        //* Creating ArrayList of Array
        
        List<String> myIntervalsList = new ArrayList<String>(Arrays.asList(myIntervalsCleaned));
        hashList = new LinkedHashSet<String>();
        
        
      //Adding ArrayList elements to the LinkedHashSet
      // in order to remove the duplicate elements and 
      //to preserve the insertion order. *

        hashList.addAll(myIntervalsList);

        // Removing ArrayList elements
        myIntervalsList.clear();

        // Adding LinkedHashSet elements to the ArrayList
        //this.myIntervalsList.addAll(hashList);
        
        String[] myIntevalsCleanedAll = new String[hashList.size()];
        this.myIntervalsCleaned = hashList.toArray(myIntevalsCleanedAll);
    }
}
