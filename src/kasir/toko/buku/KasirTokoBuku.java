package kasir.toko.buku;

import java.util.Scanner;

public class KasirTokoBuku {

    public static void main(String[] args) {
        System.out.println("Yosieka Putri Wibawa/ XRPL6/ 40");
        System.out.println("=================================");
        int hrgBrng, jumBar, jumBar2, ulangi, kodeBar, ulangi2;
        double totalHrgBar, TotalBayar, HargaPerBar, diskon1, diskon2, diskon3, HargaBar = 0;
        String namaPem, namaKas, namaBar;
        Scanner masukan = new Scanner(System.in);
        System.out.println("Selamat Datang di Toko Buku XXXX");
        System.out.println("=================================");
        System.out.print("Nama Kasir : ");
        namaKas = masukan.nextLine();
        do {
            System.out.print("Nama Pembeli : ");
            namaPem = masukan.next();
            System.out.print("Jumlah Jenis Barang : ");
            jumBar = masukan.nextInt();

            do {
                System.out.print("Nama Barang : ");
                namaBar = masukan.next();
                System.out.print("Kode Barang : ");
                kodeBar = masukan.nextInt();
                if (kodeBar == 1) {
                    HargaPerBar = 20000;
                    System.out.print("Jumlah Barang ini : ");
                    jumBar2 = masukan.nextInt();
                    HargaBar = HargaPerBar * jumBar2;
                    System.out.println("Harga Barang ini : Rp" + HargaBar);
                } else if (kodeBar == 2) {
                    HargaPerBar = 40000;
                    System.out.print("Jumlah Barang ini : ");
                    jumBar2 = masukan.nextInt();
                    HargaBar = HargaPerBar * jumBar2;
                    System.out.println("Harga Barang ini : Rp" + HargaBar);
                } else if (kodeBar == 3) {
                    HargaPerBar = 60000;
                    System.out.print("Jumlah Barang ini : ");
                    jumBar2 = masukan.nextInt();
                    HargaBar = HargaPerBar * jumBar2;
                    System.out.println("Harga Barang ini : Rp" + HargaBar);
                } else if (kodeBar == 4) {
                    HargaPerBar = 80000;
                    System.out.print("Jumlah Barang ini : ");
                    jumBar2 = masukan.nextInt();
                    HargaBar = HargaPerBar * jumBar2;
                    System.out.println("Harga Barang ini : Rp" + HargaBar);
                } else if (kodeBar == 5) {
                    HargaPerBar = 100000;
                    System.out.print("Jumlah Barang ini : ");
                    jumBar2 = masukan.nextInt();
                    HargaBar = HargaPerBar * jumBar2;
                    System.out.println("Harga Barang ini : Rp" + HargaBar);
                }
                System.out.print("Adakah Barang Lain? 1 for Y dan 0 for N");
                ulangi2 = masukan.nextInt();

            } while (ulangi2 == 1);
            totalHrgBar = jumBar * HargaBar;
            System.out.println("Harga semua barang : " + totalHrgBar);
            if (totalHrgBar > 100000 && totalHrgBar <= 200000) {
                double diskonA = 0.1;

                TotalBayar = totalHrgBar - (totalHrgBar * diskonA);
                System.out.println("Total Bayar : Rp " + TotalBayar);
            } else if (totalHrgBar > 200000 && totalHrgBar <= 500000) {
                double diskonB = 0.2;

                TotalBayar = totalHrgBar - (totalHrgBar * diskonB);
                System.out.println("Total Bayar : Rp " + TotalBayar);
            } else if (totalHrgBar > 500000) {
                double diskonC = 0.5;

                TotalBayar = totalHrgBar - (totalHrgBar * diskonC);
                System.out.println("Total Bayar : Rp " + TotalBayar);
            } else {
                System.out.println("Total Bayar : Rp " + totalHrgBar);
            }
            System.out.println("Adakah yang ingin dibeli lagi? 1 for YES dan 0 for NO ");

            ulangi = masukan.nextInt();

        } while (ulangi == 1);
        System.out.println("==============================================================");
        System.out.println("TERIMA KASIH ATAS KUNJUNGANNYA DAN JANGAN LUPA DATANG KEMBALI");
    }
}
