package day0227;

public class IDCard extends Product {

    public IDCard(int productNo, String productName) {
        super(productNo, productName);
    }

    @Override
    public String getName() {
        return "카드 소유자: " + this.getName();
    }

    public String getInfo() {
        return this.productNo + ", " + this.productName;
    }
}
