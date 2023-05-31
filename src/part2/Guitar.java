package part2;

/**
 *
 * @author Nguyen Hai Linh
 */
public class Guitar {
    // khoi tao thuộc tính attribute

    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;
    // constructor

    public Guitar() {
    }

    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }
// getter and setter

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }
    // insert code hàm toString để show thông tin của object
    // dùng String.format để cho nó thẩm mỹ

    @Override
    public String toString() {
        return String.format("%-10s|%4d|%10s|%10s|%10s|%10s|", serialNumber, price, builder, model, backWood, topWood);
    }
// tao phuong thuc theo yeu cau đề bài
    public void createSound() {
        System.out.println("SerialNumber: " + getSerialNumber());
        System.out.println("price: " + getPrice());
        System.out.println("builder: " + getBuilder());
        System.out.println("model: " + getModel());
        System.out.println("backWood: " + getBackWood());
        System.out.println("topWood: " + getTopWood());

    }
}
