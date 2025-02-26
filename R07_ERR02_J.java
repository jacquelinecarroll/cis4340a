Rule 07. Exceptional Behavior (ERR)

try {
    // ...
  } catch(SecurityException se) {
    logger.log(Level.SEVERE, se);
    // Recover from exception
  }