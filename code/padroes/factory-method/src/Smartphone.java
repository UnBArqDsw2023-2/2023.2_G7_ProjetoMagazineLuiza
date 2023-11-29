public class Smartphone implements ElectronicProduct {
    @Override
    public void turnOn() {
        System.out.println("Smartphone is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smartphone is turning off");
    }

    @Override
    public void recharge() {
        System.out.println("Charging smartphone battery");
    }

    // Additional methods specific to Smartphone
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    public void sendText(String message) {
        System.out.println("Sending text: " + message);
    }
}
