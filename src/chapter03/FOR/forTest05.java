package chapter03.FOR;

import java.util.Scanner;

public class forTest05 {

	public static void main(String[] args) {
		// 문제1) 정수를 입력받아(Scanner) 입력받은 정수부터 100까지의 합
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력하시오 : ");
		int a = scan.nextInt();
		int sum = 0;
		int i;

		for (i = a; i <= 100; i++) {
			sum += i;
		}
		System.out.println(a + "에서 100까지의 합 : " + sum);
		System.out.println("===========================");

		// 문제2) 1서부터 10까지 반복하면서 정수를 입력받아 그 수 중에 짝수의 개수가 몇 개인지 출력
		// 문제3) 단 입력받은 수가 0이면 무시
		System.out.print("정수를 입력하세요 : ");
		int j, b, cnt = 0;
		b = scan.nextInt();

		for (j = 1; j <= 10; j++) {
			if (b == 0) {
				continue;
			} // if

			if (b % 2 == 0) {
			cnt++;
			} // if2

		} // for

		System.out.println("입력받은 수의 짝수의 갯수 : " + cnt);

	}// 메인

}// 클래스
