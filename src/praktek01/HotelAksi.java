/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author Asus
 */
public class HotelAksi {
    public static void main(String[] args) {
        Hotel Biasa = new Hotel();
        Hotel VIP = new Hotel();
        Hotel VVIP = new Hotel();
        
        Biasa.Kasur="Kasur Kecil";
        Biasa.TV="TV 20 inc";
        Biasa.AC="Tidak Ada";
        Biasa.Lemari="Lemari 2 Pintu";
        Biasa.Wifi="Tidak Ada";
        
        VIP.Kasur="Kasur Sedang";
        VIP.TV="TV 30 inc";
        VIP.AC="Ada AC";
        VIP.Lemari="Lemari 3 Pintu";
        VIP.Wifi="Ada Wifi";
        
        VVIP.Kasur="Kasur Besar";
        VVIP.TV="TV 40 inc";
        VVIP.AC="Ada AC";
        VVIP.Lemari="Lemari 4 Pintu";
        VVIP.Wifi="Ada Wifi";
        
        Biasa.cetakInfo();
        System.out.println();
        VIP.cetakInfo();
        System.out.println();
        VVIP.cetakInfo();
        System.out.println();
    }
}
