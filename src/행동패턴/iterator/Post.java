package 행동패턴.iterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Post {
    private String content;
    private LocalDateTime createdDateTime;

    public Post(String content, LocalDateTime createdDateTime) {
        this.content = content;
        this.createdDateTime = createdDateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
}
