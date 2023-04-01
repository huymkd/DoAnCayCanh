package caycanh;

import java.util.Scanner;

public class CayLan extends CayCanh {

    private String loiich;

    public CayLan() {

    }

    public CayLan(int macay, String nguongoc, String ngaynhap, int soluong, int giaban, String ten, String loiich) {
        super(macay, nguongoc, ngaynhap, soluong, giaban, ten);
        this.loiich = loiich;
    }

    public String getLoiich() {
        return loiich;
    }

    public void setLoiich(String loiich) {
        this.loiich = loiich;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap loi ich cay Lan: ");
        Scanner sc = new Scanner(System.in);
        loiich = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Ma cay:" + this.getMacay()
                + ", Ten:" + this.getTen()
                + ", Nguon goc:" + this.getNguongoc()
                + ", Ngay nhap:" + this.getNgaynhap()
                + ", So luong:" + this.getSoluong()
                + ", Gia ban:" + this.getGiaban()
                + ", Loi ich:" + this.loiich;
    }

}
