package book;

import java.util.Set;

public class BookVO {
	private String bookTitle;//책제목
	private String bookWriter;//작가
	private String genre;//장르
	private String releasDate;//출간일
	private int stock;//재고량
	
		
	public BookVO() {
		
	}
	
	public BookVO(String bookTitle, String bookWriter, String genre, String releasDate, int stock) {
		this.bookTitle = bookTitle;
		this.bookWriter = bookWriter;
		this.genre = genre;
		this.releasDate = releasDate;
		this.stock = stock;
	}
	

	
	
	
	
	//책 1권 출력=================
	public void bookPrint() {
		System.out.printf("%-25s \t%-15s \t%-10s \t%-10s \t%-10d\n", bookTitle, bookWriter, genre, releasDate, stock);
	}
	//타이틀 출력
	public static void titlePrint() {
		System.out.printf("%10s %22s %22s %17s %10s\n", "제목", "저자", "장르", "출간일", "재고");
		
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookWriter() {
		return bookWriter;
	}

	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getReleasDate() {
		return releasDate;
	}

	public void setReleasDate(String releasDate) {
		this.releasDate = releasDate;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
