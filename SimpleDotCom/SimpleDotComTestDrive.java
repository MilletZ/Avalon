class SimpleDotComTestDrive {
    public static void main (String [] args) {
	SimpleDotCom sdc = new SimpleDotCom();
	
	int [] locations = {2,3,4};
	sdc.setLocationCells(locations);
	String userGuess = "2";
	String result = sdc.checkYourself(userGuess);
	String testResult = "failed";
	
	if (result.equals("hit")) {
	    testResult = "passed";
	}

	System.out.println(testResult);
    }
}
