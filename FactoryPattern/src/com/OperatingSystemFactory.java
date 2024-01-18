package com;

public class OperatingSystemFactory {
	public OS getInstance(String str){
			if(str.equals("Open"))
				return new Android();
			
			else if(str.equalsIgnoreCase("closed"))
				return new IOS();
			
			else
				return new Windows();
	}
}