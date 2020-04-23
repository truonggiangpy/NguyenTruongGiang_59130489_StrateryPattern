/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_Tap_2;

import java.util.ArrayList;

/**
 *
 * @author Giang Tien Ty
 */
public class giohang {
        Interfacethanhtoan hinhthucthanhtoan;
    ArrayList<hanghoa> danhsachhanghoa = new ArrayList<>();

    public void setHinhthucthanhtoan(Interfacethanhtoan hinhthucthanhtoan) {
        this.hinhthucthanhtoan = hinhthucthanhtoan;
    }

    public ArrayList<hanghoa> getDanhsachhanghoa() {
        return danhsachhanghoa;
    }

    public void them(hanghoa hangHoa) {
       danhsachhanghoa.add(hangHoa);
    }
    public int tongTienHang() {
      int tongtien = 0;
      for(int i=0;i< danhsachhanghoa.size();i++)
      {
         tongtien += danhsachhanghoa.get(i).getGia();
      }
        return tongtien;
    }
    public double thanhToan() {
        return hinhthucthanhtoan.thanhToan(tongTienHang());
    }
}
