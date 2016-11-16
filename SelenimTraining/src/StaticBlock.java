import java.util.Scanner;


public class StaticBlock {
	static boolean flag =true;
	static Scanner sc = new Scanner(System.in);
static	int B = sc.nextInt();
static	int H = sc.nextInt();
	
	static{
		try{
		if (B<=0||H<=0) {
			flag = false;
			throw new Exception("Height and bredth must be positive");
		} 
		}
          catch (Exception e) {
			// TODO: handle exception
        	  System.out.println(e);
		}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main


	}


