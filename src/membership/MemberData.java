package membership;


import java.util.HashMap;

public class MemberData {
	public static HashMap<String, MemberVO> memberList = new HashMap<String, MemberVO>();
	
	public MemberData() {
		
		memberList.put("aaa", new MemberVO("aaa", "aaa","°¡", 010-1234-5678));
		memberList.put("bbb", new MemberVO("bbb", "bbb","³ª", 010-1234-5679));
		memberList.put("ccc", new MemberVO("ccc", "ccc","´Ù", 010-1234-5670));
		
		
		
	}
	
}
