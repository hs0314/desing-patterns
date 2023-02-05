package 행동패턴.mediator;

// Mediator 역할 수행
// 여기에 객체들에 대한 의존성을 몰아넣고 관리
public class FrontDesk {
    private CleaningService cleaningService;
    private Guest guest;

    // 순환참조를 방지하기 위해서 Mediator에서 보고있는 객체의 생성시점에 Mediator객체에 등록하도록 함
    public CleaningService getCleaningService() {
        return cleaningService;
    }

    public void setCleaningService(CleaningService cleaningService) {
        this.cleaningService = cleaningService;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public void getTowers(Guest guest, int numberOfTowers) {
        // cleaningService.getTowers(guest) 여기서 guest를 넘기면 객체끼리의 결합이 생기므로 X

        cleaningService.getTowers(guest.getId(), numberOfTowers);
    }

    public String getRoomNumberFor(Integer id) {
        return "0000";
    }
}
