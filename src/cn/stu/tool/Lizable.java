package cn.stu.tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import cn.stu.dao.Hero;

public class Lizable {
	 /**
     * ���л�
     */
	 public  void serializeFlyPig(Hero hero) throws IOException {
		 try {
			
	
			
		  System.out.println("��ӭ����findme��Ϸ");
		  ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("f:/lizable/"+hero.getNamehero()+".txt")));
          oos.writeObject(hero);
          System.out.println("FlyPig �������л��ɹ���(�浵�ɹ���������)");
          oos.close();
          
			} catch (Exception e) {
				// TODO: handle exception
				
			}
		 
	 }
	 
	 /**
	 * �����л�
     */
	 public  Hero deserializeFlyPig() throws Exception {
			Scanner sc = new Scanner(System.in);
		 System.out.println("�������û���");
			String username = sc.next();
			try {
		
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("f:/lizable/"+username+".txt")));
       // ArrayList<User>  person = (ArrayList<User>) ois.readObject();
        Hero  person = (Hero) ois.readObject();
        System.out.println("FlyPig �������л��ɹ���");
        System.out.println( person.getLifehero());
        return person;
	 } catch (Exception e) {
			// TODO: handle exception
		 System.out.println("�������л�ʧ�ܣ��������û�������");
		 return null;
		}
	
	       
       //return user;
	    }

}
