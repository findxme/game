package cn.stu.dao;

import java.io.Serializable;

/**
 * @author lxj
 * ������
 * game
 */
public class Monster implements Serializable{//����Ķ���ɱ����л���ʵ����Serializable�ӿڣ�
	
	//��ʼ������ֵ
	public  int lifeMonsterMax;//����
	public  int attackMonsterMax;//������
	public  int exMax;//�����ľ���ֵ
	public  int goldMax;//�����Ľ��
	public  int guankaMax;//����Ĺؿ�
	

	private String nameMonster;//����
	private int lifeMonster;//����
	private int attackMonster;//������
	private int ex;//�����ľ���ֵ
	private int gold;//�����Ľ��
	private int guanka=1;//����Ĺؿ�
	

	

	public Monster() {
		super();
		this.lifeMonsterMax = lifeMonsterMax;
		this.nameMonster = nameMonster;
		this.lifeMonster = lifeMonster;
		this.attackMonster = attackMonster;
		this.ex = ex;
		this.gold = gold;
		this.guanka = guanka;
	}
	public int getLifeMonsterMax() {
		return lifeMonsterMax;
	}
	public void setLifeMonsterMax(int lifeMonsterMax) {
		this.lifeMonsterMax = lifeMonsterMax;
	}
	public int getAttackMonsterMax() {
		return attackMonsterMax;
	}
	public void setAttackMonsterMax(int attackMonsterMax) {
		this.attackMonsterMax = attackMonsterMax;
	}
	public int getExMax() {
		return exMax;
	}
	public void setExMax(int exMax) {
		this.exMax = exMax;
	}
	public int getGoldMax() {
		return goldMax;
	}
	public void setGoldMax(int goldMax) {
		this.goldMax = goldMax;
	}
	public int getGuankaMax() {
		return guankaMax;
	}
	public void setGuankaMax(int guankaMax) {
		this.guankaMax = guankaMax;
	}
	public String getNameMonster() {
		return nameMonster;
	}
	public void setNameMonster(String nameMonster) {
		this.nameMonster = nameMonster;
	}
	public int getLifeMonster() {
		return lifeMonster;
	}
	public void setLifeMonster(int lifeMonster) {
		this.lifeMonster = lifeMonster;
	}
	public int getAttackMonster() {
		return attackMonster;
	}
	public void setAttackMonster(int attackMonster) {
		this.attackMonster = attackMonster;
	}
	public int getEx() {
		return ex;
	}
	public void setEx(int ex) {
		this.ex = ex;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getGuanka() {
		return guanka;
	}
	public void setGuanka(int guanka) {
		this.guanka = guanka;
	}
	@Override
	public String toString() {
		return "Monster [nameMonster=" + nameMonster + ", lifeMonster=" + lifeMonster + ", attackMonster="
				+ attackMonster + ", ex=" + ex + ", gold=" + gold + ", guanka=" + guanka + "]";
	}



	
	

}
