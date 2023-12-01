public class Main {
    public static void main(String[] args) {
        ProductFactory smartphoneFactory = new SmartphoneFactory();
        ElectronicProduct smartphone = smartphoneFactory.createProduct();
        smartphone.turnOn();
        smartphone.makeCall("123-456-7890");

        ProductFactory laptopFactory = new LaptopFactory();
        ElectronicProduct laptop = laptopFactory.createProduct();
        laptop.turnOn();
        laptop.openApplication("Word Processor");
    }
}