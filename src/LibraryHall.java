import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import book.BookShelf;
import book.BookVO;
import membership.Login;

public class LibraryHall {
	
	BookShelf shelf = new BookShelf();
	Login login = new Login();
	
	
	public LibraryHall() {
		libraryOpen();
	}

	public void libraryOpen() {
		do {	
			//실행
			doubleLinePrint();
			System.out.println("\t\t\t\t\t비트캠프 도서관");
			doubleLinePrint();
			
			//로그인
			login.loginMenu();
			
			//메인메뉴
			
			lib: do {
				try {
						int menuNum = Integer.parseInt(inData("1.도서목록\t2.도서검색\t3.도서대출\t4.도서반납\t5.로그아웃\t6.종료"));
						linePrint();
						
						switch(menuNum) {
							case 1 :
								bookList();
								break;
							case 2 :
								bookSearch();
								break;
							case 3 :
								bookOut();
								break;
							case 4 :
								bookIn();
								break;
							case 5 :
								System.out.println("______________________________________ 이용해 주셔서 감사합니다. ______________________________________");
								System.out.println("\n\n");
								
								break lib;
							case 6 :
								System.exit(0);
							default : 
								if(menuNum>6) {
									System.out.println("_____________________________________ 번호를 다시 입력해주세요. _______________________________________\n\n");
								}
						}
				}catch(NumberFormatException nfe) {
					System.out.println("_____________________________________ 번호를 다시 입력해주세요. _______________________________________\n\n");
				}
			}while(true);
		}while(true);	
	}
	
	
	
	//도서대출
	public void bookOut() {
		BookVO vo = new BookVO();
		do {
			try {
				String bookRent = inData("대여할 책 제목을 입력해주세요.");
				vo = BookShelf.bookList.get(bookRent);
				if(vo.getStock()<=0) {
					System.out.printf("\n제목 : %s\n저자 : %s\n장르 : %s\n재고 : %d\n", vo.getBookTitle(), vo.getBookWriter(), vo.getGenre(), vo.getStock() );
					System.out.println("-------------------------------------- 모든 책이 대여중입니다. ---------------------------------------\n\n");
				}else {
					vo.setStock(vo.getStock()-1);
					System.out.printf("\n제목 : %s\n저자 : %s\n장르 : %s\n재고 : %d\n", vo.getBookTitle(), vo.getBookWriter(), vo.getGenre(), vo.getStock() );
					System.out.println("-------------------------------------- '"+bookRent+"' 대여 완료되었습니다. --------------------------------------\n\n");			
					break;
				}
			}catch(NullPointerException npe) {
				System.out.println("검색하신 책은 보유하고 있지않습니다. 다시 검색해주세요.\n\n");
			}
		}while(true);
	}
	
	//도서반남
	public void bookIn() {
		BookVO vo = new BookVO();
		do {
			try {
				String bookReturn = inData("반납할 책 제목을 입력해주세요.");
				vo = BookShelf.bookList.get(bookReturn);
				vo.setStock(vo.getStock()+1);
				System.out.printf("\n제목 : %s\n저자 : %s\n장르 : %s\n재고 : %d\n", vo.getBookTitle(), vo.getBookWriter(), vo.getGenre(), vo.getStock() );
				System.out.println("************************************* 반납이 완료되었습니다. ******************************************\n\n");
				break;
			}catch(NullPointerException npe) {
				System.out.println("입력을 바로해주세요.__________________________________________________________________________________\n\n");
			}
		}while(true);
	}
	
	//도서검색
	public void bookSearch() {
		Set<String> bookSet = shelf.bookList.keySet();
		BookVO vo = new BookVO();
		
		linePrint();
		String title = inData("제목검색을 입력해주세요.");
		vo = BookShelf.bookList.get(title);
		if (bookSet.contains(title)) {
			System.out.printf("\n제목 : %s\n저자 : %s\n장르 : %s\n재고 : %d\n", vo.getBookTitle(), vo.getBookWriter(), vo.getGenre(), vo.getStock() );
			System.out.printf("******************************** 검색하신 '%s' 책이 있습니다.*************************************\n\n",title);
			
			linePrint();
		}else {
			System.out.printf("찾으시는 '%s'책은 없습니다.\n\n",title);
			linePrint();
		}
		
	}
	
	//책List Print
	public void bookList() {	
		BookVO.titlePrint();
		linePrint();
		Collection<BookVO> list = shelf.bookList.values();
		Iterator<BookVO> ii = list.iterator();
		while(ii.hasNext()) {
			BookVO vo = ii.next();
			vo.bookPrint();
		}
		
		linePrint();
	}

	//2라인 프린트
	public void doubleLinePrint() {
		System.out.println("=================================================================================================");
	}
	//1라인 프린트
	public void linePrint() {
		System.out.println("-------------------------------------------------------------------------------------------------");
	}
	public String inData(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.print(msg+" : ");
		return sc.nextLine();
	}
}
