/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_Tap_3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Giang Tien Ty
 */
public class sinhvien {
        private String hoten;
    private Date ngaysinh;
    private float diemtrungbinh;

    public sinhvien(String hoten, Date ngaysinh, float diemtrungbinh) {
        this.hoten= hoten;
        this.ngaysinh= ngaysinh;
        this.diemtrungbinh= diemtrungbinh;
    }

    public String getHoten() {
        return hoten;
    }

    public float getDiemtrungbinh() {
        return diemtrungbinh;
        }

    public String getThongTin() {
        SimpleDateFormat ngay = new SimpleDateFormat("dd/MM/yyyy");
        return "ho ten " + this.hoten + " ngay sinh " + ngay.format(this.ngaysinh) + " diem trung binh " + this.diemtrungbinh;
        }
}

