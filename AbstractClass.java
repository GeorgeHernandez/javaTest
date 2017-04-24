public class AbstractClass {
  private static final String hello;

  static {
    System.out.println(AbstractClass.class.getName() + ": static");
    hello = "hello from " + AbstractClass.class.getName();
  }

  {
    System.out.println(AbstractClass.class.getName() + ": instnace");
  }

  public AbstractClass() {
    System.out.println(AbstractClass.class.getName() + ": constructor");
  }

  public static void hello() {
    System.out.println(hello);
  }
}

