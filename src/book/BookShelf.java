package book;

import java.util.HashMap;

public class BookShelf {
	public static HashMap<String, BookVO> bookList = new HashMap<String, BookVO>();
	
	public BookShelf() {
		bookList.put("미드나잇 라이브러리",new BookVO("미드나잇 라이브러리", "매트 헤이그", "소설", "2021-04-28", 3));
		bookList.put("그러라 그래", new BookVO("그러라 그래", "양희은", "에세이", "2021-04-12", 5));
		bookList.put("악의 꽃", new BookVO("악의 꽃", "샤를 보들레르", "시", "2021-06-20", 1));
		bookList.put("종의 기원", new BookVO("종의 기원", "정유정", "소설", "2016-05-16", 6));
		bookList.put("이번 생은 술꾼입니다", new BookVO("이번 생은 술꾼입니다","민정원", "에세이", "2021-06-23", 5));
		bookList.put("뺨에 묻은 보석", new BookVO("뺨에 묻은 보석", "박형서", "에세이", "2021-06-10",3));
		bookList.put("빈틈의 온기", new BookVO("빈틈의 온기", "윤고은", "에세이", "2021-05-28", 0));
		bookList.put("녹턴", new BookVO("녹턴", "가즈오 이시구로", "소설", "2021-04-20", 1));
		bookList.put("제인에어", new BookVO("제인에어", "샬럿 브론테", "소설", "2010-06-15", 2));
		bookList.put("모순", new BookVO("모순", "양귀자", "소설", "2021-05-25", 5));
		bookList.put("아몬드", new BookVO("아몬드", "손원평", "소설", "2017-03-31", 4));
		bookList.put("7년의 밤", new BookVO("7년의 밤", "정유정", "소설", "2016-05-30", 4));
		bookList.put("필요가 피로가 되지 않게", new BookVO("필요가 피로가 되지 않게", "인나미 이쓰시", "자기계발", "2021-06-10", 1));
		bookList.put("운의 알고리즘", new BookVO("운의 알고리즘", "정회도", "자기계발", "2021-04-28", 0));
		bookList.put("미라클 모닝", new BookVO("미라클 모닝", "할 엘로드", "자기계발", "2016-02-22", 3));
		bookList.put("특별하게 제주", new BookVO("특별하게 제주", "강경필", "여행", "2020-08-10", 3));
		bookList.put("여행의 기술", new BookVO("여행의 기술", "알랭 드 보통", "여행", "2011-12-10", 2));
		bookList.put("오래된 질문", new BookVO("오래된 질문", "장원재", "인문", "2021-05-12", 6));
		bookList.put("없던 오늘", new BookVO("없던 오늘", "유병욱", "인문", "2021-06-21", 3));
		
	}


}
