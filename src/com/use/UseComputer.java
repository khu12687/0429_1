package com.use;

import com.hardware.Computer;

class UseComputer {
	public void setColor(Computer p){ //(��)
		System.out.println("setColor �޼��� ȣ���� com�� �ּҰ�"+p);
		p.color="red";
	}
	public void setPrice(int price) {
		price=5; //(��)
	}
	
	public static void main(String[] args) {
		Computer com = new Computer();
		com.color = "black";

		UseComputer up = new UseComputer();
		System.out.println("setColor �޼��� ȣ���� com�� �ּҰ�"+com);

		//�ּҰ��� ���� �޼���ȣ���� call by reference�� �ϸ�
		//�ּҰ��� �̿��ϸ� ���� ���� ȣ����� �޸� ���� ��ü�� �����ϰ� �ȴ�
		//call by value : �㰣�� ������
		//						�ּҰ��� �ƴϹǷ�, �ش� �����ʹ� ������ ��������
		//call by reference : ���� � �ѱ涧..
		//								��ü�� �ּҰ��� �ѱ�Ƿ�, �ش� ��ü�� ����������
		up.setColor(com); // (��)
		up.setPrice(com.price);//(��)
		
		System.out.println(com.price);// (��)
	}
}

