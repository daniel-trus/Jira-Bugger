import BugCointainer.BugList;
import BugCointainer.BugTemplate;
import BusinessLogic.BugService;
import ENUMS.Priority;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class Test_Main {

    private BugList bugList;
    private BugService bugService;

//    @BeforeEach
//    public void setUp() {
//        bugList = new BugList();
//        bugService = new BugService(bugList);
//    }

    @Test
    public void addBug_VarietyTests() {
        bugList = new BugList();
        bugService = new BugService(bugList);

        LocalDate specificDate = LocalDate.of(2025,01,02);

        bugList.addBug(new BugTemplate(Priority.LOW,null,0,specificDate,"To jest przykładowy tytuł buga",null,null,"Jak Jankowski",
                null,null, null));
        bugList.addBug(new BugTemplate(Priority.LOW,null,0,specificDate,"To jest przykładowy tytuł buga",null,null,"Jak Jankowski",
                null,null, null));

        String bugFromList = bugList.getBug(0);
        Assertions.assertEquals("To jest przykładowy tytuł buga", bugFromList, "Lalala");

        LocalDate bugDateFromList = bugList.getDate(0);
        Assertions.assertEquals(LocalDate.now(), bugDateFromList);

        int bugID = bugList.getID(1);
        Assertions.assertEquals(2,bugID);
    }

    @Test
    public void addBugWithPastDate() {
        bugList = new BugList();
        bugService = new BugService(bugList);

        LocalDate specificDate = LocalDate.of(2024,10,13);

        bugList.addBug(new BugTemplate(Priority.LOW,null,1,specificDate,"To jest przykładowy tytuł buga",null,null,"Jak Jankowski",
                null,null, null));


      Assertions.assertEquals(LocalDate.now(),bugList.getDate(0));
    }


    @Test
    public void addBug2() {
        bugList = new BugList();
        bugService = new BugService(bugList);

        LocalDate specificDate = LocalDate.of(2024,10,15);
        bugList.addBug(new BugTemplate(Priority.LOW,null,2,specificDate,"To jest drugi tytuł buga",null,null,"Jak Jankowski",
                null,null, null));
        String bugFromList = bugList.getBug(0);

        Assertions.assertEquals("To jest drugi tytuł buga", bugFromList);
    }
    @Test
    public void getAllBugs() {
        bugList = new BugList();
        bugService = new BugService(bugList);

        LocalDate specificDate = LocalDate.of(2024,10,15);
        bugList.addBug(new BugTemplate(Priority.LOW,null,1,specificDate,"To jest przykładowy tytuł buga",null,null,"Jak Jankowski",
                null,null, null));
        bugList.getAllBugs();
    }
    @Test
    public void getSingleBug() {
        bugList = new BugList();
        bugService = new BugService(bugList);

        LocalDate specificDate = LocalDate.of(2024,10,15);
        bugList.addBug(new BugTemplate(Priority.LOW,null,1,specificDate,"To jest przykładowy tytuł buga",null,null,"Jak Jankowski",
                null,null, null));
        System.out.println("Bug pierwszy to: " + bugList.getBug(0));
    }

    @Test
    public void checkTitleGuardian() {
        bugList = new BugList();
        bugService = new BugService(bugList);

        LocalDate specificDate = LocalDate.of(2024,10,15);
        bugService.addBug(new BugTemplate(Priority.LOW,null,1,specificDate,"To jest przykładowy tytuł buga buga buga buga",null,null,"Jak Jankowski",
                null,null, null));
    }

    @Test
    public void checkDescriptionGuardian() {
        bugList = new BugList();
        bugService = new BugService(bugList);

        LocalDate specificDate = LocalDate.of(2024,10,15);
        bugService.addBug(new BugTemplate(Priority.LOW,null,1,specificDate,"To jest przykładowy tytuł buga","Loorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus sodales fringilla. Donec ut lorem tincidunt, malesuada turpis bibendum, semper massa. Cras in fermentum sapien, at tempus odio. Quisque nunc magna, commodo quis dolor in, viverra bibendum velit. Aenean ornare nisi in purus porttitor tristique. Suspendisse potenti. Fusce lacinia orci et felis placerat vestibulum pharetra.",null,"Jak Jankowski",
                null,null, null));
    }

    @AfterEach
    public void tearDown() {
        bugList.clear();
    }
}
