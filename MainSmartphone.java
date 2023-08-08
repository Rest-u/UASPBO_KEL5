/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PBO;

/**
 * @author Arvilanti Devani 22104410075
 * @author Nur Cindy Intan Fanderella 22104410098
 * @author Hanik Hatul Halimah 22104410101
 * @author Eka Fardinal Hergitarestu 22104410119
 * @author Wasi'atul Jannah 22104410121
 */
public class MainSmartphone implements InterfacePajak {
    String vendor, tipe;
    double harga;

    public MainSmartphone(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;}

    @Override
    public double hitungHargaSetelahPPN() {
    double ppn = 0;
        if (harga > 4000000 && harga < 4200000) {
            ppn = 0.01;} 
        else if (harga > 4200000 && harga <= 4500000) {
            ppn = 0.02;}
        else if (harga > 4500000) {
            ppn = 0.05;}
        return harga + (harga * ppn);}

    public void ListSmartphone() {
        System.out.println("Vendor : " + vendor);
        System.out.println("Tipe : " + tipe);
        System.out.println("Harga : Rp" + ( harga));
        System.out.println("Harga Setelah PPN : Rp" + ( hitungHargaSetelahPPN()));}
    
    public static void main(String[] args) {
        MainSmartphone samsungA51 = new MainSmartphone("Samsung", "A 51", 5000000);
        MainSmartphone oppoReno5 = new MainSmartphone("Oppo", "Reno 5", 4400000);
        MainSmartphone xiaomiA1 = new MainSmartphone("Xiaomi", "A1", 4100000);

        samsungA51.ListSmartphone();
        oppoReno5.ListSmartphone();
        xiaomiA1.ListSmartphone();}}
