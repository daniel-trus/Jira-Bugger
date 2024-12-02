package BusinessLogic;

import BugCointainer.BugList;
import BugCointainer.BugTemplate;

public class BugService {

    private BugList bugList;

    public BugService(BugList bugList) {
        this.bugList = bugList;
    }

    public void addBug(BugTemplate bugTemplate) {

        if(!Guardians.validateDate(bugTemplate)) {
            throw new IllegalArgumentException("Podana data jest przeszła" + bugTemplate.getDate());
        }
        if(!Guardians.validateLenghthOfTitle(bugTemplate.getTitle())) {
            throw new IllegalArgumentException("Tytuł jest zbyt długi.");
        }
        if(!Guardians.validateLengthOfDescription(bugTemplate.getDescription())) {
            throw new IllegalArgumentException("Opis jest zbyt długi.");
        }
        if(!Guardians.validateAttachment(bugTemplate.getAttachment())) {
            throw new IllegalArgumentException("Załącznik jest w nieobsługiwanym formacie");
        }
        bugList.addBug(bugTemplate);
    }
}
