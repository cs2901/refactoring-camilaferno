void renderBanner() {
    final boolean isPlatform = platform.toUpperCase().indexOf("MAC") > -1;
    final boolean isBrowser = browser.toUpperCase().indexOf("IE") > -1;
  if ( isPlatform && isBrowser && wasInitialized() && resize > 0 )
  {
    // do something
  }
}