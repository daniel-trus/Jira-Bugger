package BugCointainer;

import ENUMS.BugStatus;
import ENUMS.Priority;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class BugTemplate {

    private static int idCounter = 0;
    private int id;
    private Priority priority;
    private BugStatus bugStatus;
    private LocalDate date;
    private String title;
    private String description;
    private String label;
    private String reporter;
    private String assignee;
    private String linkIssue;
    private Object attachment;


    @Builder
    public BugTemplate(@NonNull Priority priority, BugStatus bugStatus, int id, @NonNull LocalDate date, @NonNull String title, String description, String label,@NonNull String reporter, String assignee, String linkIssue, Object attachment) {

        if (bugStatus == null) bugStatus = BugStatus.OPEN;
        if (description == null) description = "Brak opisu";
        if (label == null) label = "Brak etykiety";
        if (assignee == null) assignee = "Nie została przypisana do błędu żadna osoba";
        if (linkIssue == null) linkIssue = "Brak linków";
//        if (attachment == null) attachment = "Brak załączników";

        this.id = ++idCounter;
        this.priority = priority;
        this.bugStatus = bugStatus;
        this.date = date;
        this.title = title;
        this.description = description;
        this.label = label;
        this.reporter = reporter;
        this.assignee = assignee;
        this.linkIssue = linkIssue;
        this.attachment = attachment;
    }
}
