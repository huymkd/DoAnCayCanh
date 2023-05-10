package caycanh;

import java.util.Scanner;

public class CayNgayTet extends CayCanh {
    private String ynghia;
    

    public CayNgayTet() {

    }

    public CayNgayTet(String ynghia) {
        this.ynghia = ynghia;
    }

    public CayNgayTet(String ynghia, int macay, String nguongoc, int ngay,int thang,int nam, int soluong, int giaban, String ten) {
        super(macay, nguongoc, thang, nam, ngay, soluong, giaban, ten, ngay);
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
        return "Ma Cay:"+this.getMacay()+
                ", Ten:"+this.getTen()+
                ", Nguon goc:"+this.getNguongoc()+
                ", Ngay :"+this.getNgay()+ ",Thang: "+this.getThang()+",Nam: "+this.getNam()+
                ", So luong:"+this.getSoluong()+
                ", Gia ban:"+this.getGiaban()+
                ", y nghia:" + this.ynghia;
    }

}