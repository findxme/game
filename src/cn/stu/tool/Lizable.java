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
     * 序列化
     */
	 public  void serializeFlyPig(Hero hero) throws IOException {
		 try {
			
	
			
		  System.out.println("欢迎启动findme游戏");
		  ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("f:/lizable/"+hero.getNamehero()+".txt")));
          oos.writeObject(hero);
          System.out.println("FlyPig 对象序列化成功！(存档成功！！！！)");
          oos.close();
          
			} catch (Exception e) {
				// TODO: handle exception
				
			}
		 
	 }
	 
	 /**
	 * 反序列化
     */
	 public  Hero deserializeFlyPig() throws Exception {
			Scanner sc = new Scanner(System.in);
		 System.out.println("请输入用户名");
			String username = sc.next();
			try {
		
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("f:/lizable/"+username+".txt")));
       // ArrayList<User>  person = (ArrayList<User>) ois.readObject();
        Hero  person = (Hero) ois.readObject();
        System.out.println("FlyPig 对象反序列化成功！");
        System.out.println( person.getLifehero());
        return person;
	 } catch (Exception e) {
			// TODO: handle exception
		 System.out.println("对象反序列化失败，可能是用户名错误");
		 return null;
		}
	
	       
       //return user;
	    }

}
