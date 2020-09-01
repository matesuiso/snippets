// DATES

// Formatting
import java.util.Date;
import java.text.SimpleDateFormat;
new SimpleDateFormat("dd/MM/yyyy HH:mm:SS").format(new Date());



import java.util.Calendar;
final Calendar cal = Calendar.getInstance();

// Add or remove time
cal.add(Calendar.[MINUTE | HOUR | (DATE | DAY_OF_MONTH) | MONTH | YEAR], -90); // Month is the only 0 based

// Move to certain time (Month is 0 based)
cal.set(Calendar.[MINUTE | HOUR | (DATE | DAY_OF_MONTH) | MONTH | YEAR], 1);
cal.set(yearInt, monthInt, dayInt);
cal.set(yearInt, monthInt, dayInt, hourInt, secondInt);



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public void writeLog(String message, String logName) throws IOException {
	File folder = new File(System.getProperty("user.dir") +"/logFolder");
    File logFile = new File(System.getProperty("user.dir") +"/logFolder/"+ logName +".txt");
    
	if (!folder.exists())
        folder.mkdir();
    
    if (!logFile.exists())
        logFile.createNewFile();

    FileWriter file = new FileWriter(logFile, true);
    file.write(exc + "\n");

    file.close();
}



import java.util.regex.Pattern;
public boolean validateFullTime(String fullTime) {
    return Pattern.compile("([2][0-3]|[0-1][0-9]|[1-9]):([0-5][0-9]|[0-9]):([0-5][0-9]|[0-9])").matcher(fullTime).find();
}

public boolean validateSimpleTime(String simpleTime) {
    return Pattern.compile("([0-9]|[0-1][0-9]|[2][0-3]):([0-5][0-9]|[0-9])").matcher(simpleTime).find();
}



public boolean plusLess(double a, double b, double dif){
    return a > (b - dif) && a < (b + dif);
}

public String weekDay(int day) {
    switch(day){
        case 1: return "Monday";
        case 2: return "Tuesday";
        case 3: return "Wednesday";
        case 4: return "Thursday";
        case 5: return "Friday";
        case 6: return "Saturday";
        case 7: return "Sunday";
        default: return "Error";
    }
}

public String diaSemana(int dia) {
    switch(dia){
        case 1: return "Lunes";
        case 2: return "Martes";
        case 3: return "Miercoles";
        case 4: return "Jueves";
        case 5: return "Viernes";
        case 6: return "Sabado";
        case 7: return "Domingo";
        default: return "Error";
    }
}

public String secondsToMinutesAndSeconds(long seconds) {
    long num, hour, min, sec;
    
    hour = seconds/3600;
    min = (seconds-(3600*hour))/60;
    sec = seconds-((hour*3600)+(min*60));
    
    return (min + (hour * 60)) +"m "+ sec +"s";
}