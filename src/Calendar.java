import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Hollyday> hollydays = new ArrayList<>();

    public Calendar() {
        this.hollydays.add(new Hollyday("01/01/2023", "Confraternização mundial"));
        this.hollydays.add(new Hollyday("21/02/2023", "Carnaval"));
        this.hollydays.add(new Hollyday("17/04/2023", "Páscoa"));
        this.hollydays.add(new Hollyday("21/04/2023", "Tiradentes"));
        this.hollydays.add(new Hollyday("01/05/2023", "Dia do trabalho"));
        this.hollydays.add(new Hollyday("08/06/2023", "Corpus Christi"));
        this.hollydays.add(new Hollyday("07/09/2023", "Independência do Brasil"));
        this.hollydays.add(new Hollyday("12/10/2023", "Nossa Senhora Aparecida"));
        this.hollydays.add(new Hollyday("02/11/2023", "Finados"));
        this.hollydays.add(new Hollyday("15/11/2023", "Proclamação da República"));
        this.hollydays.add(new Hollyday("25/12/2023", "Natal"));
    }

    public void checkHollyday(String date) {
        boolean found = false;
        for (Hollyday hollyday : this.hollydays) {
            if (date.equals(hollyday.getDate())) {
                System.out.println(hollyday.getDescription());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Não existe um feriado com essa data!");
        }
    }

    public void printHollydays() {
        System.out.println("Os feriados são:");
        for (Hollyday hollyday : this.hollydays) {
            System.out.println(hollyday.getDate() + " => " + hollyday.getDescription());
        }
    }
}
