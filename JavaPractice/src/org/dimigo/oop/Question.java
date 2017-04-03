/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 3.
 * </pre>
 * 
 * @author      : 디미고인
 * @version     : 1.0
 */
public class Question {
	
	public static void main(String[] args) {
		String[] questions = {"가장 좋아하는 가수는?","가장 좋아하는 배우는?","가장 좋아하는 과목은?"};
		String[] answers = {"빅뱅","조인성","응용 프로그래밍"};
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println((i+1)+"." + questions[i]);
			String answer = scanner.nextLine();
			if(answer.equals(answers[i])) {
				System.out.println("정답입니다!");
			}
			else {
				System.out.println("틀렸습니다!");
			}
		}
		System.out.println("<<결과 출력>>");
		StringBuilder sb = new StringBuilder();
	      
	      for(int i = 0; i<3; i++)
	      {
	         sb.append( questions[i]).append( answers[i]).append("입니다.\n");
	      }
	      System.out.println(sb);
	}
}
