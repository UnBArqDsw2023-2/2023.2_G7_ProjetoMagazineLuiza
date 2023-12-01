public class LaptopFactory extends ProductFactory {
    @Override
    public ElectronicProduct createProduct() {
        return new Laptop();
    }
}
