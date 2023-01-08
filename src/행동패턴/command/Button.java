package 행동패턴.command;

public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press(){
        command.execute();
    }
}
