package builder;

public class BuilderMain {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourPlanBuilder());

        System.out.println(director.defaultTrip());
    }
}
