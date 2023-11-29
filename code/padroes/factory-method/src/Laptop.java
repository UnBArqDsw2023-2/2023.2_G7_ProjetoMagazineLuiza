public class Laptop implements ElectronicProduct {
    @Override
    public void turnOn() {
        System.out.println("Laptop is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop is turning off");
    }

    @Override
    public void recharge() {
        System.out.println("Charging laptop battery");
    }

    // Additional methods specific to Laptop
    public void openApplication(String appName) {
        System.out.println("Opening " + appName + " on the laptop");
    }

    public void browseInternet() {
        System.out.println("Browsing the internet on the laptop");
    }
}
