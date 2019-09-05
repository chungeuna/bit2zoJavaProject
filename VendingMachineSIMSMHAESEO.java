import java.util.Scanner;

class Stock {
	static int totalSales=0;
	final int MAX_COUNT = 30;
	int count;
	int price;
	String productName;
	Stock (String name, int count,int price) {
		this.productName = name;
		this.count = count;
		this.price = price;
	}
}
class Water extends Stock {
	Water () {
		super ("���� ��", 10, 1000);
	}
	@Override
	public String toString() {
		return "[���� ��]";
	}
}
class Cabo extends Stock {
	Cabo () {
		super ("���� ź���", 10, 1500);
	}
	@Override
	public String toString() {
		return "[���� ź���]";
	}
}

class Sujeong extends Stock {
	Sujeong () {
		super ("���� ������", 10, 1000);
	}
	@Override
	public String toString() {
		return "[���� ������]";
	}
}

class Orange extends Stock {
	Orange () {
		super ("���� �������ֽ�", 10, 1300);
	}
	@Override
	public String toString() {
		return "[���� ������ �ֽ�]";
	}
}
class CanCoffee extends Stock {
	CanCoffee () {
		super ("���� ĵĿ��", 20, 800);
	}
	@Override
	public String toString() {
		return "[���� ĵĿ��]";
	}
}

class MoneyExchange {
	Scanner scan = new Scanner(System.in);
	int inputMoney=0;
	
	public void inputMoneyMethod() {
		System.out.println();
		System.out.println("  �ȳ��ϼ���! ");
		System.out.print("  �Ա��� �ݾ��� �Է��ϼ��� : ");
		inputMoney += Integer.parseInt(scan.nextLine());
	}
	public void inputExtraMoneyMethod() {
		System.out.println("�߰� �Ա��� �Ͻ÷��� �ݾ��� �Է��ϼ��� (�߰��Ա��� ��ġ �����Ŵٸ� 0�� �Է����ּ���) : ");
		inputMoney += Integer.parseInt(scan.nextLine());
	}
	
	void exchangeMoney (Stock s) {
		if (s.count <=0) {
			System.out.println("ǰ���Դϴ�. �ٸ� ��ǰ�� �����ϼ���");
		} else if (inputMoney < s.price) {
			System.out.println("��ǰ�� ������� �ܾ��� �����մϴ�..");
		} else {
			this.inputMoney -= s.price;
			s.count--;
			Stock.totalSales += s.price;
			System.out.println("��ȯ�� �ݾ��� "+ inputMoney +"�Դϴ�.");
		}
	}
	
}


public class VendingMachineSIMSMHAESEO {
	MoneyExchange me = new MoneyExchange();

	Scanner scan = new Scanner(System.in);
	VendingMachineSIMSMHAESEO () {
		System.out.println("���Ǳ� ����");
	}
	
	
	int displayAdmin () {
		System.out.println("1. �������                    2. ���� Ȯ��                   3.��������                   4. �ڷΰ���");
		int userInput2 = 0;
		do {
			try {
				userInput2 = Integer.parseInt(scan.nextLine());
				if (userInput2 >= 1 && userInput2 <=4) {
					break;		
				} else {
					throw new Exception("���� ���� ���� �߻�");
				}
			} catch (Exception e) {
				System.out.println("������ �޴� ���� ����");
				System.out.println("������ �޴� 1~4������ ����");
			}
		} while (true);		
		return userInput2;	
	}
	
	int displayUser (Stock[] s) {
		System.out.println(                                                                                                           );
		System.out.printf ("1. �� [%d ��]      2. ź��� [%d ��]     3. ������ [%d ��]     4. �������ֽ� [%d ��]  5. ĵĿ�� [%d ��]    6.�߰� �ݾ� �Ա�           0. �ݾ� ��ȯ\n",s[0].count,s[1].count,s[2].count,s[3].count,s[4].count);
		System.out.println("   1000��                     1500��                        1000��                       1300��                       800��");
		for (int i=0; i<5; i++) {
			if (s[i].count <=0) {
		  System.out.print("   [ǰ��]          ");
			} else {
		  System.out.print("   [��� ����]       ");
				
			}
		} 
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("�ֹ��� ��ǰ�� ��ȣ�� �Է��ϼ���");
		int userInput = 0;
		do {
			try {
				userInput = Integer.parseInt(scan.nextLine());
				if (userInput == 98909  || userInput >= 0 && userInput <=6) {
					break;		
				} else {
					throw new Exception("���� ���� ���� �߻�");
				}
			} catch (Exception e) {
				System.out.println("�޴� ���� ����");
				System.out.println("�޴� 0~6������ ����");
			}
		} while (true);		
		
		return userInput;	
	}
	
	int displayStart () {
		System.out.println("1. �����ڸ��		 2.����ڸ��		 3. �ý��� ����");
		int userInput = 0;
		do {
			try {
				userInput = Integer.parseInt(scan.nextLine());
				if (userInput >= 1 && userInput <=3) {
					break;		
				} else {
					throw new Exception("���� ���� ���� �߻�");
				}
			} catch (Exception e) {
				System.out.println("�޴� ���� ����");
				System.out.println("�޴� 1~3������ ����");
			}
		} while (true);		
		return userInput;	
	}
	
	void machineStart () {
		int sel = displayStart();
		
		switch (sel) {
		case 1: displayAdmin();
			break;
		case 2:	//displayUser(s);
			break;
		default : 
			System.out.println("���Ǳ� ���α׷��� �����մϴ�");
			System.exit(0);	
		}
	}
	
	void adminSelect () {
		int sel = displayAdmin();
		do {
			switch (sel) {
			case 1: System.out.println("�ȳ�1?");
				break;
			case 2: System.out.println("�ȳ�2?");
				break;
			case 3: System.out.println("�ȳ�3?");
				break;
			case 4: machineStart();
				break;
			default : 
				
			}
		} while (true);
		
		/*do {
			switch(displayAdmin()) {		// ���� �� �Լ� 
			case 1:	System.out.println("�ȳ�1?");
				break;
			case 2: System.out.println(Stock.totalSales);
				break;
			case 3: System.out.println("�ȳ�3?");
				break;
			case 4: machineStart();
				break;
			default : System.out.println("�ٽ� �Է��ϼ��� -adminSelct");
			}
		} while (true);*/
	}
	
	void userSelect (Stock[] s) {
		int sel = displayUser(s);
		me.inputMoneyMethod();
		do {
			
			System.out.println("���� ���� �ݾ��� "+me.inputMoney +"�� �Դϴ�.");
			switch (sel) {
			case 0: System.out.println("<<< �ܾ� "+ me.inputMoney +"�� ��ȯ�Ͽ����ϴ�. ������ּż� �����մϴ�! >>>");
				me.inputMoney = 0;
				me.inputMoneyMethod();
			case 1:
				System.out.println("<< " + s[0].toString()+"�� �����߽��ϴ�. ������" + s[0].price +"�Դϴ� >>");
				me.exchangeMoney(s[0]);
				break;
			case 2:
				System.out.println("<< " + s[1].toString()+"�� �����߽��ϴ�. ������" + s[1].price +"�Դϴ� >>");
			me.exchangeMoney(s[1]);
			break;
			case 3:
				System.out.println("<< " + s[2].toString()+"�� �����߽��ϴ�. ������" + s[2].price +"�Դϴ� >>");
			me.exchangeMoney(s[2]);
			break;
			case 4:
				System.out.println("<< " + s[3].toString()+"�� �����߽��ϴ�. ������" + s[3].price +"�Դϴ� >>");
			me.exchangeMoney(s[3]);
			case 5:
				System.out.println("<< " + s[3].toString()+"�� �����߽��ϴ�. ������" + s[4].price +"�Դϴ� >>");
			me.exchangeMoney(s[4]);
			break;
			case 6: me.inputExtraMoneyMethod();
			case 98909:
				machineStart();
			}
		} while (true); // me.inputMoney < s[4].price
		// System.out.println("<<< �ܾ� "+ me.inputMoney +"�� ��ȯ�Ͽ����ϴ�. ������ּż� �����մϴ�! >>>");
	}
	
	public static void main(String[]args ) {
		
		VendingMachineSIMSMHAESEO ma = new VendingMachineSIMSMHAESEO();
		
		Stock[] stock = { new Water(), new Cabo(), new Sujeong(), new Orange(), new CanCoffee() };
		ma.machineStart();
		ma.userSelect(stock);
		
	}
}