package HangThucPham;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
public class HTP {
	private int MaHang;
	private String TenHang;
	private double DonGia;
	private int SoTon;
	private Date NSX,HSD;

	public HTP(int MaHang,String TenHang,double DonGia, Date NSX,Date HSD, int SoTon) {
		this.DonGia=DonGia;
		this.HSD=HSD;
		this.NSX=NSX;
		this.TenHang=TenHang;
		this.MaHang=MaHang;
		this.SoTon=SoTon;
		
	}
	public HTP() {
		}
	public int getMaHang() {
		return MaHang;
	}
	public void setMaHang(int maHang) {
		this.MaHang = maHang;
	}
	public String getTenHang() {
		return TenHang;
	}
	public void setTenHang(String tenHang) {
		this.TenHang = tenHang;
	}
	public double getDonGia() {
		return DonGia;
	}
	public void setDonGia(double donGia) {
		this.DonGia = donGia;
	}
	public int getSoTon() {
		return SoTon;
	}
	public void setSoTon(int soTon) {
		this.SoTon = soTon;
	}
	public Date getNSX() {
		return NSX;
	}
	public void setNSX(Date nSX) {
		this.NSX = nSX;
	}
	public Date getHSD() {
		return HSD;
	}
	public void setHSD(Date hSD) {
		this.HSD = hSD;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	
	Locale LocaleVn = new Locale ("vi","VN");
	NumberFormat numberFormat = NumberFormat.getCurrencyInstance(LocaleVn);
	String str = numberFormat.format(DonGia);
	SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy/mm/dd");
	String str1 = simpleDateFormat.format(HSD);
	String str2 = simpleDateFormat.format(NSX);
	
	return "* Mat hang nay: "
			+ "- Ma hang: "+MaHang
			+ "- Ten hang: "+TenHang
			+ "- Don gia: "+str
			+ "- So ton: "+SoTon
			+ "- NSX: "+str2
			+ "- HSD: "+str1;
	
}
public void setSoTon() {
	
}
public void setNSX(int day,int month,int year) {
	Calendar calendar= Calendar.getInstance();
	calendar.set(year,month-1,day);
	this.NSX=calendar.getTime();
}
public void setHSD(int day,int month, int year) {
	Calendar calendar= Calendar.getInstance();
	calendar.set(year,month-1,day);
	this.HSD=calendar.getTime();
}
public boolean KTTenHang(boolean KT) {
	if (this.TenHang==""||this.TenHang.isEmpty()) {
		System.out.println("! Ten hang khong duoc de trong");
	}else {
		KT=false;
	}
		return KT;
}
public boolean KTSanXuat(boolean SX) {
	Date today= new Date();
	today.getTime();
	if(this.getHSD().compareTo(getHSD())<0) {
		System.out.println("NSX va HSD khong hop le!!");
	}else {
		if (this.getNSX().compareTo(today)>0) {
			System.out.println("Loi NSX!");
		}else {
			SX=false;
		}
	}
	return SX;
}
public void KTHan() {
	Date today = new Date();
	today.getTime();
	if(this.getHSD().compareTo(today)>0) {
		System.out.println("San pham con han su dung!");
	}else {
		System.out.println("San pham da het han su dung!!");
	}
}
}
