package ENUMS;

public enum BugStatus {
    OPEN("Open"),
    IN_PROGRESS("In progress"),
    RESOLVED("Resolved"),
    CLOSED("Closed"),
    DUPLICATE("Duplicated"),
    CUSTOM("");

    private String description;

    BugStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (this == CUSTOM) {
            this.description = description;
        } else {
            System.out.println("Nie można zmienić opisu dla tego statusu");
        }
    }
}
