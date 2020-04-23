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
public class hanghoa {
    String tenHH;
    int gia;
    String moTa;
    
    public hanghoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }
    public int getGia() {
        return gia;
    }
    
    public String thongTinHH() {
        return "ten HH " + this.tenHH + " gia " + this.gia + " mo ta " + this.moTa;
    }
}
