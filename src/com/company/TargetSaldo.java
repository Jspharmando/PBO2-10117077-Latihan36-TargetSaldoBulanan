package com.company;

/**
 * @author
 * Nama : Joseph Armando Carvallo
 * NIM  : 10117077
 **/

public class TargetSaldo {
    public int saldoAwal;
    public double bunga;
    public int saldoTarget;

    public void targetSaldo(int parSaldo, double parBunga){
        int i = 0;
        while (saldoAwal <= 6000000) {
            i = i + 1;
            saldoTarget = (int) (bunga * saldoAwal);
            saldoAwal =  saldoAwal + saldoTarget;
            System.out.println("Saldo di Bulan ke-" + i + " Rp."
                    + saldoAwal);
        }

    }
}
