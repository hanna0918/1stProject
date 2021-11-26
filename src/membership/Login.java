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
	//로그인메뉴
	public void loginMenu() {	
		
		do{
			try {
				int intro = Integer.parseInt(inData("\t\t\t1.로그인\t\t\t\t2.회원가입"));
				System.out.println("-------------------------------------------------------------------------------------------------");
				if(intro==1) {
					loginmem();
					break;
				}else if(intro == 2) {
					joinMember();
					break;
				}	
			}catch(NumberFormatException nfe) {
				System.out.println("\n****************************** 메뉴 번호를 다시 입력해주세요. *****************************************\n");
			}
		}while(true);		
			
		
		System.out.println();
	}	
	
	//로그인
	public void loginmem() {
		MemberVO vo = new MemberVO();
		do {
			String id = inData("ID");
			String pw = inData("PW");
			md.memberList.get(id);
			if (!memberData.contains(id)) {
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx등록된 아이디가 없습니다.xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n\n");
				continue;
			}else {
				vo = MemberData.memberList.get(id);
				if(pw.equals(vo.getPw())) {
					System.out.println("**************************************** 환 영 합 니 다 ******************************************");
					break;
				}else {
					System.out.println("비밀번호가 틀렸습니다. 다시 입력해주세요!");
				}
			}
		}while(true);
	}
	
	
	
	//회원가입
	public void joinMember() {
		MemberVO vo = new MemberVO();
		do {	
			try {
				String id = inData("ID를 입력하세요");
				vo.setId(id);
				String pw = inData("비밀번호를 입력하세요.");
				vo.setPw(pw);
				String name = inData("이름을 입력하세요.");
				vo.setName(name);
			
				int tel = Integer.parseInt(inData("연락처를 입력하세요."));
				vo.setTel(tel);
			
				if(memberData.contains(id)) {
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx 중복된 아이디입니다. 다시 입력하세요. xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				}else {
					System.out.println("********************************* 환영합니다. 로그인 후 이용해주세요!***********************************");
					MemberData.memberList.put(id, vo);
					loginmem();
					break;
				}
			}catch(NumberFormatException nfe) {
				System.out.println("************************************ 연락처에 숫자를 입력해주세요.**************************************");
			}
		}while(true);	
	}
	
	
	//스캔메소드
	public String inData(String msg) {
		System.out.print(msg+" : ");
		return scan.nextLine();
	}
}
