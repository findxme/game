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
		System.out.println("请输入你的名字");
		Scanner sc = new Scanner(System.in);
		String userName= sc.next();
		hero.setNamehero(userName);
		System.out.println("欢迎"+userName+",请开始你的游戏吧");
		boolean flag=true;
		Initialization initialization = new Initialization();
		initialization.initializationHero(hero);
		while (flag) {	
			System.out.println("=====================");
			System.out.println("1.人物属性");
			System.out.println("2.金币商店");
			System.out.println("3.存档");
			System.out.println("4.进入副本");
			System.out.println("5.退出游戏");
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
			
		System.out.println("==请选择要攻击的怪物==");
		System.out.println("1.鸡");
		System.out.println("2.蛇");
		System.out.println("3.熊");
		System.out.println("4.返回");
		System.out.println("5.进入下一层");
		System.out.println("=====================");
		Scanner sc = new Scanner(System.in);
		int choose2 = sc.nextInt();
		
			switch (choose2) {
			case 1:
				monster.setNameMonster("鸡");
				flag=playMonster.play(hero, monster,flag);
				break;
			case 2:
				monster.setNameMonster("蛇");
				flag=playMonster.play(hero, monster,flag);
				break;
			case 3:
				monster.setNameMonster("熊");
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
					System.out.println("恭喜你已经通关了！！！");
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
