package book;

import java.util.HashMap;

public class BookShelf {
	public static HashMap<String, BookVO> bookList = new HashMap<String, BookVO>();
	
	public BookShelf() {
		bookList.put("�̵峪�� ���̺귯��",new BookVO("�̵峪�� ���̺귯��", "��Ʈ ���̱�", "�Ҽ�", "2021-04-28", 3));
		bookList.put("�׷��� �׷�", new BookVO("�׷��� �׷�", "������", "������", "2021-04-12", 5));
		bookList.put("���� ��", new BookVO("���� ��", "���� ���鷹��", "��", "2021-06-20", 1));
		bookList.put("���� ���", new BookVO("���� ���", "������", "�Ҽ�", "2016-05-16", 6));
		bookList.put("�̹� ���� �����Դϴ�", new BookVO("�̹� ���� �����Դϴ�","������", "������", "2021-06-23", 5));
		bookList.put("���� ���� ����", new BookVO("���� ���� ����", "������", "������", "2021-06-10",3));
		bookList.put("��ƴ�� �±�", new BookVO("��ƴ�� �±�", "������", "������", "2021-05-28", 0));
		bookList.put("����", new BookVO("����", "����� �̽ñ���", "�Ҽ�", "2021-04-20", 1));
		bookList.put("���ο���", new BookVO("���ο���", "���� �����", "�Ҽ�", "2010-06-15", 2));
		bookList.put("���", new BookVO("���", "�����", "�Ҽ�", "2021-05-25", 5));
		bookList.put("�Ƹ��", new BookVO("�Ƹ��", "�տ���", "�Ҽ�", "2017-03-31", 4));
		bookList.put("7���� ��", new BookVO("7���� ��", "������", "�Ҽ�", "2016-05-30", 4));
		bookList.put("�ʿ䰡 �Ƿΰ� ���� �ʰ�", new BookVO("�ʿ䰡 �Ƿΰ� ���� �ʰ�", "�γ��� �̾���", "�ڱ���", "2021-06-10", 1));
		bookList.put("���� �˰���", new BookVO("���� �˰���", "��ȸ��", "�ڱ���", "2021-04-28", 0));
		bookList.put("�̶�Ŭ ���", new BookVO("�̶�Ŭ ���", "�� ���ε�", "�ڱ���", "2016-02-22", 3));
		bookList.put("Ư���ϰ� ����", new BookVO("Ư���ϰ� ����", "������", "����", "2020-08-10", 3));
		bookList.put("������ ���", new BookVO("������ ���", "�˷� �� ����", "����", "2011-12-10", 2));
		bookList.put("������ ����", new BookVO("������ ����", "�����", "�ι�", "2021-05-12", 6));
		bookList.put("���� ����", new BookVO("���� ����", "������", "�ι�", "2021-06-21", 3));
		
	}


}
