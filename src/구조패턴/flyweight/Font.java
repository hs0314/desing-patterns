package 구조패턴.flyweight;

// final을 붙이고 getter만 추가함으로써 immutable한 객체 생성 가능
public final class Font {

    final String family;
    final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public int getSize() {
        return size;
    }
}
