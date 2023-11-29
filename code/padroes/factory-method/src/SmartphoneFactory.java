public class SmartphoneFactory extends ProductFactory {
    @Override
    public ElectronicProduct createProduct() {
        return new Smartphone();
    }
}
