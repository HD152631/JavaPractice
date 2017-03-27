/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 * 
 * @author      : 디미고인
 * @version     : 1.0
 */
public class CarTest2 {
	public static void main(String[] args) {
		System.out.println("<<자동차목록>>");
		Car2 car2 = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
		
		System.out.println("제조사명 : "+car2.getCompany());
		System.out.println("모델명 : "+car2.getModel());
		System.out.println("색상 : "+car2.getColor());
		System.out.println("최대속도 : "+car2.getmaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d",car2.getPrice())+"원");
		System.out.println("");
		
		Car2 car3 = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		
		System.out.println("제조사명 : "+car3.getCompany());
		System.out.println("모델명 : "+car3.getModel());
		System.out.println("색상 : "+car3.getColor());
		System.out.println("최대속도 : "+car3.getmaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d",car3.getPrice())+"원");
		System.out.println("");
		
		Car2 car4 = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		
		System.out.println("제조사명 : "+car4.getCompany());
		System.out.println("모델명 : "+car4.getModel());
		System.out.println("색상 : "+car4.getColor());
		System.out.println("최대속도 : "+car4.getmaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d",car4.getPrice())+"원");
	}
}
