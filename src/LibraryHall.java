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
			//����
			doubleLinePrint();
			System.out.println("\t\t\t\t\t��Ʈķ�� ������");
			doubleLinePrint();
			
			//�α���
			login.loginMenu();
			
			//���θ޴�
			
			lib: do {
				try {
						int menuNum = Integer.parseInt(inData("1.�������\t2.�����˻�\t3.��������\t4.�����ݳ�\t5.�α׾ƿ�\t6.����"));
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
								System.out.println("______________________________________ �̿��� �ּż� �����մϴ�. ______________________________________");
								System.out.println("\n\n");
								
								break lib;
							case 6 :
								System.exit(0);
							default : 
								if(menuNum>6) {
									System.out.println("_____________________________________ ��ȣ�� �ٽ� �Է����ּ���. _______________________________________\n\n");
								}
						}
				}catch(NumberFormatException nfe) {
					System.out.println("_____________________________________ ��ȣ�� �ٽ� �Է����ּ���. _______________________________________\n\n");
				}
			}while(true);
		}while(true);	
	}
	
	
	
	//��������
	public void bookOut() {
		BookVO vo = new BookVO();
		do {
			try {
				String bookRent = inData("�뿩�� å ������ �Է����ּ���.");
				vo = BookShelf.bookList.get(bookRent);
				if(vo.getStock()<=0) {
					System.out.printf("\n���� : %s\n���� : %s\n�帣 : %s\n��� : %d\n", vo.getBookTitle(), vo.getBookWriter(), vo.getGenre(), vo.getStock() );
					System.out.println("-------------------------------------- ��� å�� �뿩���Դϴ�. ---------------------------------------\n\n");
				}else {
					vo.setStock(vo.getStock()-1);
					System.out.printf("\n���� : %s\n���� : %s\n�帣 : %s\n��� : %d\n", vo.getBookTitle(), vo.getBookWriter(), vo.getGenre(), vo.getStock() );
					System.out.println("-------------------------------------- '"+bookRent+"' �뿩 �Ϸ�Ǿ����ϴ�. --------------------------------------\n\n");			
					break;
				}
			}catch(NullPointerException npe) {
				System.out.println("�˻��Ͻ� å�� �����ϰ� �����ʽ��ϴ�. �ٽ� �˻����ּ���.\n\n");
			}
		}while(true);
	}
	
	//�����ݳ�
	public void bookIn() {
		BookVO vo = new BookVO();
		do {
			try {
				String bookReturn = inData("�ݳ��� å ������ �Է����ּ���.");
				vo = BookShelf.bookList.get(bookReturn);
				vo.setStock(vo.getStock()+1);
				System.out.printf("\n���� : %s\n���� : %s\n�帣 : %s\n��� : %d\n", vo.getBookTitle(), vo.getBookWriter(), vo.getGenre(), vo.getStock() );
				System.out.println("************************************* �ݳ��� �Ϸ�Ǿ����ϴ�. ******************************************\n\n");
				break;
			}catch(NullPointerException npe) {
				System.out.println("�Է��� �ٷ����ּ���.__________________________________________________________________________________\n\n");
			}
		}while(true);
	}
	
	//�����˻�
	public void bookSearch() {
		Set<String> bookSet = shelf.bookList.keySet();
		BookVO vo = new BookVO();
		
		linePrint();
		String title = inData("����˻��� �Է����ּ���.");
		vo = BookShelf.bookList.get(title);
		if (bookSet.contains(title)) {
			System.out.printf("\n���� : %s\n���� : %s\n�帣 : %s\n��� : %d\n", vo.getBookTitle(), vo.getBookWriter(), vo.getGenre(), vo.getStock() );
			System.out.printf("******************************** �˻��Ͻ� '%s' å�� �ֽ��ϴ�.*************************************\n\n",title);
			
			linePrint();
		}else {
			System.out.printf("ã���ô� '%s'å�� �����ϴ�.\n\n",title);
			linePrint();
		}
		
	}
	
	//åList Print
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

	//2���� ����Ʈ
	public void doubleLinePrint() {
		System.out.println("=================================================================================================");
	}
	//1���� ����Ʈ
	public void linePrint() {
		System.out.println("-------------------------------------------------------------------------------------------------");
	}
	public String inData(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.print(msg+" : ");
		return sc.nextLine();
	}
}
