package xxch.test;

public class SuanFaTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fantan(10);
	}
	/**
	 *  题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
	 *  
	 */
	public static void fantan(int num){
		double s=0;
		double h=100;
		for(int i=0;i<num;i++){
			s+=h;
			h=h/2;
			s += h;
		}
		System.out.println("经过路程："+s);
        System.out.println("反弹高度："+h);
	}
	/**
	 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。     
		1.程序分析：利用辗除法。     最大公约数： 
	 */
	public static void gongyueshu(int a,int b){
		int max=Math.max(a, b);
		int min=Math.min(a, b);
		while(max%min!=0){
			int temp=max;
			max=max%min;
			min =temp;
		}
		System.out.println("最大公约数："+min);
		//最小公倍数是
		System.out.println("最小公倍数是:"+a*b/min);
	}
	/**
	 * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。     
		程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：     
		(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。     
		(2)如果n <> k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你,重复执行第一步。     
		(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
	 */
	public static void fenjie(int num){
		if(num<=2){System.out.println("num="+num);}
		int k=2;
		while(num>k){
			if(num%k==0){
				num=num/k;
				System.out.print(k+"*");
			}else{
				k++;
			}
			
		}
		System.out.println(k);
	}
	/**
	 *  题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
	 *  例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
	 */
	public static void shuixianhua(int num){
		if(num<100){System.out.println("hahhaha");}
		int bai=0;
		int shi=0;
		int ge=0;
		StringBuffer buf=new StringBuffer();
		for(int i=100;i<=num;i++){
			 bai=i/100;
			 shi=(i%100)/10;
			 ge=i%10;
			if(i==Math.pow(ge, 3)+Math.pow(shi, 3)+Math.pow(bai, 3)){
				buf.append(i).append(",");
			}
		}
		System.out.println(buf.toString());
	}
	
	/**
	 * 题目：判断101-200之间有多少个素数，并输出所有素数。     
		1.程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，     
		则表明此数不是素数，反之是素数。
	 * @param args
	 */
	public static void mathSuShu(){
		StringBuffer buf=new StringBuffer();
		for(int i=101;i<=200;i++){
			if(isPrimeNumber(i)){
				buf.append(i).append(",");
			}
		}
		System.out.println(buf.toString());
	}
	/**
	 * 判断当前数是否是素数
	 * @param num
	 * @return
	 */
	public static boolean isPrimeNumber(int num){
		if(2==num){return true;}
		if(num<2 || num %2==0){return false;}
		for(int i=3;i<Math.sqrt(num);i+=2){
			if(i%2==0){
				return false;
			}
		}
		return true;
	}
	
	

}
