package ENUMS;

public enum Priority {
    LOW(5),
    MEDIUM(4),
    HIGH(3),
    CRITICAL(2),
    BLOCKER(1);


    private final int code;

    private Priority(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
