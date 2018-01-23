package musicscales;

import java.util.Scanner;
/**
 * @author Sakari Angervuori
 */
public class MainActivity {

    static String intervalli1;
    static String intervalli2;
    static String intervalli3;
    static String intervalli4;
    static String intervalli5;
    static String intervalli6;
    static String intervalli7;
    static String intervalli8;

    public static void main(String[] args) {
        
        String intervallit = "";

        Scanner input = new Scanner(System.in);
        MusicScales scales = new MusicScales();
        MusicIntervals intervals = new MusicIntervals();
        MusicIntervalsList intervalsList = new MusicIntervalsList();

        System.out.println("1. intervalli: H (half), W (whole), m (minor), M (major)");
        intervalli1 = input.nextLine();
        intervals.setInterval(intervalli1);
        intervalsList.setIntervalList(intervalli1);

        System.out.println("2. intervalli: H (half), W (whole), m (minor), M (major), * (wild card)");
        intervalli2 = input.nextLine();

        if (intervalli2.equals("*")) {
            for (int counter2 = 0; counter2 <= 3; counter2++) {
                switch (counter2) {

                    case 0:
                        intervallit = intervalli1 + "H";
                        intervals.setInterval(intervallit);
                        intervalsList.setIntervalList(intervallit);
                        break;
                    case 1:
                        intervallit = intervalli1 + "W";
                        intervals.setInterval(intervallit);
                        intervalsList.setIntervalList(intervallit);
                        break;
                    case 2:
                        intervallit = intervalli1 + "m";
                        intervals.setInterval(intervallit);
                        intervalsList.setIntervalList(intervallit);
                        break;
                    case 3:
                        intervallit = intervalli1 + "M";
                        intervals.setInterval(intervallit);
                        intervalsList.setIntervalList(intervallit);
                        break;
                }
            }
        } else {
            intervallit = intervalli1 + intervalli2;
            intervalsList.setIntervalList(intervallit);
            int x = 0;
            do {
                intervals.setInterval(intervallit);
                x++;
            } while (x <= 3);
        }

        System.out.println("3. intervalli: H (half), W (whole), m (minor), M (major), * (wild card)");
        intervalli3 = input.nextLine();

        if (intervalli3.equals("*")) {
            int counter3 = 0;
            //int j = MusicIntervals.counter; 
            for (counter3 = 0; counter3 <= 3; counter3++) {

                for (int i = 1; i <= 4; i++) {
                    switch (counter3) {

                        case 0:
                            intervallit = MusicIntervals.myIntervals[i] + "H";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                        case 1:
                            intervallit = MusicIntervals.myIntervals[i] + "W";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                        case 2:
                            intervallit = MusicIntervals.myIntervals[i] + "m";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                        case 3:
                            intervallit = MusicIntervals.myIntervals[i] + "M";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                    }
                }
            }

        } else {
            intervallit = intervalli1 + intervalli2 + intervalli3;
            intervalsList.setIntervalList(intervallit);
            int x = 0;
            do {
                intervals.setInterval(intervallit);
                x++;
            } while (x <= 15);
        }

        System.out.println("4. intervalli: H (half), W (whole), m (minor), M (major), * (wild card)");
        intervalli4 = input.nextLine();

        if (intervalli4.equals("*")) {
            int counter4 = 0;
            for (counter4 = 0; counter4 <= 3; counter4++) {

                for (int i = 5; i <= 20; i++) {
                    switch (counter4) {

                        case 0:
                            intervallit = MusicIntervals.myIntervals[i] + "H";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                        case 1:
                            intervallit = MusicIntervals.myIntervals[i] + "W";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                        case 2:
                            intervallit = MusicIntervals.myIntervals[i] + "m";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                        case 3:
                            intervallit = MusicIntervals.myIntervals[i] + "M";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                    }
                }
            }
        } else {
            intervallit = intervalli1 + intervalli2 + intervalli3 + intervalli4;
            intervalsList.setIntervalList(intervallit);
            int x = 0;
            do {
                intervals.setInterval(intervallit);
                x++;
            } while (x <= 63);
        }

        System.out.println("5. intervalli: H (half), W (whole), m (minor), M (major), * (wild card)");
        intervalli5 = input.nextLine();

        if (intervalli5.equals("*")) {
            int counter5 = 0;
            for (counter5 = 0; counter5 <= 3; counter5++) {

                for (int i = 21; i <= 84; i++) {
                    switch (counter5) {

                        case 0:
                            intervallit = MusicIntervals.myIntervals[i] + "H";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                        case 1:
                            intervallit = MusicIntervals.myIntervals[i] + "W";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                        case 2:
                            intervallit = MusicIntervals.myIntervals[i] + "m";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                        case 3:
                            intervallit = MusicIntervals.myIntervals[i] + "M";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                    }
                }
            }
        } else {
            intervallit = intervalli1 + intervalli2 + intervalli3 + intervalli4 + intervalli5;
            intervalsList.setIntervalList(intervallit);
            int x = 0;
            do {
                intervals.setInterval(intervallit);
                x++;
            } while (x <= 255);
        }

        System.out.println("6. intervalli: H (half), W (whole), m (minor), M (major), * (wild card)");
        intervalli6 = input.nextLine();

        if (intervalli6.equals("*")) {
            int counter6 = 0;
            for (counter6 = 0; counter6 <= 3; counter6++) {

                for (int i = 85; i <= 340; i++) {
                    switch (counter6) {

                        case 0:
                            intervallit = MusicIntervals.myIntervals[i] + "H";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                        case 1:
                            intervallit = MusicIntervals.myIntervals[i] + "W";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                        case 2:
                            intervallit = MusicIntervals.myIntervals[i] + "m";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                        case 3:
                            intervallit = MusicIntervals.myIntervals[i] + "M";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                    }
                }
            }
        } else {
            intervallit = intervalli1 + intervalli2 + intervalli3 + intervalli4 + intervalli5 + intervalli6;
            intervalsList.setIntervalList(intervallit);
            int x = 0;
            do {
                intervals.setInterval(intervallit);
                x++;
            } while (x <= 1023);
        }

        System.out.println("7. intervalli: H (half), W (whole), m (minor), M (major), * (wild card)");
        intervalli7 = input.nextLine();

        if (intervalli7.equals("*")) {

            int counter7 = 0;
            for (counter7 = 0; counter7 <= 3; counter7++) {

                for (int i = 341; i <= 1364; i++) {
                    switch (counter7) {

                        case 0:
                            intervallit = MusicIntervals.myIntervals[i] + "H";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                        case 1:
                            intervallit = MusicIntervals.myIntervals[i] + "W";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                        case 2:
                            intervallit = MusicIntervals.myIntervals[i] + "m";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                        case 3:
                            intervallit = MusicIntervals.myIntervals[i] + "M";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                    }
                }
            }
        } else {
            intervallit = intervalli1 + intervalli2 + intervalli3 + intervalli4 + intervalli5 + intervalli6 + intervalli7;
            intervalsList.setIntervalList(intervallit);
            int x = 0;
            do {
                intervals.setInterval(intervallit);
                x++;
            } while (x <= 4095);
        }

        System.out.println("8. intervalli: H (half), W (whole), m (minor), M (major), * (wild card)");
        intervalli8 = input.nextLine();
        String intervalli = intervalli1 + intervalli2 + intervalli3 + intervalli4 + intervalli5 + intervalli6 + intervalli7;

        if (intervalli8.equals("*")) {

            int counter8 = 0;
            for (counter8 = 0; counter8 <= 1; counter8++) {

                for (int i = 1365; i <= 5460; i++) {
                    switch (counter8) {

                        case 0:
                            intervallit = MusicIntervals.myIntervals[i] + "H";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                        case 1:
                            intervallit = MusicIntervals.myIntervals[i] + "W";
                            intervals.setInterval(intervallit);
                            intervalsList.setIntervalList(intervallit);
                            break;
                    }
                }
            }

        } else {
            intervallit = intervalli1 + intervalli2 + intervalli3 + intervalli4 + intervalli5 + intervalli6 + intervalli7 + intervalli8;
            intervalsList.setIntervalList(intervallit);
            int x = 0;
            do {
                intervals.setInterval(intervallit);
                x++;
            } while (x <= 8191);
        }
        intervalsList.cleanIntervalList();
        intervalsList.myIntervlasClean();
        intervalsList.myTrueScales();

        for (String t : intervalsList.myIntervalsCleanReduced) {

            System.out.println(t + " = " + scales.getScales(t));

        }
        
        
           for (String t : intervalsList.myIntervalsClean) {

            System.out.println(t + " = " + scales.getScales(t));

        }
        
    }
}
