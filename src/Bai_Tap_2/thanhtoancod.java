/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_Tap_2;

/**
 *
 * @author Giang Tien Ty
 */
public class thanhtoancod implements Interfacethanhtoan{
        @Override
    public double thanhToan(int tienHang) {
        if(tienHang> 2000000){
            tienHang = tienHang -(tienHang*2/100);
            return tienHang;
         }
        else
            return tienHang;
    }
}
