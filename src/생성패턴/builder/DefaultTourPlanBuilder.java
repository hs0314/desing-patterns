package 생성패턴.builder;

public class DefaultTourPlanBuilder implements TourPlanBuilder{
    private String whereToStay;
    private String title;
    private Integer nights;
    private Integer days;

    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        this.nights = nights;
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
        return this;
    }

    @Override
    public TourPlan getPlan() {
        // 필요하다면 여기서 validate
        return new TourPlan(whereToStay, title, nights, days);
    }
}
