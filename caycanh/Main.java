package caycanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<CayCanh> dscc = new ArrayList<CayCanh>();

        dscc.add(new CayBonsai(10501,"vong cung","ha noi",19,356666,21,8,2019,"cay da"));
        dscc.add(new CayBonsai(10506,"uon luon","gia lai",10,233333,24,7,1990,"cay si"));
        dscc.add(new CayNgayTet("Trang tri",10507,"dong nai",17,10,2021,8,800000,"cay mai vang"));
        dscc.add(new CayNgayTet("May man",10509,"ha giang",9,9,2020,13,600000,"dao` nhat tan"));
        dscc.add(new CayPhongThuy("phat tai`","mau xanh",10503,"lam dong",12,10,2019,12,770000,"cay ngoc ngan"));
        dscc.add(new CayPhongThuy("tai loc","mau do",10504,"thai binh",2,3,2019,5,650000,"cay van loc"));

        int n;
        do {
            System.out.println("=============== Menu chinh quan ly kho cay canh =======");
            System.out.println("1.Xem thong tin nhung loai cay da co trong kho.");
            System.out.println("2.Nhap cay Bonsai vao kho.");
            System.out.println("3.Nhap cay phong thuy vao kho.");
            System.out.println("4.Nhap cay ngay tet vao kho.");
            System.out.println("5.Hien thong cay vua them vao kho.");
            System.out.println("6.Xoa cay trong kho.");
            System.out.println("7.Chinh sua gia cay canh trong kho.");
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
                    CayBonsai bs = new CayBonsai();
                    bs.nhap();
                    dscc.add(bs);
                    break;
                case 3:                   
                    CayPhongThuy cpt = new CayPhongThuy();
                    cpt.nhap();
                    dscc.add(cpt);
                    break;
                case 4:
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
                    System.out.println("Danh sach cay con lai trong kho");
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
                            System.out.print("Nhap gia ban moi: ");
                            caycanh.setGiaban(sc.nextInt());
                            break;
                        }

                    }
                    System.out.println("Danh sach cay sau khi chinh sua");
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
