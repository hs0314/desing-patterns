package 생성패턴.builder;

public interface TourPlanBuilder {

    TourPlanBuilder title(String title);
    TourPlanBuilder nightsAndDays(int nights, int days);
    TourPlanBuilder whereToStay(String whereToStay);

    TourPlan getPlan();
}
