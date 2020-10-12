package javaapp1008;

public class elseifTest {

	public static void main(String[] args) {
		//90 이상이면 A , 80 이상이면 B, 70 이상이면 C, 60이상이면 D, 그 이외는 F
		int score = 59;
		
		//만약 score가 90 이상이면
		if(score >= 90) {
			//A 출력
			System.out.println("A");
			//score가 80 이상이면
		}else if(score >= 80) {
			//B 출력
			System.out.println("B");
			//score가 70 이상이면
		}else if(score >= 70) {
			//C 출력
			System.out.println("C");
			//score가 60 이상이면
		}else if(score >= 60) {
			//D 출력
			System.out.println("D");
			//그 이외에는
		}else {
			//F 출력
			System.out.println("F");
		}
		
		//id가 root 이고 pw가 system 이면 로그인 성공
		//id가 root 이고 pw가 system 아니면 비밀번호 틀림
		//id가 root 가 아니면 잘못된 id라고 출력
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("아이디:");
		String id = sc.nextLine();
		
		System.out.println("비밀번호:");
		String pw = sc.nextLine();
		
		sc.close();
		//만약 id가 root 이고 pw가 system이면
		if(id.contentEquals("root") && pw.contentEquals("system")) {
			//로그인 성공 출력
			System.out.println("로그인 성공");
			//id가 root 이고 pw가 system이 아니면 
		}else if(id.contentEquals("root") && ! pw.contentEquals("system")) {
			//비밀번호 틀림 출력
			System.out.println("비밀번호 틀림");
			//그게 아니면
		}else
			//잘못된 id 출력
			System.out.println("잘못된 id");
	}

}
