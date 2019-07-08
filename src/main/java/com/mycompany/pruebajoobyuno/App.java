package com.mycompany.pruebajoobyuno;

import org.jooby.Jooby;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  {
<<<<<<< HEAD
    get("/", () -> "Hello !");
=======
    get("/", () -> "SOY THOR DIOS DEL TRUENO!");
>>>>>>> 653c03963737543781bbe00715c1423dd8556a91
  }

  public static void main(final String[] args) {
    run(App::new, args);
  }

}
