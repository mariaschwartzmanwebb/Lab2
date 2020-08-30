class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int total = 55 * 10;
    double blue, brown, green, orange, red, yellow;

    blue = (total * .24);
    brown = (total * .13);
    green = (total * .16);
    orange = (total * .20);
    red = (total * .13);
    yellow = (total * .14);

    System.out.println("blue: " + blue);
    System.out.println("brown: " + brown);
    System.out.println("green: " + green);
    System.out.println("orange: " + orange);
    System.out.println("red: " + red);
    System.out.println("yellow: " + yellow);

    double sum = blue + brown + green + orange + red + yellow;
    System.out.println("Sum: " + sum);

    if(blue > brown && green > orange)
      System.out.println("Blue over brown and Green over orange");
    if((brown <= red))
      System.out.println("Brown is less than or equal to red");
    if((sum==total))
      System.out.println("Numbers match");

  }
}