package BAITAPLON_LTHDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class qltienluong {
	ArrayList<giangVien> lst = new ArrayList<>();
	File f= new File("Luonggv.dat");
	public void nhapdsluong() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so giang vien can tinh luong : ");
		n = Integer.parseInt(sc.nextLine());
		for(int i =0; i<n ;i++) {
			giangVien gv =new giangVien();
			gv.nhaptinhluong();
			//gv.tinhtt();
			lst.add(gv);
		}
	}
	public void hiendsluong() {
		for(giangVien i: lst) {
			i.hienluong();
		}
	}
	public void luongmax() {
		giangVien max = new giangVien();
		max = lst.get(0);
		for(giangVien a : lst) {
			if(a.tinhtt()>max.tinhtt()) {
				max = a;
			}
		}
		System.out.println("Giang vien co luong cao nhat");
		max.hienluong();
	}
	public void luongmin() {
		giangVien min = new giangVien();
		min = lst.get(0);
		for(giangVien a : lst) {
			if(a.tinhtt()<min.tinhtt()) {
				min = a;
			}
		}
		System.out.println("Giang vien co luong thap nhat");
		min.hienluong();
	}
	public void sapxepdsl() {
		Collections.sort(lst, new Comparator<giangVien>() {
			@Override
			public int compare(giangVien o1, giangVien o2) {
				return (int)(o1.tinhtt() - o2.tinhtt());
			}
		});
	}
	public void ghiluong() {
			try{
				FileOutputStream f1=new FileOutputStream(f);
				ObjectOutputStream f2=new ObjectOutputStream(f1);
				for(giangVien i:lst) {
				f2.writeObject(i);
				}
				f2.close();
				f1.close();
		}
			catch(Exception e) {
				System.out.println("Ghi khong thanh cong");
				}
				
		}
	public void docluong() {
		try {
			FileInputStream f3=new FileInputStream(f);
			ObjectInputStream f4=new ObjectInputStream(f3);
			while(f4.available()>0) {
				lst=(ArrayList<giangVien>)f4.readObject();
			}
			hiendsluong();
			f4.close();
			f3.close();
		}catch(Exception e) {
			System.out.println("doc khong thanh cong");
		}
	}
	}


