package caycanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<CayCanh> dscc = new ArrayList<CayCanh>();

        dscc.add(new CayMai(10501, "Gia Lai", "24-6-2018", 12, 21000000, "Cay Mai", "Tu Quy"));
        dscc.add(new CayMai(10500, "Tan Phu", "23-2-2018", 9, 30000000, "Cay Mai", "Vang"));
        dscc.add(new CayDao(10502, "Da Lat", "29-5-2019", 5, 15000000, "Cay Dao", "Thang Long"));
        dscc.add(new CayLan(10505, "Go Vap", "8-8-2018", 10, 500000, "Cay Lan", "Hop phong thuy"));
        dscc.add(new CayDao(10503, "Cao Bang", "13-9-2018", 7, 4000000, "Cay Dao", "Phi Thang"));
        dscc.add(new CayLan(10504, "Q12", "3-2-2020", 2, 900000, "Cay Lan", "Loc khi"));

        int n;
        do {
            System.out.println("=============== Menu chinh quan ly kho cay canh =======");
            System.out.println("1.Xem thong tin nhung loai cay da co trong kho.");
            System.out.println("2.Nhap cay Mai vao kho.");
            System.out.println("3.Nhap cay Dao vao kho.");
            System.out.println("4.Nhap cay Lan vao kho.");
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
                    System.out.println("1.Nhap cay mai");
                    CayMai cm = new CayMai();
                    cm.nhap();
                    dscc.add(cm);
                    break;
                case 3:
                    System.out.println("2.Nhap cay dao");
                    CayDao cd = new CayDao();
                    cd.nhap();
                    dscc.add(cd);
                    break;
                case 4:
                    System.out.println("3.Nhap cay lan");
                    CayLan cl = new CayLan();
                    cl.nhap();
                    dscc.add(cl);
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
                    for (CayCanh caycanh : dscc) {
                        System.out.println(caycanh.toString());
                    }
                    break;
                case 8:
                    System.out.println("=======Menu=========");
                    System.out.println("1.Tang dan.");
                    System.out.println("2.Giam dan.");
                    System.out.println("====================");
                    System.out.println("Chon chuc nang.");
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
