package cn.stu.dao;

import java.io.Serializable;

/**
 * @author lxj
 * Ӣ����
 * game
 */
public class Hero implements Serializable{//����Ķ���ɱ����л���ʵ����Serializable�ӿڣ�
	
	
	private  int lifeheroMax=100;//����ֵ
	private  int attackheroMAx=10;//������
	private  int exMax=100;//����ֵ(Ŀǰ�ȼ�����ľ���ֵ)
	private  int goldMax=0;//ӵ�еĽ��
	private  int gradeMax=1;//ĿǰӢ�۵ĵȼ�
	private  int guankaMax=1;//Ӣ�����ڹؿ�
	
	private String namehero;//����
	private int lifehero;//����ֵ
	private int attackhero;//������
	private int ex;//����ֵ(Ŀǰ�ȼ��ľ���ֵ)
	private int gold;//ӵ�еĽ��
	private int grade=1;//ĿǰӢ�۵ĵȼ�
	private int guanka;//Ӣ�����ڹؿ�
	


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
