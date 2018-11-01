package musicscalesnew;

import java.util.HashMap;

public class MusicScales {

    public String getScales(String asteikko) {

        HashMap<String, String> points = new HashMap<String, String>();
       
        points.put("WHmHHmH", "Algerian scale");
        points.put("WWHWHHH", "Bebop dominant scale");
        points.put("mWWHHmH", "Blues scale");
        points.put("HHHHHHHH", "Chromatic scale");
        points.put("HmHWHmH", "Double harmonic scale");
        points.put("HmWWWHH", "Enigmatic scale");
        points.put("HmHHHmH", "Flamenco mode");
        points.put("WHmHHWW", "Gypsy scale[a]");
        points.put("WWHWHmH", "Harmonic major scale");       
        points.put("WHmHHmH", "Hungarian Gypsy scale[a]");
        points.put("WHmHHmH", "Hungarian minor scale");      
        points.put("WWHHHWH", "Major bebop scale");
        points.put("WWHHWWW", "Major Locrian scale");
        points.put("HWWWWWH", "Neapolitan major scale");
        points.put("HWWWHmH", "Neapolitan minor scale");
        points.put("HmHHWmH", "Persian scale");
        points.put("WHmHWWH", "Pfluke scale");      
        points.put("WHmHWHW", "Ukrainian Dorian scale");
        
        //sextatonic scales
        points.put("WWWWWW", "Whole tone scale");
        points.put("WWWmHW", "Prometheus scale");
        points.put("HmWHmW", "Tritone scale");
        points.put("mHmHmH", "Augmented scale");
           
        //octatonic scales
        points.put("WHWHWHWH", "Octatonic scale");
        points.put("HWHWHWHW", "Diminished scale");
      
        //pentatonic scales
        points.put("MWHMH", "Hirajoshi scale");
        points.put("HMWHM", "In scale");
        points.put("HMHmW", "Insen scale");
        points.put("HWHWH", "Istrian scale");
        points.put("HMHMW", "Iwato scale");
        points.put("mWWmW", "Minor pentatonic scale");
        points.put("mWWmW", "Yo scale"); 
        points.put("WWmWm", "Major pentatonic scale"); 
       
        //church modes        
        points.put("WWHWWWH", "Ionian mode or major scale");
        points.put("WHWWWHW", "Dorian mode");
        points.put("HWWWHWW", "Phrygian mode");
        points.put("WWWHWWH", "Lydian mode"); 
        points.put("WWHWWHW", "Mixolydian mode or Adonai malakh mode");
        points.put("WHWWHWW", "Aeolian mode or natural minor scale");
        points.put("HWWHWWW", "Locrian mode");
        
        //melodic minor mode
        points.put("WHWWWWH", "Melodic minor scale(ascending)");
        points.put("WHWWWWH","mi Ma7 Melodic minor scale (mm)" );
        points.put("HWWWWHW","mi7 Dorian b2 mm scale" );
        points.put("WWWWHWH","Ma7#5 Lydian augmented mm scale" );
        points.put("WWWHWHW","7 Lydian dom./Acoustic mm scale" );
        points.put("WWHWHWW","7 Aeolian dom. mm scale" );
        points.put("WHWHWWW","mi7b5 Half dim. mm scale" );
        points.put("HWHWWWW","7 Altered mm scale" );
       
        //harmonic minor modes
        points.put("HWHWWHm", "Superlocrian hm scale (Locrian b4)");
        points.put("mHWHWWH", "Lydian #2 hm scale");
        points.put("HmHWHWW", "Phrygian dominant hm scale");
        points.put("HmHWHWW", "Phrygian dominant scale");
        points.put("WHmHWHW", "Dorian #4 hm scale (Ukrainian Dorian scale)");
        points.put("WWHmHWH", "Ionian #5 hm scale");
        points.put("HWWHmHW", "Locrian #6 hm scale");
        points.put("WHWWHmH", "Harmonic minor scale (hm)");
               
        return points.get(asteikko);

    }
}