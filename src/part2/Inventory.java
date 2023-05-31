
package part2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyen Hai Linh
 */
public class Inventory {

    public static void main(String[] args) {
        // khoi tao mảng các object có tên là guitarsList 
        ArrayList<Guitar> guitarsList = new ArrayList<>();
        // khởi tạo object của lớp để sử dụng các phương thức
        Inventory inventory1 = new Inventory();
        // thêm guitar
        inventory1.addGuitar(guitarsList);
        // show list các object guitar
        inventory1.display(guitarsList);
        // tìm kiếm số seri
        System.out.println("Search serial number: "+inventory1.searchGuitarBySerialNumber(guitarsList));
    }
    // phương thức tìm số seri của guitar và trả về object có số serial cần tìm
    // nếu không có trả về null
    public Guitar searchGuitarBySerialNumber (ArrayList<Guitar> guitarsList){
        System.out.println("Enter serial number you want to search! ");
        // nhap số serial bạn muốn tìm
        String serialNumber = new Scanner(System.in).nextLine();
        for (int i = 0; i < guitarsList.size(); i++) {
            // dùng .get đễ liệt kê từng object trong list
            // dùng .getSerialNumber nhầm muốn so sánh số seri
            // và dùng .equals đễ so sánh với số seri mà  bạn đã nhập và muốn tìm ban đầu 
            if(guitarsList.get(i).getSerialNumber().equals(serialNumber)){
                System.out.println("we got it! ");
                // nếu có thông báo và trả về object có trùng số seri
                return guitarsList.get(i);
            }
        }
    
     // nếu tìm không thấy thì ta trả về null
    return null;
    }
    public void addGuitar(ArrayList<Guitar> guitarsList) {
        System.out.println("-------Add new guitar -------");
        int check = 1;
        do {
            // nhap thong tin guitar
            Scanner sc = new Scanner(System.in);
            System.out.println("Input serial number of guitar: ");
            String serialNumber = sc.nextLine();
            if (serialNumber == "" || serialNumber == null) {
                System.out.println("You can't add guitar with don't have serialNumber");
                check = 1;
            }
            System.out.print("Input price(int) of guitar: ");
            int price = Integer.parseInt(sc.nextLine());
            System.out.print("Input builder: ");
            String builder = sc.nextLine();
            System.out.print("Input model: ");
            String model = sc.nextLine();
            System.out.print("Input backWood: ");
            String backWood = sc.nextLine();
            System.out.print("Input topWood: ");
            String topWood = sc.nextLine();
            // su dung guitarslist.add đễ khởi tạo một vùng new cho mỗi
            // cái object trong list và đổ dữ liệu vào
            guitarsList.add(new Guitar(serialNumber, price, builder, model, backWood, topWood));
            System.out.println("Do you want to add new Guitar? Yes:1 || No: 0");
            check = Integer.parseInt(sc.nextLine());

        } while (check == 1);

    }
// show thong tin của mỗi guitar trong list có tên là guitarslist
    public void display(ArrayList<Guitar> guitarsList) {
        for (Guitar guitar : guitarsList) {
            System.out.println(guitar);
        }
    }

}
