package kbqtest;

public class Gamble {
	final static int  count = 100;
	public static int gambling(){
		int sum = 0;
		for(int i=0;i<count;i++){
			int g = (int) (Math.floor(6 * Math.random()) + 1);
			if(g==1){
				return 1;
			}
			sum += g;
		}
		return sum;
	}
	public double test(){
		int sumj = 0;
		for (int i = 0; i < 1000000; i++) {
			sumj += Gamble.gambling();
		}
		return sumj/10.0;
	}
	public static void main(String[] args){
		Gamble g = new Gamble();
		System.out.println(g.test());
	}
}
