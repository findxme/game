package cn.stu.tool;

import cn.stu.dao.Hero;
import cn.stu.dao.Monster;

public class Initialization {
	

	public void initializationMonster(Monster monster) {
		// TODO Auto-generated method stub
		int i= monster.getGuanka();
		if(i==1){
			monster.setLifeMonster(30);
			monster.setLifeMonsterMax(monster.getLifeMonster());//把当前等级的生命值
			monster.setAttackMonster(2);
			monster.setEx(10);
			monster.setGold(10);
			//monster.set
			System.out.println("重置怪物属性");
		}
		else {
			int k = monster.getGuanka();
			monster.setLifeMonster(30+(k-1)*8);//生命值在基础上加10
			monster.setLifeMonsterMax(monster.getLifeMonster());//把当前等级的生命值
			monster.setAttackMonster(2+(k-1)*4);//攻击力+2
			monster.setEx(30+(k-1)*5);//经验值+10
			monster.setGold(10+(k-1)*8);//金币+10
			
			
		}
	}
	public void initializationHero(Hero hero){
		
		int i= hero.getGrade();
		
		if(i==1){
			hero.setLifehero(100);
			hero.setLifeheroMax(hero.getLifehero());
			hero.setAttackhero(10);
			hero.setEx(0);
			hero.setGold(0);
			//hero.setGrade(1);
			hero.setGuanka(1);
			//monster.set
			System.out.println("重置英雄");
		}
		else {
			//int k = hero.getGold();
			hero.setLifehero(100+(i-1)*15);//生命值在基础上加10
			hero.setLifeheroMax(hero.getLifehero());//重置当前等级最大生命值
			hero.setAttackhero(20+(i-1)*8);//攻击力+2
			hero.setExMax(100+(i-1)*40);//所需的最大经验值+10
			//hero.toString();
			//hero.setGold(10+(k-1)*8);//金币+10
			
		}
		
	}
	public void ReturnBlood(int i, int j,Hero hero){//i 回复的血量，j需要的金币
		
		if (hero.getGold()<j) {
			System.out.println("没钱的穷光蛋还想买回血药水，痴心妄想");
		} else if (hero.getLifehero()==hero.getLifeheroMax()) {
			System.out.println("血量在本等级最高值，你还想回血，难道想上天！！");
			
		}else if(i>(hero.getLifeheroMax()-hero.getLifehero())){
			System.out.println("购买的血瓶回复量大于本等级最高值，默认回复到本等级最高血量！！吃亏了吧，奈何游戏数据设计都有问题，没办法，随缘了");
			hero.setLifehero(hero.getLifeheroMax());
			hero.setGold(hero.getGold()-j);
			System.out.println("回复"+i+"点血量，"+"扣除"+j+"点金币"+"，你还剩余金币："+hero.getGold());
			
		}
		else if(i<=(hero.getLifeheroMax()-hero.getLifehero())){
			hero.setLifehero(i);
			hero.setGold(hero.getGold()-j);
			System.out.println("回复"+i+"点血量，"+"扣除"+j+"点金币"+"，你还剩余金币："+hero.getGold());
		}

		
	}
	public void AddAttack(int i ,int j ,Hero hero){
		if (hero.getGold()<j) {
			System.out.println("没钱的穷光蛋还想加攻击力，痴心妄想，老老实实的打怪去！！");
		}else {
			hero.setGold(hero.getGold()-j);
			hero.setAttackhero(hero.getAttackhero()+i);
			System.out.println("增加"+i+"点攻击力，"+"扣除"+j+"点金币"+"，你还剩余金币："+hero.getGold());
		}
		
	}

	public void ExJiSuan(Hero hero){
		
	}
}
