/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 * 
 * @author      : 디미고인
 * @version     : 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] s1 = {
				new IPhone("iphone 7","애플",900000),
				new Galaxy("갤럭시 S8","삼성",800000)
		};
		
		for(SmartPhone p : s1) {
			System.out.println(p.toString());
			p.turnOn();
			p.pay();
			p.useSpecialFunction(p);
			p.turnOff();
		}
	}

}
