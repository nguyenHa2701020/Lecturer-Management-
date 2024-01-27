package BAITAPLON_LTHDT;

import java.util.Scanner;

public class main {
public static void main(String[] args) {
	qlgiangvien gv =new qlgiangvien();
	qlthoikhoabieu tk= new qlthoikhoabieu();
	qltienluong tl=new qltienluong();
	do {
		System.out.println("<==========================PHAN CONG GIANG DAY======================>");
		System.out.println("============================QUAN LY GIAO VIEN========================");
		System.out.println("1:Ket thuc chuong trinh----------------------------------------------");		
		System.out.println("2:Nhap giang vien ---------------- 3:Danh sach giang vien------------");		
		System.out.println("4:Sap xep giang vien ------------- 5:Tim kiem giang vien-------------");
		System.out.println("6:Chen mot giang vien ------------ 7:Them mot giang vien-------------");
		System.out.println("8:Xoa mot giang vien ------------- 9:Xoa danh sach-------------------");
		System.out.println("10:Ghi FILE quan ly giang vien---- 11:Doc FILE quan ly giang vien----");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("=======================QUAN LY THOI KHOA BIEU========================");
		System.out.println("12:Nhap thoi khoa bieu------------ 13:Thoi khoa bieu-----------------");
		System.out.println("14:Sap xep thoi khoa bieu--------- 15:Them lich----------------------");
		System.out.println("16:Xoa lich theo vi tri----------- 17:Sua lich-----------------------");
		System.out.println("18:Xoa het thoi khoa bieu--------- 19:Chen lich----------------------");
		System.out.println("20:Ghi FILE quan ly thoi khoa bieu 21:Doc FILE quan ly thoi khoa bieu");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("=======================QUAN LY LUONG GIANG VIEN======================");
		System.out.println("22:Nhap luong cua giang vien------ 23:Luong cua giang vien-----------");
		System.out.println("24:Giang vien co luong cao nhat--- 25:Giang vien c� luong thap nhat--");
		System.out.println("26:Sap xep luong cua giang vien--- 27:Ghi FILE tien luong------------");
		System.out.println("28.Doc FILE tien luong_______________________________________________");
		System.out.println("Moi nhap lua chon :__________________________________________________");
		Scanner sc= new Scanner(System.in);
		int key=sc.nextInt();
		switch (key) {
		case 1: {
			System.out.println("-------Chuong Trinh Ket Thuc------");
		break;
		}
		case 2: {
			gv.nhapdsgv();
			break;
		}
		case 3: {
			System.out.println("<======DANH SACH GIANG VIEN======>");
			gv.hiends();
			break;
		}
		case 4: {
			System.out.println("<======DANH SACH GIANG VIEN SAU KHI SAP XEP======>");
			gv.sapxepdsgv();
			gv.hiends();
			break;
		}
		case 5: {
			gv.timkiem();
			break;
		}
		case 6: {
			gv.chengv();
			System.out.println("Chen thanh cong!");
			break;
		}
		case 7: {
			gv.themgv();
			System.out.println("Them thanh cong!");
			break;
		}
		case 8: {
			gv.xoagv();
			System.out.println("Xoa thanh cong!");
			break;
		}
		case 9: {
			gv.xoaall();
			System.out.println("Da xoa toan bo danh sach!");
			break;
		}
		case 10: {
			gv.ghidsgv();
			break;
		}
		case 11: {
			gv.docdsgv();
			break;
		}
		case 12: {
			tk.nhapdstkb();
			break;
		}
		case 13: {
			tk.hiendstkb();
			break;
		}
		case 14: {
			tk.sapxeptkb();
			break;
		}	
		case 15: {
			tk.themlich();
			break;
		}
		case 16: {
			tk.xoavitri();
			break;
		}
		case 17: {
			tk.sualich();
			break;
		}
		case 18: {
			tk.xoaall();;
			break;
		}
		case 19: {
			tk.chenlich();
			break;
		}
		case 20: {
			tk.ghitkb();
			break;
		}	
		case 21: {
			tk.doctkb();
			break;
		}
		case 22: {
			tl.nhapdsluong();
			break;
		}
		case 23: {
			tl.hiendsluong();
			break;
		}
		case 24: {
			tl.luongmax();
			break;
		}
		case 25: {
			tl.luongmin();
			break;
		}
		case 26: {
			tl.sapxepdsl();
			break;
		}	
		case 27: {
			tl.ghiluong();
			break;
		}
		case 28: {
			tl.docluong();
			break;
		}
		default:
			break;
			}
		if(key==1) {
			break;
			}
		}while(true);
	}
}
