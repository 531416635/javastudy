package com.yao.study.testday01;

import com.yao.study.day01.Singleton;
import com.yao.study.utils.DateUtils;

public class SingletonTest {

	public static void main(String[] args) {
		System.out.println(DateUtils.getStringToday());
		Singleton.getInstance();
		System.out.println(DateUtils.getStringToday());
	}
}
