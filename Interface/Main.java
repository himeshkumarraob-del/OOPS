interface Playable {
    void play();
}

interface Recordable {
    void record();
}

class SmartDevice implements Playable, Recordable {

    public void play() {
        System.out.println("Playing media...");
    }

    public void record() {
        System.out.println("Recording media...");
    }
}

class Main {
    public static void main(String[] args) {
        SmartDevice device = new SmartDevice();

        device.play();
        device.record();
    }
}