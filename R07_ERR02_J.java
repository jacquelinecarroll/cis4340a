Rule 07. Exceptional Behavior (ERR)

try {
    // ...
  } catch (SecurityException se) {
    System.err.println(se);
    // Recover from exception
  }