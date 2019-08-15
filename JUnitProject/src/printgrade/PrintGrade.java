package printgrade;

public class PrintGrade {

	public String print(int grade)
	{
		if(grade>90)
			return "You got an A.";
		else if(grade>80)
			return "You got an B.";
		else if(grade>70)
			return "You got an C.";
		else
			return "You need to study.";
	}
}
