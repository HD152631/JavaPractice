/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ MelonChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 12.
 * </pre>
 * 
 * @author      : 디미고인
 * @version     : 1.0
 */
public class MelonChart {

	public static void main(String[] args) {
		List<Music> list = new ArrayList<>();
		System.out.println("--<< 멜론 챠트 >>--");
		list.add(new Music("I LUV IT", "PSY"));
		list.add(new Music("맞지?","언니쓰"));
		
		printlist(list);
		System.out.println();
		
		System.out.println("--<< 2위곡 추가 >>--");
		list.add(1,new Music("SIGNAL","트와이스"));
		printlist(list);
		System.out.println();
		
		System.out.println("--<< 3위곡 변경 >>--");
		list.set(2,new Music("팔레트","아이유"));
		printlist(list);
		System.out.println();
		
		System.out.println("--<<2위곡 삭제 >>--");
		list.remove(1);
		printlist(list);
		System.out.println();
		
		System.out.println("--<<전체 리스트 삭제>>--");
		list.clear();
		printlist(list);
	}

	/**
	 * @param list
	 */
	private static void printlist(List<Music> list) {
		int i = 1;
		for (Music s : list) {
			System.out.println(i + "." + s);
			i++;
		}
	}

}
