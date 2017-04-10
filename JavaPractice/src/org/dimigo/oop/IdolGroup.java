/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ IdolGroup
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 10.
 * </pre>
 * 
 * @author      : 디미고인
 * @version     : 1.0
 */
public class IdolGroup {
	
	public void printArr (String[]arr1, String [][] arr) {
		for(int i = 0; i<arr1.length;i++) {
			System.out.println("<<"+arr1[i]+">>");
			for(int j = 0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		String[] groupName = {"빅뱅","2NE1","걸스데이"};
		
		String[][] memberName = {
				{"GD","태양","대성","탑","승리"},
				{"CL","산다라박","박봄","민지"},
				{"유라","혜리","소진","민아"},
		};
		
		IdolGroup aa = new IdolGroup();
		aa.printArr(groupName, memberName);
	}

}
