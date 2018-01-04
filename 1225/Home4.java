package com.test5;
public enum Home4 {
	MONDAY(1,"a"),TUESDAY(2,"b"),WEDNESDAY(3,"c"),THURSDAY(4,"d"),FRIDAY(5,"f"),  SATURDAY(6,"g"),SUNDAY(7,"h");
	private int code;
	private String plan;
	private Home4(int code,String plan) {
		this.code=code;
		this.plan=plan;
	}

	public static String getPlan(int code) {
		for(Home4 p:Home4.values()) {
			if(p.code==code) {
				System.out.println("plan    "+ p.plan);
			}
		}
		return null;
	}
}
