package caycanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<CayCanh> dscc = new ArrayList<CayCanh>();

        dscc.add(new CayBonsai(10501,"vong cung", "ha noi ", 19, 356666,"21-8-2019", "cay da"));
        dscc.add(new CayBonsai(10506, "uốn lượn ", "gia lai ", 10, 233333, "24-8-1990", "cay si"));
        dscc.add(new CayNgayTet("trang tri", 10507,"dong nai ","3-4-2023", 10, 450000, "cay mai vang "));
        dscc.add(new CayNgayTet("mang den su may man", 10509,"ha giang","30-11-2022", 25, 550000,"dao nhat tan"));
        dscc.add(new CayPhongThuy("may man","mau xanh", 10503,"lam dong ","13-9-2020", 12, 250000,"cay ngoc ngan"));
        dscc.add(new CayPhongThuy("tai loc ","mau do ", 10504,"thai binh ","21--8-2021", 35, 350000,"van loc"));
        
        int n;
        do {
            System.out.println("=============== Menu chinh quan ly kho cay canh =======");
            System.out.println("1.Xem thong tin nhung loai cay da co trong kho.");
            System.out.println("2.Nhap cay Bonsai vao kho.");
            System.out.println("3.Nhap cay phong thuy vao kho.");
            System.out.println("4.Nhap cay ngay tet vao kho.");
            System.out.println("5.Hien thong cay vua them vao kho.");
            System.out.println("6.Xoa cay trong kho.");
            System.out.println("7.Chinh sua cay canh trong kho.");
            System.out.println("8.Sap xep gia ban cay trong kho.");
            System.out.println("============= Nhan 0 de ket thuc =================");
            System.out.print("Moi ban chon chuc nang: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();

            switch (n) {
                case 1:
                    for (CayCanh caycanh : dscc) {
                        System.out.println(caycanh.toString());
                    }
                    break;
                case 2:
                    System.out.println("1.Nhap vao cay bonsai");
                    CayBonsai bs = new CayBonsai();
                    bs.nhap();
                    dscc.add(bs);
                    break;
                case 3:
                    System.out.println("2.Nhap vao cay phong thuy");
                    CayPhongThuy cpt = new CayPhongThuy();
                    cpt.nhap();
                    dscc.add(cpt);
                    break;
                case 4:
                    System.out.println("3.Nhap vao cay ngay tet");
                    CayNgayTet cnt = new CayNgayTet();
                    cnt.nhap();
                    dscc.add(cnt);
                    break;
                case 5:
                    for (CayCanh caycanh : dscc) {
                        System.out.println(caycanh.toString());
                    }
                    break;
                case 6:
                    System.out.println("Danh sach cay trong kho.");
                    for (CayCanh caycanh : dscc) {
                        System.out.println(caycanh.toString());
                    }
                    System.out.print("Nhap ma cay can xoa: ");
                    n = sc.nextInt();
                    for (CayCanh caycanh : dscc) {
                        if (n == caycanh.getMacay()) {
                            dscc.remove(caycanh);
                            break;
                        }
                    }
                    System.out.println("Danh sach cay da xoa");
                    for (CayCanh caycanh : dscc) {
                        
                        System.out.println(caycanh.toString());
                    }
                
                    break;
                case 7:
                    System.out.println("Danh sach cay trong kho.");
                    for (CayCanh caycanh : dscc) {
                        System.out.println(caycanh.toString());
                    }
                    System.out.print("Nhap ma cay can sua: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    for (CayCanh caycanh : dscc) {
                        if (n == caycanh.getMacay()) {
                            System.out.print("Nhap ten cay: ");
                            caycanh.setTen(sc.nextLine());
                            System.out.print("Nhap nguon goc: ");
                            caycanh.setNguongoc(sc.nextLine());
                            System.out.print("Nhap ngay nhap: ");
                            caycanh.setNgaynhap(sc.nextLine());
                            System.out.print("Nhap ma cay: ");
                            caycanh.setMacay(sc.nextInt());
                            System.out.print("Nhap so luong: ");
                            caycanh.setSoluong(sc.nextInt());
                            System.out.print("Nhap gia ban: ");
                            caycanh.setGiaban(sc.nextInt());
                            break;
                        }
                                
                    }
                    System.out.println("Danh sach cay da sua");
                    for (CayCanh caycanh : dscc) {
                       
                        System.out.println(caycanh.toString());
                    }
                    break;
                case 8:
                    System.out.println("=======Menu=========");
                    System.out.println("1.Tang dan.");
                    System.out.println("2.Giam dan.");
                    System.out.println("====================");
                    System.out.print("Chon chuc nang: ");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            Collections.sort(dscc, new Comparator<CayCanh>() {
                                @Override
                                public int compare(CayCanh o1, CayCanh o2) {
                                    return (int) (o1.getGiaban() - o2.getGiaban());
                                }
                            });
                            System.out.println("Danh sach da sap xep tang dan ");
                            for (CayCanh caycanh : dscc) {
                                System.out.println(caycanh.toString());
                            }
                            break;
                        case 2:
                            Collections.sort(dscc, new Comparator<CayCanh>() {
                                @Override
                                public int compare(CayCanh o1, CayCanh o2) {
                                    return (int) (o2.getGiaban() - o1.getGiaban());
                                }
                            });
                            System.out.println("Danh sach da sap xep giam dan ");
                            for (CayCanh caycanh : dscc) {
                                System.out.println(caycanh.toString());
                            }
                            break;
                        default:
                            System.out.println("");
                    }
                    break;
                default:
                    System.out.println("");
            }
        } while (n != 0);
    }
}