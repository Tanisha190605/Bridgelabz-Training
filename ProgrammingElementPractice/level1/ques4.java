public class ques4 {
	public static void main(String[] args) {
		int sp = 191;
		int cp = 129;
		int profit = sp - cp;
		float profit_per = (profit / cp) * 100;
		System.out.println("The Cost Price is INR "+ cp + " and Selling Price is INR " + sp);
		System.out.println("The Profit is INR " + profit +" and the Profit Percentage is " + profit_per);
	}
}
