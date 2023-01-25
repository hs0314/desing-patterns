package 행동패턴.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {
    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void register(String subject, Subscriber subscriber){
        List<Subscriber> subscriberList = subscribers.getOrDefault(subject, new ArrayList<>());

        subscriberList.add(subscriber);

        subscribers.put(subject, subscriberList);
    }

    public void unregister(String subject, Subscriber subscriber){
        if(subscribers.containsKey(subject)){
            subscribers.get(subject).remove(subscriber);
        }
    }

    public void sendMessage(User user, String subject, String message){

        // 특정 subject를 구독하는 객체의 특정 메서드 실행
        if(subscribers.containsKey(subject)){
            subscribers.get(subject).forEach(s -> s.handleMessage(user.getName() + ":" + message));
        }
    }
}
