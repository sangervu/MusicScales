package musicscales;

import java.util.Arrays;

public class MusicIntervals {

    public static String[] myIntervals = new String[13653];
    static int counter = -1;


    public void setInterval(String intervallit) {
        
        counter = counter + 1;
        this.myIntervals[counter] = intervallit;
        //System.out.println(counter);
    }
    
     public String[] getInterval() {

        return myIntervals;
    }
}



