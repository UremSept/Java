package day9;

public class Demo1 {
	//���
	 int mysum=0;
	 public void sum(int a){
	 mysum+=a;
	 a++;
	 if(a>1000)
	 return;
	 sum(a);
	 }
	//������
	public void f1(int i) {
		for (int j = 1; j < i; j++) {
			for (int j2 = 0; j2 < i - j; j2++)
				System.out.print(" ");
			for (int j2 = 0; j2 < j; j2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// ��ˮ�ɻ���
	public static void shuixianhuashu() {
		for (int i = 100; i < 1000; i++) {
			int a = i / 100;
			int b = i / 10 % 10;
			int c = i % 10;
			if (i == a * a * a + b * b * b + c * c * c) {
				System.out.println(i);
			}
		}
	}

	// ������
	public void f(int a) {
		
		int count;
		int c;
		for (c = 1; c < a; c += 2) {
			count = 0;
			for (int i = 2; i <=c; i++) {
				if (c % i == 0)
					break;
				else
					count++;
				if ((c- 2) == count)
					System.out.println(c);
			}
		}
	}
	//����ȫ��
	public void qiuwanquanshu(int a){
		int sum;
		for(int i=1;i<=a;i++){
			sum=0;
			for(int j=1;j<i/2+1;j++){
				if(i%j==0)sum+=j;
			}
			if(sum==i)System.out.println(i);
		}
	}
	//���м���1
	public static void qiuone(int i){
		int count = 0;
		while(i!=0){
			if(i%2!=0)
				count++;
			i/=2;	
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Demo1 base = new Demo1();
		// ��1~1000�ĺ�
		// ��ӡһ��������
		// ��1000���ڵ�����������
		// ��100~1000���ڵ�ˮ�ɻ���153=1*1*1+5*5*5+3*3*3
		// ��1~1000���ڵ���ȫ�� 6=1+2+3
		//��һ��ʮ��������ת����2�����м���1;
		
		// 123����6������
		// int sum=0;
		// for(int i=1;i<=1000;i++){
		// sum=sum+i;
		// }
		// System.out.println("1~1000���ڵ����ĺ��ǣ�"+sum);
		// base.sum(1);
		// System.out.println("1~1000���ڵ����ĺ��ǣ�"+base.mysum);
		//base.f(10000);
		// base.shuixianhuashu();
		//base.qiuwanquanshu(10000);
		base.qiuone(15);
	}

}
