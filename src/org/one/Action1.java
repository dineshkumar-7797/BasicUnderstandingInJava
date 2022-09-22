package org.one;


	public class Action1 extends BaseClass{
		public static int i=10;
		
		private static int r=10;

		public static int getR() {
			int r=100;
			return r;
		}
		
		public static int divide(int r,int k) {//(divide(100,100)-->100
			r=r+k;
			System.out.println("2222");
			return r/2;
		}
		
		public static int re(int r,int l) {//re(100,100)
			System.out.println("11111");
			int n=divide(r,l);
			System.out.println("333");
			return n;//--100
		}
		
		public static void main(String[] args) {
			Action1 a1=new Action1();
			a1.add(i, getR());
			System.out.println(j);
			
			a1.add(i,re(r,100));//add(10,re(
			System.out.println(j);
			
			a1.add(i, r);
			System.out.println(j);
			
			a1.add(i/2, r*23);
			System.out.println(j);
		  
			
		
		}
		
		


		

}
