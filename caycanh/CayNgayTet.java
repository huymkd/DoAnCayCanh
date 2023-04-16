package caycanh;

import java.util.Scanner;

public class CayNgayTet extends CayCanh {
    private String ynghia;
    

    public CayNgayTet() {

    }

    public CayNgayTet(String ynghia) {
        this.ynghia = ynghia;
    }

    public CayNgayTet(String ynghia, int macay, String nguongoc, String ngaynhap, int soluong, int giaban, String ten) {
        super(macay, nguongoc, ngaynhap, soluong, giaban, ten);
        this.ynghia = ynghia;
    }


    public String getYnghia() {
        return ynghia;
    }

    public void setYnghia(String ynghia) {
        this.ynghia = ynghia;
    }

    

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap y nghia : ");
        Scanner sc = new Scanner(System.in);
        ynghia = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Ma cay:" + this.getMacay()
                + ", Ten:" + this.getTen()
                + ", Nguon goc:" + this.getNguongoc()
                + ", Ngay nhap:" + this.getNgaynhap()
                + ", So luong:" + this.getSoluong()
                + ", Gia ban:" + this.getGiaban()
                + ", y nghia:" + this.ynghia;
    }

}