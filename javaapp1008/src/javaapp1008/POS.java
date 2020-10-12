package javaapp1008;

public class POS {

	public static void main(String[] args) {
		//메뉴 정하기
		//1.아메리카노 - 3000
		//2.카페라떼 - 4000
		//3.허니브레드 - 9000
		
		//키보드로부터 입력받는 객체 만들기
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//메뉴 입력 받기
		int menu = 0;
		
		System.out.printf("메뉴를 입력하세요(1-아메리카노 2-카페라떼 3-허니브레드):");
		menu = sc.nextInt();
		
		//잘못된 메뉴를 입력하면 메뉴 선택화면으로 되돌리기
		
		
		//수량 입력 받기
		int cnt = 0;
		
		System.out.printf("수량를 입력하세요(1~9):");
		cnt = sc.nextInt();
		
		//1~9까지가 아니면 수량 입력화면으로 되돌리기
		
		//주문한 총액 계산하기
		//메뉴별로 금액이 다르기 때문에 if 나 switch를 이용해서 계산
		int total = 0;
		
		//if를 사용한 경우
//		if(menu == 1) {
//			total = 3000 * cnt;
//		}else if(menu == 2){
//			total = 4000 * cnt;
//		}else if(menu == 3){
//			total = 9000 * cnt;
//		}
//		
		
		//switch를 사용한 경우
		switch(menu) {
		case 1:
			total = 3000 * cnt;
			break;
		case 2:
			total = 4000 * cnt;
			break;
		case 3:
			total = 9000 * cnt;
			break;
		}
		
		//주문 여부 확인
		System.out.printf("총 금액은 %d 원입니다.\n", total);
		System.out.printf("주문은: Y 취소는: N", total);
		
		//주문 여부 입력 받기
		String input = "";
		sc.nextLine();
		input = sc.nextLine();
		
		
		//input 의 값이 Y 이면 주문완료, N 이면 주문 취소라고 출력하기
		
		//if를 사용
//		if(input.equals("Y") ) {
//			System.out.printf("주문완료\n");
//		}else if(input.contentEquals("N")) {
//			System.out.printf("주문취소\n");
//		}
		
		//switch를 사용
		switch(input) {
		case "Y":
			System.out.printf("주문완료\n");
			break;
		case "N":
			System.out.printf("주문취소\n");
			break;	
		}
		
		
		//입력받는 객체 사용 종료하는 코드 작성
		sc.close();

	}

}
