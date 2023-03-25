package TH;
import java.text.NumberFormat;
import java.util.Scanner;
public class TKNganHang {
    private long soTK;
    private String tenTK;
    private double soDu;
    Scanner sc = new Scanner(System.in);
    public TKNganHang() {
    }
    public TKNganHang(long soTK, String tenTK, double soDu) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soDu = soDu;
    }
    public long getSoTK() {
        return this.soTK;
    }
 
    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }
 
    public String getTenTK() {
        return this.tenTK;
    }
 
    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }
 
    public double getSoTienTrongTK() {
        return this.soDu;
    }
 
    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }
    public String toString() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soDu);
        return soTK + "-" + tenTK + "-" + str1;
    }

    public double napTien() {
        double nap;
        System.out.print("Nhập số tiền bạn cần nạp: ");
        nap = sc.nextDouble();
        if (nap >= 0) {
            soDu = nap + soDu;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(nap);
            System.out.println("bạn vừa nạp " + str1 + " vào tài khoản.");
        } else {
            System.out.println("Số tiền nạp vào không hợp lệ!");
        }
        return nap;
    }
 
    public void rutTien() {
        double phi = 20;
        double rut;
        System.out.print("Nhập số tiền bạn cần rút: ");
        rut = sc.nextDouble();
        if (rut <= (soDu - phi)) {
            soDu = soDu - (rut + phi);
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(rut);
            System.out.println("Bạn vừa rút " + str1 + "Đ từ tài khoản. Phí là $5.");
        } else {
            System.out.println("Số tiền muốn rút không hợp lệ!");
            return rut;
        }
             public double daoHan() {
            double laiSuat = 0.035;
            soTienTrongTK = soTienTrongTK + soTienTrongTK * laiSuat;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(soTienTrongTK);
            System.out.println("Bạn vừa được " + str1 + " từ đáo hạn 1 tháng");
            return soTienTrongTK;
        }
     
        void inTK() {
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(soTienTrongTK);
            System.out.printf("%-10d %-20s %-20s \n", soTK, tenTK, str1);
        }
    }
}