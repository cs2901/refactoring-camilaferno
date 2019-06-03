void printOwing() {
  printBanner();
  printDetails(getOutstanding());
}
void printDetails(double outstanding) {
    // Print details.
    System.out.println("name: " + name);
    System.out.println("amount: " + outstanding);
}