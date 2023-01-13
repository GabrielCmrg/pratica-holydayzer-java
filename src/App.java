public class App {
    public static void main(String[] args) throws Exception {
        Calendar myCalendar = new Calendar();
        String validHollyday = "01/01/2023";
        String invalidHollyday = "02/01/2023";

        myCalendar.checkHollyday(validHollyday);
        myCalendar.checkHollyday(invalidHollyday);

        myCalendar.printHollydays();
    }
}
