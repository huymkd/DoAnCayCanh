package caycanh;

import java.util.Scanner;

public class CayCanh {

    private int macay;
    private String nguongoc;
    private int ngay;
    private int thang;
    private int nam;
    private int soluong;
    private int giaban;
    private String ten;
    private int ngaymax;

    public CayCanh() {

    }

    public CayCanh(int macay, String nguongoc, int thang, int nam, int ngay, int soluong, int giaban, String ten, int ngaymax) {
        this.giaban = giaban;
        this.ngay = ngay;
        this.nguongoc = nguongoc;
        this.soluong = soluong;
        this.ten = ten;
        this.macay = macay;
        this.thang = thang;
        this.nam = nam;
        this.ngaymax = ngaymax;

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

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngaynhap) {
        this.ngay = ngay;
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

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getNgaymax() {
        return ngaymax;
    }

    public void setNgaymax(int ngaymax) {
        this.ngaymax = ngaymax;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten cay: ");
        ten = sc.nextLine();
        System.out.print("Nhap nguon goc: ");
        nguongoc = sc.nextLine();
        System.out.print("Nhap ngay: ");
        ngay = sc.nextInt();
        System.out.print("Nhap thang:");
        thang = sc.nextInt();
        System.out.print("Nhap nam:");
        nam = sc.nextInt();
       
        if (ngay < 0 || ngay > 31) {
            System.out.println("Ngay khong hop le! Vui long thao tac lai!!");
        } else if (nam < 0 || nam > 2023) {
            System.out.println("Nam khong hop le!Vui long thao tac lai!!!");
            System.out.println("Nhap lai nam: ");
            nam = sc.nextInt();
        } else if (thang < 0 || thang > 12) {
            System.out.println("Thang khong hop le!Vui long thao tac lai!!");
            System.out.println("Nhap lai thang: ");
            nam = sc.nextInt();
        } else {
            switch (thang) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    ngaymax = 31;
                    break;
                case 2:
                    if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                        ngaymax = 29;
                    } else {
                        ngaymax = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    ngaymax = 30;
                    break;
            }
        }
        if (ngay < 0 || ngay > ngaymax) {
            System.out.println("Ngay khong hop le! Vui long thao tac lai.");
            System.out.print("Nhap lai ngay: ");
            ngay = sc.nextInt();
        }
        System.out.print("Nhap ma cay: ");
        macay = sc.nextInt();
        System.out.print("Nhap so luong: ");
        soluong = sc.nextInt();
        System.out.print("Nhap gia ban: ");
        giaban = sc.nextInt();
    }

    @Override
    public String toString() {
        return "CayCanh"
                + "Ten cay: " + ten
                + "Nguon goc: " + nguongoc
                + ", Ngay:" + ngay + ",Thang: " + thang + ",Nam:" + nam
                + ", So luong: " + soluong
                + ", Gia ban: " + giaban + "";
    }
}
