package gupiao;

import java.io.*;

public class GuPiao2 implements Serializable{
	int id;
	String name;
	GuPiao2(int i,String n) {//构造方法
	id=i;
	name=n;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public void setId(int i){
		id=i;
	}
	public void setName(String n){
		name=n;
	}
}

