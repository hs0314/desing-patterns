package prototype;

public class GithubIssue implements Cloneable {
    private Integer id;
    private String title;

    private GithubRepository repository;

    public GithubIssue(GithubRepository repository){
        this.repository = repository;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl(){
        return String.format("httsp://github.com/%s/%s/issues/%s", this.repository.getUser(), this.repository.getName(), this.id);
    }

    @Override
    public GithubIssue clone() {
        try {
            // 기본적인 clone()은 shallow copy지원을 하기 때문에 deep copy를 원하면 여기에 추가로 구현
            GithubIssue clone = (GithubIssue) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
