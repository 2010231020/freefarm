package kbqtest;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class fanxingt {
	int bb = 1;
	public static void main(String[] args) throws ClassNotFoundException{
		int aa = 1;
		String a = "sad";
		String b = "happy";
		String c = "";
		String d = "123";
		double m = 3;
		double n = 7;
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("a", a);
		map.put("aa", aa);
		map.put("b", b);
		map.put("c", c);
		map.put("d", d);
		fanxing.printOut(map,aa);
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(new DecimalFormat("#.0").format(m/n*100) +"%");
	}
}
