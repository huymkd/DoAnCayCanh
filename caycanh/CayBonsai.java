package caycanh;

import java.util.Scanner;

public class CayBonsai extends CayCanh {
    private String kieudang ;
    public CayBonsai(){
        
    }

    public String getKieudang() {
        return kieudang;
    }

    public void setKieudang(String kieudang) {
        this.kieudang = kieudang;
    }

    public CayBonsai(String kieudang) {
        this.kieudang = kieudang;
    }

    public CayBonsai(int macay, String kieudang, String nguongoc, int soluong, int giaban, int ngay,int thang,int nam, String ten) {
        super(macay, nguongoc, thang, nam, ngay, soluong, giaban, ten, ngay);
        this.kieudang = kieudang;
    }
   
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhap kieu dang : ");
        Scanner sc=new Scanner(System.in);
        kieudang =sc.nextLine();
    }
    /*@Override
    public String toString() {
        return super.toString()+
                ", kieu dang:"+this.kieudang;
    }   */
 @Override
    public String toString() {
        return "Ma Cay:"+this.getMacay()+
                ", Ten:"+this.getTen()+
                ", Nguon goc:"+this.getNguongoc()+
                ", Ngay :"+this.getNgay()+ ",Thang: "+this.getThang()+",Nam: "+this.getNam()+
                ", So luong:"+this.getSoluong()+
                ", Gia ban:"+this.getGiaban()+
                ", kieu dang:"+this.kieudang;
    } 
}