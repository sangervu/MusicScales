package melodicminor.ii.v.i;

import java.util.HashMap;

public class HS_Sharp {

    public String getScales(String savel) {

        HashMap<String, String> points = new HashMap<String, String>();
        
        points.put("C","C#" );
        points.put("C#","D" );
        points.put("D","D#" );
        points.put("D#","E" );
        points.put("E","F" );
        points.put("F","F#" );
        points.put("F#","G" );
        points.put("G","G#" );
        points.put("G#","A" );
        points.put("A","A#" );
        points.put("A#","B" );
        points.put("B","C" );
        
        return points.get(savel);

    }
}