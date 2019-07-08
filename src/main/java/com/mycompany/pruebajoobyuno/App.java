package com.mycompany.pruebajoobyuno;

import org.jooby.Jooby;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  {
    get("/", () -> "Hola Suemy Solano ya dile que si :v");
  }

  public static void main(final String[] args) {
    run(App::new, args);
  }

}
