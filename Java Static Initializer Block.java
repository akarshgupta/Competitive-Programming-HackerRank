# Java Static Initializer Block
# https://www.hackerrank.com/challenges/java-static-initializer-block/problem

static int B,H;
static boolean flag;
static
{   
 Scanner scan= new Scanner(System.in);
 flag = true;   
 B=scan.nextInt();
 H=scan.nextInt(); 
    scan.close();
    try {
  if (B <= 0 || H <= 0)
   throw new Exception("Breadth and height must be positive");
 } catch (Exception e) {
  System.out.println(e);
  System.exit(0);
    }
}
