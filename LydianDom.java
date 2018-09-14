package melodicminor.ii.v.i;

/**
 *
 * @author angervuorisa
 */
public class LydianDom {

    String note2, note3, note4, note5, note6, note7, note8;
    public static String newScale;

    static String sharpKeys = "D#EA#B";
    static String flatKeys = "CFGb";

    WS_Sharp ws_sharp = new WS_Sharp();
    HS_Sharp hs_sharp = new HS_Sharp();
    WS_Flat ws_flat = new WS_Flat();
    HS_Flat hs_flat = new HS_Flat();

    public void scale(String minorKey) {

        if (sharpKeys.contains(minorKey)
                || minorKey.contains("C#") || minorKey.contains("F#") || minorKey.contains("G#")) {

          
            //roote note
            System.out.println("1. note: " + minorKey);
            //intervalli1 = "W";
            note2 = ws_sharp.getScales(minorKey);
            System.out.println("2. note: " + note2);
            //intervalli2 = "H";
            note3 = hs_sharp.getScales(note2);
            System.out.println("3. note: " + note3);
            //intervalli3 = "W";
            note4 = ws_sharp.getScales(note3);
            System.out.println("4. note: " + note4);
            //intervalli4 = "W";
            note5 = ws_sharp.getScales(note4);
            System.out.println("5. note: " + note5);
            //intervalli5 = "W";
            note6 = ws_sharp.getScales(note5);
            System.out.println("6. note: " + note6);
            //intervalli6 = "W";
            note7 = ws_sharp.getScales(note6);
            System.out.println("7. note: " + note7);
            //intervalli7 = "H";
            note8 = hs_sharp.getScales(note7);
            System.out.println("8. note: " + note8);

        } else if (flatKeys.contains(minorKey)
                || minorKey.contains("Db") || minorKey.contains("Eb") || minorKey.contains("Ab") || minorKey.contains("Bb")) {

   
            //roote note
            System.out.println("1. note: " + minorKey);
            //intervalli1 = "W";
            note2 = ws_flat.getScales(minorKey);
            System.out.println("2. note: " + note2);
            //intervalli2 = "H";
            note3 = hs_flat.getScales(note2);
            System.out.println("3. note: " + note3);
            //intervalli3 = "W";
            note4 = ws_flat.getScales(note3);
            System.out.println("4. note: " + note4);
            //intervalli4 = "W";
            note5 = ws_flat.getScales(note4);
            System.out.println("5. note: " + note5);
            //intervalli5 = "W";
            note6 = ws_flat.getScales(note5);
            System.out.println("6. note: " + note6);
            //intervalli6 = "W";
            note7 = ws_flat.getScales(note6);
            System.out.println("7. note: " + note7);
            //intervalli7 = "H";
            note8 = hs_flat.getScales(note7);
            System.out.println("8. note: " + note8);

        } else {
            System.out.println("This is not a valid key");

        }
    }

}
