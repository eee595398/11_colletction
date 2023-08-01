package edu.kh.collection.model.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.model.svo.Book;

public class BookService {
	
	
	private List<Book> bookList = new LinkedList<Book>();
	Scanner sc = new Scanner(System.in);

	
	public  void displayMenu() {
		
		int num=0;
		do {
			System.out.println("<도서 목록 프로그램>");
			System.out.println("1.도서 등록");
			System.out.println("2.도서 조회");
			System.out.println("3.도서 수정");
			System.out.println("4.도서 삭제");
			System.out.println("5.즐겨찾기 추가");
			System.out.println("6.즐겨찾기 취소");
			System.out.println("0.종료");
			System.out.print("\n메뉴 번호 선택 >>");
			try {
				num = sc.nextInt();
				switch(num){
				
				
				case 1 : System.out.println(bookAdd()); break;
				case 2 : selectAll(); break;
				case 3 : System.out.println(bookUpdate()); break;
				case 4 : System.out.println(bookremove()); break;
				case 5 : System.out.println(); break;
				case 6 : System.out.println(); break;
				case 0 : System.out.println("프로그램 종료"); break;
				default : System.out.println("잘못 입력했습니다.");
				
				}
				
				
			}catch(Exception e) {
				System.out.println("입력 형식이 올바르지 않습니다.");
				sc.nextLine();
				num = -1;
			}
			
			
		}while(num!=0);
			
		
	}
	
	public String bookAdd()throws Exception {
		System.out.print("도서명 : ");
		String bookname = sc.nextLine();
		
		System.out.print("작가 이름 : ");
		String name = sc.nextLine();

		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String namename = sc.nextLine();
		
		if(bookList.add(new Book(bookname, name, price, namename))) {
			return "등록되었습니다.";
			
		}
		else {
			return"실패했습니다.";
		}
		
		
	}
	
	public void selectAll() {
		
		if(bookList.isEmpty()) {
			System.out.println("정보가 없습니다");
			return;
		}
		
		for(Book b : bookList) {
			System.out.println(b);
		}
		
		
	}
	
	public String bookUpdate() throws Exception {
		 
		System.out.print("번호 입력 : ");
		int index = sc.nextInt();
		
		if(bookList.isEmpty()) {
			return"정보가 없습니다";
		}
		else if(index<0) {
			return"음수를 입력 할 수 없습니다";
		}
		else if(index>=bookList.size()) {
			return"범위를 넝어서는 값을 입력할 수 없습니다.";
		} else {
			System.out.println(bookList.get(index));
			// if temp num
			//boolean flag 
			//switch()
			System.out.println("도서명 : ");
			String bookname = sc.nextLine();
			
			System.out.println("작가 이름 : ");
			String name = sc.nextLine();

			
			System.out.println("도서 가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.println("출판사 : ");
			String namename = sc.nextLine();
			
			Book temp = bookList.set(index, new Book(bookname,name,price,namename));
			return temp.getBookname();
		
			//if
		}
		
		// return
		
	}
	
	public String bookremove() throws Exception {
		System.out.print("번호 입력 : ");
		int index = sc.nextInt();
		
		if(bookList.isEmpty()) {
			return"정보가 없습니다";
		}
		else if(index<0) {
			return"음수를 입력 할 수 없습니다";
		}
		else if(index>=bookList.size()) {
			return"범위를 넝어서는 값을 입력할 수 없습니다.";
		} else {
		 System.out.println("정말 삭제 하시겠습니까?(Y/N)");
		 char input = sc.next().toUpperCase().charAt(0);
		 
		 if(input=='Y') {
			 Book temp = bookList.remove(index);
			 return temp+"가 삭제되었습니다.";
		 }else {
			 return "취소되었습니다.";
		 }
		 
		 
		 
	}
	
}
	
	
	public String bookmark() {

	}
}
