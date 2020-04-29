package com.use;

import com.hardware.Computer;

class UseComputer {
	public void setColor(Computer p){ //(가)
		System.out.println("setColor 메서드 호출전 com의 주소값"+p);
		p.color="red";
	}
	public void setPrice(int price) {
		price=5; //(나)
	}
	
	public static void main(String[] args) {
		Computer com = new Computer();
		com.color = "black";

		UseComputer up = new UseComputer();
		System.out.println("setColor 메서드 호출전 com의 주소값"+com);

		//주소값에 의한 메서드호출을 call by reference라 하며
		//주소값을 이용하면 값에 의한 호출과는 달리 같은 객체를 제어하게 된다
		//call by value : 꿔간돈 갚을때
		//						주소값이 아니므로, 해당 데이터는 영향을 받지않음
		//call by reference : 등기부 등본 넘길때..
		//								객체의 주소값을 넘기므로, 해당 객체가 영향을받음
		up.setColor(com); // (다)
		up.setPrice(com.price);//(라)
		
		System.out.println(com.price);// (마)
	}
}

