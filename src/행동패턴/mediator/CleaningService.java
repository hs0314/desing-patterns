package 행동패턴.mediator;

public class CleaningService {

    private FrontDesk frontDesk = new FrontDesk();

    public CleaningService(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
        frontDesk.setCleaningService(this);
    }

    public void getTowers(Integer id, int numberOfTowers) {
        String roomNumber = frontDesk.getRoomNumberFor(id);

        System.out.println("provide " + numberOfTowers + " to " + roomNumber);
    }
}
