/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapTongHop;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Set;
/**
 *
 * @author PC Của Bình
 */
public class NguoiYeuMoiService {
    //Khai báo các biến toàn cục lên đầu: là biến dùng chung cho toàn bộ class, chỉ khai báo một lần rồi dùng mãi.
    Scanner scan = new Scanner(System.in);
    List<NguoiYeuMoi> _lstNym; //Khai báo
    NguoiYeuMoi _nym; //Khai báo
    int _input;
    String _input2;                          
    public NguoiYeuMoiService(){
    //Tạo constructor NguoiYeuMoiService
    
    //Khởi tạo 1 đối tượng 
    _lstNym = new ArrayList<>();
    fakedata();
    
    }
    
    //fix cứng dữ liệu
    public void fakedata(){
        //Khi nhập dữ liệu phải đảm bảo đúng thứ tự khai báo ở bên Constructor ở Class NguoiYeuMoi
    _lstNym.add(new NguoiYeuMoi(85.5,"nau an","0123456","A",2006,"Nu"));
    
    //Nhập danh sách người yêu mới bằng bàn phím:
    
    }
    public void themnym(){
        System.out.println("Moi ban chon so luong nguoi yeu moi can nhap:");
        _input = scan.nextInt();
        scan.nextLine();
        //dùng vòng lặp for để duyệt từng nym để nhập 
        for (int i = 0; i <  _input; i++) {
            //Khởi tạo đối tượng nym
            _nym = new NguoiYeuMoi(); //Mỗi lần thêm lại phải khởi tạo lại đối tượng vậy nên để vào vòng lặp for để không phải khởi tạo lại 
            System.out.println("Moi nhap ten: ");
            //Không thể mang thuộc tính họ tên ra được mà pahỉ gọi thông qua đối tượng
            _nym.setTen(scan.nextLine());
            System.out.println("Moi nhap so thich: ");
            _nym.setSothich(scan.nextLine());
            System.out.println("Moi nhap CMT: ");
            _nym.setCMT(scan.nextLine());
            
            
        }
        
        //xuất danh sách
        
        
}
//xuất danh sách
        public void xuatds(){
            for (NguoiYeuMoi x : _lstNym) {
                x.inThongTin();
            }
        
        }
        
    //Tìm kiếm ny
        public void Timem(){
            System.out.println("Hay nhap cmt ny cua ban: ");
        _input2 = scan.nextLine();
        //Dùng vòng lặp for để duyệt từng phần tử của nym xem có tìm thấy trùng với dữ liệu _input2 nhập vào ko
        //get(i) : Lấy ra đối tượng nym thứ i trong danh sách
        //_lstNym.get() -> Lấy ra dữ liệu của cmt của đối tượng nym được get ở trên 
            for (int i = 0; i < _lstNym.size(); i++) {
                if (_lstNym.get(i).getCMT().equals(_input2)) {
                    _lstNym.get(i).inThongTin();
                }
            }
        
        }
        
        //Xóa nym
        //để xóa được đối tượng thì phải tìm ra được thì mới xóa được
        public void xoanym(){
            
            System.out.println("Hay nhap cmt ny cua ban: ");
        _input2 = scan.nextLine();
            for (int i = 0; i < _lstNym.size(); i++) {
                if (_lstNym.get(i).getCMT().equals(_input2)) {
                    _lstNym.remove(i);
                    System.out.println("Da xoa thanh cong doi tuong");
                    return;
                }
            }
            
            System.out.println("Khong tim thay doi tuong muon xoa");
                    
        }
        
        //Sửa đối tượng
        //Muốn sửa thì phải tìm được rồi mới sửa được
        public void Suanym(){
        System.out.println("Hay nhap cmt ny cua ban: ");
        _input2 = scan.nextLine();
            for (int i = 0; i < _lstNym.size(); i++) {
                if (_lstNym.get(i).getCMT().equals(_input2)) {
                    //Nếu bài toán ko chỉ ra cần sửa thuộc tính gì thì làm như này:
                    //Còn nếu không chỉ ra rõ ràng cần sửa cái gì thì làm theo đề bài
                    System.out.println("1. Sua ten");
                    System.out.println("2. Sua so thich");
                    System.out.println("Hay chon thuoc tinh ban muon sua");
                    int choice;
                     choice = scan.nextInt();
                    switch(choice){
                        case 1:
                            System.out.println("Hay nhap ten can sua: ");
                            //Lay ra doi tuong can sua
                            //Dung ham setten = gán giá trị
                            _lstNym.get(i).setTen(scan.nextLine());
                            System.out.println("Sua thanh cong ten");
                        case 2:
                            System.out.println("Hay nhap so thich ban muon vao: ");
                            _lstNym.get(i).setSothich(scan.nextLine());
                            System.out.println("Sua thanh cong so thich");
                    }
                    
                }
        
        
        }
}
}
