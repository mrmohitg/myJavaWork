package dashboard;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.text.DecimalFormat;

@RestController
@EnableAutoConfiguration
public class Service {
    static ArrayList<Integer> pulsometer = new ArrayList();
    static ArrayList<Integer> r = new ArrayList();
    static ArrayList<Integer> g = new ArrayList();
    static ArrayList<Integer> b = new ArrayList();
    static ArrayList<Float> EngineEff = new ArrayList();


    String pattern = "###.##";
    DecimalFormat decimalFormat = new DecimalFormat(pattern);

    @CrossOrigin
    @RequestMapping("/data")
    Map home(Service s) {
        // REST API Service Method here
    	ZonedDateTime now = ZonedDateTime.now();
    	ZonedDateTime midnight = now.truncatedTo(ChronoUnit.DAYS);
    	Duration duration = Duration.between(midnight, now);
    	int secondPassed = (int) duration.getSeconds();
    	
    	HashMap map = new HashMap();
    	map.put("pulsometer", pulsometer.get(secondPassed));
    	map.put("r", r.get(secondPassed));
    	map.put("g", g.get(secondPassed));
    	map.put("b", b.get(secondPassed));
    	map.put("EngineEff",decimalFormat.format(EngineEff.get(secondPassed)));
    	return map;
    }

    public static void loadData(){
        String filename = "./dashBoardData.csv";
        File file = new File(filename);
        String[] values = null;
        boolean skipHeader = true;

        try{
            Scanner inputStream = new Scanner(file);
            while(inputStream.hasNext()){
                String data = inputStream.next();
                if ( skipHeader ) { skipHeader = false; continue;}                
                values = data.split(",");
                pulsometer.add(Integer.parseInt(values[1]));
                EngineEff.add(Float.parseFloat(values[2]));
                r.add(Integer.parseInt(values[3]));
                g.add(Integer.parseInt(values[4]));
                b.add(Integer.parseInt(values[5]));
            }
            inputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        loadData();
        SpringApplication.run(Service.class, args);
    }

}