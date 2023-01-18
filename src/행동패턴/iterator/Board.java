package 행동패턴.iterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {
    List<Post> posts = new ArrayList<>();

    public List<Post> getPosts(){
        return posts;
    }

    public void addPost(String content, LocalDateTime dateTime){
        this.posts.add(new Post(content, dateTime));
    }

    public Iterator<Post> getDefaultIterator(){
        return posts.iterator();
    }

    public Iterator<Post> getRecentPostIterator(){
        return new RecentPostIterator(this);
    }
}
