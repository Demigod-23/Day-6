package com.access_modifier1;

public class public_ {
	public int a = 4;
	public void disp() {
		System.out.println("Access modifier type - PUBLIC");
	}
		public static void main(String[] args) {
			public_ x = new public_();
			x.disp();
			System.out.println(x.a);

		}

	}


