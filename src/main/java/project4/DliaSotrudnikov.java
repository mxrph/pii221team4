package project4;

	public class DliaSotrudnikov extends Uslovie {
		
		@Override
		public void porcent() {
			double procMin; // ���������� ���������� ������������ ��������
			double procMax; // ���������� ���������� ������������� ��������
			double procRaznica; // ���������� ����������, ������� ������������ �������
			double procMes; // ���������� ���������� ��������� ��������

			if(summ < 250001) { //������� ������� ��������, ������� ������� �� �����
				procMin = 15.99;
				procMax = 23.49;
				procRaznica = procMax - procMin;// ������ �������
			} else if (summ < 700001) {//������� ������� ��������, ������� ������� �� �����
				procMin = 13.99;
				procMax = 18.99;
				procRaznica = procMax - procMin;// ������ �������
			} else {
				procMin = 11.99;
				procMax = 18.99;
				procRaznica = procMax - procMin;// ������ �������
			}
			procMes = procRaznica/48;// ���������� ������������ ��������, ��� ���������� ��������� ��������
			proc = procMax - procMes*(mes - 12);
		}

	}
