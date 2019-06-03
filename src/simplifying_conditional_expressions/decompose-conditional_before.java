boolean isWinter() {
    if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
        return true;
    }
    else{
        return false;
    }
}

if (isWinter) {
  charge = quantity * winterRate + winterServiceCharge;
}
else {
  charge = quantity * summerRate;
}