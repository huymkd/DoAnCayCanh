package caycanh;

import java.util.Scanner;

public class CayPhongThuy extends CayCanh {

    private String congdung;
    private String mausac;

    public CayPhongThuy() {

    }
    public CayPhongThuy(String congdung, String mausac) {
        this.congdung = congdung;
        this.mausac = mausac;
    }

    public CayPhongThuy(String congdung, String mausac, int macay, String nguongoc, int ngay,int thang, int nam, int soluong, int giaban, String ten) {
        super(macay, nguongoc, thang, nam, nam, soluong, giaban, ten, ngay);
        this.congdung = congdung;
        this.mausac = mausac;
    }

    public String getCongdung() {
        return congdung;
    }

    public void setCongdung(String congdung) {
        this.congdung = congdung;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap cong dung cay phong thuy: ");
        Scanner sc = new Scanner(System.in);
        congdung = sc.nextLine();

    }

    @Override
    public String toString() {
        return "Ma Cay:"+this.getMacay()+
                ", Ten:"+this.getTen()+
                ", Nguon goc:"+this.getNguongoc()+
                ", Ngay :"+this.getNgay()+ ",Thang: "+this.getThang()+",Nam: "+this.getNam()+
                ", So luong:"+this.getSoluong()+
                ", Gia ban:"+this.getGiaban()+
                " ,Cong Dung:" + this.congdung;
    }

}
