/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapTongHop;

/**
 *
 * @author PC Của Bình
 */
public class Nguoi {
    //b1: Khai báo các thuộc tính
    String CMT;
    String ten;
    int namsinh;
    String Gioitinh;
    //b2: tạo constructor
    public Nguoi(){
    }

    public Nguoi(String CMT, String ten, int namsinh, String Gioitinh) {
        this.CMT = CMT;
        this.ten = ten;
        this.namsinh = namsinh;
        this.Gioitinh = Gioitinh;
        
        
    }
    //Getter dùng để lấy dữ liệu
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
    
    
    
//Setter dùng để gán dữ liệu
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
    
    //b4: Phương thức
    public void inThongTin(){ //Hàm void là hàm không trả về
        //In ra chuỗi thì: %s
        //In ra số thì: %d
        System.out.printf("Ten: %s, Nam sinh: %d, Gioi tinh: %s, CMT: %s ", ten, namsinh, Gioitinh, CMT );
    
    }
    //Hàm trả về : String, boolean, int
    //Khi là hàm trả về thì bắt buộc phải có return về giá trị cần trả về 
//    public String inthongtin1(){
//    return "+ ten = " + ten + ", namsinh = " + namsinh;
//    
//    }
}
