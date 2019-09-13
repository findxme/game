package cn.stu.zhu;

import java.io.File;
import java.util.List;
import java.util.Scanner;



import cn.stu.dao.Monster;
import cn.stu.tool.Lizable;
import cn.stu.dao.Hero;

public class RunGame {

	//Hero hero =new Hero();
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Hero hero =new Hero();
		Monster monster = new Monster();
		boolean flag=true;
		System.out.println("打熊熊游戏开始");
		do {
		while (flag) {
			
		
		System.out.println("=====================");
		System.out.println("1.新游戏");
		System.out.println("2.读取存档");
		System.out.println("3.退出游戏");
		System.out.println("=====================");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		
		ZhuJieMian zhuJieMian=new ZhuJieMian();
		
		switch (choose) {
		case 1:
			
			zhuJieMian.runPlay(hero,monster);
			
			break;
		case 2:
			Lizable lizable = new Lizable();	
			hero=lizable.deserializeFlyPig();
			zhuJieMian.runPlay(hero,monster);
			break;
		case 3:
			flag=false;
			break;
		
		}
		
	}
		System.out.println("唉，我都觉得不好玩！！！，就这样把结束游戏，欢迎下次光临！！！");
		} while (flag);
		}
	
	public void DuQu(){
		System.out.println("请输入你的用户名！！");
		
	}
//	public static void listfile(File file, List<String> list) {
//        // 如果file代表的不是一个文件，而是一个目录
//        if (!file.isFile()) {
//            // 列出该目录下的所有文件和目录
//            File files[] = file.listFiles();
//            // 遍历files[]数组
//            for (File f : files) {
//                // 递归
//                listfile(f, map);
//            }
//        } else {
//            list.add(file.getName());
//        }
//    }
	
}
