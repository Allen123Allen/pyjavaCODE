class FamilyAccount {
	public static void main(String[] args){
		
		boolean isFlag = true;

		String detail = "��֧\t�˻����\t��֧����\t˵   ��\n";
		int balance = 10000;

		while(isFlag){
			System.out.println("------------��ͥ�������-----------\n");
			System.out.println("\t\t1 ��֧��ϸ");
			System.out.println("\t\t2 �Ǽ�����");
			System.out.println("\t\t3 �Ǽ�֧��");
			System.out.println("\t\t4 �˳�\n");
			System.out.print("��ѡ��1-4����");

			char selection = Utility. readMenuSelection();
			switch (selection){
			case '1':
				//System.out.println("��֧��ϸ");

				System.out.println("------------��ǰ��֧��ϸ��¼-----------");
				System.out.println(detail);
				System.out.println("---------------------------------------");
				break;
			case '2':
				System.out.print("��������� ");
				int moneyin = Utility.readNumber();
				System.out.print("��������˵���� ");
				String explainin = Utility.readString();

				balance +=moneyin;

				detail +=("����\t"+balance + "\t\t"+ moneyin+ "\t\t"+explainin +"\n");
				System.out.println("------------�Ǽ����------------ ");


				break;
			case '3':

				System.out.print("����֧���� ");
				int moneyout = Utility.readNumber();
				System.out.print("����֧��˵���� ");
				String explainout = Utility.readString();
				
				balance -=moneyout;

				detail +=("֧��\t"+balance + "\t\t"+ moneyout+ "\t\t"+explainout +"\n");
				System.out.println("------------�Ǽ����------------ ");


				//System.out.println("�Ǽ�֧��");
				break;
			case '4':
				System.out.print("ȷ���Ƿ��˳���Y/N��:");

				char isExit = Utility.readConfirmSelection();
				if (isExit =='Y'){
					isFlag =false;
				}
				break;

			
			}
			
		}
	}
}
