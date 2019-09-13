package com.stu.test;

import com.stu.model.FlyPig;
 
import java.io.*;
 
/**
 * ���л�����
 *
 * @author lxk on 2017/11/1
 */
public class SerializableTest {
    public static void main(String[] args) throws Exception {
        serializeFlyPig();
        FlyPig flyPig = deserializeFlyPig();
        //System.out.println(flyPig.toString());
 
    }
 
    /**
     * ���л�
     */
    private static void serializeFlyPig() throws IOException {
        FlyPig flyPig = new FlyPig();
//        flyPig.setColor("black");
//        flyPig.setName("naruto");
//        flyPig.setCar("0000");
        // ObjectOutputStream ������������� flyPig ����洢��E�̵� flyPig.txt �ļ��У���ɶ� flyPig ��������л�����
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("f:/lizable/flyPig.txt")));
        oos.writeObject(flyPig);
        System.out.println("FlyPig �������л��ɹ���");
        oos.close();
    }
 
    /**
     * �����л�
     */
    private static FlyPig deserializeFlyPig() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("d:/flyPig.txt")));
        FlyPig person = (FlyPig) ois.readObject();
        System.out.println("FlyPig �������л��ɹ���");
        System.out.println( person.getColor());
       
        return person;
    }
}

