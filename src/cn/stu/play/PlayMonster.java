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
			
//			System.out.println("Ӣ�۹�����");
			System.out.println("Ӣ��**"+hero.getNamehero()+"**���������£�");
			System.out.println("**************************");
			System.out.println("Ѫ����"+hero.getLifehero());
			System.out.println("��������"+hero.getAttackhero());
			System.out.println("�ȼ���"+hero.getGrade());
			System.out.println("**************************");
			//System.out.println("**"+hero.getNamehero()+"**��Ѫ��"+hero.getLifehero()+",��������"+hero.getAttackhero()+",�ȼ���"+hero.getGrade());
			System.out.println("����**"+monster.getNameMonster()+"**���������£�");
			System.out.println("==========================");
			System.out.println("����ֵ:"+monster.getLifeMonster());
			System.out.println("������:"+monster.getAttackMonster());
			System.out.println("�����Ľ��:"+monster.getGold());
			System.out.println("�����ľ���ֵ:"+monster.getEx());
			System.out.println("==========================");
			System.out.println("������**"+monster.getNameMonster()+"**���е�"+(i++)+"��pk��"+"�Ҿ�������һ����Ӯ��"+"--Ӣ�۹�������--");
			j=monster.getLifeMonster()-hero.getAttackhero();//Ӣ�۹�������ȥ����Ѫ��
			System.out.println("************************************");
			System.out.println("********����ʣ��Ѫ��"+j+"***************");
			System.out.println("************************************");
			monster.setLifeMonster(j);
			if (j<=0) {
				System.out.println("��������,�����������Ȼ�����˹���");
				//��ȡĿǰӢ�۵ľ�����Ϲ�������ľ���Ȼ��ֵ��Ӣ�۵ľ�������Ȼ��Ѿ������������ֵ���Ƚ�
				
				hero.setEx(hero.getEx()+monster.getEx());//����ط�Ҫ��һ�������ķ���ȥ����Ӣ�����������⣬��Ŀǰ�������������ֻ��һ����������ľ���ֻ����һ�����߲���һ��
				System.out.println("��ɱ��������ľ���ֵ��"+monster.getEx());
				int ex=hero.getEx();
				hero.setGold(hero.getGold()+monster.getGold());//���ӽ��
				System.out.println("///////////////////////////////////");
				System.out.println("Ӣ�۵ľ���"+ex);
				System.out.println("///////////////////////////////////");
				flag=false;
				if(ex>=hero.getExMax())
				{
					hero.setGrade((hero.getGrade()+1));
					System.out.println("���Ȼ�����ˡ��������ţ���ϲ��������"+hero.getGrade());
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
				//System.out.println(monster.getNameMonster()+"Ѫ��:"+monster.getLifeMonster()+"����"+monster.getAttackMonster());
				System.out.println("����ת����"+monster.getNameMonster()+"����"+hero.getNamehero());
				k=hero.getLifehero()-monster.getAttackMonster();
				hero.setLifehero(k);
				System.out.println("Ӣ������ֵ��"+k);
				
				
			}
			if (k<=0) {
				System.out.println("Ӣ����������Ϸ��������������ô�ˣ�����");
				hero.setLifehero(k);
				flag=false;
				flag2=false;
				
				
			}
			
			//return flag;
			
	
		}
		System.out.println("���");
		return flag2;
	}
	
	public void Attributes(Hero hero){
		System.out.println("Ӣ��**"+hero.getNamehero()+"**���������£�");
		System.out.println("**************************");
		System.out.println("Ѫ����"+hero.getLifehero());
		System.out.println("��������"+hero.getAttackhero());
		System.out.println("�ȼ���"+hero.getGrade());
		System.out.println("ӵ�н�ң�"+hero.getGold());
		System.out.println("��ǰ�ؿ���"+hero.getGuanka());
		System.out.println("Ŀǰ�ȼ�����ֵ��"+hero.getEx());
		System.out.println("��������һ�ȼ���Ҫ����ֵ��"+(hero.getExMax()-hero.getEx()));
		System.out.println("**************************");
	}
	
	public void JbStore(Hero hero){
	//	ReturnB returnB= new ReturnB();
		System.out.println("**************************");
		System.out.println("�㵱ǰ�����������Լ�ȥ�ԱȶԱȿ�Ҫ��Ҫ��");
		Attributes(hero);
		System.out.println("**************************");
		System.out.println("//////////////////////////////");
		System.out.println("���ȼ��������ֵ��"+hero.getLifeheroMax()+"���ȼ���߾���ֵ:"+hero.getExMax());
		System.out.println("//////////////////////////////");
		System.out.println("�������д�����Ѫҩˮ�����ӹ�������ҩˮ����������Ҫʲô?");
		System.out.println("1.�ظ�"+(hero.getGrade()*2+10)+"������ֵ"+",��Ҫ���"+(hero.getGrade()*2+3));
		System.out.println("2.�ظ�"+(hero.getGrade()*5+10)+"������ֵ"+",��Ҫ���"+(hero.getGrade()*2+5));
		System.out.println("3.�ظ�"+(hero.getGrade()*8+10)+"������ֵ"+",��Ҫ���"+(hero.getGrade()*2+7));
		System.out.println("4.�ظ�"+(hero.getGrade()*10+10)+"������ֵ"+",��Ҫ���"+(hero.getGrade()*2+9));
		System.out.println("5.����"+(hero.getGrade()*3+2)+"�Ĺ�����"+",��Ҫ���"+(hero.getGrade()*2+7));
		System.out.println("6.����"+(hero.getGrade()*3+5)+"�Ĺ�����"+",��Ҫ���"+(hero.getGrade()*2+9));
		System.out.println("7.�˳�");
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
