public class ESingleton{
	//�����������һ��ʵ����������ͬʱ����ʼ������
	public static ESingleton instance = new ESingleton();
	//�����캯��˽�л����������ṩ���캯��
	private ESingleton(){
	}
	//�����ṩ���ʸ������ķ���
	public static ESingleton getInstance(){
		return instance;
	}
}