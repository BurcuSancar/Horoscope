import java.util.Scanner;

public class Horoscopes {
    public static void main(String[] args) {
     /* Zodiac Signs
           Aries	      March 21 - April 19
           Taurus	      April 20 - May 21
           Gemini	      May 22 - June 22
           Cancer	      June 23 - July 22
           Leo	          July 23 - August 22
           Virgo	      August 23 - September 22
           Libra	      September 23 - October 22
           Scorpio	      October 23 - November 21
           Sagittarius	  November 22 - December 21
           Capricorn	  December 22 - January 21
           Aquarius	      January 20 - February 19
           Pisces	      February 20 - March 20
         */

        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("What is your name");
        name = input.nextLine();
        String birthMonth;
        System.out.println("What month were you born");
        birthMonth = input.nextLine();
        int dayOfBirt;
        System.out.println("What day of the month were you born");
        dayOfBirt = input.nextInt();
        String sign = "";
        boolean isError = false;

        if (birthMonth.equals("January")) {
            if (dayOfBirt >= 1 && dayOfBirt <= 31) {
                if (dayOfBirt < 21) {
                    sign = "Capricorn";
                } else {
                    sign = "Aquarius";
                }
            } else {
                isError = true;
            }
        }

        if (birthMonth.equals("March")) {
            if (dayOfBirt >= 1 && dayOfBirt <= 31) {
                if (dayOfBirt < 20) {
                    sign = "Pisces";
                } else {
                    sign = "Aries";
                }
            } else {
                isError = true;
            }
        }

        if (birthMonth.equals("April")) {
            if (dayOfBirt >= 1 && dayOfBirt <= 30) {
                if (dayOfBirt < 20) {
                    sign = "Aries";
                } else {
                    sign = "Taurus";
                }
            } else {
                isError = true;
            }
        }

        if (birthMonth.equals("May")) {
            if (dayOfBirt >= 1 && dayOfBirt <= 31) {
                if (dayOfBirt < 21) {
                    sign = "Taurus";
                } else {
                    sign = "Gemini";
                }
            } else {
                isError = true;
            }
        }

        if (birthMonth.equals("June")) {
            if (dayOfBirt >= 1 && dayOfBirt <= 30) {
                if (dayOfBirt < 22) {
                    sign = "Gemini";
                } else {
                    sign = "Cancer";
                }
            } else {
                isError = true;
            }
        }

        if (birthMonth.equals("July")) {
            if (dayOfBirt >= 1 && dayOfBirt <= 31) {
                if (dayOfBirt < 22) {
                    sign = "Cancer";
                } else {
                    sign = "Leo";
                }
            } else {
                isError = true;
            }
        }

        if (birthMonth.equals("August")) {
            if (dayOfBirt >= 1 && dayOfBirt <= 31) {
                if (dayOfBirt < 22) {
                    sign = "Leo";
                } else {
                    sign = "Virgo";
                }
            } else {
                isError = true;
            }
        }

        if (birthMonth.equals("September")) {
            if (dayOfBirt >= 1 && dayOfBirt <= 30) {
                if (dayOfBirt < 22) {
                    sign = "Virgo";
                } else {
                    sign = "Libra";
                }
            } else {
                isError = true;
            }
        }

        if (birthMonth.equals("October")) {
            if (dayOfBirt >= 1 && dayOfBirt <= 31) {
                if (dayOfBirt < 21) {
                    sign = "Libra";
                } else {
                    sign = "Scorpio";
                }
            } else {
                isError = true;
            }
        }

        if (birthMonth.equals("November")) {
            if (dayOfBirt >= 1 && dayOfBirt <= 30) {
                if (dayOfBirt < 21) {
                    sign = "Scorpio";
                } else {
                    sign = "Sagittarius";
                }
            } else {
                isError = true;
            }
        }

        if (birthMonth.equals("December")) {
            if (dayOfBirt >= 1 && dayOfBirt <= 31) {
                if (dayOfBirt < 21) {
                    sign = "Sagittarius";
                } else {
                    sign = "Capricorn";
                }
            } else {
                isError = true;
            }
        }

        if (isError) {
            System.out.println("Invalid Entry");
        } else {
            System.out.println(name + "'s" + " Zodiac sign is " + sign);
        }
    }
}