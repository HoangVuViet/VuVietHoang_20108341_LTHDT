package HangThucPham;

import java.util.Scanner;

public class Test_HTP {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HTP tp = new HTP();
        boolean KT = true;
        boolean SX = true;
        System.out.println("Nhap ma hang: ");

        tp.setMaHang(scanner.nextInt());
        scanner.nextLine();
        do {
            System.out.println("Nhập tên hàng : ");
            tp.setTenHang(scanner.nextLine());
        } while (tp.KTTenHang(KT));
        System.out.println("Nhập đơn giá : ");
        tp.setDonGia(scanner.nextDouble());
        do {
            System.out.println("Nhập năm,tháng,ngày sản xuất : ");
            tp.setNSX(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            System.out.println("nhập năm,tháng,ngày hết hạn : ");
            tp.setHSD(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        } while (tp.KTSanXuat(SX));
        System.out.println(tp);
        tp.KTHan();

    }
}
