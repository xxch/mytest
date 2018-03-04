package mytest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new LinkedList<>();
		list.add("用户1");
		list.add("用户2");
		list.add("用户3");
		list.add("用户4");
		list.add("用户5");
		list.add("用户6");
		
		list.add(4, "新用户");
		list.set(2, "哈哈哈");
		list.remove(6);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i)+"iiiiiii"+i);
		}

	}

}
