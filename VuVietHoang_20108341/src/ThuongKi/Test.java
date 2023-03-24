package ThuongKi;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so cong nhan:");
		int n=sc.nextInt();
		DanhSachCongNhan  ds = new DanhSachCongNhan(n); 
		
		for ( int i = 0; i < n; i++) 	
		{
		System.out.println("Nhập thông tin công nhân thứ " + (i+1) + ":");
		ds.them(nhap());
		}
		ds.xuat();
		ds.xuatTren200();
		System.out.println("Sap xep giam dan so san pham:");
		ds.sapXep();
		ds.xuat();
	}
	public static CongNhan nhap() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap ma cong nhan: " );
	String maCD = sc.nextLine();
	System.out.println("Nhap ho: " );
	String ho = sc.nextLine();
	System.out.println("Nhap ten: " );
	String ten = sc.nextLine();
	System.out.println("Nhap so san pham: " );
	int soSP = sc.nextInt();
	CongNhan cnhan = new CongNhan(maCD, ho, ten, soSP);
	return cnhan;
	
	}

}
