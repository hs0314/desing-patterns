package 행동패턴.mediator;

public class Guest {

    private Integer id;
    private FrontDesk frontDesk;

    public Guest(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
        frontDesk.setGuest(this);
    }

    public void getTowers(int numberOfTowers){
        frontDesk.getTowers(this, numberOfTowers);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
