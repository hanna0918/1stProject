package membership;

import java.util.Collection;
import java.util.Scanner;
import java.util.Set;

public class Login {
	Scanner scan = new Scanner(System.in);
	MemberData md= new MemberData();
	Set<String> memberData = md.memberList.keySet();
	Collection<MemberVO> membervo = md.memberList.values();
	
	
	public Login() {
		
		
		
	}
	//�α��θ޴�
	public void loginMenu() {	
		
		do{
			try {
				int intro = Integer.parseInt(inData("\t\t\t1.�α���\t\t\t\t2.ȸ������"));
				System.out.println("-------------------------------------------------------------------------------------------------");
				if(intro==1) {
					loginmem();
					break;
				}else if(intro == 2) {
					joinMember();
					break;
				}	
			}catch(NumberFormatException nfe) {
				System.out.println("\n****************************** �޴� ��ȣ�� �ٽ� �Է����ּ���. *****************************************\n");
			}
		}while(true);		
			
		
		System.out.println();
	}	
	
	//�α���
	public void loginmem() {
		MemberVO vo = new MemberVO();
		do {
			String id = inData("ID");
			String pw = inData("PW");
			md.memberList.get(id);
			if (!memberData.contains(id)) {
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx��ϵ� ���̵� �����ϴ�.xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n\n");
				continue;
			}else {
				vo = MemberData.memberList.get(id);
				if(pw.equals(vo.getPw())) {
					System.out.println("**************************************** ȯ �� �� �� �� ******************************************");
					break;
				}else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���!");
				}
			}
		}while(true);
	}
	
	
	
	//ȸ������
	public void joinMember() {
		MemberVO vo = new MemberVO();
		do {	
			try {
				String id = inData("ID�� �Է��ϼ���");
				vo.setId(id);
				String pw = inData("��й�ȣ�� �Է��ϼ���.");
				vo.setPw(pw);
				String name = inData("�̸��� �Է��ϼ���.");
				vo.setName(name);
			
				int tel = Integer.parseInt(inData("����ó�� �Է��ϼ���."));
				vo.setTel(tel);
			
				if(memberData.contains(id)) {
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx �ߺ��� ���̵��Դϴ�. �ٽ� �Է��ϼ���. xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				}else {
					System.out.println("********************************* ȯ���մϴ�. �α��� �� �̿����ּ���!***********************************");
					MemberData.memberList.put(id, vo);
					loginmem();
					break;
				}
			}catch(NumberFormatException nfe) {
				System.out.println("************************************ ����ó�� ���ڸ� �Է����ּ���.**************************************");
			}
		}while(true);	
	}
	
	
	//��ĵ�޼ҵ�
	public String inData(String msg) {
		System.out.print(msg+" : ");
		return scan.nextLine();
	}
}
