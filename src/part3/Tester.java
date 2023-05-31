
package part3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyen Hai Linh
 */
public class Tester {

    public static void main(String[] args) {
        // khởi tạo 2 object của lớp guitar với tên là obj1 và obj2
        guitar obj1 = new guitar();
        // rót thông tin vào obj2
        guitar obj2 = new guitar("G123", 2000, "Sony",
                "Model123", "hardWood", "softWood");
        System.out.println("State of obj 1: ");
        // gọi phương thức createSound của obj1
        obj1.createSound();
        System.out.println("State of obj2: ");
        // gọi phương thức createSound của obj2
        obj2.createSound();

        System.out.println("Set price = 3000 of obj1");
        // gọi phương thức setPrice để gán và thay thế giá trị mới cho object1
        obj1.setPrice(3000);
        // sau cùng là gọi phương thức getPrice đễ in ra giá của obj1
        System.out.println("get price of obj1: " + obj1.getPrice());

    }
    
}
