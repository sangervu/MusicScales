package melodicminor.ii.v.i;

import java.util.HashMap;

public class WS_Flat {

    public String getScales(String savel) {

        HashMap<String, String> points = new HashMap<String, String>();
        
        points.put("C","D" );
        points.put("Db","Eb" );
        points.put("D","E" );
        points.put("Eb","F" );
        points.put("E","Gb" );
        points.put("F","G" );
        points.put("Gb","Ab" );
        points.put("G","A" );
        points.put("Ab","Bb" );
        points.put("A","B" );
        points.put("Bb","C" );
        points.put("B","Db" );

        
        return points.get(savel);

    }
}
