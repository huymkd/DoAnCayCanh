package caycanh;

import java.util.Scanner;

public class CayCanh {

    private int macay;
    private String nguongoc;
    private String ngaynhap;
    private int soluong;
    private int giaban;
    private String ten;

    public CayCanh() {

    }

    public CayCanh(int macay, String nguongoc, String ngaynhap, int soluong, int giaban, String ten) {
        this.giaban = giaban;
        this.ngaynhap = ngaynhap;
        this.nguongoc = nguongoc;
        this.soluong = soluong;
        this.ten = ten;
        this.macay = macay;
    }

    public int getMacay() {
        return macay;
    }

    public void setMacay(int macay) {
        this.macay = macay;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public long getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public long getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten cay: ");
        ten = sc.nextLine();                        
        System.out.print("Nhap nguon goc: ");
        nguongoc = sc.nextLine();
        System.out.print("Nhap ngay nhap: ");
        ngaynhap = sc.nextLine();
        System.out.print("Nhap ma cay: ");
        macay = sc.nextInt();
        System.out.print("Nhap so luong: ");
        soluong = sc.nextInt();
        System.out.print("Nhap gia ban: ");
        giaban = sc.nextInt();
    }

    @Override
    public String toString() {
        return "CayCanh["
                + "Ten cay" + ten
                + "Nguon goc=" + nguongoc
                + ", Ngay nhap=" + ngaynhap
                + ", So luong=" + soluong
                + ", Gia ban=" + giaban + "]";
    }

}