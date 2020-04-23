/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_Tap_1;

/**
 *
 * @author Giang Tien Ty
 */
public class baitap_main {
        public static void main(String[] args) {
        context context = new context();
        context.setTinhToan(new cong());
        context.setTinhToan(new tru());
        float tinhcong= context.tinh(75, 12);
        float tinhtru= context.tinh(54, 78);
        System.out.println(tinhcong);
        System.out.println(tinhtru);
    }
}
