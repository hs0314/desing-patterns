package singleton;

import java.io.Serializable;

public class Settings implements Serializable {
    private static volatile Settings instance; // volatile은 자바 1.5이상에서만 동작

    private Settings(){

    }

    // 1. 간단한 방법
    public static Settings getInstanceSimple(){
        if(instance == null){
            instance = new Settings();
        }

        return instance;
    }

    // 2. double checked locking방법을 통해서 쓰레드 세이프한 처리
    public static Settings getInstanceDoubleCheckedLocking(){
        if(instance == null){
            synchronized (Settings.class){
                if(instance == null){
                    instance = new Settings();
                }
            }
        }

        return instance;
    }

    // 3. static inner 클래스 사용
    private static class SettingsHolder{
        private static final Settings INSTANCE = new Settings();
    }
    public static Settings getInstanceStaticInner(){
        return SettingsHolder.INSTANCE;
    }
}
