package practice06;
/*
 * PTra06_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_04 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * ■■■■■
		 */

			for(int i=0; i<5; i++) {
			
			System.out.print("■");
	            
	            

		  }
			
			
			for (int i = 1; i < 10; i++) {
	            System.out.print(i + "の段：");
	            for (int j = 1; j < 10; j++) {
	                System.out.print(i * j);    // 掛け算の結果を出力
	                System.out.print(" ");      // 空白を出力
	            }
	            System.out.println("");         // 改行
	        }
	    

			
			
			
			
			
			
			
			
			
			
			
	}
}
