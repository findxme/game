package cn.stu.dao;

import java.io.Serializable;

/**
 * @author lxj
 * 英雄类
 * game
 */
public class Hero implements Serializable{//此类的对象可被序列化（实现了Serializable接口）
	
	
	private  int lifeheroMax=100;//生命值
	private  int attackheroMAx=10;//攻击力
	private  int exMax=100;//经验值(目前等级所需的经验值)
	private  int goldMax=0;//拥有的金币
	private  int gradeMax=1;//目前英雄的等级
	private  int guankaMax=1;//英雄所在关卡
	
	private String namehero;//名字
	private int lifehero;//生命值
	private int attackhero;//攻击力
	private int ex;//经验值(目前等级的经验值)
	private int gold;//拥有的金币
	private int grade=1;//目前英雄的等级
	private int guanka;//英雄所在关卡
	


	public int getLifeheroMax() {
		return lifeheroMax;
	}


	public Hero() {
	super();
	this.exMax=exMax;
	this.lifeheroMax=lifeheroMax;
	this.namehero = namehero;
	this.lifehero = lifehero;
	this.attackhero = attackhero;
	this.ex = ex;
	this.gold = gold;
	this.grade = grade;
	this.guanka = guanka;
}


	public void setLifeheroMax(int lifeheroMax) {
		this.lifeheroMax = lifeheroMax;
	}


	public int getAttackheroMAx() {
		return attackheroMAx;
	}


	public void setAttackheroMAx(int attackheroMAx) {
		this.attackheroMAx = attackheroMAx;
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


	public int getGradeMax() {
		return gradeMax;
	}


	public void setGradeMax(int gradeMax) {
		this.gradeMax = gradeMax;
	}


	public int getGuankaMax() {
		return guankaMax;
	}


	public void setGuankaMax(int guankaMax) {
		this.guankaMax = guankaMax;
	}


	public String getNamehero() {
		return namehero;
	}


	public void setNamehero(String namehero) {
		this.namehero = namehero;
	}


	public int getLifehero() {
		return lifehero;
	}


	public void setLifehero(int lifehero) {
		this.lifehero = lifehero;
	}


	public int getAttackhero() {
		return attackhero;
	}


	public void setAttackhero(int attackhero) {
		this.attackhero = attackhero;
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


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getGuanka() {
		return guanka;
	}


	public void setGuanka(int guanka) {
		this.guanka = guanka;
	}


	@Override
	public String toString() {
		return "Hero [namehero=" + namehero + ", lifehero=" + lifehero + ", attackhero=" + attackhero + ", ex=" + ex
				+ ", gold=" + gold + ", grade=" + grade + ", guanka=" + guanka + ", exMax=" + exMax +"]";
	}







	

	

}
