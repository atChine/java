package Exercise01;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;;

public class Test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ComputerTeacher wbb01=new ComputerTeacher("������01", 31);
		ComputerTeacher wbb02=new ComputerTeacher("������02", 16);
		ComputerTeacher wbb03=new ComputerTeacher("������03", 6);
		ComputerTeacher wbb04=new ComputerTeacher("������04", 12);
		ComputerTeacher wbb05=new ComputerTeacher("������05", 18);
		wbb01.work();
		
		ArrayList<ComputerTeacher> comname=new ArrayList<>();
		comname.add(wbb01);
		comname.add(wbb02);
		comname.add(wbb03);
		comname.add(wbb04);
		comname.add(wbb05);
	
		ComputerTeacher min=Collections.min(comname,new Mycomputer());
	}
}
