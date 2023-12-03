public static void main(String[] args)
{
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter two number");
        int number = myObj.nextInt();  // Read user input
        int second_number=myObj.nextInt();
        int result = (number > second_number) ? second_number : number;
        System.out.println(result); 
}
