/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KTP_EL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author zakkizuboys
 */
public class DriverClass {

    public static void main(String[] args) {
        int c, d, e, f;
        String nm, agm, jk, pk, gd, tl, tgl, kw;
        Scanner sc = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        setGet st = new setGet();

        ArrayList<HashMap<String, ArrayList>> ald = new ArrayList<>();
        HashMap<String, ArrayList> dtHash = new HashMap<>();
        ArrayList<String> dtList = new ArrayList<String>();

        do {
            try {
                System.out.println("1. masukkan data ");
                System.out.println("2. tampilkan data ");
                System.out.println("masukkan pilihan menu : ");
                e = sc.nextInt();
                switch (e) {
                    case 1:
                        System.out.println("1. kelurahan bisa");
                        System.out.println("2. kelurahan siap");
                        System.out.println("masukkan kelurahan : ");
                        c = sc.nextInt();
                        switch (c) {
                            case 1:
                                st.setKelurahan("bisa");
                                System.out.println("pilih RT");
                                System.out.println("1. RT 01");
                                System.out.println("2. RT 02");
                                System.out.println("3. RT 03");
                                System.out.println("4. RT 04");
                                System.out.println("5. RT 05");
                                System.out.println("masukkan RT : ");
                                d = sc.nextInt();

                                switch (d) {
                                    case 1:
                                        st.setRT("01");
                                        System.out.println("masukkan nama :");
                                        nm = scn.nextLine();
                                        st.setNama(nm);
                                        System.out.println("masukkan agama :");
                                        agm = scn.nextLine();
                                        st.setAgama(agm);
                                        System.out.println("masukkan jenis kelamin :");
                                        jk = scn.nextLine();
                                        st.setJenisKelamin(jk);
                                        System.out.println("masukkan pekerjaan :");
                                        pk = scn.nextLine();
                                        st.setPekerjaan(pk);
                                        System.out.println("masukkan golongan darah :");
                                        gd = scn.nextLine();
                                        st.setGolonganDarah(gd);
                                        System.out.println("masukkan tempat lahir :");
                                        tl = scn.nextLine();
                                        st.setTempatLahir(tl);
                                        System.out.println("masukkan tanggal lahir :");
                                        tgl = scn.nextLine();
                                        st.setTanggalLahir(tgl);
                                        System.out.println("masukkan kewarganegaraan :");
                                        kw = scn.nextLine();
                                        st.setKewarganegaraan(kw);
                                        dtList.add(st.getNama() + "\t" + st.getAgama() + "\t\t" + st.getJenisKelamin() + "\t" + st.getPekerjaan() + "\t\t" + st.getGolonganDarah() + "\t" + st.getKelurahan() + "\t\t" + st.getRT() + "\t" + st.getTempatLahir() + "\t" + st.getTanggalLahir() + "\t\t" + st.getKewarganegaraan());
                                        dtHash.put(st.getNama(), dtList);
                                        ald.add(dtHash);
                                        break;

                                    case 2:
                                        st.setRT("02");
                                        System.out.println("masukkan nama :");
                                        nm = scn.nextLine();
                                        st.setNama(nm);
                                        System.out.println("masukkan agama :");
                                        agm = scn.nextLine();
                                        st.setAgama(agm);
                                        System.out.println("masukkan jenis kelamin :");
                                        jk = scn.nextLine();
                                        st.setJenisKelamin(jk);
                                        System.out.println("masukkan pekerjaan :");
                                        pk = scn.nextLine();
                                        st.setPekerjaan(pk);
                                        System.out.println("masukkan golongan darah :");
                                        gd = scn.nextLine();
                                        st.setGolonganDarah(gd);
                                        System.out.println("masukkan tempat lahir :");
                                        tl = scn.nextLine();
                                        st.setTempatLahir(tl);
                                        System.out.println("masukkan tanggal lahir :");
                                        tgl = scn.nextLine();
                                        st.setTanggalLahir(tgl);
                                        System.out.println("masukkan kewarganegaraan :");
                                        kw = scn.nextLine();
                                        st.setKewarganegaraan(kw);
                                        dtList.add(st.getNama() + "\t" + st.getAgama() + "\t\t" + st.getJenisKelamin() + "\t" + st.getPekerjaan() + "\t\t" + st.getGolonganDarah() + "\t" + st.getKelurahan() + "\t\t" + st.getRT() + "\t" + st.getTempatLahir() + "\t" + st.getTanggalLahir() + "\t\t" + st.getKewarganegaraan());
                                        dtHash.put(st.getNama(), dtList);
                                        ald.add(dtHash);
                                        break;

                                    case 3:
                                        st.setRT("03");
                                        System.out.println("masukkan nama :");
                                        nm = scn.nextLine();
                                        st.setNama(nm);
                                        System.out.println("masukkan agama :");
                                        agm = scn.nextLine();
                                        st.setAgama(agm);
                                        System.out.println("masukkan jenis kelamin :");
                                        jk = scn.nextLine();
                                        st.setJenisKelamin(jk);
                                        System.out.println("masukkan pekerjaan :");
                                        pk = scn.nextLine();
                                        st.setPekerjaan(pk);
                                        System.out.println("masukkan golongan darah :");
                                        gd = scn.nextLine();
                                        st.setGolonganDarah(gd);
                                        System.out.println("masukkan tempat lahir :");
                                        tl = scn.nextLine();
                                        st.setTempatLahir(tl);
                                        System.out.println("masukkan tanggal lahir :");
                                        tgl = scn.nextLine();
                                        st.setTanggalLahir(tgl);
                                        System.out.println("masukkan kewarganegaraan :");
                                        kw = scn.nextLine();
                                        st.setKewarganegaraan(kw);
                                        dtList.add(st.getNama() + "\t" + st.getAgama() + "\t\t" + st.getJenisKelamin() + "\t" + st.getPekerjaan() + "\t\t" + st.getGolonganDarah() + "\t" + st.getKelurahan() + "\t\t" + st.getRT() + "\t" + st.getTempatLahir() + "\t" + st.getTanggalLahir() + "\t\t" + st.getKewarganegaraan());
                                        dtHash.put(st.getNama(), dtList);
                                        ald.add(dtHash);
                                        break;

                                    case 4:
                                        st.setRT("04");
                                        System.out.println("masukkan nama :");
                                        nm = scn.nextLine();
                                        st.setNama(nm);
                                        System.out.println("masukkan agama :");
                                        agm = scn.nextLine();
                                        st.setAgama(agm);
                                        System.out.println("masukkan jenis kelamin :");
                                        jk = scn.nextLine();
                                        st.setJenisKelamin(jk);
                                        System.out.println("masukkan pekerjaan :");
                                        pk = scn.nextLine();
                                        st.setPekerjaan(pk);
                                        System.out.println("masukkan golongan darah :");
                                        gd = scn.nextLine();
                                        st.setGolonganDarah(gd);
                                        System.out.println("masukkan tempat lahir :");
                                        tl = scn.nextLine();
                                        st.setTempatLahir(tl);
                                        System.out.println("masukkan tanggal lahir :");
                                        tgl = scn.nextLine();
                                        st.setTanggalLahir(tgl);
                                        System.out.println("masukkan kewarganegaraan :");
                                        kw = scn.nextLine();
                                        st.setKewarganegaraan(kw);
                                        dtList.add(st.getNama() + "\t" + st.getAgama() + "\t\t" + st.getJenisKelamin() + "\t" + st.getPekerjaan() + "\t\t" + st.getGolonganDarah() + "\t" + st.getKelurahan() + "\t\t" + st.getRT() + "\t" + st.getTempatLahir() + "\t" + st.getTanggalLahir() + "\t\t" + st.getKewarganegaraan());
                                        dtHash.put(st.getNama(), dtList);
                                        ald.add(dtHash);
                                        break;

                                    case 5:
                                        st.setRT("05");
                                        System.out.println("masukkan nama :");
                                        nm = scn.nextLine();
                                        st.setNama(nm);
                                        System.out.println("masukkan agama :");
                                        agm = scn.nextLine();
                                        st.setAgama(agm);
                                        System.out.println("masukkan jenis kelamin :");
                                        jk = scn.nextLine();
                                        st.setJenisKelamin(jk);
                                        System.out.println("masukkan pekerjaan :");
                                        pk = scn.nextLine();
                                        st.setPekerjaan(pk);
                                        System.out.println("masukkan golongan darah :");
                                        gd = scn.nextLine();
                                        st.setGolonganDarah(gd);
                                        System.out.println("masukkan tempat lahir :");
                                        tl = scn.nextLine();
                                        st.setTempatLahir(tl);
                                        System.out.println("masukkan tanggal lahir :");
                                        tgl = scn.nextLine();
                                        st.setTanggalLahir(tgl);
                                        System.out.println("masukkan kewarganegaraan :");
                                        kw = scn.nextLine();
                                        st.setKewarganegaraan(kw);
                                        dtList.add(st.getNama() + "\t" + st.getAgama() + "\t\t" + st.getJenisKelamin() + "\t" + st.getPekerjaan() + "\t\t" + st.getGolonganDarah() + "\t" + st.getKelurahan() + "\t\t" + st.getRT() + "\t" + st.getTempatLahir() + "\t" + st.getTanggalLahir() + "\t\t" + st.getKewarganegaraan());
                                        dtHash.put(st.getNama(), dtList);
                                        ald.add(dtHash);
                                        break;
                                }
                                break;

                            case 2:
                                st.setKelurahan("siap");
                                System.out.println("pilih RT");
                                System.out.println("1. RT 11");
                                System.out.println("2. RT 12");
                                System.out.println("3. RT 13");
                                System.out.println("4. RT 14");
                                System.out.println("5. RT 15");
                                System.out.println("masukkan RT : ");
                                d = sc.nextInt();

                                switch (d) {
                                    case 1:
                                        st.setRT("01");
                                        System.out.println("masukkan nama :");
                                        nm = scn.nextLine();
                                        st.setNama(nm);
                                        System.out.println("masukkan agama :");
                                        agm = scn.nextLine();
                                        st.setAgama(agm);
                                        System.out.println("masukkan jenis kelamin :");
                                        jk = scn.nextLine();
                                        st.setJenisKelamin(jk);
                                        System.out.println("masukkan pekerjaan :");
                                        pk = scn.nextLine();
                                        st.setPekerjaan(pk);
                                        System.out.println("masukkan golongan darah :");
                                        gd = scn.nextLine();
                                        st.setGolonganDarah(gd);
                                        System.out.println("masukkan tempat lahir :");
                                        tl = scn.nextLine();
                                        st.setTempatLahir(tl);
                                        System.out.println("masukkan tanggal lahir :");
                                        tgl = scn.nextLine();
                                        st.setTanggalLahir(tgl);
                                        System.out.println("masukkan kewarganegaraan :");
                                        kw = scn.nextLine();
                                        st.setKewarganegaraan(kw);
                                        dtList.add(st.getNama() + "\t" + st.getAgama() + "\t\t" + st.getJenisKelamin() + "\t" + st.getPekerjaan() + "\t\t" + st.getGolonganDarah() + "\t" + st.getKelurahan() + "\t\t" + st.getRT() + "\t" + st.getTempatLahir() + "\t" + st.getTanggalLahir() + "\t\t" + st.getKewarganegaraan());
                                        dtHash.put(st.getNama(), dtList);
                                        ald.add(dtHash);
                                        break;

                                    case 2:
                                        st.setRT("02");
                                        System.out.println("masukkan nama :");
                                        nm = scn.nextLine();
                                        st.setNama(nm);
                                        System.out.println("masukkan agama :");
                                        agm = scn.nextLine();
                                        st.setAgama(agm);
                                        System.out.println("masukkan jenis kelamin :");
                                        jk = scn.nextLine();
                                        st.setJenisKelamin(jk);
                                        System.out.println("masukkan pekerjaan :");
                                        pk = scn.nextLine();
                                        st.setPekerjaan(pk);
                                        System.out.println("masukkan golongan darah :");
                                        gd = scn.nextLine();
                                        st.setGolonganDarah(gd);
                                        System.out.println("masukkan tempat lahir :");
                                        tl = scn.nextLine();
                                        st.setTempatLahir(tl);
                                        System.out.println("masukkan tanggal lahir :");
                                        tgl = scn.nextLine();
                                        st.setTanggalLahir(tgl);
                                        System.out.println("masukkan kewarganegaraan :");
                                        kw = scn.nextLine();
                                        st.setKewarganegaraan(kw);
                                        dtList.add(st.getNama() + "\t" + st.getAgama() + "\t\t" + st.getJenisKelamin() + "\t" + st.getPekerjaan() + "\t\t" + st.getGolonganDarah() + "\t" + st.getKelurahan() + "\t\t" + st.getRT() + "\t" + st.getTempatLahir() + "\t" + st.getTanggalLahir() + "\t\t" + st.getKewarganegaraan());
                                        dtHash.put(st.getNama(), dtList);
                                        ald.add(dtHash);
                                        break;

                                    case 3:
                                        st.setRT("03");
                                        System.out.println("masukkan nama :");
                                        nm = scn.nextLine();
                                        st.setNama(nm);
                                        System.out.println("masukkan agama :");
                                        agm = scn.nextLine();
                                        st.setAgama(agm);
                                        System.out.println("masukkan jenis kelamin :");
                                        jk = scn.nextLine();
                                        st.setJenisKelamin(jk);
                                        System.out.println("masukkan pekerjaan :");
                                        pk = scn.nextLine();
                                        st.setPekerjaan(pk);
                                        System.out.println("masukkan golongan darah :");
                                        gd = scn.nextLine();
                                        st.setGolonganDarah(gd);
                                        System.out.println("masukkan tempat lahir :");
                                        tl = scn.nextLine();
                                        st.setTempatLahir(tl);
                                        System.out.println("masukkan tanggal lahir :");
                                        tgl = scn.nextLine();
                                        st.setTanggalLahir(tgl);
                                        System.out.println("masukkan kewarganegaraan :");
                                        kw = scn.nextLine();
                                        st.setKewarganegaraan(kw);
                                        dtList.add(st.getNama() + "\t" + st.getAgama() + "\t\t" + st.getJenisKelamin() + "\t" + st.getPekerjaan() + "\t\t" + st.getGolonganDarah() + "\t" + st.getKelurahan() + "\t\t" + st.getRT() + "\t" + st.getTempatLahir() + "\t" + st.getTanggalLahir() + "\t\t" + st.getKewarganegaraan());
                                        dtHash.put(st.getNama(), dtList);
                                        ald.add(dtHash);
                                        break;

                                    case 4:
                                        st.setRT("04");
                                        System.out.println("masukkan nama :");
                                        nm = scn.nextLine();
                                        st.setNama(nm);
                                        System.out.println("masukkan agama :");
                                        agm = scn.nextLine();
                                        st.setAgama(agm);
                                        System.out.println("masukkan jenis kelamin :");
                                        jk = scn.nextLine();
                                        st.setJenisKelamin(jk);
                                        System.out.println("masukkan pekerjaan :");
                                        pk = scn.nextLine();
                                        st.setPekerjaan(pk);
                                        System.out.println("masukkan golongan darah :");
                                        gd = scn.nextLine();
                                        st.setGolonganDarah(gd);
                                        System.out.println("masukkan tempat lahir :");
                                        tl = scn.nextLine();
                                        st.setTempatLahir(tl);
                                        System.out.println("masukkan tanggal lahir :");
                                        tgl = scn.nextLine();
                                        st.setTanggalLahir(tgl);
                                        System.out.println("masukkan kewarganegaraan :");
                                        kw = scn.nextLine();
                                        st.setKewarganegaraan(kw);
                                        dtList.add(st.getNama() + "\t" + st.getAgama() + "\t\t" + st.getJenisKelamin() + "\t" + st.getPekerjaan() + "\t\t" + st.getGolonganDarah() + "\t" + st.getKelurahan() + "\t\t" + st.getRT() + "\t" + st.getTempatLahir() + "\t" + st.getTanggalLahir() + "\t\t" + st.getKewarganegaraan());
                                        dtHash.put(st.getNama(), dtList);
                                        ald.add(dtHash);
                                        break;

                                    case 5:
                                        st.setRT("05");
                                        System.out.println("masukkan nama :");
                                        nm = scn.nextLine();
                                        st.setNama(nm);
                                        System.out.println("masukkan agama :");
                                        agm = scn.nextLine();
                                        st.setAgama(agm);
                                        System.out.println("masukkan jenis kelamin :");
                                        jk = scn.nextLine();
                                        st.setJenisKelamin(jk);
                                        System.out.println("masukkan pekerjaan :");
                                        pk = scn.nextLine();
                                        st.setPekerjaan(pk);
                                        System.out.println("masukkan golongan darah :");
                                        gd = scn.nextLine();
                                        st.setGolonganDarah(gd);
                                        System.out.println("masukkan tempat lahir :");
                                        tl = scn.nextLine();
                                        st.setTempatLahir(tl);
                                        System.out.println("masukkan tanggal lahir :");
                                        tgl = scn.nextLine();
                                        st.setTanggalLahir(tgl);
                                        System.out.println("masukkan kewarganegaraan :");
                                        kw = scn.nextLine();
                                        st.setKewarganegaraan(kw);
                                        dtList.add(st.getNama() + "\t" + st.getAgama() + "\t\t" + st.getJenisKelamin() + "\t" + st.getPekerjaan() + "\t\t" + st.getGolonganDarah() + "\t" + st.getKelurahan() + "\t\t" + st.getRT() + "\t" + st.getTempatLahir() + "\t" + st.getTanggalLahir() + "\t\t" + st.getKewarganegaraan());
                                        dtHash.put(st.getNama(), dtList);
                                        ald.add(dtHash);
                                        break;
                                }
                        }
                        break;
                    case 2:
                        Collections.sort(dtList);
                        System.out.println("Nama\t" + "Agama\t" + "Jenis Kelamin\t" + "Pekerjaan\t" + "Golongan Darah\t" + "Kelurahan\t" + "RT\t" + "Tempat lahir\t" + "Tanggal Lahir\t" + "Kewarganegaraan");
                        for (int i = 0; i < dtList.size(); i++) {
                            System.out.println(ald.get(i).get(st.getNama()).get(i));
                        }
                        break;

                }
            } catch (ArrayIndexOutOfBoundsException w) {
                System.out.println(w);
            }catch(InputMismatchException ww){
                System.out.println(ww);
            }
            System.out.println("apakah anda ingin kembali ke menu(1/0)");
            f = sc.nextInt();
        } while (f == 1);
        System.out.println("terima kasih");
    }
}
