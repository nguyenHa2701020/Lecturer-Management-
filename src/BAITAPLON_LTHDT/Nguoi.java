package BAITAPLON_LTHDT;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

abstract public class Nguoi {
	protected String ten;
	protected boolean gtinh;
	protected Date ngayS;
	protected String diaC;
	String nn;
	SimpleDateFormat sl = new SimpleDateFormat("dd-MM-yyyy");
	public Nguoi(String ten, boolean gtinh, Date ngayS, String diaC) {
		super();
		this.ten = ten;
		this.gtinh = gtinh;
		this.ngayS = ngayS;
		this.diaC = diaC;
	}
	
	public Nguoi() {
		super();
	}

	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public boolean isGtinh() {
		return gtinh;
	}
	public void setGtinh(boolean gtinh) {
		this.gtinh = gtinh;
	}
	public Date getNgayS() {
		return ngayS;
	}
	public void setNgayS(Date ngayS) {
		this.ngayS = ngayS;
	}
	public String getDiaC() {
		return diaC;
	}
	public void setDiaC(String diaC) {
		this.diaC = diaC;
	}
	public void nhap() {
		ngayS = new Date();
		Scanner sc= new Scanner(System.in);
		System.out.println("Ten:");
		this.ten=sc.nextLine();
		System.out.println("Gioi tinh:");
		this.gtinh=sc.nextBoolean();
		if(gtinh==true) {
			nn="Nam";
		}
		else {nn="Nu";}
		sc.nextLine();
		
		System.out.println("Ngay sinh:");
		try {
			ngayS = (Date) sl.parse(sc.nextLine());
		}catch(Exception e) {
			System.out.println("nhap khong duoc!!!");
		}
		System.out.println("Dia chi:");
		this.diaC=sc.nextLine();
		}
	
	@Override
	public String toString() {
		return "ten=" + ten + ", gtinh=" + nn + ", ngayS=" + sl.format(ngayS) + ", diaC=" + diaC ;
	}

	public void hien() {
		System.out.println(toString());
	}
}
