package Project4Test;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

public class infotest {

@Test
public void infotest() {

String s = "1.�������� ���� ���������. ����� �� -19130625\n2. ������������ �������� ��������. ����� �� - 19170028\n3. ������� ����� ������������. ����� �� - 19130168\n4. �������� ������ ���������. ����� �� - 19130616";
JOptionPane.showMessageDialog( null,s , "���������� �� ���������� �������", -1);

assertNotNull(s);
}

}