package com.fac;

import com.Android;
import com.OS;
import com.OperatingSystemFactory;

public class FactoryMain {
	public static void main(String[] args) {
//		OS o=new Android();
//		o.specs();
		
		OperatingSystemFactory ofs=new OperatingSystemFactory();
		OS o=ofs.getInstance("Open");
		o.specs();
	}
}
