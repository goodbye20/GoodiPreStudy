package JavaApiStudy.exam02;

public class Member {
	
	public String id;
	
	public Member(String id	) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		 if(obj instanceof Member) {
			 Member member = (Member) obj;
			 if(id.equals(member.id)) { //여기서 사용되는 equals는
				return true; 		  // id가 String으로 선언됬기에
			 }						// String타입 equals >> 문자열비교
		 }
		 return false;
	}
}
