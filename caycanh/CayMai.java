package caycanh;

import java.util.Scanner;

public class CayMai extends CayCanh {
    private String loaimai;
    public CayMai(){
        
    }
    public CayMai(int macay, String nguongoc, String ngaynhap, int soluong, int giaban, String ten,String loaimai){
        super(macay, nguongoc, ngaynhap, soluong, giaban, ten);
        this.loaimai=loaimai;
    }

    public String getLoaimai() {
        return loaimai;
    }

    public void setLoaimai(String loaimai) {
        this.loaimai = loaimai;
    }

    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhap loai mai: ");
        Scanner sc=new Scanner(System.in);
        loaimai =sc.nextLine();
    }
    @Override
    public String toString() {
        return "Ma Cay:"+this.getMacay()+
                ", Ten:"+this.getTen()+
                ", Nguon goc:"+this.getNguongoc()+
                ", Ngay nhap:"+this.getNgaynhap()+
                ", So luong:"+this.getSoluong()+
                ", Gia ban:"+this.getGiaban()+
                ", Loai Mai:"+this.loaimai;
    }   
}
