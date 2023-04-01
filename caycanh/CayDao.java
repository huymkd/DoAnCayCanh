package caycanh;

import java.util.Scanner;

public class CayDao extends CayCanh {

    private String dang;

    public CayDao() {

    }

    public CayDao(int macay, String nguongoc, String ngaynhap, int soluong, int giaban, String ten, String dang) {
        super(macay, nguongoc, ngaynhap, soluong, giaban, ten);
        this.dang = dang;
    }

    public String getdang() {
        return dang;
    }

    public void setKieu(String dang) {
        this.dang = dang;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap dang cay Dao: ");
        Scanner sc = new Scanner(System.in);
        dang = sc.nextLine();

    }

    @Override
    public String toString() {
        return "Ma cay:" + this.getMacay()
                + " ,Ten:" + this.getTen()
                + " ,Nguon goc:" + this.getNguongoc()
                + " ,Ngay nhap:" + this.getNgaynhap()
                + " ,So luong:" + this.getSoluong()
                + " ,Gia ban:" + this.getGiaban()
                + " ,Dang:" + this.dang;
    }

}
