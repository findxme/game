package com.stu.test.file;

import java.io.File;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("F:/ee");
		String[] allFileName=f.list();
		System.out.println(allFileName);

	}

}
