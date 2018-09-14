package melodicminor.ii.v.i;

import java.util.HashMap;

public class HS_Flat {

    public String getScales(String savel) {

        HashMap<String, String> points = new HashMap<String, String>();
        
        points.put("C","Db" );
        points.put("Dd","D" );
        points.put("D","Eb" );
        points.put("Eb","E" );
        points.put("E","F" );
        points.put("F","Gb" );
        points.put("Gb","G" );
        points.put("G","Ab" );
        points.put("Ab","A" );
        points.put("A","Bb" );
        points.put("Bb","B" );
        points.put("B","C" );
        
        return points.get(savel);

    }
}