package time_converter_consumer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import TimeConverterPublisher.TimePublish;

public class Activator implements BundleActivator {

	 ServiceReference serviceReference;

	public void start(BundleContext bundleContext) throws Exception {
		//Activator.context = bundleContext;
		System.out.println("Start Subscriber Service");
		serviceReference = bundleContext.getServiceReference(TimePublish.class.getName());
		TimePublish timePublish = (TimePublish) bundleContext.getService(serviceReference);
		
	try {
		System.out.println("If you want to exit from the Time Converter, please enter 0");
		
		String input1 = "";
		String input2 = "";
		
		double value1 = 0;//value to convert
		int methodNo = 0;//method number
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		do {
		
		System.out.println("Enter a value to convert");
		
		input1 = in.readLine();
		value1 = Double.parseDouble(input1);
		
		System.out.println("Please select the conversion method");
		
		System.out.println("1) Milliseconds To Seconds");
		System.out.println("2) Milliseconds To Minutes");
		System.out.println("3) Milliseconds To Hours");
		System.out.println("4) Milliseconds To Days");
		System.out.println("5) Milliseconds To Weeks");
		System.out.println("6) Milliseconds To Months");
		System.out.println("7) Milliseconds To Years");
		System.out.println("8) Milliseconds To Decades");
		System.out.println("9) Milliseconds To Centuries");
		System.out.println("10) Milliseconds To Millenniums");
		System.out.println("11) Milliseconds To Microseconds");
		System.out.println("12) Milliseconds To Nanoseconds");
		System.out.println("13) Milliseconds To Picoseconds");
		System.out.println("14) Milliseconds To Femtoseconds");
		System.out.println("15) Milliseconds To Attoseconds");
		System.out.println("16) Seconds To Milliseconds");
		System.out.println("17) Seconds To Minutes");
		System.out.println("18) Seconds To Hours");
		System.out.println("19) Seconds To Days");
		System.out.println("20) Seconds To Weeks");
		System.out.println("21) Seconds To Months");
		System.out.println("22) Seconds To Years");
		System.out.println("23) Seconds To Decades");
		System.out.println("24) Seconds To Centuries");
		System.out.println("25) Seconds To Millenniums");
		System.out.println("26) Seconds To Microseconds");
		System.out.println("27) Seconds To Nanoseconds");
		System.out.println("28) Seconds To Picoseconds");
		System.out.println("29) Seconds To Femtoseconds");
		System.out.println("30) Seconds To Attoseconds");
		System.out.println("31) Minutes To Milliseconds");
		System.out.println("32) Minutes To Seconds");
		System.out.println("33) Minutes To Hours");
		System.out.println("34) Minutes To Days");
		System.out.println("35) Minutes To Weeks");
		System.out.println("36) Minutes To Months");
		System.out.println("37) Minutes To Years");
		System.out.println("38) Minutes To Decades");
		System.out.println("39) Minutes To Centuries");
		System.out.println("40) Minutes To Millenniums");
		System.out.println("41) Minutes To Microseconds");
		System.out.println("42) Minutes To Nanoseconds");
		System.out.println("43) Minutes To Picoseconds");
		System.out.println("44) Minutes To Femtoseconds");
		System.out.println("45) Minutes To Attoseconds");
		System.out.println("46) Hours To Milliseconds");
		System.out.println("47) Hours To Seconds");
		System.out.println("48) Hours To Minutes");
		System.out.println("49) Hours To Days");
		System.out.println("50) Hours To Weeks");
		System.out.println("51) Hours To Months");
		System.out.println("52) Hours To Years");
		System.out.println("53) Hours To Decades");
		System.out.println("54) Hours To Centuries");
		System.out.println("55) Hours To Millenniums");
		System.out.println("56) Hours To Microseconds");
		System.out.println("57) Hours To Nanoseconds");
		System.out.println("58) Hours To Picoseconds");
		System.out.println("59) Hours To Femtoseconds");
		System.out.println("60) Hours To Attoseconds");
		System.out.println("61) Days To Milliseconds");
		System.out.println("62) Days To Seconds");
		System.out.println("63) Days To Minutes");
		System.out.println("64) Days To Hours");
		System.out.println("65) Days To Weeks");
		System.out.println("66) Days To Months");
		System.out.println("67) Days To Years");
		System.out.println("68) Days To Decades");
		System.out.println("69) Days To Centuries");
		System.out.println("70) Days To Millenniums");
		System.out.println("71) Days To Microseconds");
		System.out.println("72) Days To Nanoseconds");
		System.out.println("73) Days To Picoseconds");
		System.out.println("74) Days To Femtoseconds");
		System.out.println("75) Days To Attoseconds");
		System.out.println("76) Weeks To Milliseconds");
		System.out.println("77) Weeks To Seconds");
		System.out.println("78) Weeks To Minutes");
		System.out.println("79) Weeks To Hours");
		System.out.println("80) Weeks To Days");
		System.out.println("81) Weeks To Months");
		System.out.println("82) Weeks To Years");
		System.out.println("83) Weeks To Decades");
		System.out.println("84) Weeks To Centuries");
		System.out.println("85) Weeks To Millenniums");
		System.out.println("86) Weeks To Microseconds");
		System.out.println("87) Weeks To Nanoseconds");
		System.out.println("88) Weeks To Picoseconds");
		System.out.println("89) Weeks To Femtoseconds");
		System.out.println("90) Weeks To Attoseconds");
		System.out.println("91) Months To Milliseconds");
		System.out.println("92) Months To Seconds");
		System.out.println("93) Months To Minutes");
		System.out.println("94) Months To Hours");
		System.out.println("95) Months To Days");
		System.out.println("96) Months To Weeks");
		System.out.println("97) Months To Years");
		System.out.println("98) Months To Decades");
		System.out.println("99) Months To Centuries");
		System.out.println("100) Months To Millenniums");
		System.out.println("101) Months To Microseconds");
		System.out.println("102) Months To Nanoseconds");
		System.out.println("103) Months To Picoseconds");
		System.out.println("104) Months To Femtoseconds");
		System.out.println("105) Months To Attoseconds");
		System.out.println("106) Years To Milliseconds");
		System.out.println("107) Years To Seconds");
		System.out.println("108) Years To Minutes");
		System.out.println("109) Years To Hours");
		System.out.println("110) Years To Days");
		System.out.println("111) Years To Weeks");
		System.out.println("112) Years To Months");
		System.out.println("113) Years To Decades");
		System.out.println("114) Years To Centuries");
		System.out.println("115) Years To Millenniums");
		System.out.println("116) Years To Microseconds");
		System.out.println("117) Years To Nanoseconds");
		System.out.println("118) Years To Picoseconds");
		System.out.println("119) Years To Femtoseconds");
		System.out.println("120) Years To Attoseconds");
		System.out.println("121) Decades To Milliseconds");
		System.out.println("122) Decades To Seconds");
		System.out.println("123) Decades To Minutes");
		System.out.println("124) Decades To Hours");
		System.out.println("125) Decades To Days");
		System.out.println("126) Decades To Weeks");
		System.out.println("127) Decades To Months");
		System.out.println("128) Decades To Years");
		System.out.println("129) Decades To Centuries");
		System.out.println("130) Decades To Millenniums");
		System.out.println("131) Decades To Microseconds");
		System.out.println("132) Decades To Nanoseconds");
		System.out.println("133) Decades To Picoseconds");
		System.out.println("134) Decades To Femtoseconds");
		System.out.println("135) Decades To Attoseconds"); 
		System.out.println("136) Centuries To Milliseconds");
		System.out.println("137) Centuries To Seconds");
		System.out.println("138) Centuries To Minutes");
		System.out.println("139) Centuries To Hours");
		System.out.println("140) Centuries To Days");
		System.out.println("141) Centuries To Weeks");
		System.out.println("142) Centuries To Months");
		System.out.println("143) Centuries To Years");
		System.out.println("144) Centuries To Decades");
		System.out.println("145) Centuries To Millenniums");
		System.out.println("146) Centuries To Microseconds");
		System.out.println("147) Centuries To Nanoseconds");
		System.out.println("148) Centuries To Picoseconds");
		System.out.println("149) Centuries To Femtoseconds");
		System.out.println("150) Centuries To Attoseconds"); 
		System.out.println("151) Millenniums To Milliseconds");
		System.out.println("152) Millenniums To Seconds");
		System.out.println("153) Millenniums To Minutes");
		System.out.println("154) Millenniums To Hours");
		System.out.println("155) Millenniums To Days");
		System.out.println("156) Millenniums To Weeks");
		System.out.println("157) Millenniums To Months");
		System.out.println("158) Millenniums To Years");
		System.out.println("159) Millenniums To Decades");
		System.out.println("160) Millenniums To Centuries");
		System.out.println("161) Millenniums To Microseconds");
		System.out.println("162) Millenniums To Nanoseconds");
		System.out.println("163) Millenniums To Picoseconds");
		System.out.println("164) Millenniums To Femtoseconds");
		System.out.println("165) Millenniums To Attoseconds");
		System.out.println("166) Microseconds To Milliseconds");
		System.out.println("167) Microseconds To Seconds");
		System.out.println("168) Microseconds To Minutes");
		System.out.println("169) Microseconds To Hours");
		System.out.println("170) Microseconds To Days");
		System.out.println("171) Microseconds To Weeks");
		System.out.println("172) Microseconds To Months");
		System.out.println("173) Microseconds To Years");
		System.out.println("174) Microseconds To Decades");
		System.out.println("175) Microseconds To Centuries");
		System.out.println("176) Microseconds To Millenniums");
		System.out.println("177) Microseconds To Nanoseconds");
		System.out.println("178) Microseconds To Picoseconds");
		System.out.println("179) Microseconds To Femtoseconds");
		System.out.println("180) Microseconds To Attoseconds"); 
		System.out.println("181) Nanoseconds To Milliseconds");
		System.out.println("182) Nanoseconds To Seconds");
		System.out.println("183) Nanoseconds To Minutes");
		System.out.println("184) Nanoseconds To Hours");
		System.out.println("185) Nanoseconds To Days");
		System.out.println("186) Nanoseconds To Weeks");
		System.out.println("187) Nanoseconds To Months");
		System.out.println("188) Nanoseconds To Years");
		System.out.println("189) Nanoseconds To Decades");
		System.out.println("190) Nanoseconds To Centuries");
		System.out.println("191) Nanoseconds To Millenniums");
		System.out.println("192) Nanoseconds To Microseconds");
		System.out.println("193) Nanoseconds To Picoseconds");
		System.out.println("194) Nanoseconds To Femtoseconds");
		System.out.println("195) Nanoseconds To Attoseconds");
		System.out.println("196) Picoseconds To Milliseconds");
		System.out.println("197) Picoseconds To Seconds");
		System.out.println("198) Picoseconds To Minutes");
		System.out.println("199) Picoseconds To Hours");
		System.out.println("200) Picoseconds To Days");
		System.out.println("201) Picoseconds To Weeks");
		System.out.println("202) Picoseconds To Months");
		System.out.println("203) Picoseconds To Years");
		System.out.println("204) Picoseconds To Decades");
		System.out.println("205) Picoseconds To Centuries");
		System.out.println("206) Picoseconds To Millenniums");
		System.out.println("207) Picoseconds To Microseconds");
		System.out.println("208) Picoseconds To Nanoseconds");
		System.out.println("209) Picoseconds To Femtoseconds");
		System.out.println("210) Picoseconds To Attoseconds"); 
		System.out.println("211) Femtoseconds To Milliseconds");
		System.out.println("212) Femtoseconds To Seconds");
		System.out.println("213) Femtoseconds To Minutes");
		System.out.println("214) Femtoseconds To Hours");
		System.out.println("215) Femtoseconds To Days");
		System.out.println("216) Femtoseconds To Weeks");
		System.out.println("217) Femtoseconds To Months");
		System.out.println("218) Femtoseconds To Years");
		System.out.println("219) Femtoseconds To Decades");
		System.out.println("220) Femtoseconds To Centuries");
		System.out.println("221) Femtoseconds To Millenniums");
		System.out.println("222) Femtoseconds To Microseconds");
		System.out.println("223) Femtoseconds To Nanoseconds");
		System.out.println("224) Femtoseconds To Picoseconds");
		System.out.println("225) Femtoseconds To Attoseconds"); 
		System.out.println("226) Attoseconds To Milliseconds");
		System.out.println("227) Attoseconds To Seconds");
		System.out.println("228) Attoseconds To Minutes");
		System.out.println("229) Attoseconds To Hours");
		System.out.println("230) Attoseconds To Days");
		System.out.println("231) Attoseconds To Weeks");
		System.out.println("232) Attoseconds To Months");
		System.out.println("233) Attoseconds To Years");
		System.out.println("234) Attoseconds To Decades");
		System.out.println("235) Attoseconds To Centuries");
		System.out.println("236) Attoseconds To Millenniums");
		System.out.println("237) Attoseconds To Microseconds");
		System.out.println("238) Attoseconds To Nanoseconds");
		System.out.println("239) Attoseconds To Picoseconds");
		System.out.println("240) Attoseconds To Femtoseconds"); 
			
		input2 = in.readLine();
		methodNo = Integer.parseInt(input2);
		
		if(methodNo == 1) {
			System.out.println(timePublish.millisecondsToSeconds(value1));
		}else if(methodNo == 2) {
			System.out.println(timePublish.millisecondsToMinutes(value1));
		}else if(methodNo == 3) {
			System.out.println(timePublish.millisecondsToHours(value1));
		}else if(methodNo == 4) {
			System.out.println(timePublish.millisecondsToDays(value1));	
		}else if(methodNo == 5) {
			System.out.println(timePublish.millisecondsToWeeks(value1));
		}else if(methodNo == 6) {
			System.out.println(timePublish.millisecondsToMonths(value1));
		}else if(methodNo == 7) {
			System.out.println(timePublish.millisecondsToYears(value1));
		}else if(methodNo == 8) {
			System.out.println(timePublish.millisecondsToDecades(value1));
		}else if(methodNo == 9) {
			System.out.println(timePublish.millisecondsToCenturies(value1));
		}else if(methodNo == 10) {
			System.out.println(timePublish.millisecondsToMillenniums(value1));
		}else if(methodNo == 11) {
			System.out.println(timePublish.millisecondsToMicroseconds(value1));
		}else if(methodNo == 12) {
			System.out.println(timePublish.millisecondsToNanoseconds(value1));
		}else if(methodNo == 13) {
			System.out.println(timePublish.millisecondsToPicoseconds(value1));
		}else if(methodNo == 14) {
			System.out.println(timePublish.millisecondsToFemtoseconds(value1));
		}else if(methodNo == 15) {
			System.out.println(timePublish.millisecondsToAttoseconds(value1));
		}else if(methodNo == 16) {
			System.out.println(timePublish.secondsToMilliseconds(value1));
		}else if(methodNo == 17) {
			System.out.println(timePublish.secondsToMinutes(value1));
		}else if(methodNo == 18) {
			System.out.println(timePublish.secondsToHours(value1));
		}else if(methodNo == 19) {
			System.out.println(timePublish.secondsToDays(value1));	
		}else if(methodNo == 20) {
			System.out.println(timePublish.secondsToWeeks(value1));
		}else if(methodNo == 21) {
			System.out.println(timePublish.secondsToMonths(value1));
		}else if(methodNo == 22) {
			System.out.println(timePublish.secondsToYears(value1));
		}else if(methodNo == 23) {
			System.out.println(timePublish.secondsToDecades(value1));
		}else if(methodNo == 24) {
			System.out.println(timePublish.secondsToCenturies(value1));
		}else if(methodNo == 25) {
			System.out.println(timePublish.secondsToMillenniums(value1));
		}else if(methodNo == 26) {
			System.out.println(timePublish.secondsToMicroseconds(value1));
		}else if(methodNo == 27) {
			System.out.println(timePublish.secondsToNanoseconds(value1));
		}else if(methodNo == 28) {
			System.out.println(timePublish.secondsToPicoseconds(value1));
		}else if(methodNo == 29) {
			System.out.println(timePublish.secondsToFemtoseconds(value1));
		}else if(methodNo == 30) {
			System.out.println(timePublish.secondsToAttoseconds(value1));
		}else if(methodNo == 31) {
			System.out.println(timePublish.minutesToMilliseconds(value1));
		}else if(methodNo == 32) {
			System.out.println(timePublish.minutesToSeconds(value1));
		}else if(methodNo == 33) {
			System.out.println(timePublish.minutesToHours(value1));
		}else if(methodNo == 34) {
			System.out.println(timePublish.minutesToDays(value1));	
		}else if(methodNo == 35) {
			System.out.println(timePublish.minutesToWeeks(value1));
		}else if(methodNo == 36) {
			System.out.println(timePublish.minutesToMonths(value1));
		}else if(methodNo == 37) {
			System.out.println(timePublish.minutesToYears(value1));
		}else if(methodNo == 38) {
			System.out.println(timePublish.minutesToDecades(value1));
		}else if(methodNo == 39) {
			System.out.println(timePublish.minutesToCenturies(value1));
		}else if(methodNo == 40) {
			System.out.println(timePublish.minutesToMillenniums(value1));
		}else if(methodNo == 41) {
			System.out.println(timePublish.minutesToMicoseconds(value1));
		}else if(methodNo == 42) {
			System.out.println(timePublish.minutesToNanoseconds(value1));
		}else if(methodNo == 43) {
			System.out.println(timePublish.minutesToPicoseconds(value1));
		}else if(methodNo == 44) {
			System.out.println(timePublish.minutesToFemtoseconds(value1));
		}else if(methodNo == 45) {
			System.out.println(timePublish.minutesToAttoseconds(value1));
		}else if(methodNo == 46) {
			System.out.println(timePublish.hoursToMilliseconds(value1));
		}else if(methodNo == 47) {
			System.out.println(timePublish.hoursToSeconds(value1));
		}else if(methodNo == 48) {
			System.out.println(timePublish.hoursToMinutes(value1));
		}else if(methodNo == 49) {
			System.out.println(timePublish.hoursToDays(value1));	
		}else if(methodNo == 50) {
			System.out.println(timePublish.hoursToWeeks(value1));
		}else if(methodNo == 51) {
			System.out.println(timePublish.hoursToMonths(value1));
		}else if(methodNo == 52) {
			System.out.println(timePublish.hoursToYears(value1));
		}else if(methodNo == 53) {
			System.out.println(timePublish.hoursToDecades(value1));
		}else if(methodNo == 54) {
			System.out.println(timePublish.hoursToCenturies(value1));
		}else if(methodNo == 55) {
			System.out.println(timePublish.hoursToMillenniums(value1));
		}else if(methodNo == 56) {
			System.out.println(timePublish.hoursToMicoseconds(value1));
		}else if(methodNo == 57) {
			System.out.println(timePublish.hoursToNanoseconds(value1));
		}else if(methodNo == 58) {
			System.out.println(timePublish.hoursToPicoseconds(value1));
		}else if(methodNo == 59) {
			System.out.println(timePublish.hoursToFemtoseconds(value1));
		}else if(methodNo == 60) {
			System.out.println(timePublish.hoursToAttoseconds(value1));
		}else if(methodNo == 61) {
			System.out.println(timePublish.daysToMilliseconds(value1));
		}else if(methodNo == 62) {
			System.out.println(timePublish.daysToSeconds(value1));
		}else if(methodNo == 63) {
			System.out.println(timePublish.daysToMinutes(value1));
		}else if(methodNo == 64) {
			System.out.println(timePublish.daysToHours(value1));	
		}else if(methodNo == 65) {
			System.out.println(timePublish.daysToWeeks(value1));
		}else if(methodNo == 66) {
			System.out.println(timePublish.daysToMonths(value1));
		}else if(methodNo == 67) {
			System.out.println(timePublish.daysToYears(value1));
		}else if(methodNo == 68) {
			System.out.println(timePublish.daysToDecades(value1));
		}else if(methodNo == 69) {
			System.out.println(timePublish.daysToCenturies(value1));
		}else if(methodNo == 70) {
			System.out.println(timePublish.daysToMillenniums(value1));
		}else if(methodNo == 71) {
			System.out.println(timePublish.daysToMicoseconds(value1));
		}else if(methodNo == 72) {
			System.out.println(timePublish.daysToNanoseconds(value1));
		}else if(methodNo == 73) {
			System.out.println(timePublish.daysToPicoseconds(value1));
		}else if(methodNo == 74) {
			System.out.println(timePublish.daysToFemtoseconds(value1));
		}else if(methodNo == 75) {
			System.out.println(timePublish.daysToAttoseconds(value1));
		}else if(methodNo == 76) {
			System.out.println(timePublish.weeksToMilliseconds(value1));
		}else if(methodNo == 77) {
			System.out.println(timePublish.weeksToSeconds(value1));
		}else if(methodNo == 78) {
			System.out.println(timePublish.weeksToMinutes(value1));
		}else if(methodNo == 79) {
			System.out.println(timePublish.weeksToHours(value1));	
		}else if(methodNo == 80) {
			System.out.println(timePublish.weeksToDays(value1));
		}else if(methodNo == 81) {
			System.out.println(timePublish.weeksToMonths(value1));
		}else if(methodNo == 82) {
			System.out.println(timePublish.weeksToYears(value1));
		}else if(methodNo == 83) {
			System.out.println(timePublish.weeksToDecades(value1));
		}else if(methodNo == 84) {
			System.out.println(timePublish.weeksToCenturies(value1));
		}else if(methodNo == 85) {
			System.out.println(timePublish.weeksToMillenniums(value1));
		}else if(methodNo == 86) {
			System.out.println(timePublish.weeksToMicoseconds(value1));
		}else if(methodNo == 87) {
			System.out.println(timePublish.weeksToNanoseconds(value1));
		}else if(methodNo == 88) {
			System.out.println(timePublish.weeksToPicoseconds(value1));
		}else if(methodNo == 89) {
			System.out.println(timePublish.weeksToFemtoseconds(value1));
		}else if(methodNo == 90) {
			System.out.println(timePublish.weeksToAttoseconds(value1));
		}else if(methodNo == 91) {
			System.out.println(timePublish.monthsToMilliseconds(value1));
		}else if(methodNo == 92) {
			System.out.println(timePublish.monthsToSeconds(value1));
		}else if(methodNo == 93) {
			System.out.println(timePublish.monthsToMinutes(value1));
		}else if(methodNo == 94) {
			System.out.println(timePublish.monthsToHours(value1));	
		}else if(methodNo == 95) {
			System.out.println(timePublish.monthsToDays(value1));
		}else if(methodNo == 96) {
			System.out.println(timePublish.monthsToWeeks(value1));
		}else if(methodNo == 97) {
			System.out.println(timePublish.monthsToYears(value1));
		}else if(methodNo == 98) {
			System.out.println(timePublish.monthsToDecades(value1));
		}else if(methodNo == 99) {
			System.out.println(timePublish.monthsToCenturies(value1));
		}else if(methodNo == 100) {
			System.out.println(timePublish.monthsToMillenniums(value1));
		}else if(methodNo == 101) {
			System.out.println(timePublish.monthsToMicoseconds(value1));
		}else if(methodNo == 102) {
			System.out.println(timePublish.monthsToNanoseconds(value1));
		}else if(methodNo == 103) {
			System.out.println(timePublish.monthsToPicoseconds(value1));
		}else if(methodNo == 104) {
			System.out.println(timePublish.monthsToFemtoseconds(value1));
		}else if(methodNo == 105) {
			System.out.println(timePublish.monthsToAttoseconds(value1));
		}else if(methodNo == 106) {
			System.out.println(timePublish.yearsToMilliseconds(value1));
		}else if(methodNo == 107) {
			System.out.println(timePublish.yearsToSeconds(value1));
		}else if(methodNo == 108) {
			System.out.println(timePublish.yearsToMinutes(value1));
		}else if(methodNo == 109) {
			System.out.println(timePublish.yearsToHours(value1));	
		}else if(methodNo == 110) {
			System.out.println(timePublish.yearsToDays(value1));
		}else if(methodNo == 111) {
			System.out.println(timePublish.yearsToWeeks(value1));
		}else if(methodNo == 112) {
			System.out.println(timePublish.yearsToMonths(value1));
		}else if(methodNo == 113) {
			System.out.println(timePublish.yearsToDecades(value1));
		}else if(methodNo == 114) {
			System.out.println(timePublish.yearsToCenturies(value1));
		}else if(methodNo == 115) {
			System.out.println(timePublish.yearsToMillenniums(value1));
		}else if(methodNo == 116) {
			System.out.println(timePublish.yearsToMicoseconds(value1));
		}else if(methodNo == 117) {
			System.out.println(timePublish.yearsToNanoseconds(value1));
		}else if(methodNo == 118) {
			System.out.println(timePublish.yearsToPicoseconds(value1));
		}else if(methodNo == 119) {
			System.out.println(timePublish.yearsToFemtoseconds(value1));
		}else if(methodNo == 120) {
			System.out.println(timePublish.yearsToAttoseconds(value1));
		}else if(methodNo == 121) {
			System.out.println(timePublish.decadesToMilliseconds(value1));
		}else if(methodNo == 122) {
			System.out.println(timePublish.decadesToSeconds(value1));
		}else if(methodNo == 123) {
			System.out.println(timePublish.decadesToMinutes(value1));
		}else if(methodNo == 124) {
			System.out.println(timePublish.decadesToHours(value1));	
		}else if(methodNo == 125) {
			System.out.println(timePublish.decadesToDays(value1));
		}else if(methodNo == 126) {
			System.out.println(timePublish.decadesToWeeks(value1));
		}else if(methodNo == 127) {
			System.out.println(timePublish.decadesToMonths(value1));
		}else if(methodNo == 128) {
			System.out.println(timePublish.decadesToYears(value1));
		}else if(methodNo == 129) {
			System.out.println(timePublish.decadesToCenturies(value1));
		}else if(methodNo == 130) {
			System.out.println(timePublish.decadesToMillenniums(value1));
		}else if(methodNo == 131) {
			System.out.println(timePublish.decadesToMicoseconds(value1));
		}else if(methodNo == 132) {
			System.out.println(timePublish.decadesToNanoseconds(value1));
		}else if(methodNo == 133) {
			System.out.println(timePublish.decadesToPicoseconds(value1));
		}else if(methodNo == 134) {
			System.out.println(timePublish.decadesToFemtoseconds(value1));
		}else if(methodNo == 135) {
			System.out.println(timePublish.decadesToAttoseconds(value1));
		}else if(methodNo == 136) {
			System.out.println(timePublish.centuriesToMilliseconds(value1));
		}else if(methodNo == 137) {
			System.out.println(timePublish.centuriesToSeconds(value1));
		}else if(methodNo == 138) {
			System.out.println(timePublish.centuriesToMinutes(value1));
		}else if(methodNo == 139) {
			System.out.println(timePublish.centuriesToHours(value1));	
		}else if(methodNo == 140) {
			System.out.println(timePublish.centuriesToDays(value1));
		}else if(methodNo == 141) {
			System.out.println(timePublish.centuriesToWeeks(value1));
		}else if(methodNo == 142) {
			System.out.println(timePublish.centuriesToMonths(value1));
		}else if(methodNo == 143) {
			System.out.println(timePublish.centuriesToYears(value1));
		}else if(methodNo == 144) {
			System.out.println(timePublish.centuriesToDecades(value1));
		}else if(methodNo == 145) {
			System.out.println(timePublish.centuriesToMillenniums(value1));
		}else if(methodNo == 146) {
			System.out.println(timePublish.centuriesToMicoseconds(value1));
		}else if(methodNo == 147) {
			System.out.println(timePublish.centuriesToNanoseconds(value1));
		}else if(methodNo == 148) {
			System.out.println(timePublish.centuriesToPicoseconds(value1));
		}else if(methodNo == 149) {
			System.out.println(timePublish.centuriesToFemtoseconds(value1));
		}else if(methodNo == 150) {
			System.out.println(timePublish.centuriesToAttoseconds(value1));
		}else if(methodNo == 151) {
			System.out.println(timePublish.millenniumsToMilliseconds(value1));
		}else if(methodNo == 152) {
			System.out.println(timePublish.millenniumsToSeconds(value1));
		}else if(methodNo == 153) {
			System.out.println(timePublish.millenniumsToMinutes(value1));
		}else if(methodNo == 154) {
			System.out.println(timePublish.millenniumsToHours(value1));	
		}else if(methodNo == 155) {
			System.out.println(timePublish.millenniumsToDays(value1));
		}else if(methodNo == 156) {
			System.out.println(timePublish.millenniumsToWeeks(value1));
		}else if(methodNo == 157) {
			System.out.println(timePublish.millenniumsToMonths(value1));
		}else if(methodNo == 158) {
			System.out.println(timePublish.millenniumsToYears(value1));
		}else if(methodNo == 159) {
			System.out.println(timePublish.millenniumsToDecades(value1));
		}else if(methodNo == 160) {
			System.out.println(timePublish.millenniumsToCenturies(value1));
		}else if(methodNo == 161) {
			System.out.println(timePublish.millenniumsToMicoseconds(value1));
		}else if(methodNo == 162) {
			System.out.println(timePublish.millenniumsToNanoseconds(value1));
		}else if(methodNo == 163) {
			System.out.println(timePublish.millenniumsToPicoseconds(value1));
		}else if(methodNo == 164) {
			System.out.println(timePublish.millenniumsToFemtoseconds(value1));
		}else if(methodNo == 165) {
			System.out.println(timePublish.millenniumsToAttoseconds(value1));
		}else if(methodNo == 166) {
			System.out.println(timePublish.microsecondsToMilliseconds(value1));
		}else if(methodNo == 167) {
			System.out.println(timePublish.microsecondsToSeconds(value1));
		}else if(methodNo == 168) {
			System.out.println(timePublish.microsecondsToMinutes(value1));
		}else if(methodNo == 169) {
			System.out.println(timePublish.microsecondsToHours(value1));	
		}else if(methodNo == 170) {
			System.out.println(timePublish.microsecondsToDays(value1));
		}else if(methodNo == 171) {
			System.out.println(timePublish.microsecondsToWeeks(value1));
		}else if(methodNo == 172) {
			System.out.println(timePublish.microsecondsToMonths(value1));
		}else if(methodNo == 173) {
			System.out.println(timePublish.microsecondsToYears(value1));
		}else if(methodNo == 174) {
			System.out.println(timePublish.microsecondsToDecades(value1));
		}else if(methodNo == 175) {
			System.out.println(timePublish.microsecondsToCenturies(value1));
		}else if(methodNo == 176) {
			System.out.println(timePublish.microsecondsToMillenniums(value1));
		}else if(methodNo == 177) {
			System.out.println(timePublish.microsecondsToNanoseconds(value1));
		}else if(methodNo == 178) {
			System.out.println(timePublish.microsecondsToPicoseconds(value1));
		}else if(methodNo == 179) {
			System.out.println(timePublish.microsecondsToFemtoseconds(value1));
		}else if(methodNo == 180) {
			System.out.println(timePublish.microsecondsToAttoseconds(value1));
		}else if(methodNo == 181) {
			System.out.println(timePublish.nanosecondsToMilliseconds(value1));
		}else if(methodNo == 182) {
			System.out.println(timePublish.nanosecondsToSeconds(value1));
		}else if(methodNo == 183) {
			System.out.println(timePublish.nanosecondsToMinutes(value1));
		}else if(methodNo == 184) {
			System.out.println(timePublish.nanosecondsToHours(value1));	
		}else if(methodNo == 185) {
			System.out.println(timePublish.nanosecondsToDays(value1));
		}else if(methodNo == 186) {
			System.out.println(timePublish.nanosecondsToWeeks(value1));
		}else if(methodNo == 187) {
			System.out.println(timePublish.nanosecondsToMonths(value1));
		}else if(methodNo == 188) {
			System.out.println(timePublish.nanosecondsToYears(value1));
		}else if(methodNo == 189) {
			System.out.println(timePublish.nanosecondsToDecades(value1));
		}else if(methodNo == 190) {
			System.out.println(timePublish.nanosecondsToCenturies(value1));
		}else if(methodNo == 191) {
			System.out.println(timePublish.nanosecondsToMillenniums(value1));
		}else if(methodNo == 192) {
			System.out.println(timePublish.nanosecondsToMicroseconds(value1));
		}else if(methodNo == 193) {
			System.out.println(timePublish.nanosecondsToPicoseconds(value1));
		}else if(methodNo == 194) {
			System.out.println(timePublish.nanosecondsToFemtoseconds(value1));
		}else if(methodNo == 195) {
			System.out.println(timePublish.nanosecondsToAttoseconds(value1));
		}else if(methodNo == 196) {
			System.out.println(timePublish.picosecondsToMilliseconds(value1));
		}else if(methodNo == 197) {
			System.out.println(timePublish.picosecondsToSeconds(value1));
		}else if(methodNo == 198) {
			System.out.println(timePublish.picosecondsToMinutes(value1));
		}else if(methodNo == 199) {
			System.out.println(timePublish.picosecondsToHours(value1));	
		}else if(methodNo == 200) {
			System.out.println(timePublish.picosecondsToDays(value1));
		}else if(methodNo == 201) {
			System.out.println(timePublish.picosecondsToWeeks(value1));
		}else if(methodNo == 202) {
			System.out.println(timePublish.picosecondsToMonths(value1));
		}else if(methodNo == 203) {
			System.out.println(timePublish.picosecondsToYears(value1));
		}else if(methodNo == 204) {
			System.out.println(timePublish.picosecondsToDecades(value1));
		}else if(methodNo == 205) {
			System.out.println(timePublish.picosecondsToCenturies(value1));
		}else if(methodNo == 206) {
			System.out.println(timePublish.picosecondsToMillenniums(value1));
		}else if(methodNo == 207) {
			System.out.println(timePublish.picosecondsToMicroseconds(value1));
		}else if(methodNo == 208) {
			System.out.println(timePublish.picosecondsToNanoseconds(value1));
		}else if(methodNo == 209) {
			System.out.println(timePublish.picosecondsToFemtoseconds(value1));
		}else if(methodNo == 210) {
			System.out.println(timePublish.picosecondsToAttoseconds(value1));
		}else if(methodNo == 211) {
			System.out.println(timePublish.femtosecondsToMilliseconds(value1));
		}else if(methodNo == 212) {
			System.out.println(timePublish.femtosecondsToSeconds(value1));
		}else if(methodNo == 213) {
			System.out.println(timePublish.femtosecondsToMinutes(value1));
		}else if(methodNo == 214) {
			System.out.println(timePublish.femtosecondsToHours(value1));	
		}else if(methodNo == 215) {
			System.out.println(timePublish.femtosecondsToDays(value1));
		}else if(methodNo == 216) {
			System.out.println(timePublish.femtosecondsToWeeks(value1));
		}else if(methodNo == 217) {
			System.out.println(timePublish.femtosecondsToMonths(value1));
		}else if(methodNo == 218) {
			System.out.println(timePublish.femtosecondsToYears(value1));
		}else if(methodNo == 219) {
			System.out.println(timePublish.femtosecondsToDecades(value1));
		}else if(methodNo == 220) {
			System.out.println(timePublish.femtosecondsToCenturies(value1));
		}else if(methodNo == 221) {
			System.out.println(timePublish.femtosecondsToMillenniums(value1));
		}else if(methodNo == 222) {
			System.out.println(timePublish.femtosecondsToMicroseconds(value1));
		}else if(methodNo == 223) {
			System.out.println(timePublish.femtosecondsToNanoseconds(value1));
		}else if(methodNo == 224) {
			System.out.println(timePublish.femtosecondsToPicoseconds(value1));
		}else if(methodNo == 225) {
			System.out.println(timePublish.femtosecondsToAttoseconds(value1));
		}else if(methodNo == 226) {
			System.out.println(timePublish.attosecondsToMilliseconds(value1));
		}else if(methodNo == 227) {
			System.out.println(timePublish.attosecondsToSeconds(value1));
		}else if(methodNo == 228) {
			System.out.println(timePublish.attosecondsToMinutes(value1));
		}else if(methodNo == 229) {
			System.out.println(timePublish.attosecondsToHours(value1));	
		}else if(methodNo == 230) {
			System.out.println(timePublish.attosecondsToDays(value1));
		}else if(methodNo == 231) {
			System.out.println(timePublish.attosecondsToWeeks(value1));
		}else if(methodNo == 232) {
			System.out.println(timePublish.attosecondsToMonths(value1));
		}else if(methodNo == 233) {
			System.out.println(timePublish.attosecondsToYears(value1));
		}else if(methodNo == 234) {
			System.out.println(timePublish.attosecondsToDecades(value1));
		}else if(methodNo == 235) {
			System.out.println(timePublish.attosecondsToCenturies(value1));
		}else if(methodNo == 236) {
			System.out.println(timePublish.attosecondsToMillenniums(value1));
		}else if(methodNo == 237) {
			System.out.println(timePublish.attosecondsToMicroseconds(value1));
		}else if(methodNo == 238) {
			System.out.println(timePublish.attosecondsToNanoseconds(value1));
		}else if(methodNo == 239) {
			System.out.println(timePublish.attosecondsToPicoseconds(value1));
		}else if(methodNo == 240) {
			System.out.println(timePublish.attosecondsToFemtoseconds(value1));
		}	
		
		}while(true);
	}catch(Exception e) {
		
	}
	}

	public void stop(BundleContext bundleContext) throws Exception {
		//Activator.context = null;
		System.out.println("Good Bye!!!");
		bundleContext.ungetService(serviceReference);
	}

}
