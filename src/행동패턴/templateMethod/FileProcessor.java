package 행동패턴.templateMethod;

import java.io.BufferedReader;
import java.io.FileReader;

public abstract class FileProcessor {
    private String path;

    public FileProcessor(String path) {
        this.path = path;
    }

    public int process(){

        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            int result = 0;
            String line = null;

            while((line = reader.readLine()) != null){
                result = getResult(result, line); // 구체클래스에서 정의하는 알고리즘 적용
            }

            return result;
        }catch(Exception e){
            throw new IllegalArgumentException("file can't be found.");
        }
    }

    protected abstract int getResult(int result, String line);
}
