package cn.stu.dao;

import java.io.Serializable;

/**
 * @author lxj
 * 怪物类
 * game
 */
public class Monster implements Serializable{//此类的对象可被序列化（实现了Serializable接口）
	
	//初始化属性值
	public  int lifeMonsterMax;//生命
	public  int attackMonsterMax;//攻击力
	public  int exMax;//产生的经验值
	public  int goldMax;//产生的金币
	public  int guankaMax;//怪物的关卡
	

	private String nameMonster;//名字
	private int lifeMonster;//生命
	private int attackMonster;//攻击力
	private int ex;//产生的经验值
	private int gold;//产生的金币
	private int guanka=1;//怪物的关卡
	

	

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
