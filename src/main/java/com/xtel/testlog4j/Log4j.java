package com.xtel.testlog4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;


public class Log4j {
	
	 final static Logger logger = Logger.getLogger(Log4j.class);
	 
	 ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();
		SinhVien sv = new SinhVien();
		SinhVienModel s= new SinhVienModel();
		
		//Nhap thong tin va so luong sinh vien
		public void inputDataStudent() throws Exception{
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			SinhVien sv = new SinhVien();
			SinhVienModel svm = new SinhVienModel();
			System.out.println("Nhap vao so luong sinh vien ban muon them: ");
			int soLuong = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < soLuong; i++) {
				System.out.println("Sinh vien thu "+(i+1));
				sv.inputSinhVien();
				svm.insertSinhVien(sv);
			}
			logger.info("Insert data successful.!");
			
		}
		
		//Hien thi thong tin sinh vien
			public void outputDataStudent() {
				SinhVienModel svm = new SinhVienModel();
				List<SinhVien> list = svm.getInfoSinhVien();
				for (int i = 0; i < list.size(); i++) {
					list.get(i).outputSinhVien();
				}
			}
		
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			Log4j m = new Log4j();
			System.out.println("=================================================");
			System.out.println("1.Hien thi thong tin sinh vien.");
			System.out.println("2.Them thong tin sinh vien.");
			System.out.println("3.Thoat.");
			System.out.println("=================================================");
			do {
				System.out.println("Nhap vao lua chon cua ban:");
				int chon = Integer.parseInt(sc.nextLine());
				switch (chon) {
					case 1:
						m.outputDataStudent();
						break;
					case 2:
						m.inputDataStudent();
						break;
						default:
							System.exit(3);
						break;
				}
			} while (true);
		}


}
