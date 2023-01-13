import Interfaces.Speakable;

public class Radio implements Speakable {
    @Override
    public String speak() {
        return "Welcome to AlexRadio";
    }
}