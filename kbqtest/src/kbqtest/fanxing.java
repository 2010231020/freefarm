package kbqtest;

import java.util.Map;
import java.util.Map.Entry;



public class fanxing {
//	public static void printOut(Object...objects){
//		for(Object obj:objects){
//			if(obj instanceof Map<?, ?>){
//				Map<?, ?> map = (Map<?, ?>) obj;
//				for(Object obje:map.entrySet()){
//					System.out.print(((Map.Entry<?, ?>)obje).getKey()+":");
//					if(((Map.Entry<?, ?>)obje).getValue() instanceof Integer){
//						System.out.println(((Map.Entry<?, ?>)obje).getValue()+" again!");
//					}else{
//						System.out.println(((Map.Entry<?, ?>)obje).getValue());
//					}
//				}
//			}
//			if(obj instanceof Integer){
//				System.out.println(obj+" i am an integer!");
//			}
//		}
//	}
	public static void printOut(Map<String, Object> map,Object...objects){
		int i = 0;
		Object[] obstr =  new Object[map.size()];
		for(Entry<String, Object> obj:map.entrySet()){
			System.out.print(obj.getKey()+":");
			if(obj.getValue() instanceof Integer){
				System.out.println(obj.getValue()+" again!");
			}else{
				System.out.println(obj.getValue());
			}
			obstr[i] = obj.getValue();
			System.out.println(obstr[i]);
			i++;
		}
	for(Object obj:objects){
		StringBuffer sb = new StringBuffer();
		if(obj instanceof Integer){
			sb.append(obj+" i am an integer!");
			sb.deleteCharAt(sb.length()-1);
			System.out.println(sb.toString());
		}
	}
}
}
