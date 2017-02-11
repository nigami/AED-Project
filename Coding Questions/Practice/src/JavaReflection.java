import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class JavaReflection {

	public static void main(String arg[]){
		try {
			//java reflection
			Class twoArgCls = Class.forName("SampleTwoArg");
			SampleTwoArg abc=(SampleTwoArg) twoArgCls.newInstance();
			Method m = twoArgCls.getMethod("getId");
			System.out.println(m.invoke(abc));
			
			System.out.println(abc.getId());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
