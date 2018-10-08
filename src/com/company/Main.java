package com.company;

/**
 * @author
 * Nama : Joseph Armando Carvallo
 * NIM  : 10117077
 **/

public class Main {
    public static void main(String[] args) {
        TargetSaldo saldo = new TargetSaldo();

        saldo.saldoAwal = 3500000;
        saldo.bunga = 0.08;

        saldo.targetSaldo(saldo.saldoAwal, saldo.bunga);
    }
}