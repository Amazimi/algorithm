package com.johnny.learn.algorithm.adt;


public interface Iterator {
	//�ƶ�����һ��Ԫ��
	public void first();
	//�ƶ�����һ��Ԫ��
	public void next();
	//�����������Ƿ���ʣ���Ԫ��
	public boolean isDone();
	//���ص�ǰԪ��
	public Object currentItem();
}
