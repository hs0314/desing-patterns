package 생성패턴.prototype;

public class PrototypeMain {
    public static void main(String[] args) {

        GithubRepository repository = new GithubRepository();
        repository.setUser("user1");
        repository.setName("dev-repo");

        GithubIssue issue1 = new GithubIssue(repository);
        issue1.setId(1);
        issue1.setTitle("issue1 title here");

        // issue1
        System.out.println(issue1.getUrl());
        GithubIssue clone = (GithubIssue) issue1.clone();
        System.out.println(clone.getUrl());

    }
}
