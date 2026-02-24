class CharSwitchRunner
{
	public static void main(String[] args)
	{
		evaluateGrade('A');
		evaluateGrade('C');
	}
	static void evaluateGrade(char grade)
	{
		switch(grade)
		{
			case 'A':
			CharSwitch.excellence();
			break;
			case 'B':
			CharSwitch.encourageProgress();
			break;
			case 'C':
			CharSwitch.suggestPractice();
			break;
			case 'D':
			CharSwitch.improvement();
			break;
			case 'F':
			CharSwitch.warnFailure();
			break;
			default:
			System.out.println("Invalid Grade");
		}
	}
}