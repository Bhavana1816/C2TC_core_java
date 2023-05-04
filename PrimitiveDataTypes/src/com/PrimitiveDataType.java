package com;

public class PrimitiveDataType {
	public static void main(String[] args) {
		//byte takes 1 byte
		byte byteMax =127;
		byte byteMin= -128;
		
		System.out.println("Min range of byte is"+
		      byteMin+"Max range of byte is"+byteMax);
		
		//short takes 2 bytes
		short shortmax = 32767;
		short shortmin = -32768;
		System.out.println("Minshort range of byte is"+
		       shortmin +"Maxshort range of byte is"+ shortmax);
		
		//int -4 bytes
		int maxInt = 214783647;
		int minInt = -2147483648;
		System.out.println("minint range of byte is" +
		minInt+"maxInt range of byte is"+maxInt);
		
		//long -8 bytes
		long maxLong=9223372036854775807l;
		long minLong=-9223372036854775808L;
		System.out.println("minlong range of byte is "+minLong+"maxlong range of byte is"+maxLong);
		
		//float 4-bytes
		float f=3234.1458976235455f;
		double d=3456.114478965623358685623963f;
		System.out.println("float value is "+f+"double value is"+d);
		
		//boolean
		boolean flag = false;
		System.out.println("boolean value is " + flag);
	}

}
