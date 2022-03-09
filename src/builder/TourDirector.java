package builder;

public class TourDirector {

    private TourPlanBuilder builder;

    public TourDirector(TourPlanBuilder builder){
        this.builder = builder;
    }

    public TourPlan defaultTrip(){
        return builder.title("title")
                .whereToStay("seoul")
                .nightsAndDays(2,3)
                .getPlan();
    }
}
