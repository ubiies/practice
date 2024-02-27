package day0227;

public class Product {
    public int productNo;
    public String productName;

    public Product(int productNo, String productName) {
        this.productNo = productNo;
        this.productName = productName;
    }

    public int getProductNo() {
        return this.productNo;
    }

    public String getName() {
        return this.productName;
    }
}

class Test7 {
    public static void main(String[] args) {
        Product p = new Product(1, "Celine");
        IDCard i = (IDCard)p;
        i.getInfo();
    }
}
