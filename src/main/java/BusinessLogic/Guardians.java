package BusinessLogic;

import BugCointainer.BugTemplate;
import java.time.LocalDate;

public class Guardians {

    public static boolean validateDate(BugTemplate bugTemplate) {
        LocalDate date = bugTemplate.getDate();
        if (date.isBefore(LocalDate.now())) {
            System.err.println("Data nie może być przeszła!");
            return false;
        }
        return true;
    }

    public static boolean validateLenghthOfTitle(String title) {
        return title.length() <= 40;
    }

    public static boolean validateLengthOfDescription(String description) {
        return description.length() <= 400;
    }

    public static boolean validateAttachment(Object attachment) {
        if(attachment == null) {
            return true;
        }

        if(attachment instanceof String) {
            String file = (String) attachment;
            return file.endsWith(".pdf") || file.endsWith(".jpg") || file.endsWith(".png");
        }
        return false;
    }
}
