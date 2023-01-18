package 행동패턴.iterator;

import java.time.LocalDateTime;
import java.util.Iterator;

/**
 * 집합객체의 내부구현을 드러내지않고 집합 요소에 대한 순회를 가능하게 하는 패턴
 *  - iterator 인터페이스 : 클라이언트가 순회를 위해서 사용하는 인터페이스 ex) getNext(), hasNext()
 *  - Aggregate 인터페이스(optional) : iterator에 의해서 순회되는 것 ex) List
 *
 * 장점
 *  - 집합 객체(aggregate)의 구조에 대해서 알 필요없이 순회 가능
 *
 * 사용예시
 *  - 자바 java.util.Enumeration -> Iterator
 *  - 스프링 CompositIterator (iterator 여러개를 조합 가능)
 */
public class IteratorMain {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("post1", LocalDateTime.MIN);
        board.addPost("post2", LocalDateTime.now());
        board.addPost("post3", LocalDateTime.MAX);

        // case1. 들어온대로 순회 1->2->3
        Iterator<Post> it = board.getDefaultIterator();
        while(it.hasNext()){
            System.out.println(it.next().getContent());
        }


        // case2. 가장 최신글 먼저 순회 3->2->1
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while(recentPostIterator.hasNext()){
            System.out.println(recentPostIterator.next().getContent());
        }

    }
}
