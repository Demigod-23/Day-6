package com.access_modifier1;

public class default_ {
	int a = 2;
	void disp() {
		System.out.println("Access modifier type - DEFAULT");
	}
		public static void main(String[] args) {
			default_ x = new default_();
			x.disp();
			System.out.println(x.a);
}
}