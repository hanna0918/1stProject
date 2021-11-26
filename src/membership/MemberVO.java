package membership;

public class MemberVO {
	
	private String id, pw, name;
	private int tel;
	
	
	public MemberVO() {
		
	}
	
	public MemberVO(String id, String pw, String name, int tel) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
			
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}


	
	
}
