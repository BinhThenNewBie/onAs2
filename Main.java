/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapTongHop;

import java.util.Scanner;

/**
 *
 * @author PC Của Bình
 */
public class Main {
    public static void main(String[] args) {
        NguoiYeuMoiService _NYMSER = new NguoiYeuMoiService ();
        Scanner scan = new Scanner(System.in);
        int choice;
        do{
       
        System.out.println("1.Nhap danh sach doi tuong ");
        System.out.println("2.Xuat danh sach doi tuong ");
        System.out.println("3.Tim nguoi yeu theo cmt ");
        System.out.println("4.Xoa doi tuong theo cmt ");
        System.out.println("0.Sua nym ");
        System.out.println("Hay nhap lua chon cua ban: ");
        choice = scan.nextInt();
        scan.nextLine();
        
            switch(choice){
                case 1: 
                    _NYMSER.themnym();
                    break;
                case 2:
                    _NYMSER.xuatds();
                    break;
                case 3:
                    _NYMSER.Timem();
                    break;
                case 4:
                    _NYMSER.xoanym();
                    break;
                case 0:
                    _NYMSER.Suanym();
                    break;
            }
        }while(choice != 10);
        
        
        
    }
    }

