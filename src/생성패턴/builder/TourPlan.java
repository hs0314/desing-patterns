package 생성패턴.builder;

public class TourPlan {

    public TourPlan(String whereToStay, String title, Integer nights, Integer days) {
        this.whereToStay = whereToStay;
        this.title = title;
        this.nights = nights;
        this.days = days;
    }

    private String whereToStay;
    private String title;
    private Integer nights;
    private Integer days;

    public String getWhereToStay() {
        return whereToStay;
    }

    public void setWhereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNights() {
        return nights;
    }

    public void setNights(Integer nights) {
        this.nights = nights;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "TourPlan{" +
                "whereToStay='" + whereToStay + '\'' +
                ", title='" + title + '\'' +
                ", nights=" + nights +
                ", days=" + days +
                '}';
    }
}
