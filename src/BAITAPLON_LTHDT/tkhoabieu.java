package BAITAPLON_LTHDT;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class tkhoabieu implements mon,Serializable {
	private String gv;
	private String Phongday;
	private String maMon;
	private String Monday;
	private String Nganhday;
	private Date Ngayday;
	SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
	public tkhoabieu(String gv, String phongday, String maMon, Date Ngayday) {
		this.gv = gv;
		this.Phongday = phongday;
		this.maMon = maMon;
		this.Ngayday = Ngayday;
	}
	
	public tkhoabieu() {
	}
	public void nhaptkb() {
		Ngayday = new Date(0);
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap ten Giang vien:");
		this.gv = sc.nextLine();
		System.out.println("Nhap Phong day :");
		this.Phongday = sc.nextLine();
		System.out.println("Nhap ma mon:");
		this.maMon =sc.nextLine();
		nmonday();
		nnganhd();
		System.out.println("Nhap ngay day:");	
		try {
			this.Ngayday = (Date)sd.parse(sc.nextLine());
		}catch(Exception e) {
			System.out.println("Nhap khong duoc ngay day!!!");
		} 
	}
	
	public void setNganhday(String nganhday) {
		Nganhday = nganhday;
	}

	public Date getNgayday() {
		return Ngayday;
	}

	public String nmonday() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap mon  day: ");
		Monday = sc.nextLine();
		return Monday ;	
	}
	public String nnganhd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap nganh day: ");
		this.Nganhday = sc.nextLine();
		return Nganhday ;
	}

	public String toString() {
		return "  Ngayday =" + sd.format(Ngayday)  + ",Giang Vien =" + gv + ", Phongday=" + Phongday + ",maMon=" + maMon + ", Monday="
				+ Monday + ", Nganhday=" + Nganhday  ;
	}

	public void hientkb() {
		System.out.println(toString());
	}
}
