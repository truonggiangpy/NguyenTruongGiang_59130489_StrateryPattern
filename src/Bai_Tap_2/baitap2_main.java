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
public class baitap2_main {
        public static void main(String[] args) {
        hanghoa hanghoa1 = new hanghoa("sách thuyền", 47730, "rất hay");
        hanghoa hanghoa2 = new hanghoa("sách truyện", 99730, "rất hay");
        hanghoa hanghoa3 = new hanghoa("sách di tim le song", 51220, "rất hay");
        
        giohang giohang1 = new giohang();
        giohang1.setHinhthucthanhtoan(new thanhtoancod());
        giohang1.them(hanghoa1);
        giohang1.them(hanghoa2);
        giohang1.them(hanghoa3);
        
        giohang giohang2 = new giohang();
        giohang2.setHinhthucthanhtoan(new thanhtoancod());
        giohang2.them(hanghoa2);
        giohang2.them(hanghoa3);
        
        ArrayList<hanghoa> danhsachHangHoa1 = giohang1.getDanhsachhanghoa();
        System.out.println("hang trong giỏ có");
        for(int i=0;i< danhsachHangHoa1.size();i++)
        {
             System.out.println("hàng " + danhsachHangHoa1.get(i).thongTinHH());
        }
        System.out.println("tiền hàng đã mua " + giohang1.tongTienHang());
        System.out.println("Tổng tiền phải trả " + giohang1.thanhToan());

                
        ArrayList<hanghoa> danhsachHangHoa2 = giohang2.getDanhsachhanghoa();
        System.out.println("hang trong giỏ có");
        for(int i=0;i< danhsachHangHoa2.size();i++)
        {
             System.out.println("hàng " + danhsachHangHoa2.get(i).thongTinHH());
        }
        System.out.println("tiền hàng đã mua  " + giohang2.tongTienHang());
        System.out.println("Tổng tiền phải trả " + giohang2.thanhToan());
    }
}
