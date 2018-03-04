package xxch.array;

public class ArrayUtil {
	/**
	 * 冒泡排序
	 * @param arry
	 * @return
	 */
	public static String BubbleSort(int[] arry){
		if(arry.length<=0){return "";}
		for(int i=0;i<arry.length-1;i++){
			for(int j=arry.length-1;j>i;j--){
				if(arry[i]>arry[j]){
					int temp=arry[i];
					arry[i]=arry[j];
					arry[j]=temp;
				}
			}
		}
		return outPrint(arry);
	}
	/**
	 * 插入排序
	 * @param arry
	 * @return
	 */
	public static String InsertSort(int[] arry){
		if(arry.length<=0){return "";}
		int temp=0;
		for(int i=1;i<arry.length;i++){
			temp=arry[i];
			int j=i;
			while(j>0&&arry[j]>temp){
				arry[j]=arry[j-1];
				j--;
			}
			arry[j]=temp;
			
		}
		return outPrint(arry);
	}
	public static String SelectionSort(int[] arry){
		if(arry.length<=0){return "";}
		for(int i=0;i<arry.length-1;i++){
			int k=i;
			int tmp=0;
			for(int j=i+1;j<arry.length;j++){
				if(arry[j]>arry[k]){
					k=j;
				}
			}
			tmp = arry[i];
			arry[i] = arry[k];
			arry[k] = tmp;
		}
		return outPrint(arry);
	}
	/**
	 * 打印输出
	 * @param temp
	 * @return
	 */
	public static String outPrint(int[] temp){
		StringBuffer buff=new StringBuffer();
		for(int i=0;i<temp.length;i++){
			buff.append(temp[i]).append(",");
		}
		return buff.toString();
	}
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 34;
		arr[1] = 23;
		arr[2] = 2;
		arr[3] = 1;
		arr[4] = 4;
		String temp=SelectionSort(arr);
		System.out.println(temp);
	}

}
