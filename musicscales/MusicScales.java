package musicscales;

import java.util.HashMap;

public class MusicScales {

    public String getScales(String asteikko) {

        HashMap<String, String> points = new HashMap<String, String>();
        points.put("WWWHWHW", "Acoustic scale");
        points.put("WHWWHWW", "Aeolian mode or natural minor scale");
        points.put("WHmHHmH", "Algerian scale");
        points.put("HWHWWWW", "Altered scale");
        points.put("mHmHmH", "Augmented scale");
        points.put("WWHWHHH", "Bebop dominant scale");
        points.put("mWWHHmH", "Blues scale");
        points.put("HHHHHHH", "Chromatic scale");
        points.put("WHWWWHW", "Dorian mode");
        points.put("HmHWHmH", "Double harmonic scale");
        points.put("HmWWWHH", "Enigmatic scale");
        points.put("HmHHHmH", "Flamenco mode");
        points.put("WHmHHWW", "Gypsy scale[a]");
        points.put("WHHHWWW", "Half diminished scale");
        points.put("WWHWHmH", "Harmonic major scale");
        points.put("WHWWHmH", "Harmonic minor scale");
        points.put("MWHMH ", "Hirajoshi scale");
        points.put("WHmHHmH", "Hungarian Gypsy scale[a]");
        points.put("WHmHHmH", "Hungarian minor scale");
        points.put("HMWHM", "In scale");
        points.put("HMHmW", "Insen scale");
        points.put("WWHWWWH", "Ionian mode or major scale");
        points.put("HWHWH", "Istrian scale");
        points.put("HMHMW", "Iwato scale");
        points.put("HWWHWWW", "Locrian mode");
        points.put("WWWWHWH", "Lydian augmented scale");
        points.put("WWWHWWH", "Lydian mode");
        points.put("WWHHHWH", "Major bebop scale");
        points.put("WWHHWWW", "Major Locrian scale");
        points.put("WWmWm", "Major pentatonic scale");
        points.put("WHWHWWH", "Melodic minor scale");
        points.put("WHWHWWH", "Melodic minor scale(ascending)");
        points.put("mWWmW", "Minor pentatonic scale");
        points.put("WWHWWHW", "Mixolydian mode or Adonai malakh mode");
        points.put("HWWWWWH", "Neapolitan major scale");
        points.put("HWWWHmH", "Neapolitan minor scale");
        points.put("WHWHWHWH", "Octatonic scale");
        points.put("HWHWHWHW", "Diminished scale");
        points.put("HmHHWmH", "Persian scale");
        points.put("WHmHWWH", "Pfluke scale");
        points.put("HmHWHWW", "Phrygian dominant scale");
        points.put("HWWWHWW", "Phrygian mode");
        points.put("WWWmHW", "Prometheus scale");
        points.put("HmWHmW", "Tritone scale");
        points.put("WHmHWHW", "Ukrainian Dorian scale");
        points.put("WWWWWW", "Whole tone scale");
        points.put("mWWmW", "Yo scale");

        return points.get(asteikko);

    }
}
    
