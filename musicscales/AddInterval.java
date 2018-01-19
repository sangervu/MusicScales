package musicscales;

public class AddInterval {

    public String intervallit;

    public void addInterval(String intervalli) {

        int counter = 0;
        for (counter = 0; counter <= 3; counter++) {
            switch (counter) {

                case 0:
                    intervallit = intervalli + "H";
                    break;
                case 1:
                    intervallit = intervalli + "W";
                    break;
                case 2:
                    intervallit = intervalli + "m";
                    break;
                case 3:
                    intervallit = intervalli + "M";
                    break;
            }
        }
    }

    public String getInterval() {
        return intervallit;

    }
}
