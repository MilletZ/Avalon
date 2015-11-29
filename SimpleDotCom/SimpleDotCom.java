class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits = 0;

    public String checkYourself(String userGuess) {
	int ug = Integer.parseInt(userGuess);
	String result = "miss";

	for(int cell : locationCells) {
	    if(ug == cell) {
		result = "hit";
		numOfHits++;
	    }
	}

	if(numOfHits == locationCells.length) {
	    result = "kill";
	}

	System.out.println(result);
	return result;
    }

    public void setLocationCells(int[] locations){
	locationCells = locations;
    }
}
