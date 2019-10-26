class FamilyAccount {
	public static void main(String[] args){
		
		boolean isFlag = true;

		String detail = "收支\t账户金额\t收支净额\t说   明\n";
		int balance = 10000;

		while(isFlag){
			System.out.println("------------家庭记账软件-----------\n");
			System.out.println("\t\t1 收支明细");
			System.out.println("\t\t2 登记收入");
			System.out.println("\t\t3 登记支出");
			System.out.println("\t\t4 退出\n");
			System.out.print("请选择（1-4）：");

			char selection = Utility. readMenuSelection();
			switch (selection){
			case '1':
				//System.out.println("收支明细");

				System.out.println("------------当前收支明细记录-----------");
				System.out.println(detail);
				System.out.println("---------------------------------------");
				break;
			case '2':
				System.out.print("本次收入金额： ");
				int moneyin = Utility.readNumber();
				System.out.print("本次收入说明： ");
				String explainin = Utility.readString();

				balance +=moneyin;

				detail +=("收入\t"+balance + "\t\t"+ moneyin+ "\t\t"+explainin +"\n");
				System.out.println("------------登记完成------------ ");


				break;
			case '3':

				System.out.print("本次支出金额： ");
				int moneyout = Utility.readNumber();
				System.out.print("本次支出说明： ");
				String explainout = Utility.readString();
				
				balance -=moneyout;

				detail +=("支出\t"+balance + "\t\t"+ moneyout+ "\t\t"+explainout +"\n");
				System.out.println("------------登记完成------------ ");


				//System.out.println("登记支出");
				break;
			case '4':
				System.out.print("确认是否退出（Y/N）:");

				char isExit = Utility.readConfirmSelection();
				if (isExit =='Y'){
					isFlag =false;
				}
				break;

			
			}
			
		}
	}
}
