package melodicminor.ii.v.i;

import java.util.HashMap;

public class WS_Sharp {

    public String getScales(String savel) {

        HashMap<String, String> points = new HashMap<String, String>();
        
        points.put("C","D" );
        points.put("C#","D#" );
        points.put("D","E" );
        points.put("D#","F" );
        points.put("E","F#" );
        points.put("F","G " );
        points.put("F#","G#" );
        points.put("G","A" );
        points.put("G#","A#" );
        points.put("A","B" );
        points.put("A#","C" );
        points.put("B","C#" );
 
        
        return points.get(savel);

    }
}