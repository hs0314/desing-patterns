package 행동패턴.visitor;

// visitor 인터페이스 (기능모음)
public interface Device {
    void print(Circle circle);

    void print(Rectangle rectangle);
}
