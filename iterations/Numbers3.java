package com.qa.iteration;

public class Numbers3 {
		public int addition(int x) {

			int total = 0;
			int len = String.valueOf(x).length();

			for (int i = 0; i < len; i++) {
				total += x % 10;
				x /= 10;
			}

			return total;

		}

		public String tens(int x) {

			int len = String.valueOf(x).length();

			if (len == 2) {
				if (x < 20) {
					return (getSpecial(x % 10));
				} else {
					int ones = x % 10;
					int tens = x / 10;
					return (getTens(tens) + " " + getOnes(ones));
				}
			} else {
				return (getOnes(x));
			}

		}

		public String hundreds(int x) {
			
			int hundreds = 0;
			int tens = 0;
			int ones = 0;
			
			String output = "";
			
			while(x > 0) {
				if (x >= 100) {
					x -= 100;
					hundreds++;
				} else if (x >= 10) {
					x -= 10;
					tens++;
				} else {
					x -=1;
					ones++;
				}
			}
			
			if (hundreds > 0) {
				output += getOnes(hundreds) + "-hundred ";
			}
			
			if (tens == 1) {
				output += getSpecial(ones);
			} else {
				output += getTens(tens) + " ";
				output += getOnes(ones);
			}
			
			return output;
		}

		public String thousands(int x) {
					
			int thousands = 0;
			int hundreds = 0;
			int tens = 0;
			int ones = 0;
			
			String output = "";
			
			while(x > 0) {
				if (x >= 1000) {
					x -=1000;
					thousands++;
				}else if (x >= 100) {
					x -= 100;
					hundreds++;
				} else if (x >= 10) {
					x -= 10;
					tens++;
				} else {
					x -=1;
					ones++;
				}
			}
			
			if (thousands > 0) {
				output += getOnes(thousands) + "-thousand ";
			}
			
			if (hundreds > 0) {
				output += getOnes(hundreds) + "-hundred ";
			}
			
			if (tens == 1) {
				output += getSpecial(ones);
			} else {
				output += getTens(tens) + " ";
				output += getOnes(ones);
			}
			
			return output;
		}

		public String getTens(int i) {
			switch (i) {
//			case 1:
//				return "ten";
			case 2:
				return "twenty";
			case 3:
				return "thirty";
			case 4:
				return "fourty";
			case 5:
				return "fifty";
			case 6:
				return "sixty";
			case 7:
				return "seventy";
			case 8:
				return "eighty";
			case 9:
				return "ninety";
			default:
				return "";
			}
		}

		public String getSpecial(int i) {
			switch (i) {
			case 0:
				return "ten";
			case 1:
				return "eleven";
			case 2:
				return "twelve";
			case 3:
				return "thirteen";
			case 4:
				return "fourteen";
			case 5:
				return "fifteen";
			case 6:
				return "sixteen";
			case 7:
				return "seventeen";
			case 8:
				return "eighteen";
			case 9:
				return "nineteen";
			default:
				return "";
			}
		}

		public String getOnes(int i) {
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
				return "";
			}
		}
		
		public void oneToOneHundred() {
			
			for(int i =1; i <100; i++) {
				
				if (i<10) {
					System.out.println(getOnes(i));
				} else if (i <20) {
					System.out.println(getSpecial(i % 10));
				} else {
					int ones = i % 10;
					int tens = i / 10;
					System.out.println(getTens(tens) + " " + getOnes(ones));
				}
			}
			System.out.println("one hundred");
		}

	}

