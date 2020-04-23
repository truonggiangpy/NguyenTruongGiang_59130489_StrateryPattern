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
public class context {
    private Interfacetinh tinhgiatri;

    public void setTinhToan(Interfacetinh tinhToan) {
        this.tinhgiatri = tinhToan;
    }
    public float tinh(float a, float b) {
        return tinhgiatri.tinh(a, b);
    }
}
