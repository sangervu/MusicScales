package musicscales;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Arrays;

public class MusicIntervalsList {
    
    MusicScales scales = new MusicScales();
    public List<String> myIntervalsList = new ArrayList<String>();
    // Creating LinkedHashSet
    public LinkedHashSet<String> hashList = new LinkedHashSet<String>();
    // Creating final Array list with no dublicates and strings < 5 char
    public String[] myIntervalsClean;
    
    public String[] scale;

    public int arrayLength, k;

    public void setIntervalList(String intervallit) {
        //* Creating ArrayList of Strings and adding elements to it
        this.myIntervalsList.add(intervallit);
    }

    public void cleanIntervalList() {
        /* Adding ArrayList elements to the LinkedHashSet
      * in order to remove the duplicate elements and 
      * to preserve the insertion order. */

        hashList.addAll(myIntervalsList);

        // Removing ArrayList elements
        myIntervalsList.clear();

        // Adding LinkedHashSet elements to the ArrayList
        this.myIntervalsList.addAll(hashList);
    }

    public void myIntervlasClean() {

        String[] myIntervalsClean = new String[myIntervalsList.size()];

        this.myIntervalsClean = myIntervalsList.toArray(myIntervalsClean);
        arrayLength = myIntervalsClean.length;
        k = 0;
        for (int size = 1; size <= arrayLength; size++) {

            if (myIntervalsClean[size - 1].length() < 5) {

                k = k + 1;

                this.myIntervalsClean[size - 1] = null;
            }
        }
        //System.out.println("k= " + k);
        myIntervalsClean = Arrays.copyOfRange(myIntervalsClean, k, arrayLength);
        this.arrayLength = myIntervalsClean.length;
        this.myIntervalsClean = myIntervalsClean;
    }

    public void myTrueScales() {

        int laskuri = 0;

        //puhdistetun taulukon koko, jossa kaikki ovat potentiaalisia skaaloja
        //tarkistetaan kaikki potentiuaaliset skaalat
        for (int n = 0; n < arrayLength; n++) {

            String scale = scales.getScales(myIntervalsClean[n]);

    
            System.out.println("null lukumäärä " + scale);
           

        }

    }

}
