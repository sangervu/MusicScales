package melodicminor.ii.v.i;

/**
 *
 * @author angervuorisa
 */
public class MelodicMinor {

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

            //System.out.println(" W H W W W W H ");
            
            //intervalli1 = "W";
            note2 = ws_sharp.getScales(minorKey);

            //intervalli2 = "H";
            note3 = hs_sharp.getScales(note2);

            //intervalli3 = "W";
            note4 = ws_sharp.getScales(note3);

            //intervalli4 = "W";
            note5 = ws_sharp.getScales(note4);

            //intervalli5 = "W";
            note6 = ws_sharp.getScales(note5);

            //intervalli6 = "W";
            note7 = ws_sharp.getScales(note6);

            //intervalli7 = "H";
            note8 = hs_sharp.getScales(note7);

            this.newScale = minorKey + " " + note2 + " " + note3 + " " + note4 + " " + note5 + " " + note6 + " " + note7 + " " + note8;

        } else if (flatKeys.contains(minorKey)
                || minorKey.contains("Db") || minorKey.contains("Eb") || minorKey.contains("Ab") || minorKey.contains("Bb")) {

            //System.out.println(" W H W W W W H ");
            
            //intervalli1 = "W";
            note2 = ws_flat.getScales(minorKey);

            //intervalli2 = "H";
            note3 = hs_flat.getScales(note2);

            //intervalli3 = "W";
            note4 = ws_flat.getScales(note3);

            //intervalli4 = "W";
            note5 = ws_flat.getScales(note4);

            //intervalli5 = "W";
            note6 = ws_flat.getScales(note5);

            //intervalli6 = "W";
            note7 = ws_flat.getScales(note6);

            //intervalli7 = "H";
            note8 = hs_flat.getScales(note7);

            this.newScale = minorKey + " " + note2 + " " + note3 + " " + note4 + " " + note5 + " " + note6 + " " + note7 + " " + note8;

        } else {
            System.out.println("This is not a valid key");

        }
    }

}
