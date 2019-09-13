package cn.stu.zhu;

import java.util.Scanner;

import cn.stu.dao.Hero;
import cn.stu.dao.Monster;
import cn.stu.play.PlayMonster;
import cn.stu.tool.Initialization;
import cn.stu.tool.Lizable;

public class ZhuJieMian {
	PlayMonster playMonster =new PlayMonster();
	public void runPlay(Hero hero,Monster monster) throws Exception{
		System.out.println("�������������");
		Scanner sc = new Scanner(System.in);
		String userName= sc.next();
		hero.setNamehero(userName);
		System.out.println("��ӭ"+userName+",�뿪ʼ�����Ϸ��");
		boolean flag=true;
		Initialization initialization = new Initialization();
		initialization.initializationHero(hero);
		while (flag) {	
			System.out.println("=====================");
			System.out.println("1.��������");
			System.out.println("2.����̵�");
			System.out.println("3.�浵");
			System.out.println("4.���븱��");
			System.out.println("5.�˳���Ϸ");
			System.out.println("=====================");
			//Scanner sc = new Scanner(System.in);
			int choose2 = sc.nextInt();
			switch (choose2) {
			case 1:
				playMonster.Attributes(hero);
				break;
			case 2:
				playMonster.JbStore(hero);
				break;
			case 3:
				Lizable lizable = new Lizable();
				lizable.serializeFlyPig(hero);
				break;
			case 4:
			boolean	f=copyGame(hero,monster,flag);
				if (f==false) {
					flag=false;
				}
				break;
			case 5:
				flag=false;
				break;
			
			}
		}
	}
	
	public boolean copyGame(Hero hero,Monster monster,boolean f){
		
		boolean flag=true;
		
		while (flag) {	
			
		System.out.println("==��ѡ��Ҫ�����Ĺ���==");
		System.out.println("1.��");
		System.out.println("2.��");
		System.out.println("3.��");
		System.out.println("4.����");
		System.out.println("5.������һ��");
		System.out.println("=====================");
		Scanner sc = new Scanner(System.in);
		int choose2 = sc.nextInt();
		
			switch (choose2) {
			case 1:
				monster.setNameMonster("��");
				flag=playMonster.play(hero, monster,flag);
				break;
			case 2:
				monster.setNameMonster("��");
				flag=playMonster.play(hero, monster,flag);
				break;
			case 3:
				monster.setNameMonster("��");
				flag=playMonster.play(hero, monster,flag);
				break;
			case 4:
				flag=false;
				//monster.setGuanka(monster.getGuanka()-1);
				//copyGame(hero,monster);
				break;
			case 5:
				System.out.println("//////////////////////////////");
				if(hero.getGuanka()<=20){
				monster.setGuanka(monster.getGuanka()+1);
				monster.setGuanka(hero.getGuanka()+1);
				
				hero.setGuanka(hero.getGuanka()+1);
				}
				else{
					flag=false;
					System.out.println("��ϲ���Ѿ�ͨ���ˣ�����");
				}
				//System.out.println(monster.toString());
				System.out.println("//////////////////////////////");
				break;
			}
		}

		
		f=false;
		return f;
	}
	

}
