package com.access_modifier1;

public class private_ {
private int a = 1;
private void disp() {
	System.out.println("Access modifier type - PRIVATE");
}
	public static void main(String[] args) {
		private_ x = new private_();
		x.disp();
		System.out.println(x.a);

	}

}
