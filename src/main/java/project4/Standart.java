package project4;

    public class Standart extends Uslovie   {

         @Override
         	public void porcent() {
        	 double procMin; // ���������� ���������� ������������ ��������
        	 double procMax; // ���������� ���������� ������������� ��������
        	 double procRaznica; // ���������� ���������� �������������� �������
        	 double procMes; // ���������� ���������� ��������� ��������

        	 if(summ < 250001) { //������� ������� ��������, ������� ������� �� �����
        		 procMin = 16.99;
        		 procMax = 23.49;
        		 procRaznica = procMax - procMin; // ������ �������
        	 } else if (summ < 700001) { //������� ������� ��������, ������� ������� �� �����
        		 procMin = 14.99;
        		 procMax = 18.99;
        		 procRaznica = procMax - procMin; // ������ �������
        	 } else {
        		 procMin = 11.99;
        		 procMax = 18.99;
        		 procRaznica = procMax - procMin; // ������ �������
        	 }
        	 procMes = procRaznica/48; // ���������� ������������ ��������, ��� ���������� ��������� ��������
        	 proc = procMax - procMes*(mes - 12);
         }

}
