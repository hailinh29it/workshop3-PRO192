
package carmanager_Part1;

/**
 *
 * @author Nguyen Hai Linh
 */
public class Tester {
    public static void main(String[] args) {
        // tao object vao 1 vung new
        Car c = new Car(); // không có đổ thuộc tính vào
        c.pressAcceleratorButton();
        c.pressStartButton();
        c.output();
        // tạo object với tên c2 vào 1 vùng new mới và rót dữ liệu vào
        Car c2 = new Car("red", 100, true, true);
        c2.pressAcceleratorButton();
        // dung set.colour de thay đổi màu
        c2.setColour("black");
        System.out.println("Colour of c2: "+ c2.getColour());
        c2.output();
    }
}
