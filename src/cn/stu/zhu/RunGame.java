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
		System.out.println("��������Ϸ��ʼ");
		do {
		while (flag) {
			
		
		System.out.println("=====================");
		System.out.println("1.����Ϸ");
		System.out.println("2.��ȡ�浵");
		System.out.println("3.�˳���Ϸ");
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
		System.out.println("�����Ҷ����ò����棡�������������ѽ�����Ϸ����ӭ�´ι��٣�����");
		} while (flag);
		}
	
	public void DuQu(){
		System.out.println("����������û�������");
		
	}
//	public static void listfile(File file, List<String> list) {
//        // ���file����Ĳ���һ���ļ�������һ��Ŀ¼
//        if (!file.isFile()) {
//            // �г���Ŀ¼�µ������ļ���Ŀ¼
//            File files[] = file.listFiles();
//            // ����files[]����
//            for (File f : files) {
//                // �ݹ�
//                listfile(f, map);
//            }
//        } else {
//            list.add(file.getName());
//        }
//    }
	
}
