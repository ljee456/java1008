package javaapp1008;

public class ifTest {

	public static void main(String[] args) {
		//숫자가 짝수이면 짝수라고 출력하기
		int su = 23;
		
		if(su % 2 == 0) {
			System.out.println("짝수");
		}
		
		//숫자가 짝수라면 짝수라고 출력하고 아니면 홀수라고 출력하기
		if(su % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		
		//아이디와 비밀번호를 입력받아서 아이디가 root이고 비밀번호가 1234 이면
		//로그인 성공이라고 출력하고 그렇지 않으면 로그인 실패라고 출력하기
		
		//1.아이디와 비밀번호를 입력받기 - 스캐너 
		//2.아이디와 비밀번호를 비교해서 처리하기
		//숫자 데이터나 boolean 데이터는 == 로 일치하는지 확인하지만 문자열은 equals를 이용
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//아이디 입력받기 - root는 문자열String
		System.out.printf("아이디:");
		String id = sc.nextLine();
		
		//비밀번호 입력받기 - 1234는 정수 int
		System.out.printf("비밀번호:");
		int password = sc.nextInt();
		
		//스캐너 종료
		sc.close();
		
		//아이디가 root이고 비밀번호가 1234이면 - 이고 이니까 &&
		//아이디가 문자열이니까 equals로 비교
		if(id.equals("root") && password == 1234) { 
			//로그인 성공 출력
			System.out.println("로그인 성공");
			//그게 아니면
		}else {
			//로그인 실패 출력
			System.out.println("로그인 실패");
		}
			
	}

}
