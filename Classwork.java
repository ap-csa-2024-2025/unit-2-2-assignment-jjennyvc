public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println("Hello");
    Scanner sc = new Scanner(System.in);
    System.out.println("What type of item do you want to buy?");
    String item;
    item = sc.nextLine();
    System.out.println("How many items do you want to buy?");
    int number;
    number = sc.nextInt();
    System.out.println("How much does it weight?");
    double weight;
    weight = sc.nextDouble();
    double totalWeight = number * weight;

    System.out.println(number + " " + item + "at" + weight + "pounds each will weight" + totalWeight + "pounds total");
    System.out.println("\"That brain of mine is something more than merely mortal; as time will show.\"\nAda Lovelace\nThe first computer programmer");
    System.out.println("(\\(\\\n( - -)\n(( \' ) ( \' )");
  }
}
