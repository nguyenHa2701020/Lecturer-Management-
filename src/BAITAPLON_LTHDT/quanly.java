package BAITAPLON_LTHDT;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class quanly extends Nguoi implements Subscriber {
 private String vitri;
 private int pcap;
 private Date vaol;
 SimpleDateFormat vl = new SimpleDateFormat("dd-MM-yyyy");
public quanly(String ten, boolean gtinh, java.util.Date ngayS, String diaC, String vitri, int pcap, Date vaol) {
	super(ten, gtinh, ngayS, diaC);
	this.vitri = vitri;
	this.pcap = pcap;
	this.vaol = vaol;
}

public quanly() {
}
public String getVitri() {
	return vitri;
}
public void setVitri(String vitri) {
	this.vitri = vitri;
}
public int getPcap() {
	return pcap;
}
public void setPcap(int pcap) {
	this.pcap = pcap;
}
public Date getVaol() {
	return vaol;
}
public void setVaol(Date vaol) {
	this.vaol = vaol;
}
 public void nhapql() {
	 Scanner sc= new Scanner(System.in);
	 super.nhap();
	 System.out.println("Vi tri:");
	 this.vitri=sc.nextLine();
	 System.out.println("Phu cap:");
	 this.pcap=sc.nextInt();
	 sc.nextLine();
	 System.out.println("Ngay vao lam:");
	 try {
		 vaol=(Date) vl.parse(sc.nextLine());
	 }catch(Exception e ) {
		 System.out.println("Nhap sai ngay");
	 }
	 
 }
@Override
public String toString() {
	return super.toString()+"quanly [vitri=" + vitri + ", pcap=" + pcap + ", vaol=" + vl.format(vaol) + "]";
}
 public void hienql() {
	 System.out.println(toString());
 }

@Override
public void onSubscribe(Subscription subscription) {
	// TODO Auto-generated method stub
	
}

@Override
public void onNext(Object item) {
	// TODO Auto-generated method stub
	
}

@Override
public void onError(Throwable throwable) {
	// TODO Auto-generated method stub
	
}

@Override
public void onComplete() {
	// TODO Auto-generated method stub
	
}
}
