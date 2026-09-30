public class Main{
  static String passFail(int month, int day, int year){
    if(month <= 0 || month > 12 || day <= 0 || day > 31 || year <= 0 || (month == 2 && day > 29)) return month + " " + day + " " + year + " is an invalid date";
    if(day == 29 && month == 2) if((year%4 == 0 && year%100 == 0) || year%4 != 0) if(year%400 != 0) return year + " is not a leap year, Feb can have only 28 days";
    if((month == 9 || month == 4 || month == 6 || month == 11) && day == 31) return "month " + month + " cannot have " + day + " days";
    return month + " " + day + " " + year + " is a valid date ";
  }
  public static void main(String[] args) {
    IO.println(passFail(6,30,2017) + "\n" + passFail(6,31,2017) + "\n" + passFail(-3,12,2019) + "\n" + passFail(2,29,2000) + "\n" + passFail(2,30,2000) + "\n" + passFail(2,31,1999) + "\n" + passFail(2,-12,2019) + "\n" + passFail(10,31,1998) + "\n" + passFail(7,33,2020) + "\n" + passFail(2,29,2001) + "\n" + passFail(6,30,-1909) + "\n" + passFail(1,31,2011) + "\n" + passFail(11,32,2017) + "\n" + passFail(2,28,2001) + "\n" + passFail(2,28,1900) + "\n" + passFail(2,29,1800) + "\n" + passFail(2,16,2003));
    /*
      6 30 2017 is a valid date
      month 6 cannot have 31 days
      -3 12 2019 is an invalid date
      2 29 2000 is a valid date
      2 30 2000 is an invalid date
      2 31 1999 is an invalid date
      2 -12 2019 is an invalid date
      10 31 1998 is a valid date
      7 33 2020 is an invalid date
      2001 is not a leap year, Feb can have only 28 days
      6 30 -1909 is an invalid date
      1 31 2011 is a valid date
      11 32 2017 is an invalid date
      2 28 2001 is a valid date
      2 28 1900 is a valid date
      1800 is not a leap year, Feb can have only 28 days
      2 16 2003 is a valid date
    */
  }
}
