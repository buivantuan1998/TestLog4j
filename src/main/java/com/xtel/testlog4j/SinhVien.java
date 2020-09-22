/**
 * 
 */
package com.xtel.testlog4j;

import java.util.List;
import java.util.Scanner;


/**
 * @author admin
 *
 */
public class SinhVien {
	private int id;
	private String tenSV;
	private int gioiTinh;
	private String queQuan;
	private int tuoi;
	
	public SinhVien() {
		super();
	}

	public SinhVien(String tenSV, int gioiTinh, String queQuan, int tuoi) {
		super();
		this.tenSV = tenSV;
		this.gioiTinh = gioiTinh;
		this.queQuan = queQuan;
		this.tuoi = tuoi;
	}

	public SinhVien(int id, String tenSV, int gioiTinh, String queQuan, int tuoi) {
		super();
		this.id = id;
		this.tenSV = tenSV;
		this.gioiTinh = gioiTinh;
		this.queQuan = queQuan;
		this.tuoi = tuoi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public int getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	//Nhap thong tin sinh vien
	public void inputSinhVien() {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		do {
			System.out.print("Nhap ten sinh vien:");
			this.tenSV=sc.nextLine();
		}while(checkName()==false);
			System.out.print("Nhap gioi tinh(0-nam, 1-nu):");
			this.gioiTinh= Integer.parseInt(sc.nextLine());
			System.out.print("Nhap que quan:");
			this.queQuan=sc.nextLine();
			System.out.print("Nhap tuoi sinh vien:");
			this.tuoi= Integer.parseInt(sc.nextLine());
	}
	
	//Hien thi thong tin
	public void outputSinhVien() {
		System.out.println(this.id+"   "+this.tenSV+"   "+this.gioiTinh+"   "+this.queQuan+"   "+this.tuoi);
	}
	
	//kiem tra ten nhap vao
	public boolean checkName() {
		Boolean check = false;
		SinhVienModel svm = new SinhVienModel();
		List<SinhVien> listSV = svm.getInfoSinhVien();
		for (int i = 0; i <listSV.size(); i++) {
			if(this.tenSV.equals(listSV.get(i).getTenSV())) {
				check = false;
			}
			else {
				check = true;
			}
		}
		return check;
	}
}
