package BAITAPLON_LTHDT;

import java.io.Serializable;
import java.util.Scanner;

public class tongtien implements Serializable{
		private int sotietthua;
		private int HSL;
		private static int luongcb = 1350000;
		private static int thua1tiet=30000;
		public tongtien(int sotietthua, int hSL) {
			this.sotietthua = sotietthua;
			HSL = hSL;
		}

		public int getSotietthua() {
			return sotietthua;
		}
		public void setSotietthua(int sotietthua) {
			this.sotietthua = sotietthua;
		}
		public int getHSL() {
			return HSL;
		}
		public void setHSL(int hSL) {
			HSL = hSL;
		}
		public static int getLuongcb() {
			return luongcb;
		}
		public static void setLuongcb(int luongcb) {
			tongtien.luongcb = luongcb;
		}
		public static int getThua1tiet() {
			return thua1tiet;
		}
		public static void setThua1tiet(int thua1tiet) {
			tongtien.thua1tiet = thua1tiet;
		}
		public tongtien() {
			super();
			this.sotietthua = sotietthua;
		}
		public void nhapdt() {
			Scanner sc= new Scanner(System.in);
			System.out.println("So tiet day thua:");
			this.sotietthua=sc.nextInt();
			System.out.println("nhap HSL:");
			this.HSL = sc.nextInt();
		}
		public int tongtthua() {
			return thua1tiet*this.sotietthua;
		}
		public int luong() {
			return this.HSL * luongcb;
		}
		public double tongtien() {
			return (double)luong()+tongtthua();
		}

}

