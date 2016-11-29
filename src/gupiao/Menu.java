package gupiao;

import java.io.*;
import java.util.Scanner;


public class Menu {
	public static void main(String []args) throws IOException, ClassNotFoundException{
		//GuPiao2 e1=new GuPiao2(1001,"上海理工");
		GuPiao2[] gupiao=new GuPiao2[3];
		gupiao[0]=new GuPiao2(1001,"上海军工");
		gupiao[1]=new GuPiao2(1002,"上海理工");
		gupiao[2]=new GuPiao2(1003,"上海华师");
		FileOutputStream fos=new FileOutputStream(".\\object.text");
		ObjectOutputStream out=new ObjectOutputStream(fos);
		for(int i=0;i<3;i++)
		out.writeObject(gupiao[i]);
		out.close();
		
		FileInputStream fis=new FileInputStream(".\\object.text");
		ObjectInputStream in=new ObjectInputStream(fis);
		for(int i=0;i<3;i++)
		gupiao[i]=(GuPiao2)in.readObject();//读取对象
		in.close();
		
		 //File s=new File("d:/Mydoc/123.txt");
		 //GuPiao2 e1=new GuPiao2(1001,"上海理工");
		    //Students zhan=new Students("张三",21,true);
		   // Students li=new Students("李三",22,true);
		   // Students liu=new Students("刘三",20,true); 
		   // ObjectOutputStream dos=new ObjectOutputStream(new FileOutputStream(s));
		 
		   // InputStreamReader dos;
			//dos.write(e1);
		   // dos.writeObject(li);//
		    //dos.writeObject(liu);
		   // System.out.println("序列化完成");
		    //dos.flush();
		   // dos.close();
		   // ObjectInputStream fos=new ObjectInputStream(new FileInputStream(s));
		//in.close();
		//GuPiao2 e2=null;
		view(gupiao);
		System.out.println();
		System.out.println("所有股票信息如下：");
		//for(GuPiao2 gupiao1:gupiao){
		for(int i=0;i<3;i++)
			System.out.println(gupiao[i].id+" \t\t"+gupiao[i].name);
		//System.out.println(e2);
	}
	//}
		//查询功能
	public static void view(GuPiao2 gupiao[]){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入要查询的编码：");
		String x = input.nextLine();
		for(int i=0;i<3;i++){
			if(x.equals(String.valueOf(gupiao[i].getId()))){
			System.out.println("该股票的地址为："+gupiao[i].getName());
			break;
//		}
//		try {
//		    while((e2=(GuPiao2)fos.readObject())!=null){
//			//GuPiao2 e2 = (GuPiao2)in.readObject();
//			System.out.println("股票编码为："+e2.id);
//			System.out.println("股票名字为："+e2.name);
//		    }
//		} catch (EOFException  e) {
//			System.out.println("输出结束");
		//System.out.println("股票编码为："+e2.id);
		//System.out.println("股票名字为："+e2.name);
		//fos.close();
	}
	}
}
}

