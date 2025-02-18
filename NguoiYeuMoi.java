/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapTongHop;

/**
 *
 * @author PC Của Bình
 */
public class NguoiYeuMoi extends Nguoi { //hàm extends dùng để class này kế thừa một class khác
    double v1;
    String sothich;

    public NguoiYeuMoi() {
    }

    public NguoiYeuMoi(double v1, String sothich, String CMT, String ten, int namsinh, String Gioitinh) {
        super(CMT, ten, namsinh, Gioitinh);
        this.v1 = v1;
        this.sothich = sothich;
    }
    
//Getter
    public double getV1() {
        return v1;
    }

    public String getSothich() {
        return sothich;
    }

    public String getCMT() {
        return CMT;
    }

    public String getTen() {
        return ten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public String gettrangthai(){
        return v1 < 50? "Binh thuong" : v1 < 90? "Khong binh thuong" : "Rat binh thuong";
    
    }
//Setter    
    public void setSothich(String sothich) {
        this.sothich = sothich;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.printf("v1: %f" + "Trang thai: " + gettrangthai(), v1);
        //v1: 90 để trạng thái: bình thường 
    }
    
    
}
