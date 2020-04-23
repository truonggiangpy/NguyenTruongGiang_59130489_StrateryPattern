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
public class thanhtoanonline {


    public double thanhToan(int tienHang) {
        if(tienHang<1000000 ){
            tienHang = tienHang -(tienHang*5/100);
            return tienHang;
         }
        else{
            tienHang = tienHang -(tienHang*7/100);
            return tienHang;
            }
    }
}
