public class AbstractClassExt extends AbstractClass {
  static {
    System.out.println(AbstractClassExt.class.getName() + ": static");
  }

  {
    System.out.println(AbstractClassExt.class.getName() + ": instance");
  }

  public AbstractClassExt() {
    System.out.println(AbstractClassExt.class.getName() + ": constructor");
  }

  public static void main(String[] args) {
    AbstractClassExt nc = new AbstractClassExt();
    hello();
  }
}
