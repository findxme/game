package cn.stu.tool;

import cn.stu.dao.Hero;
import cn.stu.dao.Monster;

public class Initialization {
	

	public void initializationMonster(Monster monster) {
		// TODO Auto-generated method stub
		int i= monster.getGuanka();
		if(i==1){
			monster.setLifeMonster(30);
			monster.setLifeMonsterMax(monster.getLifeMonster());//�ѵ�ǰ�ȼ�������ֵ
			monster.setAttackMonster(2);
			monster.setEx(10);
			monster.setGold(10);
			//monster.set
			System.out.println("���ù�������");
		}
		else {
			int k = monster.getGuanka();
			monster.setLifeMonster(30+(k-1)*8);//����ֵ�ڻ����ϼ�10
			monster.setLifeMonsterMax(monster.getLifeMonster());//�ѵ�ǰ�ȼ�������ֵ
			monster.setAttackMonster(2+(k-1)*4);//������+2
			monster.setEx(30+(k-1)*5);//����ֵ+10
			monster.setGold(10+(k-1)*8);//���+10
			
			
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
			System.out.println("����Ӣ��");
		}
		else {
			//int k = hero.getGold();
			hero.setLifehero(100+(i-1)*15);//����ֵ�ڻ����ϼ�10
			hero.setLifeheroMax(hero.getLifehero());//���õ�ǰ�ȼ��������ֵ
			hero.setAttackhero(20+(i-1)*8);//������+2
			hero.setExMax(100+(i-1)*40);//����������ֵ+10
			//hero.toString();
			//hero.setGold(10+(k-1)*8);//���+10
			
		}
		
	}
	public void ReturnBlood(int i, int j,Hero hero){//i �ظ���Ѫ����j��Ҫ�Ľ��
		
		if (hero.getGold()<j) {
			System.out.println("ûǮ����⵰�������Ѫҩˮ����������");
		} else if (hero.getLifehero()==hero.getLifeheroMax()) {
			System.out.println("Ѫ���ڱ��ȼ����ֵ���㻹���Ѫ���ѵ������죡��");
			
		}else if(i>(hero.getLifeheroMax()-hero.getLifehero())){
			System.out.println("�����Ѫƿ�ظ������ڱ��ȼ����ֵ��Ĭ�ϻظ������ȼ����Ѫ�������Կ��˰ɣ��κ���Ϸ������ƶ������⣬û�취����Ե��");
			hero.setLifehero(hero.getLifeheroMax());
			hero.setGold(hero.getGold()-j);
			System.out.println("�ظ�"+i+"��Ѫ����"+"�۳�"+j+"����"+"���㻹ʣ���ң�"+hero.getGold());
			
		}
		else if(i<=(hero.getLifeheroMax()-hero.getLifehero())){
			hero.setLifehero(i);
			hero.setGold(hero.getGold()-j);
			System.out.println("�ظ�"+i+"��Ѫ����"+"�۳�"+j+"����"+"���㻹ʣ���ң�"+hero.getGold());
		}

		
	}
	public void AddAttack(int i ,int j ,Hero hero){
		if (hero.getGold()<j) {
			System.out.println("ûǮ����⵰����ӹ��������������룬����ʵʵ�Ĵ��ȥ����");
		}else {
			hero.setGold(hero.getGold()-j);
			hero.setAttackhero(hero.getAttackhero()+i);
			System.out.println("����"+i+"�㹥������"+"�۳�"+j+"����"+"���㻹ʣ���ң�"+hero.getGold());
		}
		
	}

	public void ExJiSuan(Hero hero){
		
	}
}
