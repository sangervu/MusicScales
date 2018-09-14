package melodicminor.ii.v.i;

import java.util.HashMap;

public class MelodicMinorScales {

    public String getScales(String asteikko) {

        HashMap<String, String> points = new HashMap<String, String>();
        
        points.put("WHWWWWH","mi Ma7 Melodic minor scale" );
        points.put("HWWWWHW","mi7 Dorian b2 scale" );
        points.put("WWWWHWH","Ma7#5 Lydian augmented scale" );
        points.put("WWWHWHW","7 Lydian dom./Acoustic scale" );
        points.put("WWHWHWW","7 Aeolian dom. scale" );
        points.put("WHWHWWW","mi7b5 Half dim. scale" );
        points.put("HWHWWWW","7 Altered scale" );
        
        return points.get(asteikko);

    }
}