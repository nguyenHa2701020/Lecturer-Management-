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

public class dsachqly {
ArrayList<quanly> lst =new ArrayList<>();
File ql= new File("lanhdao.dat");
public void nhapdsql() {
	int n;
	Scanner sc= new Scanner(System.in);
	System.out.println("Nhap so quan ly: ");
	n=sc.nextInt();
	for(int i=0;i<n;i++) {
		quanly ql= new quanly();
		ql.nhapql();
		lst.add(ql);
	}
}
public void xuatdsql() {
	for(quanly i: lst) {
		i.hienql();
	}
}
public void sapxep() {
	Collections.sort(lst, new Comparator<quanly>() {
		@Override
		public int compare(quanly o1, quanly o2) {
			return o1.getVaol().compareTo(o2.getVaol());
		}
	});
}

public void ghidstp() {
	try{
		FileOutputStream f1=new FileOutputStream(ql);
		ObjectOutputStream f2=new ObjectOutputStream(f1);
		for(quanly i: lst ) {
		if(i.getVitri().compareTo("truong phong")==0) {
		f2.writeObject(i);}
		}
		f2.close();
		f1.close();
}
	catch(Exception e) {
		System.out.println("Ghi khong thanh cong");
		}
		
	}
public void docdstp() {
	try {
		FileInputStream f3= new FileInputStream(ql);
		ObjectInputStream f4= new ObjectInputStream(f3);
		while(f4.available()>0) {
			lst=(ArrayList<quanly>)f4.readObject();
		}
			System.out.println(lst);
	}catch(Exception e) {
		System.out.println("Doc khong thanh cong");
	}
}
}
