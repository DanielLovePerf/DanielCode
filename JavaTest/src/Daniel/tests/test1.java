package Daniel.tests;

public class test1 {
	public static void main(String[] args){
		int num = 999;
		int count = 0;
		if(num>=0 && num <=999999999){
		    while(num!=0){
		        count++;
		        num=num/10;
		    }
		System.out.println("xxxx"+count+"xxx");}else{
		    System.out.println("error input!");
		}


		}

}
