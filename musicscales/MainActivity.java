package musicscalesnew;

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

        System.out.println("1. intervalli: H (half), W (whole), m (minor), M (major), * (wild card)");
        intervalli1 = input.nextLine();

        if (intervalli1.equals("*")) {
            for (int counter1 = 0; counter1 <= 3; counter1++) {
                switch (counter1) {

                    case 0:
                        intervallit = "H";
                        intervals.setInterval(intervallit);
                        break;
                    case 1:
                        intervallit = "W";
                        intervals.setInterval(intervallit);

                        break;
                    case 2:
                        intervallit = "m";
                        intervals.setInterval(intervallit);

                        break;
                    case 3:
                        intervallit = "M";
                        intervals.setInterval(intervallit);

                        break;
                }
            }
        } else {
            intervallit = intervalli1;

            int x = 0;
            do {
                intervals.setInterval(intervallit);
                x++;
            } while (x <= 3);
        }

        System.out.println("2. intervalli: H (half), W (whole), m (minor), M (major), * (wild card)");
        intervalli2 = input.nextLine();

        if (intervalli2.equals("*")) {
            for (int counter2 = 0; counter2 <= 3; counter2++) {

                for (int i = 0; i <= 3; i++) {
                    switch (counter2) {

                        case 0:
                            intervallit = intervals.myIntervals[i] + "H";
                            intervals.setInterval(intervallit);

                            break;
                        case 1:
                            intervallit = intervals.myIntervals[i] + "W";
                            intervals.setInterval(intervallit);

                            break;
                        case 2:
                            intervallit = intervals.myIntervals[i] + "m";
                            intervals.setInterval(intervallit);

                            break;
                        case 3:
                            intervallit = intervals.myIntervals[i] + "M";
                            intervals.setInterval(intervallit);

                            break;
                    }
                }
            }
        } else {

            for (int counter2 = 0; counter2 <= 3; counter2++) {
                for (int i = 0; i <= 3; i++) {
                    intervallit = intervals.myIntervals[i] + intervalli2;
                    intervals.setInterval(intervallit);

                }
            }
        }

        System.out.println("3. intervalli: H (half), W (whole), m (minor), M (major), * (wild card)");
        intervalli3 = input.nextLine();

        if (intervalli3.equals("*")) {
            int counter3 = 0;
            //int j = intervals.counter; 
            for (counter3 = 0; counter3 <= 3; counter3++) {

                for (int i = 4; i <= 19; i++) {
                    switch (counter3) {

                        case 0:
                            intervallit = intervals.myIntervals[i] + "H";
                            intervals.setInterval(intervallit);

                            break;
                        case 1:
                            intervallit = intervals.myIntervals[i] + "W";
                            intervals.setInterval(intervallit);

                            break;
                        case 2:
                            intervallit = intervals.myIntervals[i] + "m";
                            intervals.setInterval(intervallit);

                            break;
                        case 3:
                            intervallit = intervals.myIntervals[i] + "M";
                            intervals.setInterval(intervallit);

                            break;
                    }
                }
            }

        } else {
            for (int counter3 = 0; counter3 <= 3; counter3++) {
                for (int i = 4; i <= 19; i++) {
                    intervallit = intervals.myIntervals[i] + intervalli3;
                    intervals.setInterval(intervallit);

                }
            }
        }

        System.out.println("4. intervalli: H (half), W (whole), m (minor), M (major), * (wild card)");
        intervalli4 = input.nextLine();

        if (intervalli4.equals("*")) {
            int counter4 = 0;
            for (counter4 = 0; counter4 <= 3; counter4++) {

                for (int i = 20; i <= 83; i++) {
                    switch (counter4) {

                        case 0:
                            intervallit = intervals.myIntervals[i] + "H";
                            intervals.setInterval(intervallit);

                            break;
                        case 1:
                            intervallit = intervals.myIntervals[i] + "W";
                            intervals.setInterval(intervallit);

                            break;
                        case 2:
                            intervallit = intervals.myIntervals[i] + "m";
                            intervals.setInterval(intervallit);

                            break;
                        case 3:
                            intervallit = intervals.myIntervals[i] + "M";
                            intervals.setInterval(intervallit);

                            break;
                    }
                }
            }
        } else {
            for (int counter4 = 0; counter4 <= 3; counter4++) {
                for (int i = 20; i <= 83; i++) {
                    intervallit = intervals.myIntervals[i] + intervalli4;
                    intervals.setInterval(intervallit);

                }
            }
        }

        System.out.println("5. intervalli: H (half), W (whole), m (minor), M (major), * (wild card)");
        intervalli5 = input.nextLine();

        if (intervalli5.equals("*")) {
            int counter5 = 0;
            for (counter5 = 0; counter5 <= 3; counter5++) {

                for (int i = 84; i <= 339; i++) {
                    switch (counter5) {

                        case 0:
                            intervallit = intervals.myIntervals[i] + "H";
                            intervals.setInterval(intervallit);

                            break;
                        case 1:
                            intervallit = intervals.myIntervals[i] + "W";
                            intervals.setInterval(intervallit);

                            break;
                        case 2:
                            intervallit = intervals.myIntervals[i] + "m";
                            intervals.setInterval(intervallit);

                            break;
                        case 3:
                            intervallit = intervals.myIntervals[i] + "M";
                            intervals.setInterval(intervallit);

                            break;
                    }
                }
            }
        } else {
            for (int counter5 = 0; counter5 <= 3; counter5++) {
                for (int i = 84; i <= 339; i++) {
                    intervallit = intervals.myIntervals[i] + intervalli5;
                    intervals.setInterval(intervallit);

                }
            }
        }

        System.out.println("6. intervalli: H (half), W (whole), m (minor), M (major), * (wild card)");
        intervalli6 = input.nextLine();

        if (intervalli6.equals("*")) {
            int counter6 = 0;
            for (counter6 = 0; counter6 <= 3; counter6++) {

                for (int i = 340; i <= 1363; i++) {
                    switch (counter6) {

                        case 0:
                            intervallit = intervals.myIntervals[i] + "H";
                            intervals.setInterval(intervallit);

                            break;
                        case 1:
                            intervallit = intervals.myIntervals[i] + "W";
                            intervals.setInterval(intervallit);

                            break;
                        case 2:
                            intervallit = intervals.myIntervals[i] + "m";
                            intervals.setInterval(intervallit);

                            break;
                        case 3:
                            intervallit = intervals.myIntervals[i] + "M";
                            intervals.setInterval(intervallit);

                            break;
                    }
                }
            }
        } else {
            for (int counter6 = 0; counter6 <= 3; counter6++) {
                for (int i = 340; i <= 1363; i++) {
                    intervallit = intervals.myIntervals[i] + intervalli6;
                    intervals.setInterval(intervallit);

                }
            }
        }

        System.out.println("7. intervalli: H (half), W (whole), m (minor), M (major), * (wild card)");
        intervalli7 = input.nextLine();

        if (intervalli7.equals("*")) {

            int counter7 = 0;
            for (counter7 = 0; counter7 <= 3; counter7++) {

                for (int i = 1364; i <= 5459; i++) {
                    switch (counter7) {

                        case 0:
                            intervallit = intervals.myIntervals[i] + "H";
                            intervals.setInterval(intervallit);

                            break;
                        case 1:
                            intervallit = intervals.myIntervals[i] + "W";
                            intervals.setInterval(intervallit);

                            break;
                        case 2:
                            intervallit = intervals.myIntervals[i] + "m";
                            intervals.setInterval(intervallit);

                            break;
                        case 3:
                            intervallit = intervals.myIntervals[i] + "M";
                            intervals.setInterval(intervallit);

                            break;
                    }
                }
            }
        } else {
            for (int counter7 = 0; counter7 <= 3; counter7++) {
                for (int i = 1364; i <= 5459; i++) {
                    intervallit = intervals.myIntervals[i] + intervalli7;
                    intervals.setInterval(intervallit);

                }
            }
        }

        System.out.println("8. intervalli: H (half), W (whole), m (minor), M (major), * (wild card)");
        intervalli8 = input.nextLine();

        if (intervalli8.equals("*")) {

            int counter8 = 0;
            for (counter8 = 0; counter8 <= 1; counter8++) {

                for (int i = 5460; i <= 21843; i++) {
                    switch (counter8) {

                        case 0:
                            intervallit = intervals.myIntervals[i] + "H";
                            intervals.setInterval(intervallit);

                            break;
                        case 1:
                            intervallit = intervals.myIntervals[i] + "W";
                            intervals.setInterval(intervallit);

                            break;
                    }
                }
            }

        } else {

            for (int counter8 = 0; counter8 <= 1; counter8++) {
                for (int i = 5460; i <= 21843; i++) {
                    intervallit = intervals.myIntervals[i] + intervalli8;
                    intervals.setInterval(intervallit);
                }
            }
        }

        intervals.myTrueScales();
        intervals.cleanInterval();

        for (String t : intervals.myIntervalsCleaned) {

            System.out.println(t + " = " + scales.getScales(t));

        }
    }
}
