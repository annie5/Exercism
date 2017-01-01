public class HelloWorld {

  public static String hello(String name) {
    String hello = "Hello, World!";
    if (name == null || name == "") {
      return hello;
    }
    return hello.replace("World", name);
  }

}
