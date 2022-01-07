package com.qa.iteration;

public class Coins {

	public String giveChange(double cost, double amount) {
		double change = ((amount*100) - (cost*100))/100;
		System.out.println("Change required: £" + change);
		change *= 100;

		int fiftyPound = 0;
		int twentyPound = 0;
		int tenPound = 0;
		int fivePound = 0;
		int twoPound = 0;
		int onePound = 0;
		int fiftyPence = 0;
		int twentyPence = 0;
		int tenPence = 0;
		int fivePence = 0;
		int twoPence = 0;
		int onePence = 0;

		String output = "";

		while (change > 0) {
			if (change >= 5000) {
				change -= 5000;
				fiftyPound++;
			} else if (change >= 2000) {
				change -= 2000;
				twentyPound++;
			} else if (change >= 1000) {
				change -= 1000;
				tenPound++;
			} else if (change >= 500) {
				change -= 500;
				fivePound++;
			} else if (change >= 100) {
				change -= 100;
				onePound++;
			} else if (change >= 50) {
				change -= 50;
				fiftyPence++;
			} else if (change >= 20) {
				change -= 20;
				twentyPence++;
			} else if (change >= 10) {
				change -= 10;
				tenPence++;
			} else if (change >= 5) {
				change -= 5;
				fivePence++;
			} else if (change >= 2) {
				change -= 2;
				twoPence++;
			} else {
				change -= 1;
				onePence++;
			}
		}

			if (fiftyPound > 0) {
				output += "£50 note: " + getFifty(fiftyPound);
			}

			if (twentyPound > 0) {
				output += "\n£20 note: " + getTwenty(twentyPound);
			}
			if (tenPound > 0) {
				output += "\n£10 note: " + getTen(tenPound);
			}
			if (fivePound > 0) {
				output += "\n£5 note: " + getFive(fivePound);
			}
			if (twoPound > 0) {
				output += "\n£2 coin: " + getTwo(twoPound);
			}
			if (onePound > 0) {
				output += "\n£1 coin: " + getOne(onePound);
			}
			if (fiftyPence > 0) {
				output += "\n50p coin: " + getFiftyP(fiftyPence);
			}
			if (twentyPence > 0) {
				output += "\n20p coin: " + getTwentyP(twentyPence);
			}
			if (tenPence > 0) {
				output += "\n10p coin: " + getTenP(tenPence);
			}
			if (fivePence > 0) {
				output += "\n5p coin: " + getFiveP(fivePence);
			}
			if (twoPence > 0) {
				output += "\n2p coin: " + getTwoP(twoPence);
			}
			if (onePence > 0) {
				output += "\n1p coin: " + getOneP(onePence);
			}
			return output;

		}


	public String getFifty(int i) {
		switch (i) {
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		default:
			return "It's more than 9 £50 notes at this point, maybe just pay with card?";
		}
	}

	public String getTwenty(int i) {
		switch (i) {
		case 1:
			return "one";
		case 2:
			return "two";
		default:
			return "";
		}

	}

	public String getTen(int i) {
		switch (i) {
		case 1:
			return "one";
		default:
			return "";
		}
	}
	
	public String getFive(int i) {
		switch (i) {
		case 1:
			return "one";
		default:
			return "";
		}
	}
	public String getTwo(int i) {
		switch (i) {
		case 1:
			return "one";
		case 2:
			return "two";
		default:
			return "";
		}
	}
	public String getOne(int i) {
		switch (i) {
		case 1:
			return "one";
		default:
			return "";
		}
	}
	public String getFiftyP(int i) {
		switch (i) {
		case 1:
			return "one";
		default:
			return "";
		}
	}
	public String getTwentyP(int i) {
		switch (i) {
		case 1:
			return "one";
		case 2:
			return "two";
		default:
			return "";
		}
	}
	public String getTenP(int i) {
		switch (i) {
		case 1:
			return "one";
		default:
			return "";
		}
	}
	public String getFiveP(int i) {
		switch (i) {
		case 1:
			return "one";
		default:
			return "";
		}
	}
	public String getTwoP(int i) {
		switch (i) {
		case 1:
			return "one";
		case 2:
			return "two";
		default:
			return "";
		}
	}
	public String getOneP(int i) {
		switch (i) {
		case 1:
			return "one";
		default:
			return "";
		}
	}
}
