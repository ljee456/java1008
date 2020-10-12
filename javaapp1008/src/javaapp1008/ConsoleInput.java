package javaapp1008;

public class ConsoleInput {

	public static void main(String[] args) {
		//키보드로부터 입력받는 Scanner 생성
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//이름 입력받기
		System.out.printf("이름입력:");
		String name = sc.nextLine();
		
		//점수를 입력받기
		System.out.printf("점수입력:");
		double score = sc.nextDouble();
		
		//주소 입력받기
		System.out.printf("주소입력:");
		//숫자 다음에 문자열을 입력받을 때는 버퍼를 비우기 위해서 한 번 호출 해야한다
		sc.nextLine();
		String address = sc.nextLine();
		
		System.out.printf("우편번호입력:");
		int add = sc.nextInt();
		
		
		System.out.printf("이름:%-10s\n점수:%3.2f\n주소:%-10s\n우편번호:%-10d\n",
				name, score, address, add);
		
		//스캐너 종료
		sc.close();

	}

}
