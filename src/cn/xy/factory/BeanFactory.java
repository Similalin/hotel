package cn.xy.factory;

import java.util.ResourceBundle;

public class BeanFactory {
	
	private static ResourceBundle bundle ;
	static{
		bundle = ResourceBundle.getBundle("instance");
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getInstance(String key,Class<T> clazz){
		try {
			String className = bundle.getString(key);
			return (T) Class.forName(className).newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
}
