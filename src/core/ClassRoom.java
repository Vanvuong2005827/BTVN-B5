package core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import javax.swing.plaf.LabelUI;

public class ClassRoom {
	static ArrayList<Student> li = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	public void sortByGpa() {
		li.sort(Comparator.comparing(Student::getGpa).reversed());
	}
	
	public void inputList() {
		while(true) {
			li.add(new Student());
			li.getLast().input();
			System.out.println("Nhập Thành Công Sinh Viên!");
			if (li.getLast().getId() == 555) return;
		}
	}
	
	public void outputList() {
		li.getLast().StringFormat();
		for(Student students : li) {
			students.output();
		}
	}
	
	public void removeById() {
		System.out.println("Nhập Vào ID cần Xóa:");
		int IdToRemove = sc.nextInt();
		

		if (li.removeIf(c -> c.getId() == IdToRemove)) {
			System.out.println("Đã Xóa");
		} else System.out.println("Không tồn tại để xóa!");
	}
	
	public static void main(String[] args) {
		
		ClassRoom Class = new ClassRoom();
		int n;
		do {
			System.out.println("1. Nhập Thông Tin Sinh Viên (đến khi có mã sinh viên 555 thì dừng nhập)");
			System.out.println("2. In Thông Tin Sinh Viên Dạng Bảng");
			System.out.println("3. Sắp xếp danh sách sinh viên theo gpa");
			System.out.println("4. Xóa sinh viên theo id");
			System.out.println("5. Exit");
			
			n = sc.nextInt();
			
			switch (n) {
			case 1: 
				Class.inputList();
				break;
			case 2:
				Class.outputList();
				break;
			case 3:
				Class.sortByGpa();
				break;
			case 4:
				Class.removeById();
				break;
				
			}
			
		} while (n < 5);
	}
}
