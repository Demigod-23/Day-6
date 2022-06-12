package com.access_modifier1;

public class protected_ {
	protected int a = 3;
	protected void disp() {
		System.out.println("Access modifier type - PROTECTED");
	}
		public static void main(String[] args) {
			protected_ x = new protected_();
			x.disp();
			System.out.println(x.a);

		}

	}


