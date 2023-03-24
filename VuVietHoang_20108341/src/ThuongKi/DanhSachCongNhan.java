package ThuongKi;

public class DanhSachCongNhan {
	    private CongNhan[] dsCN;
	    private int n;

	    public DanhSachCongNhan(int n) {
	       
	        dsCN = new CongNhan[n];
	        n=0;
	    }

	    public boolean them(CongNhan cn) {
	        if (n < dsCN.length) {
	            dsCN[n] = cn;
	            n++;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public void xuat() {
	        for (int i = 1; i < n; i++) {
	            System.out.println(dsCN[i].toString());
	        }
	    }

	    public int soLuong() {
	        return n;
	    }

	    public void xuatTren200() {
	        System.out.println("Danh sach cong nhan lam tren 200 san pham: ");
	        for (int i = 0; i < n; i++) {
	            if (dsCN[i].getSoSP() > 200) {
	                System.out.println(dsCN[i].toString());
	            }
	        }
	    }

	    public void sapXep() {
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (dsCN[i].getSoSP() < dsCN[j].getSoSP()) {
	                    CongNhan temp = dsCN[i];
	                    dsCN[i] = dsCN[j];
	                    dsCN[j] = temp;
	                }
	            }
	        }
	    }
	}

