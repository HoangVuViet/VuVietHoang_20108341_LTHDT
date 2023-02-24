package Hoang;
import java.util.Calendar;
import java.text.NumberFormat;
import java.text.DateFormat;
import java.text.Dateformat;
import java.text.Locale;
public class CD {
private String maCD;
private String tuaCD;
private Calendar ngayPH;
private double DonGia;
private int SoBH;

public static void main(String[] args) {
public String getMaCD() {
	return maCD;
}
public void setMaCD(String macd) throws Exception {
	if (macd!="") {
	this.maCD = macd;
	} else throw new Exception("Loi Ma CD!");
}
public String getTuaCD() {
	return tuaCD;
}
public void setTuaCD(String tuacd) throws Exception {
	if (tuacd!="") {
	this.tuaCD = tuacd;
	} else throw new Exception("Loi tua de!");
}
public Calendar getNgayPH() {
	return ngayPH;
}
public void setNgayPH(Calendar ngayPH) throws Exception{
	if (ngayPH!= null) {
	this.ngayPH = ngayPH;
	} else throw new Exception("Loi ngay!");
}
public double getDonGia() {
	return DonGia;
}
public void setDonGia(double DonGia) {
	this.DonGia = DonGia;
}
public int getSoBH() {
	return SoBH;
}
public void setSoBH(int soBH) {
	this.SoBH = soBH;
}

public CD() {
	this.maCD = "00000000";
	this.tuaCD = "xxxxxxxx";
	this.ngayPH =null;
	this.DonGia =10000;
	this.SoBH =0;
}
public CD(String macd, String tuacd, Calendar ngayPH, double DonGia, int soBH) throws Exception {
	super();
	if (macd!="")
	this.maCD = macd;
	else throw new Exception("Loi ma!");
	if (tuacd!="")
	this.tuaCD = tuacd;
	else throw new Exception ("Loi tua!");
	this.ngayPH = ngayPH;
	this.DonGia = DonGia;
	if (soBH>0)
	this.SoBH = soBH;
	else throw new Exception("Loi so ban hang!");
}
public double getThanhTien() {
	return getDonGia()*getSoBH();
}
public void TieuDe() {
	System.out.println("Test kq");
	for (int i=0;i<72;i++)
		System.out.println("-");
	System.out.println();
	System.out.println("|%-10s|%-10s|%-14s|%-10s|%-10S|%-12s|\n"
			,"Ma CD","Tua CD","Ngay Phat Hanh","Don Gia","So Bai Hat","Tong Hoa Don");
	for (int i=0;i<72:i++)
		System.out.println("-");
	System.out.println(); 
}
Locale lc = new Locale("vi","VN");
DateFormat df= DateFormat.getDateInstance(1,1c);
NumberFormat sf= NumberFormat.getCurrencyInstance(1c);
@Override
public String toString() {
	String s="";
	s+=s.format("|%-10s|%-10s|%14s|%10s|%10S|%12s|",getMaCD(),getTuaCD(),
			df.format(getNgayPH(),getTime()),sf.format(getDonGia()), getSoBH,
					sf.format(getThanhTien()));
			return s;
}
}
