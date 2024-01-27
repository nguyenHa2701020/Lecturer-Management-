package BAITAPLON_LTHDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class qlgiangvien {
	ArrayList<giangVien> lst = new ArrayList<>();
	File gv=new File("Giangvien.dat");
	public void nhapdsgv() {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap so giang vien: ");
		n =sc.nextInt();
		for(int i =0;i<n;i++) {
			giangVien gv = new giangVien();
			gv.nhapgv();
			lst.add(gv);
		}
	}
	public void chengv() {
		Scanner sc= new Scanner(System.in);
		giangVien gv=new giangVien();
		System.out.println("Nhap vi tri can chen:");
		int vt=sc.nextInt();
		System.out.println("Nhap giang vien can chen:");
		gv.nhapgv();
			lst.add(vt, gv);
	}
	public void themgv() {
		Scanner sc= new Scanner(System.in);
		giangVien gv=new giangVien();
		System.out.println("Nhap giang vien can them:");
		gv.nhapgv();
			lst.add(gv);		
	}
	public void xoagv() {
		Scanner sc= new Scanner(System.in);
		giangVien gv=new giangVien();
		System.out.println("Nhap vi tri can xoa:");
		int a=sc.nextInt();
			lst.remove(a);
	}
	public void xoaall() {
		lst.removeAll(lst);
	}
	public void hiends() {
		for(giangVien gi : lst) {
			gi.hiengv();
		}
	}
	public void timkiem() {
		String s = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten giang vien muon tim:");
		s = sc.nextLine();
		for(giangVien i: lst) {
			if(i.getTen().compareTo(s)==0) {
				i.hiengv();
			}
		}
	}
	public void sapxepdsgv() {
		Collections.sort(lst, new Comparator<giangVien>() {
			@Override
			public int compare(giangVien o1, giangVien o2) {
				return o1.getTen().compareTo(o2.getTen());
			}
		});
	}
	public void ghidsgv() {
		try{
			FileOutputStream f1=new FileOutputStream(gv);
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
	public void docdsgv() {
		try {
			FileInputStream f3=new FileInputStream(gv);
			ObjectInputStream f4=new ObjectInputStream(f3);
			while(f4.available()>0) {
				lst=(ArrayList<giangVien>)f4.readObject();
			}
			hiends();
			f4.close();
			f3.close();
		}catch(Exception e) {
			System.out.println("doc khong thanh cong");
		}
	}
}

