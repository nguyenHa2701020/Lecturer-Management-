package BAITAPLON_LTHDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class qlthoikhoabieu {
ArrayList<tkhoabieu> lst = new ArrayList<>();
File f = new File("THOIKHOABIEU.DAT");
public void nhapdstkb() {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap so lich can phan cong: ");
	n = Integer.parseInt(sc.nextLine());
	for(int i=0 ;i<n;i++) {
		tkhoabieu tk = new tkhoabieu ();
		tk.nhaptkb();
		lst.add(tk);
	}
}
public void hiendstkb() {
	for(tkhoabieu i : lst) {
		i.hientkb();
	}
}
public void sapxeptkb() {
	Collections.sort(lst, new Comparator<tkhoabieu>() {

		@Override
		public int compare(tkhoabieu o1, tkhoabieu o2) {
			return o1.getNgayday().compareTo(o2.getNgayday());
		}
	});
	System.out.println("Sap xep thanh cong!!!!");
}
public void themlich() {
	tkhoabieu tkb = new tkhoabieu();
	System.out.println("nhap vao them TKB :");
	tkb.nhaptkb();
	lst.add(tkb);
}
public void xoavitri() {
	int i=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vi tri muon xoa: ");
	i = sc.nextInt();
	lst.remove(i);
}
public void sualich() {
	int i=0;
	tkhoabieu ngay= new tkhoabieu();
	Scanner sc= new Scanner (System.in);
	System.out.println("nhap doi tuong muon sua: ");
	ngay.nhaptkb();
	System.out.println("nhap vi tri muon sua :");
	i=sc.nextInt();
	lst.set(i,ngay);
}
public void chenlich() {
	int i =0;
	tkhoabieu object = new tkhoabieu();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vi tri muon chen");
	i= sc.nextInt();
	System.out.println("Nhap doi tuong muon chen");
	object.nhaptkb();
	lst.add(i,object);
}
public void xoaall() {
	lst.removeAll(lst);
}
public void ghitkb() {
	try{
		FileOutputStream f1=new FileOutputStream(f);
		ObjectOutputStream f2=new ObjectOutputStream(f1);
		for(tkhoabieu i:lst) {
		f2.writeObject(i);
		}
		f2.close();
		f1.close();
}
	catch(Exception e) {
		System.out.println("Ghi khong thanh cong");
		}
		
}
public void doctkb() {
	try {
		FileInputStream f3=new FileInputStream(f);
		ObjectInputStream f4=new ObjectInputStream(f3);
		while(f4.available()>0) {
			lst=(ArrayList<tkhoabieu>)f4.readObject();
		}
		hiendstkb();
		f4.close();
		f3.close();
	}catch(Exception e) {
		System.out.println("doc khong thanh cong");
	}
}
}
