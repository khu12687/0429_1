package com.use;
/*
Apple은 현재 클래스와는 다른 경로에 있으므로, Apple의 경로를 명시하자
*/
import com.fruit.Apple;
class UseApple{
	public static void main(String[] args) {
		Apple app = new Apple();
		System.out.println(app.getName());
	}
}
