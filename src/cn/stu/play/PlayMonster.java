package cn.stu.play;

import java.util.Scanner;



import cn.stu.dao.Hero;
import cn.stu.dao.Monster;
import cn.stu.tool.Initialization;

public class PlayMonster {
	Initialization initialization = new Initialization();
	public boolean play(Hero hero,Monster monster,boolean flag2){
		//Initialization initialization = new Initialization();
		initialization.initializationMonster(monster);
		
		int j=monster.getLifeMonster();
		int i=1;
		int k=hero.getLifehero();
		boolean flag=true;
		while (flag) {
			
//			System.out.println("英雄攻击熊");
			System.out.println("英雄**"+hero.getNamehero()+"**的属性如下：");
			System.out.println("**************************");
			System.out.println("血量："+hero.getLifehero());
			System.out.println("攻击力："+hero.getAttackhero());
			System.out.println("等级："+hero.getGrade());
			System.out.println("**************************");
			//System.out.println("**"+hero.getNamehero()+"**的血量"+hero.getLifehero()+",攻击力："+hero.getAttackhero()+",等级："+hero.getGrade());
			System.out.println("怪物**"+monster.getNameMonster()+"**的属性如下：");
			System.out.println("==========================");
			System.out.println("生命值:"+monster.getLifeMonster());
			System.out.println("攻击力:"+monster.getAttackMonster());
			System.out.println("产生的金币:"+monster.getGold());
			System.out.println("产生的经验值:"+monster.getEx());
			System.out.println("==========================");
			System.out.println("正在与**"+monster.getNameMonster()+"**进行第"+(i++)+"轮pk，"+"我觉得你是一定打不赢的"+"--英雄攻击怪物--");
			j=monster.getLifeMonster()-hero.getAttackhero();//英雄攻击力减去怪物血量
			System.out.println("************************************");
			System.out.println("********怪物剩余血量"+j+"***************");
			System.out.println("************************************");
			monster.setLifeMonster(j);
			if (j<=0) {
				System.out.println("怪物死亡,不敢相信你居然干死了怪物");
				//获取目前英雄的经验加上怪物产生的经验然后赋值回英雄的经验条，然后把经验条和最大经验值做比较
				
				hero.setEx(hero.getEx()+monster.getEx());//这个地方要做一个单独的方法去计算英雄升级的问题，但目前我在数据设计上只让一个怪物产生的经验只能升一级或者不到一级
				System.out.println("击杀怪物产生的经验值："+monster.getEx());
				int ex=hero.getEx();
				hero.setGold(hero.getGold()+monster.getGold());//增加金币
				System.out.println("///////////////////////////////////");
				System.out.println("英雄的经验"+ex);
				System.out.println("///////////////////////////////////");
				flag=false;
				if(ex>=hero.getExMax())
				{
					hero.setGrade((hero.getGrade()+1));
					System.out.println("你居然升级了。不敢相信，恭喜你升到了"+hero.getGrade());
					int exz=hero.getEx()-hero.getExMax();
					initialization.initializationHero(hero);
					hero.setEx(exz);
					System.out.println(hero.toString());
					System.out.println(hero.getLifehero());
					System.out.println("+++++++++++++++++++++++++++");
					//return flag;
				}
				break;
			}
			else {
				monster.setLifeMonster(j);
				//System.out.println(monster.getNameMonster()+"血量:"+monster.getLifeMonster()+"攻击"+monster.getAttackMonster());
				System.out.println("攻防转换，"+monster.getNameMonster()+"攻击"+hero.getNamehero());
				k=hero.getLifehero()-monster.getAttackMonster();
				hero.setLifehero(k);
				System.out.println("英雄生命值："+k);
				
				
			}
			if (k<=0) {
				System.out.println("英雄死亡！游戏结束，垃圾，这么菜！！！");
				hero.setLifehero(k);
				flag=false;
				flag2=false;
				
				
			}
			
			//return flag;
			
	
		}
		System.out.println("检测");
		return flag2;
	}
	
	public void Attributes(Hero hero){
		System.out.println("英雄**"+hero.getNamehero()+"**的属性如下：");
		System.out.println("**************************");
		System.out.println("血量："+hero.getLifehero());
		System.out.println("攻击力："+hero.getAttackhero());
		System.out.println("等级："+hero.getGrade());
		System.out.println("拥有金币："+hero.getGold());
		System.out.println("当前关卡："+hero.getGuanka());
		System.out.println("目前等级经验值："+hero.getEx());
		System.out.println("升级到下一等级需要经验值："+(hero.getExMax()-hero.getEx()));
		System.out.println("**************************");
	}
	
	public void JbStore(Hero hero){
	//	ReturnB returnB= new ReturnB();
		System.out.println("**************************");
		System.out.println("你当前的属性如下自己去对比对比看要不要买");
		Attributes(hero);
		System.out.println("**************************");
		System.out.println("//////////////////////////////");
		System.out.println("本等级最高生命值，"+hero.getLifeheroMax()+"本等级最高经验值:"+hero.getExMax());
		System.out.println("//////////////////////////////");
		System.out.println("本商人有大量回血药水和增加攻击力的药水，请问你需要什么?");
		System.out.println("1.回复"+(hero.getGrade()*2+10)+"的生命值"+",需要金币"+(hero.getGrade()*2+3));
		System.out.println("2.回复"+(hero.getGrade()*5+10)+"的生命值"+",需要金币"+(hero.getGrade()*2+5));
		System.out.println("3.回复"+(hero.getGrade()*8+10)+"的生命值"+",需要金币"+(hero.getGrade()*2+7));
		System.out.println("4.回复"+(hero.getGrade()*10+10)+"的生命值"+",需要金币"+(hero.getGrade()*2+9));
		System.out.println("5.增加"+(hero.getGrade()*3+2)+"的攻击力"+",需要金币"+(hero.getGrade()*2+7));
		System.out.println("6.增加"+(hero.getGrade()*3+5)+"的攻击力"+",需要金币"+(hero.getGrade()*2+9));
		System.out.println("7.退出");
		 Scanner sc =new Scanner(System.in);
		 int blood=sc.nextInt();
		 switch (blood) {
			case 1:
				initialization.ReturnBlood((hero.getGrade()*2+10),(hero.getGuanka()*2+3),hero);
				break;
			case 2:
				initialization.ReturnBlood((hero.getGrade()*5+10),(hero.getGuanka()*2+5),hero);		
				break;
			case 3:
				initialization.ReturnBlood((hero.getGrade()*8+10),(hero.getGuanka()*2+7),hero);
				break;
			case 4:
				initialization.ReturnBlood((hero.getGrade()*10+10),(hero.getGuanka()*2+9),hero);
				break;
	
			case 5:
				initialization.AddAttack(hero.getGrade()*3+2,(hero.getGrade()*2+7),hero);
				break;
			case 6:
				initialization.AddAttack(hero.getGrade()*3+5,(hero.getGrade()*2+9),hero);
				break;
			case 7:
				break;
			default:
				break;
		}
		
	}

	

}
