package exceptionEx;

import java.io.FileNotFoundException;
import java.io.IOException;

public class C_SubClass extends C_SuperClass {
	
//	@Override
	// 부모클래스의 메소드보다 상위타입의 예외를 발생시키는것은 불가능
//	public void method() throws Exception {
//		super.method();
//	}

//	@Override
	// 오버라이딩시 예외를 작성하지 않아도 된다
//	public void method() {
//		super.method();
//	}
	
	// 부모 클래스의 메소드 보다 하위 타입의 예외를 발생시킬 수 있다 
	public void method() throws FileNotFoundException {
//		super.method();
	}

}
