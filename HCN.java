package HCN;

public class HCN {
    public double CD;
    public double CR;
    public void setCD(double cd) throws Exception {
        if (cd>0) {
            this.CD=cd;
        } else throw new Exception("Chieu dai lon hon 0");
    }
    public double getCD() {
        return this.CD;
    }
    public void setCR(double cr) throws Exception {
      if (cr>0) {
          this.CR=cr;
      } else throw new Exception("Chieu rong >0");
    }
    public double getCR() {
        return this.CR;
    }
    public HCN() {

    }
    public HCN(double cd, double cr) {
        this.CD=cd;
        this.CR=cr;
    }
    public double getChuVi() {
        return (getCD()+getCR())*2;
    }
    public double getDienTich() {
        return (getCD()*getCR());
    }
    public static void main(String[] args) throws Exception {
        HCN h1= new HCN();
        h1.setCD(5);
        h1.setCR(3);
        System.out.println("Chu Vi la:"+h1.getChuVi());
        System.out.println("Dien tich la:"+h1.getDienTich());
    }
}