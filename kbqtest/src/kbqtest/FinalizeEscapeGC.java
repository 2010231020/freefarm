package kbqtest;

public class FinalizeEscapeGC {
	public static FinalizeEscapeGC SAVE_HOOL = null;
	public void isAlive(){
		System.out.println("yes, i am still alive.");
	}
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize method executed!");
		FinalizeEscapeGC.SAVE_HOOL = this;
	}
	public static void main(String[] args) throws Throwable{
		SAVE_HOOL = new FinalizeEscapeGC();
		SAVE_HOOL = null;
		System.gc();
		Thread.sleep(500);
		if(SAVE_HOOL!=null){
			SAVE_HOOL.isAlive();
		}else{
			System.out.println("no,i am dead!");
		}
		SAVE_HOOL = null;
		System.gc();
		Thread.sleep(500);
		if(SAVE_HOOL!=null){
			SAVE_HOOL.isAlive();
		}else{
			System.out.println("no,i am dead!");
		}
	}
}
