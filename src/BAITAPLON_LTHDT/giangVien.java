package BAITAPLON_LTHDT;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class giangVien extends Nguoi implements mon,Serializable{
		private String maGv;
		private String chucV;
		private int tgian;
		private String khoa;
		private String Monday;
		private String Nganhday;
		private tongtien tt;

		public giangVien(String ten, boolean gtinh, Date ngayS, String diaC, String maGv, String chucV, int tgian,
				String khoa, String monday, String nganhday) {
			super(ten, gtinh, ngayS, diaC);
			this.maGv = maGv;
			this.chucV = chucV;
			this.tgian = tgian;
			this.khoa = khoa;
			this.Monday = monday;
			this.Nganhday = nganhday;
		}
		public giangVien() {
		}
		public String getMaGv() {
			return maGv;
		}
		public void setMaGv(String maGv) {
			this.maGv = maGv;
		}
		public String getChucV() {
			return chucV;
		}
		public void setChucV(String chucV) {
			this.chucV = chucV;
		}
		public int getTgian() {
			return tgian;
		}
		public void setTgian(int tgian) {
			this.tgian = tgian;
		}

		public String getKhoa() {
			return khoa;
		}
		public void setKhoa(String khoa) {
			this.khoa = khoa;
		}
		public void nhapgv() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Ma giang vien:");
			this.maGv=sc.nextLine();
			super.nhap();
			System.out.println("Chuc vu:");
			this.chucV=sc.nextLine();		
			System.out.println("Thoi gian: ");
			this.tgian=Integer.parseInt(sc.nextLine());
			System.out.println("Khoa: ");
			this.khoa=sc.nextLine();
			nmonday();
			nnganhd();
		}
		public void nhaptinhluong() {
			tt = new tongtien();
			System.out.println("Nhap Thong tin giang vien :");
			super.nhap();
			tt.nhapdt();
		}
		public double tinhtt() {
			return tt.tongtien();
		}
		public void hienluong() {
			System.out.println(super.toString()+ "tien luong : " +tt.tongtien());
		}
		public String nmonday() {
			Scanner sc = new Scanner (System.in);
			System.out.println("Nhap mon co the day: ");
			Monday = sc.nextLine();
		return Monday ;	
		}
		public String nnganhd() {
			Scanner sc = new Scanner (System.in);
			System.out.println("Nhap nganh day : ");
			Nganhday = sc.nextLine();
			return Nganhday;
		}
		@Override
		public String toString() {
			return "GiangVien :"+super.toString()+", MaGv" + maGv + ", chucV=" + chucV + ", tgian=" + tgian + ", khoa=" + khoa + ", Monday="
					+ Monday + ", Nganhday=" + Nganhday;
		}
		public void hiengv() {
			System.out.println(toString());
		}
		
}
