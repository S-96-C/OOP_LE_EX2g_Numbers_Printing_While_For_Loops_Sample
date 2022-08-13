import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   /* 
	int no = 1;
	while(no < 10){
		System.out.println(no);
		no +=2;
	}
	System.out.println(no);
	*/

	/*
	int no1 = 0;
	while(no1 > 10){
		System.out.println(no1);
		no1 +=2;
	}
	System.out.println(no1);
	*/
	
	/*
	int no = 1;
	do{
		System.out.println(no);
		no +=2;
	}while(no > 10);
	System.out.println(no);
	*/
	
	/*
	int no = 0;
	do{
		System.out.println(no);
		no++;
	}while(no < 10);
	System.out.println(no);
	*/
	
	/*
	int no = 0;
	do{
		System.out.println(no);
		no++;
	}while(false);
	System.out.println(no);
	*/
	
	/*
	for(int no = 10; no <= 10; no--){
		System.out.println(no);
	}
	*/
	
	/*
	for(int no = 10; no >= 0; no--){
		System.out.println(no);
	}
	*/

	/*
	for(int no = 10; no >= 0; no-=2){
		System.out.println(no);
	}
	*/
	
	/*
	for(int x = 1; x <=10; x++){
		for(int y = 1; y<=10; y++){
		System.out.print(y);
		}
	System.out.println();
	}
	*/

	for(int x = 1; x <=10; x++){
		for(int y = 1; y<=x; y++){
		System.out.print(y);
		}
	System.out.println();
	}
  }
}