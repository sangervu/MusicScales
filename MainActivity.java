package melodicminor.ii.v.i;

import java.util.Scanner;

/**
 * @author Sakari Angervuori
 */
public class MainActivity {

    static String minorKey;
    static String newScale;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jatka = 1;

        while (jatka == 1) {

            System.out.println("Jatka, paina 1 ");
            jatka = input.nextInt();

            if (jatka == 1) {

                System.out.println("Input key for the minor II V I progression");
                Scanner key = new Scanner(System.in);
                minorKey = key.nextLine();

                System.out.println("1: I (mi Ma7) 2: I (Dorian b2) 3: II (Half.dim) 4: V (Alt) 5: V (Lyd.dom) 6: V (Aeol.dom) ");
                int valinta = input.nextInt();
                switch (valinta) {

                    case 1:
                        MelodicMinor melodicMinor = new MelodicMinor();
                        melodicMinor.scale(minorKey);
                        newScale = MelodicMinor.newScale;

                        System.out.println("Melodic minor scale for I cord (mi MA7):");
                        System.out.println(" W H W W W W H ");
                        System.out.println(newScale);

                        break;
                    case 2:
                        Dorianb2 dorianb2 = new Dorianb2();
                        dorianb2.scale(minorKey);
                        newScale = Dorianb2.newScale;

                        System.out.println("Dorian b2 scale on for I cord (mi7)");
                        System.out.println(" H W W W W H W ");
                        System.out.println(newScale);

                        break;
                    case 3:
                        HalfDiminished halfDim = new HalfDiminished();
                        halfDim.scale(minorKey);
                        newScale = HalfDiminished.newScale;

                        System.out.println("Half diminished scale for II cord (mi7b5)");
                        System.out.println(" W H W H W W W ");
                        System.out.println(newScale);

                        break;
                    case 4:
                        Altered altered = new Altered();
                        altered.scale(minorKey);
                        newScale = Altered.newScale;

                        System.out.println("Diminished whole tone scale for V cord (7 altered)");
                        System.out.println(" H W H W W W W ");
                        System.out.println(newScale);

                        break;
                    case 5:
                        LydianDom lydianDom = new LydianDom();
                        lydianDom.scale(minorKey);
                        newScale = LydianDom.newScale;

                        System.out.println("Lydian dominant/Acoustic scale for V cord (7)");
                        System.out.println(" W W W H W H W ");
                        System.out.println(newScale);

                        break;
                    case 6:
                        AeolianDom aeolianDom = new AeolianDom();
                        aeolianDom.scale(minorKey);
                        newScale = AeolianDom.newScale;

                        System.out.println("Aeolian dominant scale for V cord (7)");
                        System.out.println(" W W H W H W W ");
                        System.out.println(newScale);

                        break;

                }

            }
        }
    }

}
