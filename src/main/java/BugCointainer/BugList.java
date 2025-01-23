package BugCointainer;

import java.time.LocalDate;
import java.util.ArrayList;

public class BugList {
    ArrayList<BugTemplate> bugs = new ArrayList<>();


    public void addBug(BugTemplate bugTemplate) {
        bugs.add(bugTemplate);
        System.out.println("Dodano buga: " + bugTemplate.getTitle());
    }


    public String getBug(int index) {
        return bugs.get(index).getTitle();
    }

    public LocalDate getDate(int index) {
        return bugs.get(index).getDate();
    }

    public int getID(int index) {
        return bugs.get(index).getId();
    }

    public void clear() {
        bugs.clear();  // Czyszczenie listy po zakończeniu testu
    }

    public void getAllBugs() {
        if (bugs.isEmpty()) {
            System.out.println("Brak bugów do naprawy :)");
        } else {
            System.out.println("Lista bugów: ");
            int index = 1;
            for (BugTemplate bug : bugs) {
                System.out.println(index + "." + bug.getTitle());
                index++;
            }
        }
    }
}
