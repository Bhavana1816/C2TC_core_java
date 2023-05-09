package com;

public class switchdemo {
	public static void main(String[] args) {
		char x= 'm';
		switch (x)
		{
		case 'm':
		case 'M':
			System.out.println(x + " is a letter");
			break;
			
		case 'n':
		case 'N':
			System.out.println(x+"is a digit");
			break;
			
		case 'o':
		case 'O':
			System.out.println(x+"is a white space");
			break;
			
		case 'p':
		case 'P':
			System.out.println(x+"is a special sysbol");
			default:
				System.out.println(x+"is other than letter,digit,space or special sysbol");
				break;
		}
	}

}
