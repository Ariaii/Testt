package gupiao;

import java.io.*;
import java.util.Scanner;


public class Menu {
	public static void main(String []args) throws IOException, ClassNotFoundException{
		//GuPiao2 e1=new GuPiao2(1001,"�Ϻ���");
		GuPiao2[] gupiao=new GuPiao2[3];
		gupiao[0]=new GuPiao2(1001,"�Ϻ�����");
		gupiao[1]=new GuPiao2(1002,"�Ϻ���");
		gupiao[2]=new GuPiao2(1003,"�Ϻ���ʦ");
		FileOutputStream fos=new FileOutputStream(".\\object.text");
		ObjectOutputStream out=new ObjectOutputStream(fos);
		for(int i=0;i<3;i++)
		out.writeObject(gupiao[i]);
		out.close();
		
		FileInputStream fis=new FileInputStream(".\\object.text");
		ObjectInputStream in=new ObjectInputStream(fis);
		for(int i=0;i<3;i++)
		gupiao[i]=(GuPiao2)in.readObject();//��ȡ����
		in.close();
		
		 //File s=new File("d:/Mydoc/123.txt");
		 //GuPiao2 e1=new GuPiao2(1001,"�Ϻ���");
		    //Students zhan=new Students("����",21,true);
		   // Students li=new Students("����",22,true);
		   // Students liu=new Students("����",20,true); 
		   // ObjectOutputStream dos=new ObjectOutputStream(new FileOutputStream(s));
		 
		   // InputStreamReader dos;
			//dos.write(e1);
		   // dos.writeObject(li);//
		    //dos.writeObject(liu);
		   // System.out.println("���л����");
		    //dos.flush();
		   // dos.close();
		   // ObjectInputStream fos=new ObjectInputStream(new FileInputStream(s));
		//in.close();
		//GuPiao2 e2=null;
		view(gupiao);
		System.out.println();
		System.out.println("���й�Ʊ��Ϣ���£�");
		//for(GuPiao2 gupiao1:gupiao){
		for(int i=0;i<3;i++)
			System.out.println(gupiao[i].id+" \t\t"+gupiao[i].name);
		//System.out.println(e2);
	}
	//}
		//��ѯ����
	public static void view(GuPiao2 gupiao[]){
		Scanner input=new Scanner(System.in);
		System.out.print("������Ҫ��ѯ�ı��룺");
		String x = input.nextLine();
		for(int i=0;i<3;i++){
			if(x.equals(String.valueOf(gupiao[i].getId()))){
			System.out.println("�ù�Ʊ�ĵ�ַΪ��"+gupiao[i].getName());
			break;
//		}
//		try {
//		    while((e2=(GuPiao2)fos.readObject())!=null){
//			//GuPiao2 e2 = (GuPiao2)in.readObject();
//			System.out.println("��Ʊ����Ϊ��"+e2.id);
//			System.out.println("��Ʊ����Ϊ��"+e2.name);
//		    }
//		} catch (EOFException  e) {
//			System.out.println("�������");
		//System.out.println("��Ʊ����Ϊ��"+e2.id);
		//System.out.println("��Ʊ����Ϊ��"+e2.name);
		//fos.close();
	}
	}
}
}

