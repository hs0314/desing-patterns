package singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class SingletonMain {

    public static void main(String []args) throws Exception{
        Settings settings1 = Settings.getInstanceSimple();
        Settings settings2 = Settings.getInstanceDoubleCheckedLocking();
        Settings settings3 = Settings.getInstanceStaticInner();
        SettingsEnum settings4 = SettingsEnum.INSTANCE; // 리플렉션, 직렬화등에도 안전한 방법
        System.out.println("basic : " + (settings1 == settings1));


        // 싱글톤 패턴을 깨는 안좋은 사용방법
        // 1. 리플렉션 사용
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings usingReflectionObj = constructor.newInstance();
        System.out.println("case1 : " + (settings2 == usingReflectionObj));



        // 2. 직렬화 & 역직렬화
        // readResolve() 메서드 안에서 싱글톤 인스턴스를 가져오게끔 수정하면 의도대로 사용 가능
        Settings deserializedObj = null;
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
            out.writeObject(settings2);
        }

        try(ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
            deserializedObj = (Settings) in.readObject();
        }
        System.out.println("case2 : " + (settings2 == deserializedObj));

    }
}
