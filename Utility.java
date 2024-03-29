import java.util.*;
/*Utility工具类：
将不同的功能封装为方法

*/
public class Utility{
	private static Scanner scanner = new Scanner(System.in);
	/*用于界面的选择。
	该方法读取键盘，如果用户输入1到4的任意字符，方法返回值为输入的任意字符
	*/
	public static char readMenuSelection(){
		char c;
		for(;;){
			String str = readKeyBoard(1);
			c = str.charAt(0);
			if (c !='1' && c !='2' && c != '3' && c != '4'){
				System.out.print("选择错误，请重新输入");
			}else break;
		}
		return c;
	}

	/*用于支出和收入金额的输入，读取一个不超过4位数长度的整数，并将其作为方法的返回值
	*/

	public static int readNumber(){
		int n;
		for(;;){
			String str = readKeyBoard(4);
			try{
				n = Integer.parseInt(str);
				break;
			}catch(NumberFormatException e){
				System.out.print("数字输入有误，请重新输入：");
			}
		}
		return n;
	}


	/*用于支出和收入说明的输入。用于读取从键盘输入的不超过8为字符串长度的输入值，
	并将其作为方法的返回值
	*/

	public static String readString(){
		String str = readKeyBoard(8);
		return str;
	}

	/*用于确认选择的输入，从键盘读取'y'或者'n',并将其作为返回值

	*/
	public static char readConfirmSelection(){
		char c;
		for(;;){
			String str = readKeyBoard(1).toUpperCase();
			c = str.charAt(0);
			if(c == 'Y' || c == 'N'){
				break;
			}else{
				System.out.print("选择错误，请重新输入：");
			}
		}
		return c;
		
	}


	private static String readKeyBoard(int limit){
		String line = "";

		while (scanner.hasNext()){
			line = scanner.nextLine();
			if (line.length()<1 || line.length()>limit){
				System.out.print("输入长度（不大于" + limit+ "）错误，请重新输入");
				continue;
			}
			break;
		}
		return line;
	}
}   
