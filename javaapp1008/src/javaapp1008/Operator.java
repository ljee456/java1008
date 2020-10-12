package javaapp1008;

public class Operator {

	public static void main(String[] args) {
		int score = 78;
		
		//msg 라는 변수에 score가 60이상이면 합격
		//아니면 불합격이라고 저장
		
		String msg = score > 60 ? "합격" : "불합격";
		
		System.out.printf("%s\n",msg);
		System.out.println(msg);
		
		int a = 20;
		a *= 4;
		//a = a * 4; 이런 식으로 변경 가능
		
		System.out.printf("a=%2d\n", a);
		System.out.println("a=" +a);
		
		//다음 2개 변수의 값을 교환하기
		//n1은 20이 나오고 n2는 30이 나오도록
		//n1 이나 n2에 직접 20이나 30은 대입하면 안됨
		//데이터가 여러개 있을 때 순서대로 나열
		//하기 위해서 자주 수행 - swap
		
		int n1 = 30;
		int n2 = 20;
		
		//임시변수를 생성해서 임시변수에 값을 넣어두고 하나를 변경하고 다른 하나의 값을 변경
		int temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.printf("n1:%3d\t n2:%3d\n", n1 , n2);

	}

}
