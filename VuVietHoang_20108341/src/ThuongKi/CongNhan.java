package ThuongKi;

import java.util.Scanner;

public class CongNhan {
	    private String maCN;
	    private String ho;
	    private String ten;
	    private int soSP;
	    Scanner sc=new Scanner(System.in);
	    public CongNhan() {
	    }

	    public CongNhan(String maCN, String ho, String ten, int soSP) {
	        this.maCN = maCN;
	        this.ho = ho;
	        this.ten = ten;
	        this.soSP = soSP;
	    }

	    public String getMaCN() {
	    	return maCN;
	    }

	    public void setMaCN(String maCN) {
	        this.maCN = maCN;
	    }

	    public String getHo() {
	    	return ho;
	    }

	    public void setHo(String ho) {
	        this.ho = ho;
	    }

	    public String getTen() {
	    	return ten;
	    }

	    public void setTen(String ten) {
	        this.ten = ten;
	    }

	    public int getSoSP() {
	    	return soSP;
	    }

	    public void setSoSP(int soSP) {
	        this.soSP = soSP;
	    }

	    public double tinhLuong() {
	        double dongia;
	        if (soSP < 200) {
	            dongia = 0.5;
	        } else if (soSP < 400) {
	            dongia = 0.55;
	        } else if (soSP < 600) {
	            dongia = 0.6;
	        } else {
	            dongia = 0.65;
	        }
	        return soSP * dongia;
	    }

	    @Override
	    public String toString() {
	        return "Ma CN: " + maCN + ", Ho: " + ho + ", Ten: " + ten + ", So SP: " + soSP + ", Luong: " + tinhLuong();
	    }
}

