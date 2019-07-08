package com.mycompany.pruebajoobyuno;

import org.jooby.Jooby;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  {
    get("/", () -> "SOY THOR DIOS DEL TRUENO!");
  }

  public static void main(final String[] args) {
    run(App::new, args);
  }

}
